package com.example.EInvoicings.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EInvoicings.Model.Dto.PaymentDto.GetPaymentDto;
import com.example.EInvoicings.Model.Dto.PaymentDto.SendPaymentDto;
import com.example.EInvoicings.Service.PaymentService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class paymentController {
	private final PaymentService ser;
	@GetMapping("/Payment")
	public List<GetPaymentDto> GetAll() {
		return this.ser.GetAll();
		
		
	}
	@PostMapping("/Payment")
	
	
	public SendPaymentDto Send( @RequestBody SendPaymentDto Dto) {
		return this.ser.Send(Dto);
		
		
	}

}
