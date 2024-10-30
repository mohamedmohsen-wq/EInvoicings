package com.example.EInvoicings.Service.imp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.EInvoicings.Model.Dto.InvoiceDto.GetInvoiceDto;
import com.example.EInvoicings.Model.Dto.InvoiceDto.SendInvoiceDto;
import com.example.EInvoicings.Model.Dto.InvoiceDto.updateInvoiceDto;
import com.example.EInvoicings.Model.Entity.InvoiceEntity;
import com.example.EInvoicings.Model.Entity.UserEntity;
import com.example.EInvoicings.Model.Mapper.MapperInvioice;
import com.example.EInvoicings.Repository.InvoiceRepo;
import com.example.EInvoicings.Repository.UserRepo;
import com.example.EInvoicings.Service.InvoiceService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InvoiceImp implements InvoiceService {
	private final InvoiceRepo repo;
	private final MapperInvioice map;
	private final UserRepo userrepo;
    private final EmailService emailService;  // إضافة EmailService



	
	@Override
	public List<GetInvoiceDto> GetAll() {
		List<InvoiceEntity> GetAll=this.repo.findAll();
		List<GetInvoiceDto> respons=this.map.DtoList(GetAll);
		return respons;
	}

	@Override
	public GetInvoiceDto Get(Long id) {
		InvoiceEntity Get=this.repo.getById(id);
		GetInvoiceDto respons=this.map.Dto(Get);
		
		return respons;
	}

	@Override
	public SendInvoiceDto Send(SendInvoiceDto Dto) {
		InvoiceEntity send=this.map.sendEntity(Dto);
		UserEntity user=this.userrepo.findById(Dto.getUser_id()).orElseThrow();
		send.setUser(user);
		InvoiceEntity send2=this.repo.save(send);
		SendInvoiceDto respons=this.map.SendDto(send2);
		if (user.getEmail() != null && !user.getEmail().isEmpty()) {
	        emailService.sendEmail(user.getEmail(), "إشعار فاتورة جديدة", "تم إنشاء فاتورة جديدة.",send.getAmount(),send.getDueDate(),send.getPayments());
	    } else {
	        System.out.println("البريد الإلكتروني غير موجود للمستخدم: " + user.getId());
	    }
		return respons;
	}

	@Override
	public updateInvoiceDto update(updateInvoiceDto dto) {
		InvoiceEntity update=this.map.updateEntity(dto);
		UserEntity user=this.userrepo.findById(dto.getUser_id()).orElseThrow();
		update.setUser(user);
		InvoiceEntity update2=this.repo.save(update);
//	    emailService.sendEmail(user.getEmail(), "إشعار تحديث فاتورة جديدة", "تم تحديث فاتورة .");
		updateInvoiceDto respons=this.map.updateDto(update2);
		return respons;
	}

	
}
