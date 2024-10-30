package com.example.EInvoicings.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.EInvoicings.Model.Dto.PaymentDto.GetPaymentDto;
import com.example.EInvoicings.Model.Dto.PaymentDto.SendPaymentDto;

@Service
public interface PaymentService {
List<GetPaymentDto> GetAll();

SendPaymentDto Send(SendPaymentDto Dto);
}
