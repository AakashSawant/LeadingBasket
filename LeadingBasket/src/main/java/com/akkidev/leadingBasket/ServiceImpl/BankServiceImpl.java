package com.akkidev.leadingBasket.ServiceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Activity.BankActivity;
import com.akkidev.leadingBasket.Service.BankService;
import com.akkidev.leadingBasket.entities.bank_charge;
import com.akkidev.leadingBasket.entities.bank_master;

@Service
@Transactional
public class BankServiceImpl implements BankService {

	@Autowired
	BankActivity bankActivity;
	
	@Override
	public long getBankCount() {
		
		return bankActivity.getBankCount();
	}

	@Override
	public List<bank_master> getAllBanks() {
		// TODO Auto-generated method stub
		return bankActivity.getAllBanks();
	}

	@Override
	public bank_master getBankByName(String name) {
		// TODO Auto-generated method stub
		return bankActivity.getBankByName(name);
	}

	@Override
	public List<bank_charge> getAllBankWithCharge(int id) {
		// TODO Auto-generated method stub
		return bankActivity.getAllBankWithCharge(id);
	}

}
