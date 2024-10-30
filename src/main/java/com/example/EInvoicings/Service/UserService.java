package com.example.EInvoicings.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.EInvoicings.Model.Dto.UserDto.GetUserDto;

@Service
public interface UserService {
	
	List<GetUserDto> GetAll();
	GetUserDto Get(Long id);
	GetUserDto send(GetUserDto Dto);
	

}
