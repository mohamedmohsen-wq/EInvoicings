package com.example.EInvoicings.Model.Mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.EInvoicings.Model.Dto.InvoiceDto.GetInvoiceDto;
import com.example.EInvoicings.Model.Dto.UserDto.GetUserDto;
import com.example.EInvoicings.Model.Dto.UserDto.SenUserDto;
import com.example.EInvoicings.Model.Entity.UserEntity;

@Mapper(componentModel = "spring")

public interface MapperUser {
	
	List<UserEntity> EntityList(List<GetUserDto> DtoList);
	List<GetUserDto> DtoList(List<UserEntity> EntityList);
	
	UserEntity Entity (GetUserDto Dto);
	GetUserDto Dto(UserEntity Entity);
	
	UserEntity SendEntity(SenUserDto sendDto);
	SenUserDto sendDto(UserEntity SendEntity);
	
	
	

}
