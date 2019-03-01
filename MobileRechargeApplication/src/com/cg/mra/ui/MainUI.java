package com.cg.mra.ui;

import java.util.Scanner;

import com.cg.mra.beans.Account;
import com.cg.mra.exceptions.InvalidMobileNumberException;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

public class MainUI {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AccountService services=new AccountServiceImpl();
		while(true) {
		System.out.println("Enter Your Choice Of Operation");
		System.out.println("1) Account Balance Entry \n2)RechargeAccount \n3)Exit");
		int choice=sc.nextInt();
	
		switch(choice){
		case 1:
			System.out.println("Account Balance:");
			try {
				
				System.out.println("Enter Mobile No: ");
				String mobileNo=sc.next();
				Account account=services.getAccountDetails(mobileNo);
				System.out.println("Your Current Balance is: "+account.getAccountBalance());

			}catch(InvalidMobileNumberException e) {
				System.err.println("Error: Given Account Id does no exist");
			}break;
		case 2:
			try {
				System.out.println("Enter Mobile Number");
				String mobileNo=sc.next();
				Account account=services.getAccountDetails(mobileNo);
				System.out.println("Enter Recharge Amount: ");
				double rechargeAmt=sc.nextDouble();
				account.setAccountBalance(account.getAccountBalance()+rechargeAmt);
				System.out.println("Your account recharged successfully");
				System.out.println("Hello "+account.getCustomerName()+", Available Balance is Rs."+account.getAccountBalance());
			}catch(InvalidMobileNumberException e) {
				System.err.println("ERROR: Cannot Recharge Account as Given Mobile No.Does not Exist");
			}
			break;
		case 3:
			System.out.println("exit");
			System.exit(-1);
		}
		}
	}
}