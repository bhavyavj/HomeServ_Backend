package com.example.urban.FinalProject.Services;



import java.util.List;


import org.springframework.stereotype.Service;


@Service
public interface UserService {
	boolean signUp(String fullname, String email, String address, String password );

	public long login (String emailId, String password);

}
