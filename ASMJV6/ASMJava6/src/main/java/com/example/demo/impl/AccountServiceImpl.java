package com.example.demo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Account;
import com.example.demo.repository.AccountRepository;
import com.example.demo.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepository dao;

	@Override
	public Account findById(String username) {
		return dao.findById(username).get();
	}


	public List<Account> getAdministrators() {
		// TODO Auto-generated method stub
		return dao.getAdministrators();
	}

	
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
