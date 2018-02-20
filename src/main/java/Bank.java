/**
 * Implement a bank class.
 * <p>
 * In this lab we will model a bank. We have two classes: Bank and BankAccount. You should finish
 * both classes, by fixing checkstyle errors, defining constructors, getters and setters, and
 * accessing private variables.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class Bank {
    /**
     * Bank Name
     */
    private String bankName;

    public Bank() {
        bankName = "Illini Bank";
    }

    /**
     * Withdraw money from an account.
     * <p>
     * Subtracts the amount of money from bank account's balance. Returns true if transaction is
     * successful, false otherwise.
     *
     * @param bankAccount to withdraw money from.
     * @param amount to withdraw (double)
     * @return boolean
     */
    public static boolean withdrawMoney(final BankAccount bankAccount, final double amount) {
        if (amount > 0){
            bankAccount.setAccountBalance(bankAccount.getAccountBalance() - amount);
            return true;
        }
        return false;
    }

    /**
     * Deposit money in an account.
     * <p>
     * Adds the amount of money to bank account's balance. Returns true if transaction is
     * successful, false otherwise.
     *
     * @param bankAccount to deposit money to.
     * @param amount to deposit
     * @return boolean
     */
    public static boolean depositMoney(final BankAccount bankAccount, final double amount) {
        if (amount > 0){
            bankAccount.setAccountBalance(bankAccount.getAccountBalance() + amount);
            return true;
        }
        return false;

    }

    /**
     * Stuff
     * @param source s.
     * @param destination d.
     * @param amount am.
     * @return
     */
    public static boolean transferMoney(final BankAccount source, final BankAccount destination,
            final double amount) {
        if (withdrawMoney(source, amount)) {
            return depositMoney(destination, amount);
        }
        return false;
    }

    /**
     * Change back account owner name.
     *
     * @param bankAccount to change
     * @param name new name to set
     */
    public static void changeOwnerName(final BankAccount bankAccount, final String name) {
        bankAccount.setOwnerName(name);
    }

    /**
     * number accounts
     */
    private static int totalAccounts = 0;
    /**
     * Uses static variable to get number of bank accounts opened.
     *
     * @return the total number of accounts
     */
    public static int getNumberOfAccount() {
        return totalAccounts;
    }

    /**
     * adds 1 to totalaccounts
     */
    public static void addNewAccount() {
        totalAccounts++;
    }

    /**
     * Main method for testing.
     *
     * @param unused unused input arguments
     */
    @SuppressWarnings("checkstyle:magicnumber")
    public static void main(final String[] unused) {
        Bank bank = new Bank();
        System.out.println("Welcome to " + bank.bankName);
        System.out.println("We are excited to have you banking with us!\n\n");

        // Create Bank Accounts
        BankAccount account1 = new BankAccount("John Doe", BankAccount.BankAccountType.CHECKINGS);
        System.out.println("Bank account for John Doe created");

        BankAccount account2 = new BankAccount("Jony Ive", BankAccount.BankAccountType.STUDENT);
        System.out.println("Bank account for Johy Ive created\n\n");

        // Deposit money to both accounts and print new balance
        bank.depositMoney(account1, 1000.0);
        bank.depositMoney(account2, 5000.0);

        // Withdraw money from Account 2 and print new balance
        bank.withdrawMoney(account2, 200.0);

        // Transfer money from Account 2 to Account 1 and print new balances
        bank.transferMoney(account2, account1, 350.0);

        // Print number of accounts
        System.out.print("Number of active accounts at " + bank.bankName + " are ");
        System.out.println(Bank.totalAccounts);
    }
}
