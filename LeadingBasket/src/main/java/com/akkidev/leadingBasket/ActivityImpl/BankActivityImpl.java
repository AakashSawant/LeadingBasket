package com.akkidev.leadingBasket.ActivityImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Activity.BankActivity;
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

}
