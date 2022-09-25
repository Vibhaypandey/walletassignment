package wallet.com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import wallet.com.springboot.entity.User;

@Repository
public interface LoginRepository extends JpaRepository<User, Integer>  {
		User findByEmailAndPassword(String email, String password);
	
}