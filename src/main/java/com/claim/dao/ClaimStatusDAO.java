package com.claim.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claim.entity.ClaimStatus;

public interface ClaimStatusDAO extends JpaRepository<ClaimStatus, Long> {

	ClaimStatus findByClaimId(long claimId);

}
