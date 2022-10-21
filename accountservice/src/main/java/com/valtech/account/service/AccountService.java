package com.valtech.account.service;

import java.util.List;

import com.valtech.account.entity.Account;

public interface AccountService {

	Account createAccount(Account ac);

	Account updateAccount(Account ac);

	Account getAccount(long id);

	List<Account> getAllAccount();

	Account createSavingAccount(double balance);

	Account createCURRENTAccount(double balance);

}