package com.aquabill.payment_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aquabill.payment_service.model.Payment;
import com.aquabill.payment_service.repository.PaymentRepository;


@Service
public class PaymentService {


    @Autowired
    private PaymentRepository paymentRepository;


    // Create Payment
    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }


    // Get All Payments
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }


    // Get Payment By ID
    public Payment getPaymentById(Long id) {
        return paymentRepository.findById(id).orElse(null);
    }


    // Delete Payment
    public void deletePayment(Long id) {
        paymentRepository.deleteById(id);
    }
}
