package com.example.urban.FinalProject.controller;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.urban.FinalProject.Services.SubserviceService;
import com.example.urban.FinalProject.bean.FinalResponse;
import com.example.urban.FinalProject.bean.Purchase;
import com.example.urban.FinalProject.bean.PurchaseRequestPojo;
import com.example.urban.FinalProject.bean.SubServices;



@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("/service")
public class ServiceController {
	@Autowired
	private SubserviceService subservice;
	
	@PostMapping("/add")
	public boolean addSubService(String category, String service, String subservice, int cost)
	{
		return this.subservice.addSubService(category,service,subservice,cost);
	}
	@GetMapping("/getCategories")
	public  List<String> getCategories()
	{
		return subservice.getCategories();
	}
	@GetMapping("/getService/{category}")
	public List<String> getServicefromCategory(@PathVariable String category)
	{
		return subservice.getServicefromCategory(category);
	}
	
	@PostMapping("/subscribe")
	public boolean Subscribe(@RequestBody PurchaseRequestPojo pur)
	{
		
	return subservice.Subscribe(pur.getReferenceNumber(),pur.getUserId(),pur.getSubserviceId());
	
	}
	@GetMapping("/orders")
	public List<String> getPastOrders(int userid)
	{
		return subservice.getPastOrders(userid);
	}
	@GetMapping("/getsubservice/{service}")
	public List<FinalResponse> getSubService(@PathVariable String service)
	{
		return subservice.getSubService(service);
	}
	
}
