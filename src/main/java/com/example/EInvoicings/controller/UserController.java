package com.example.EInvoicings.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EInvoicings.Model.Dto.UserDto.GetUserDto;
import com.example.EInvoicings.Service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {
	private  final UserService ser;
	
	@GetMapping("/User")
	public List<GetUserDto> GetAll() {
		return this.ser.GetAll();
		
		
	}
	@GetMapping("/User/{id}")
	public GetUserDto Get( @PathVariable Long id) {
		return this.ser.Get(id);
		
		
	}
	@PostMapping("/User")
	public GetUserDto send(@RequestBody GetUserDto Dto) {
		return this.ser.send(Dto);
		
		
	}

}
