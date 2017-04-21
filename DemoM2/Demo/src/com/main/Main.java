package com.main;

import java.util.ArrayList;

import com.table.Personnel.Personnel;
import com.table.Personnel.PersonnelDAO;

public class Main {

	public static void main(String[] args) {
		
		PersonnelDAO accountDao = new PersonnelDAO();

		 for (int i = 1; i < 9; i++) {
		 Personnel account = new Personnel();
		 account.setName("TONY0" + i);
		 System.out.println("**********");
		 System.out.println(account.getId());
		 System.out.println(account.getName());
		 System.out.println("********");
		 accountDao.save(account);
		 }
	}

}
