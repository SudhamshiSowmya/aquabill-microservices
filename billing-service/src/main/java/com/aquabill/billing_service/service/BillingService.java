package com.aquabill.billing_service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aquabill.billing_service.model.Bill;
import com.aquabill.billing_service.repository.BillingRepository;

@Service
public class BillingService {

    @Autowired
    private BillingRepository billingRepository;


    // CREATE BILL
    public Bill createBill(Bill bill) {
        return billingRepository.save(bill);
    }


    // GET ALL BILLS
    public List<Bill> getAllBills() {
        return billingRepository.findAll();
    }


    // GET BILL BY ID
    public Optional<Bill> getBillById(Long id) {
        return billingRepository.findById(id);
    }


    // DELETE BILL
    public void deleteBill(Long id) {
        billingRepository.deleteById(id);
    }
}