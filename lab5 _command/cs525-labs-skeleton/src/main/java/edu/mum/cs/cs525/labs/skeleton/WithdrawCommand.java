package edu.mum.cs.cs525.labs.skeleton;

public class WithdrawCommand implements Command{
    private String accountNumber;
    private double amount;
    private AccountDAO accountDAO;

    public WithdrawCommand(AccountDAO accountDAO, String accountNumber, double amount){
        this.accountDAO = accountDAO;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
    @Override
    public void execute() {
        Account account = accountDAO.loadAccount(accountNumber);
        account.withdraw(amount);

        accountDAO.updateAccount(account);
    }

    @Override
    public void undo() {
        Account account = accountDAO.loadAccount(accountNumber);
        account.deposit(amount);

        accountDAO.updateAccount(account);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
