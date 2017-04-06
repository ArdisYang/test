package com.main;

import java.util.ArrayList;

import com.table.Account.Account;
import com.table.Account.AccountDAO;

public class Main {

	public static void main(String[] args) {
		
		AccountDAO accountDao = new AccountDAO();

		 for (int i = 1; i < 9; i++) {
		 Account account = new Account();
		 account.setName("TONY0" + i);
		 System.out.println("**********");
		 System.out.println(account.getId());
		 System.out.println(account.getName());
		 System.out.println("********");
		 accountDao.save(account);
		 }
	}

}
