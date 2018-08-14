package utils;

import play.http.HttpErrorHandler;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Results;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class ErrorHandler implements HttpErrorHandler {
    @Override
    public CompletionStage<Result> onClientError(Http.RequestHeader request, int statusCode, String message) {
        return CompletableFuture.completedFuture(
                Results.status(statusCode,JsonServiceUtil.toJsonNode(new ResponseWrapper<>( "A client error occurred: ".concat(message), null))));
    }

    @Override
    public CompletionStage<Result> onServerError(Http.RequestHeader request, Throwable exception) {
        return CompletableFuture.completedFuture(
                Results.internalServerError(JsonServiceUtil
                        .toJsonNode(new ResponseWrapper<>("A server error occurred: ", exception.getLocalizedMessage()))));
    }

}
