package dao;

import models.Loan;

import java.util.List;

public interface LoanDoa {
    Loan addLoan(Loan loanToAdd);
    List<Loan> viewLoan();
}
