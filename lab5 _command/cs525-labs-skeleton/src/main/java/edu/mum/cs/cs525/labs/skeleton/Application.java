package edu.mum.cs.cs525.labs.skeleton;

public class Application {
	public static void main(String[] args) {

		AccountService accountService = new AccountServiceImpl();

		DepositCommand depositCommand = new DepositCommand(
				accountService.getAccountDAO(),
				"1263862",
				240
		);

		WithdrawCommand withdrawCommand = new WithdrawCommand(
				accountService.getAccountDAO(),
				"1263862",
				230
		);
		accountService.setCommand(depositCommand);

		// create 2 accounts;
		accountService.createAccount("1263862", "Frank Brown");
		accountService.createAccount("4253892", "John Doe");
		// use account 1;
		//accountService.deposit("1263862", 240);
		accountService.deposit();
		accountService.setCommand(withdrawCommand);
		accountService.withdraw();
		//accountService.deposit("1263862", 529);
		//accountService.withdraw("1263862", 230);
		// use account 2;
		depositCommand.setAccountNumber("4253892");
		depositCommand.setAmount(12450);
		accountService.setCommand(depositCommand);
		accountService.deposit();
		accountService.undo(depositCommand);
		//accountService.deposit("4253892", 12450);
		//accountService.transferFunds("4253892", "1263862", 100, "payment of invoice 10232");
		// show balances

		for (Account account : accountService.getAllAccounts()) {
			Customer customer = account.getCustomer();
			System.out.println("Statement for Account: " + account.getAccountNumber());
			System.out.println("Account Holder: " + customer.getName());
			
			System.out.println("-Date-------------------------" 
					+ "-Description------------------" 
					+ "-Amount-------------");
			
			for (AccountEntry entry : account.getEntryList()) {
				System.out.printf("%30s%30s%20.2f\n", 
						entry.getDate().toString(), 
						entry.getDescription(),
						entry.getAmount());
			}
			
			System.out.println("----------------------------------------" + "----------------------------------------");
			System.out.printf("%30s%30s%20.2f\n\n", "", "Current Balance:", account.getBalance());
		}
	}

}
