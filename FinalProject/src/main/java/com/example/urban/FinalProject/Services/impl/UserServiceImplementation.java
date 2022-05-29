package com.example.urban.FinalProject.Services.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.urban.FinalProject.Services.UserService;
import com.example.urban.FinalProject.bean.Users;
import com.example.urban.FinalProject.repo.UserRepository;

@Service
public class UserServiceImplementation implements UserService{

	@Autowired
	UserRepository userRepository;

	
	public boolean signUp(String fullname, String email, String address, String password ) {
		try {
			Users user = new Users();
			user.setFullname(fullname);
			user.setEmail(email);
			user.setAddress(address);
			user.setPassword(password);
			userRepository.save(user);	
			return true;
		}
		catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}



	
	
	@Override
	public long login (String emailId,String password)
	{
		List<String> l1=userRepository.findEmailandPassword();
		Users user = userRepository.findByEmailAndPassword(emailId, password);
		int flag=0;
		for(String a:l1)
		{
			String a1[]=a.split(",");
			if(emailId.equals(a1[0]) && password.equals(a1[1]))
			{
				flag=1;
				System.out.println(emailId);
				break;
			}
		
		
		}
		
		if(flag==1)
		{
			return user.getUserid();
		}
		else
		{
			return -1;
		}
		
		
		
		
	}

     


}
