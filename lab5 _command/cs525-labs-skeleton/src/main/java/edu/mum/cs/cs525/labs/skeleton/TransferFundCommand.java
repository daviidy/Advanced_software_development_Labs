package edu.mum.cs.cs525.labs.skeleton;

public class TransferFundCommand implements Command{
    private String fromAccountNumber;
    private String toAccountNumber;
    private String description;
    private double amount;
    private AccountDAO accountDAO;

    public TransferFundCommand(AccountDAO accountDAO, String fromAccountNumber, String toAccountNumber, double amount, String description){
        this.accountDAO = accountDAO;
        this.fromAccountNumber = fromAccountNumber;
        this.toAccountNumber = toAccountNumber;
        this.amount = amount;
        this.description = description;
    }
    @Override
    public void execute() {
        Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
        Account toAccount = accountDAO.loadAccount(toAccountNumber);
        fromAccount.transferFunds(toAccount, amount, description);
        accountDAO.updateAccount(fromAccount);
        accountDAO.updateAccount(toAccount);
    }

    @Override
    public void undo() {

    }

    public void setFromAccountNumber(String fromAccountNumber) {
        this.fromAccountNumber = fromAccountNumber;
    }

    public void setToAccountNumber(String toAccountNumber) {
        this.toAccountNumber = toAccountNumber;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
