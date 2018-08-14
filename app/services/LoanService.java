package services;

import models.Loan;

import java.util.List;

public interface LoanService {
    Loan addLoan(Loan loanToAdd);
    List<Loan> getLoan();
}
