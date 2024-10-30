package com.example.EInvoicings.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EInvoicings.Model.Entity.InvoiceEntity;
import com.example.EInvoicings.Model.Entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Long>  {

}
