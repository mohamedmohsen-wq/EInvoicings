package com.example.EInvoicings.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EInvoicings.Model.Dto.InvoiceDto.GetInvoiceDto;
import com.example.EInvoicings.Model.Dto.InvoiceDto.SendInvoiceDto;
import com.example.EInvoicings.Model.Dto.InvoiceDto.updateInvoiceDto;
import com.example.EInvoicings.Service.InvoiceService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class InvoiceController {
	private final InvoiceService ser;
	
	
@GetMapping("/Invoice")
	public List<GetInvoiceDto> GetAll() {
		return this.ser.GetAll();
		
	}

@GetMapping("/Invoice/{id}")
public GetInvoiceDto Get( @PathVariable Long id) {
	return this.ser.Get(id);
	}

@PostMapping("/Invoice")
public SendInvoiceDto Send(@RequestBody SendInvoiceDto Dto) {
	return this.ser.Send(Dto);
	
}

@PutMapping("/Invoice")
public updateInvoiceDto update(@RequestBody updateInvoiceDto dto) {
	return this.ser.update(dto);
	
	
}





}
	
	
