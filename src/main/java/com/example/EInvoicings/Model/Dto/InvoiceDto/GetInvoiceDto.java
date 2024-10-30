package com.example.EInvoicings.Model.Dto.InvoiceDto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetInvoiceDto {
	 private Float amount;
	 private LocalDateTime issueDate;
	 private LocalDateTime dueDate;
	 private String status;
}
