package com.example.EInvoicings.Model.Dto.UserDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SenUserDto {
	 private String username;
	 private String Password;
	 private String role;
	 private String email;
}
