package com.example.EInvoicings.Model.Mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.EInvoicings.Model.Dto.PaymentDto.GetPaymentDto;
import com.example.EInvoicings.Model.Dto.PaymentDto.SendPaymentDto;
import com.example.EInvoicings.Model.Entity.PaymentEntity;

@Mapper(componentModel = "spring")

public interface MapperPayment {
	List< GetPaymentDto> ListGet(List<PaymentEntity> ListEntity);
	List<PaymentEntity> ListEntity(List< GetPaymentDto> ListGet);
	
	PaymentEntity send(SendPaymentDto sendentity);
	SendPaymentDto sendentity(PaymentEntity send);
	

}
