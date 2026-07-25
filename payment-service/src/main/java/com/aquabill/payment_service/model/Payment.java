package com.aquabill.payment_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long billId;

    private Double amount;

    private String paymentStatus;

    private String paymentDate;


    public Payment() {
    }


    public Payment(Long id, Long billId, Double amount, String paymentStatus, String paymentDate) {
        this.id = id;
        this.billId = billId;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
        this.paymentDate = paymentDate;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Long getBillId() {
        return billId;
    }


    public void setBillId(Long billId) {
        this.billId = billId;
    }


    public Double getAmount() {
        return amount;
    }


    public void setAmount(Double amount) {
        this.amount = amount;
    }


    public String getPaymentStatus() {
        return paymentStatus;
    }


    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }


    public String getPaymentDate() {
        return paymentDate;
    }


    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }
}