package com.aquabill.billing_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.aquabill.billing_service.model.Bill;
import com.aquabill.billing_service.service.BillingService;


@RestController
@RequestMapping("/bills")
public class BillingController {


    @Autowired
    private BillingService billingService;


    // CREATE BILL
    @PostMapping
    public Bill createBill(@RequestBody Bill bill) {
        return billingService.createBill(bill);
    }


    // GET ALL BILLS
    @GetMapping
    public List<Bill> getAllBills() {
        return billingService.getAllBills();
    }


    // GET BILL BY ID
    @GetMapping("/{id}")
    public ResponseEntity<Bill> getBillById(@PathVariable Long id) {

        return billingService.getBillById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    // DELETE BILL
    @DeleteMapping("/{id}")
    public String deleteBill(@PathVariable Long id) {

        billingService.deleteBill(id);

        return "Bill deleted successfully";
    }
}