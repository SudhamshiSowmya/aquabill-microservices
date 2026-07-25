package com.aquabill.billing_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aquabill.billing_service.model.Bill;

@Repository
public interface BillingRepository extends JpaRepository<Bill, Long> {

}