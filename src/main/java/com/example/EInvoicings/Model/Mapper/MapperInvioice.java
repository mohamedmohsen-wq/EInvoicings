package com.example.EInvoicings.Model.Mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.EInvoicings.Model.Dto.InvoiceDto.GetInvoiceDto;
import com.example.EInvoicings.Model.Dto.InvoiceDto.SendInvoiceDto;
import com.example.EInvoicings.Model.Dto.InvoiceDto.updateInvoiceDto;
import com.example.EInvoicings.Model.Entity.InvoiceEntity;

@Mapper(componentModel = "spring")
public interface MapperInvioice {
	List<InvoiceEntity> entityList(List<GetInvoiceDto> DtoList);
	List<GetInvoiceDto> DtoList(List<InvoiceEntity> entityList);
	
	InvoiceEntity entity( GetInvoiceDto Dto);
	GetInvoiceDto Dto(InvoiceEntity entity);
	
	
	InvoiceEntity sendEntity(SendInvoiceDto  SendDto);
	SendInvoiceDto  SendDto(InvoiceEntity sendEntity);
	
	
	InvoiceEntity updateEntity(updateInvoiceDto updateDto);
	updateInvoiceDto updateDto(InvoiceEntity updateEntity);
}
