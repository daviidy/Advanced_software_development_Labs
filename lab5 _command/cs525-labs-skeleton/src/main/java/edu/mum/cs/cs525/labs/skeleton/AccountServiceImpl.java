package edu.mum.cs.cs525.labs.skeleton;

import java.util.Collection;

public class AccountServiceImpl implements AccountService {
	private AccountDAO accountDAO;

	private Command command;
	
	public AccountServiceImpl(){
		accountDAO = new AccountDAOImpl();
	}

	public Account createAccount(String accountNumber, String customerName) {
		Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		
		accountDAO.saveAccount(account);
		
		return account;
	}

	public void deposit() {
		command.execute();
	}

	@Override
	public void undo(Command command) {
		command.undo();
	}

	public Account getAccount(String accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		return account;
	}

	public Collection<Account> getAllAccounts() {
		return accountDAO.getAccounts();
	}

	public void withdraw() {
		command.execute();
	}



	public void transferFunds() {
		command.execute();
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	@Override
	public AccountDAO getAccountDAO(){
		return this.accountDAO;
	}
}
