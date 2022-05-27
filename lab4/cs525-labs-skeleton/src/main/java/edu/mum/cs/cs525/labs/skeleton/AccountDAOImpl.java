package edu.mum.cs.cs525.labs.skeleton;

import java.util.ArrayList;
import java.util.Collection;

public abstract class AccountDAOImpl implements AccountDAO {
	Collection<Account> accountlist = new ArrayList<Account>();

	public abstract void saveAccount(Account account);

	public abstract void updateAccount(Account account);

	public Account loadAccount(String accountNumber) {
		for (Account account : accountlist) {
			if (account.getAccountNumber() == accountNumber) {
				return account;
			}
		}
		return null;
	}

	public Collection<Account> getAccounts() {
		return accountlist;
	}

}
