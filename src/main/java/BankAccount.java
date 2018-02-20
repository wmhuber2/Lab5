import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    /**
     * get Ballance
     * @return
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Set Ballance
     * @param accountBalance
     */
    public void setAccountBalance(final double accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * get ownername.
     * @return
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * set owner name.
     * @param ownerName
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * wrew
     * @return werew
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * werew
     * @param accountNumber rwe
     */
    public void setAccountNumber(final int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * werew
     * @return werwe
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * wer
     * @param accountType wer
     */
    public void setAccountType(final BankAccountType accountType) {
        this.accountType = accountType;
    }

    /**
     * qerw
     * @return eqwr
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * erwer
     * @param interestRate werew
     */
    public void setInterestRate(final double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * hget int
     * @return sfds
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * stfuhudc
     * @param interestEarned sdfds
     */
    public void setInterestEarned(final double interestEarned) {
        this.interestEarned = interestEarned;
    }

    /**
     *
     */
    private int accountNumber;
    /**
     *
     */
    private BankAccountType accountType;
    /**
     *
     */
    private double accountBalance;
    /**
     *
     */
    private String ownerName;
    /**
     *
     */
    private double interestRate;
    /**
     *
     */
    private double interestEarned;

    /**
     * new.
     * @param name duh.
     * @param accountCategory duh.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        Bank.addNewAccount();
        this.accountType = accountCategory;
        this.accountBalance = 0;
        this.ownerName = name;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}