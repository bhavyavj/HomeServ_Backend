package com.example.urban.FinalProject.Services;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.stereotype.Service;

import com.example.urban.FinalProject.bean.FinalResponse;
import com.example.urban.FinalProject.bean.SubServices;

@Service
public interface SubserviceService {

	 boolean addSubService(String category, String service, String subservice, int cost);
	 List<String> getCategories();
	 public List<String> getServicefromCategory(String category);
	 public boolean Subscribe(int referencenumber ,long userid , int  subserviceid);
	 public List<String> getPastOrders(int userid);
	public List<FinalResponse> getSubService(String service);
}