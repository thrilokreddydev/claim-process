package com.claims.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claims.model.Claims;

public interface ClaimsDAO extends JpaRepository<Claims, Integer> {

	Claims findByClaimId(int vehicleVin);

}