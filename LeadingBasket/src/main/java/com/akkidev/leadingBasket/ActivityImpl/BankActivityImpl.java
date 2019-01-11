package com.akkidev.leadingBasket.ActivityImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Activity.BankActivity;
import com.akkidev.leadingBasket.entities.bank_charge;
import com.akkidev.leadingBasket.entities.bank_master;
import com.akkidev.leadingBasket.repository.BankRepository;

@Service
public class BankActivityImpl implements BankActivity {

	@Autowired
	BankRepository bankRepository;
	
	@Override
	public long getBankCount() {
		// TODO Auto-generated method stub
		return bankRepository.getBankCount();
	}

	@Override
	public List<bank_master> getAllBanks() {
		// TODO Auto-generated method stub
		return bankRepository.getAllBanks();
	}

	@Override
	public bank_master getBankByName(String name) {
		// TODO Auto-generated method stub
		return bankRepository.getBankByName(name);
	}

	@Override
	public List<bank_charge> getAllBankWithCharge(int id) {
		// TODO Auto-generated method stub
		return bankRepository.getAllBankWithCharge(id);
	}

}
