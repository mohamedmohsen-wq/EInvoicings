package com.example.EInvoicings.Model.Dto.PaymentDto;

import java.time.LocalDateTime;

import com.example.EInvoicings.Model.Dto.UserDto.GetUserDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SendPaymentDto {
	 private LocalDateTime paymentDate;
	 private Float amountPaid;
	 private Long invoice_id;

}
