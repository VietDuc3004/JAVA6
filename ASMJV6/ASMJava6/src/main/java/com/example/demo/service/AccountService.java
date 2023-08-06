package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Account;

public interface AccountService {
	public  Account findById(String username);

	public List<Account> getAdministrators();

	public List<Account> findAll();
}
