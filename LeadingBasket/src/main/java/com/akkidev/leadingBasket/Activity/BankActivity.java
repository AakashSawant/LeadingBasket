/**
 * 
 */
package com.akkidev.leadingBasket.Activity;

import java.util.List;

import com.akkidev.leadingBasket.entities.bank_charge;
import com.akkidev.leadingBasket.entities.bank_master;

/**
 * @author Aakash
 *
 */
public interface BankActivity {

	public long getBankCount();
	 public List<bank_master> getAllBanks();
	 public bank_master getBankByName(String name);
	 public List<bank_charge> getAllBankWithCharge(int id);
}
