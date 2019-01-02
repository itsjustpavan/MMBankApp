package com.moneymoney.account.dao;

import java.sql.SQLException;
import java.util.List;

import com.moneymoney.account.SavingsAccount;
import com.moneymoney.exception.AccountNotFoundException;

public interface SavingsAccountDAO {

	SavingsAccount createNewAccount(SavingsAccount account)
			throws ClassNotFoundException, SQLException;

	SavingsAccount getAccountById(int accountNumber)
			throws ClassNotFoundException, SQLException,
			AccountNotFoundException;

	SavingsAccount deleteAccount(int accountNumber)
			throws ClassNotFoundException, SQLException,
			AccountNotFoundException;

	SavingsAccount searchAccount(int accountNumber)
			throws ClassNotFoundException, SQLException,
			AccountNotFoundException;

	List<SavingsAccount> getAllSavingsAccount() throws ClassNotFoundException,
			SQLException;

	SavingsAccount updateAccount(SavingsAccount account) throws SQLException,
			ClassNotFoundException;

	double checkBalance(int accountNumber) throws ClassNotFoundException,
			SQLException, AccountNotFoundException;

	void updateBalance(int accountNumber, double currentBalance)
			throws ClassNotFoundException, SQLException;

	void commit() throws SQLException;

}
