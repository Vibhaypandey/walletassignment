package wallet.com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import wallet.com.springboot.entity.Transaction;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Integer>
{

  Transaction getById(int id);
 
}
