package com.example.EInvoicings.Model.Dto.InvoiceDto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class updateInvoiceDto {
	private Long id;
	 
	 private String status;
	 private Long  user_id;

}
