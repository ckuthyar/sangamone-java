package com.sangamone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sangamone.entity.Pincode2;


public interface Pincode2Repo extends JpaRepository<Pincode2, Integer> {
	
	@Query(value="select * from pincode where pincode=?1", nativeQuery=true)
	List<Pincode2> getPincode(int pincode);

}
