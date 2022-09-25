package wallet.com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wallet.com.springboot.entity.User;
import wallet.com.springboot.repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	private LoginRepository loginrepo;
	public User loginmethod(String email,String	password) {
		User user =loginrepo.findByEmailAndPassword(email, password);
		return user;
	}
}
