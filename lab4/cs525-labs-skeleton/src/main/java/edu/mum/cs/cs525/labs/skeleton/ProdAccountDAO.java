package edu.mum.cs.cs525.labs.skeleton;

public class ProdAccountDAO extends AccountDAOImpl {
    public void saveAccount(Account account) {
        accountlist.add(account); // add the new
    }

    public void updateAccount(Account account) {
        Account accountexist = loadAccount(account.getAccountNumber());
        if (accountexist != null) {
            accountlist.remove(accountexist); // remove the old
            accountlist.add(account); // add the new
        }

    }
}
