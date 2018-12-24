package com.akkidev.leadingBasket.ServiceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Activity.BankActivity;
import com.akkidev.leadingBasket.Service.BankService;

@Service
@Transactional
public class BankServiceImpl implements BankService {

	@Autowired
	BankActivity bankActivity;
	
	@Override
	public long getBankCount() {
		
		return bankActivity.getBankCount();
	}

}
