package com.akkidev.leadingBasket.repositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.akkidev.leadingBasket.Dao.BankDao;
import com.akkidev.leadingBasket.repository.BankRepository;

@Repository
public class BankRepositoryImpl implements BankRepository {

	
	@Autowired
	BankDao bankDao;
	
	@Override
	public long getBankCount() {
		
		return bankDao.getBankCount();
	}

}
