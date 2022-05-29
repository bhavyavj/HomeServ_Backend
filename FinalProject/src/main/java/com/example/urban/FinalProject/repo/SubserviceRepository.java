package com.example.urban.FinalProject.repo;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.urban.FinalProject.bean.FinalResponse;
import com.example.urban.FinalProject.bean.SubServices;

public interface SubserviceRepository extends JpaRepository<SubServices,Integer> {
	boolean existsBySubservice(String subservice);
	@Query("select distinct category from SubServices")
	List<String> findDistinctByCategory();
	@Query("select service from SubServices s where s.category=:category")
	List<String> findByCategory(String category);

	List<SubServices> findByService(String service );
}

