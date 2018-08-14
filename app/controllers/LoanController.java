package controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Loan;
import play.Logger;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import services.LoanService;
import utils.JsonServiceUtil;
import utils.ResponseWrapper;

import javax.inject.Inject;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoanController extends Controller {
    @Inject
    private ObjectMapper objectMapper;
    @Inject
    private LoanService loanService;

    /**
     * catching the Json which comes from the front end and assigning a object for the particular Json and passing it to the service
     * @return sending a User object for the UserService
     */
    @BodyParser.Of(BodyParser.Json.class)
    public Result addLoan() {

        JsonNode jsonNode = request().body().asJson();

        Loan loanToAdd = null;

        try {
            loanToAdd = objectMapper.treeToValue(jsonNode, Loan.class);

            Loan loanAdded = loanService.addLoan(loanToAdd);
            if (loanAdded != null){
                return ok(JsonServiceUtil.toJsonNode(new ResponseWrapper<>("Loan added", loanAdded)));
            }else {
                return badRequest(JsonServiceUtil.toJsonNode(new ResponseWrapper<>("Couldn't add", null)));
            }


        } catch (Exception ex){
            Logger.error(ex.getMessage());
            return badRequest(JsonServiceUtil.toJsonNode(new ResponseWrapper<>(ex.getMessage(), null)));
        }
    }

    public Result getLoan(){

        List<Loan> contactList = loanService.getLoan();
        return ok(JsonServiceUtil.toJsonNode(new ResponseWrapper<>("All Loans", contactList)));
    }

}
