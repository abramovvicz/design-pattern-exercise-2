package account;

import logger.Logger;

public class AccountService {
    Logger logger = Logger.getInstance();
    public void withdraw(String accountNumber, double amount) {
        if (amount > 0 && AccountNumberValidator.validate(accountNumber)) {

            logger.log(amount + " has been withdraw from " + accountNumber);
        }
    }

    public void deposit(String accountNumber, double amount) {
        if (amount > 0 && AccountNumberValidator.validate(accountNumber)) {


            logger.log(amount + " has been deposit into " + accountNumber);
        }
    }
}
