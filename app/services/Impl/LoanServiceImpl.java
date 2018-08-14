package services.Impl;

import dao.LoanDoa;
import models.Loan;
import services.LoanService;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

public class LoanServiceImpl implements LoanService {
    @Inject
    @Named("loanDao")
    private LoanDoa loanDao;
    @Override
    public Loan addLoan(Loan loanToAdd) {
        return loanDao.addLoan(loanToAdd);
    }

    @Override
    public List<Loan> getLoan() {
        return loanDao.viewLoan();
    }
}
