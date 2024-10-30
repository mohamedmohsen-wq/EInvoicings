package com.example.EInvoicings.Model.Dto.InvoiceDto;

import java.time.LocalDateTime;
import java.util.List;

import com.example.EInvoicings.Model.Entity.InvoiceEntity;
import com.example.EInvoicings.Model.Entity.PaymentEntity;
import com.example.EInvoicings.Model.Entity.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class 
SendInvoiceDto {
	 private Float amount;
	 private LocalDateTime issueDate;

	 private LocalDateTime dueDate;
	 private String status;
	 private Long  user_id;
	
}
