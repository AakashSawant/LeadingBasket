package com.akkidev.leadingBasket.repositoryImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.akkidev.leadingBasket.Dao.BankDao;
import com.akkidev.leadingBasket.entities.bank_charge;
import com.akkidev.leadingBasket.entities.bank_master;
import com.akkidev.leadingBasket.repository.BankRepository;

@Repository
public class BankRepositoryImpl implements BankRepository {

	
	@Autowired
	BankDao bankDao;
	
	@Override
	public long getBankCount() {
		
		return bankDao.getBankCount();
	}

	@Override
	public List<bank_master> getAllBanks() {
		// TODO Auto-generated method stub
		return bankDao.getAllBanks();
	}

	@Override
	public bank_master getBankByName(String name) {
		// TODO Auto-generated method stub
		return bankDao.getBankByName(name);
	}

	@Override
	public List<bank_charge> getAllBankWithCharge(int id) {
		// TODO Auto-generated method stub
		return bankDao.getAllBankWithCharge(id);
	}

}
