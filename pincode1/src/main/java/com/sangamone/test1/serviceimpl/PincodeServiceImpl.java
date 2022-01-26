package com.sangamone.test1.serviceimpl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.sangamone.test1.service.PincodeService;
import com.sangamone.test1.vo.PincodeVO;

@Service
public class PincodeServiceImpl implements PincodeService{
	Map<Integer,String> locmap;
	
@PostConstruct
private void initialize() {
	locmap=new HashMap<>();
	locmap.put(560083,"Gottigere");
	locmap.put(560041,"Jayanagar");
}

	@Override
	public PincodeVO displayLocation(int pincode) {
		// TODO Auto-generated method stub
		String loc = locmap.get(pincode);
		PincodeVO pincodeVO = new PincodeVO(pincode, loc);	
		return pincodeVO;
	}
	

}
