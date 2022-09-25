package wallet.com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wallet.com.springboot.entity.Transaction;

import wallet.com.springboot.repository.TransactionRepo;

@Service
public class TransactionService {
	@Autowired
    private TransactionRepo trepo;
	public Transaction balance(int id) {
		Transaction tran =trepo.getById(id);
		return tran;
	}
	public void addCategory(Transaction category) {
		// TODO Auto-generated method stub
		this.trepo.save(category);
	}
}
