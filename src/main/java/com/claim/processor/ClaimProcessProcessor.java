package com.claim.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.claim.dao.ClaimStatusDAO;
import com.claim.entity.ClaimStatus;

@Component
public class ClaimProcessProcessor {

	@Autowired
	private ClaimStatusDAO claimStatusDAO;

	public ClaimStatus updateClaimStatus(ClaimStatus claimStatus) {
		return claimStatusDAO.save(claimStatus);
	}

	public ClaimStatus getClaimStatus(long claimId) {
		return claimStatusDAO.findByClaimId(claimId);
	}

}
