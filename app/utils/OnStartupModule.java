package utils;


import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import dao.Impl.LoanDaoImpl;
import dao.LoanDoa;
import services.Impl.LoanServiceImpl;
import services.LoanService;


public class OnStartupModule extends AbstractModule {

    @Override
    protected void configure() {
        //Bind dao
        bind(LoanDoa.class).annotatedWith(Names.named("loanDao")).to(LoanDaoImpl.class);
//        //bind Service
        bind(LoanService.class).to(LoanServiceImpl.class);

    }
}
