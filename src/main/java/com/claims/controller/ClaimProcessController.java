package com.claims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.claims.dao.ClaimStatusDAO;
import com.claims.dao.ClaimsDAO;
import com.claims.model.ClaimStatus;
import com.claims.model.Claims;

@RestController
public class ClaimProcessController {
	
	@Autowired
	private ClaimsDAO claimsDAO;
	
	@Autowired
	private ClaimStatusDAO claimStatusDAO;
	
	@GetMapping("/getClaimDetails/{claimId}")
	public Claims getClaimDetails(@PathVariable int claimId){ 
		Claims data = claimsDAO.findByClaimId(claimId);
		return data;
	}
	
	@GetMapping("/getAllClaims")
	public List<Claims> getAllClaims(){ 
		List<Claims> data = claimsDAO.findAll();
		return data;
	}
	
	@PostMapping(path="/updateClaimStatus")
	public String updateClaimStatus(@RequestBody ClaimStatus claimStatus) {
	
		claimStatusDAO.save(claimStatus);
		return "Claim Status Updated";		
	}
	
	@GetMapping("/getClaimStatus/{claimId}")
	public ClaimStatus getClaimStatus(@PathVariable int claimId){ 
		ClaimStatus data = claimStatusDAO.findByClaimId(claimId);
		return data;
	}

}
