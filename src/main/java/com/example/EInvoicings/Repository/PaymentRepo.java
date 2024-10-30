package com.example.EInvoicings.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EInvoicings.Model.Entity.InvoiceEntity;
import com.example.EInvoicings.Model.Entity.PaymentEntity;

public interface PaymentRepo extends JpaRepository<PaymentEntity, Long>  {

}
