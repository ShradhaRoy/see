package com.cg.mra.service;
import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;
import com.cg.mra.exceptions.InvalidMobileNumberException;

public class AccountServiceImpl implements AccountService {
	private AccountDao acc= new AccountDaoImpl();

	@Override
	public Account getAccountDetails(String mobileNo) throws InvalidMobileNumberException {
		Account account= acc.getAccountDetails(mobileNo);
		if(mobileNo.equals("9010210131")|| mobileNo.equals("9823920123")|| mobileNo.equals("9932012345")||
				mobileNo.equals("9010210132")||mobileNo.equals("9010210133"))
			return account;
		else 
			throw new InvalidMobileNumberException("Invalid Mobile Number");
		
	}

	@Override
	public double rechargeAccount(String mobileNo, double rechargeAmount) throws InvalidMobileNumberException {
		Account account=acc.getAccountDetails(mobileNo);
		if(mobileNo.equals("9010210131")|| mobileNo.equals("9823920123")|| mobileNo.equals("9932012345")||
				mobileNo.equals("9010210132")||mobileNo.equals("9010210133")) {
		account.setAccountBalance(account.getAccountBalance()+rechargeAmount);
		return account.getAccountBalance();
		}
		else
			throw new InvalidMobileNumberException("Invalid Mobile Number");
	}

}
