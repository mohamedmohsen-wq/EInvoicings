package com.example.EInvoicings.Service.imp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.EInvoicings.Model.Dto.PaymentDto.GetPaymentDto;
import com.example.EInvoicings.Model.Dto.PaymentDto.SendPaymentDto;
import com.example.EInvoicings.Model.Entity.InvoiceEntity;
import com.example.EInvoicings.Model.Entity.PaymentEntity;
import com.example.EInvoicings.Model.Mapper.MapperPayment;
import com.example.EInvoicings.Repository.InvoiceRepo;
import com.example.EInvoicings.Repository.PaymentRepo;
import com.example.EInvoicings.Service.PaymentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PaymentImp  implements PaymentService{
private final MapperPayment map;
private final PaymentRepo repo;
private final InvoiceRepo Invoicerepo;


	@Override
	public List<GetPaymentDto> GetAll() {
		List<PaymentEntity> GetAll=this.repo.findAll();
		
		return this.map.ListGet(GetAll);
	}


	@Override
	public SendPaymentDto Send(SendPaymentDto Dto) {
		PaymentEntity send=this.map.send(Dto);
		InvoiceEntity Invoice=this.Invoicerepo.findById(Dto.getInvoice_id()).orElseThrow();
		send.setInvoice(Invoice);
		PaymentEntity send1=this.repo.save(send);
		SendPaymentDto respons=this.map.sendentity(send1);
		return respons;
	}

}
