package com.example.urban.FinalProject.Services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.urban.FinalProject.Services.SubserviceService;
import com.example.urban.FinalProject.bean.FinalResponse;
import com.example.urban.FinalProject.bean.Purchase;
import com.example.urban.FinalProject.bean.SubServices;
import com.example.urban.FinalProject.bean.Users;
import com.example.urban.FinalProject.repo.PurchaseRepository;
import com.example.urban.FinalProject.repo.SubserviceRepository;
import com.example.urban.FinalProject.repo.UserRepository;

@Service
public class SubserviceServiceImpl implements SubserviceService {
	@Autowired
	
	SubserviceRepository subRepository;
	@Autowired
	PurchaseRepository pur;
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	SubserviceRepository subservicerep;
	
	@Override
	public boolean addSubService(String category, String service, String subservice, int cost)
	 {
		if(subRepository.existsBySubservice(subservice))
			return false;
		SubServices sub=new SubServices();
		sub.setCategory(category);
		sub.setService(service);
		sub.setSubservice(subservice);
		sub.setCost(cost);
		subRepository.save(sub);
		return true;
		
	 }
	@Override
	public  List<String> getCategories()
	{
		return subRepository.findDistinctByCategory();
	}
@Override
	public List<String> getServicefromCategory(String category)
	{
		return subRepository.findByCategory(category);
	}
 
@Override
public boolean Subscribe(int referencenumber ,long userId , int subserviceid)
{
	Users user=userRepository.getById(userId);
	SubServices sub=subservicerep.getById(subserviceid);
	if(user==null || sub==null) return false;
	Purchase pub=new Purchase();
	pub.setUser(user);
	pub.setSub(sub);
	pub.setReferenceNumber(referencenumber);
	pur.save(pub);
return true;
}
@Override
public List<String> getPastOrders(int userid)
{
 
	
	
	Purchase p=pur.findById(userid);
	
 SubServices sub=p.getSub();
 List<String>l=new ArrayList<>();
 l.add(sub.getService());
 l.add(sub.getSubservice());
 l.add(sub.getCategory());
 return l;
}
@Override
public List<FinalResponse> getSubService(String service)
{
	List<SubServices> subservices = subRepository.findByService(service);
	List<FinalResponse> response = new ArrayList<FinalResponse>();
	for(SubServices s:subservices) {
		FinalResponse r = new FinalResponse();
		r.setCost(s.getCost());
		r.setSubservice(s.getSubservice());
	    r.setId(s.getId());
		response.add(r);
	}
	return response;
}

}
