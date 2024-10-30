package com.example.EInvoicings.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EInvoicings.Model.Entity.InvoiceEntity;


public interface InvoiceRepo extends JpaRepository<InvoiceEntity, Long> {

}
