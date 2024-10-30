package com.example.EInvoicings.Model.Dto.UserDto;

import java.util.List;

import com.example.EInvoicings.Model.Entity.InvoiceEntity;
import com.example.EInvoicings.Model.Entity.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetUserDto {
	 private String username;
	 private String role;
	 private String email;


}
