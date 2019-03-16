package transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        TransactionRepo tRepo = applicationContext.getBean(TransactionRepo.class);
    
        tRepo.reuiredTransaction();
        tRepo.reuiredNewTransaction();
        tRepo.mandatoryTransaction();
        tRepo.nestedTransaction();
        tRepo.neverTransaction();
        tRepo.notSupportedTransaction();
        tRepo.notSupportedTransaction();
    }
    
}
