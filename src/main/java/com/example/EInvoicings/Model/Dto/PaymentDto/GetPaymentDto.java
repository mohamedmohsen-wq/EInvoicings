package com.example.EInvoicings.Model.Dto.PaymentDto;

import java.time.LocalDateTime;

import com.example.EInvoicings.Model.Dto.UserDto.GetUserDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetPaymentDto {
	 private LocalDateTime paymentDate;
	 private Float amountPaid;

}
