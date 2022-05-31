package edu.mum.cs.cs525.labs.skeleton;

import java.util.Collection;

public interface AccountService {
    Account createAccount(String accountNumber, String customerName);
    Account getAccount(String accountNumber);
    Collection<Account> getAllAccounts();
    void deposit ();
    void undo(Command command);
    void withdraw ();
    void transferFunds();
    void setCommand(Command command);

    AccountDAO getAccountDAO();
}
