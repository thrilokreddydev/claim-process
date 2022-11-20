package com.claims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.claims.dao.ClaimsDAO;
import com.claims.model.Claims;

@RestController
public class ClaimProcessController {
	
	@Autowired
	private ClaimsDAO claimsDAO;
	
	@GetMapping("/getClaimDetails/{claimId}")
	public Claims getClaimStatus(@PathVariable int claimId){ 
		Claims data = claimsDAO.findByClaimId(claimId);
		return data;
	}
	
	@GetMapping("/getAllClaims")
	public List<Claims> getAllClaims(){ 
		List<Claims> data = claimsDAO.findAll();
		return data;
	}
	 

}
