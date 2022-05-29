package com.example.urban.FinalProject.repo;
import com.example.urban.FinalProject.bean.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PurchaseRepository extends JpaRepository<Purchase,Integer> {

	public Purchase findById(int userid);
}
