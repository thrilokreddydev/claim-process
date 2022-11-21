package com.claim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.claim.entity.ClaimStatus;
import com.claim.processor.ClaimProcessProcessor;

@RestController
public class ClaimProcessController {

	@Autowired
	private ClaimProcessProcessor claimProcessProcessor;

	@PutMapping("/updateClaimStatus")
	public ResponseEntity<ClaimStatus> updateClaimStatus(@RequestBody ClaimStatus claimStatus) {
		return ResponseEntity.ok().body(claimProcessProcessor.updateClaimStatus(claimStatus));
	}

	@GetMapping("/getClaimStatus/{claimId}")
	public ResponseEntity<ClaimStatus> getClaimStatus(@PathVariable long claimId) {
		return ResponseEntity.ok().body(claimProcessProcessor.getClaimStatus(claimId));
	}

}
