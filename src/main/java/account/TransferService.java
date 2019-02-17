package account;

import logger.Logger;

public class TransferService {
    public void transfer(final String accountNumberSource, final String accountNumberDestination, double ammount) {
        if (ammount > 0 && AccountNumberValidator.validate(accountNumberSource)
                && AccountNumberValidator.validate(accountNumberDestination)) {
            Logger logger = Logger.getInstance();
            logger.log("money from " + accountNumberSource + " to " + accountNumberDestination + " has been transferred ...");
//            System.out.println("money from " + accountNumberSource + " to " + accountNumberDestination + " has been transferred ...");

        }
    }
}
