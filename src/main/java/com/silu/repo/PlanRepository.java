package com.silu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.silu.entity.CitizenPlan;

public interface PlanRepository extends JpaRepository<CitizenPlan, Integer>{
	
	@Query("select distinct (planName) from CitizenPlan")
	public List<String> getPlanNames() ;
	
	@Query("select distinct (planStatus) from CitizenPlan")
	public List<String> getPlanStatus() ;
	

}
