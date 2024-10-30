package com.example.EInvoicings.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.EInvoicings.Model.Dto.InvoiceDto.GetInvoiceDto;
import com.example.EInvoicings.Model.Dto.InvoiceDto.SendInvoiceDto;
import com.example.EInvoicings.Model.Dto.InvoiceDto.updateInvoiceDto;

@Service
public interface InvoiceService {
	List<GetInvoiceDto> GetAll();
	GetInvoiceDto Get(Long id);
	
	SendInvoiceDto Send(SendInvoiceDto Dto );
	
	updateInvoiceDto update(updateInvoiceDto dto);

}
