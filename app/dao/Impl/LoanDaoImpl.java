package dao.Impl;

import com.avaje.ebean.Model;
import dao.LoanDoa;
import models.Loan;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

public class LoanDaoImpl implements LoanDoa {
    public static final Model.Finder<Long, Loan> find = new Model.Finder<>(Loan.class);
    @Override
    public Loan addLoan(Loan loanToAdd) {
        loanToAdd.save();
        return loanToAdd;
    }

    @Override
    public List<Loan> viewLoan() {
        return find.findList();
    }
}
