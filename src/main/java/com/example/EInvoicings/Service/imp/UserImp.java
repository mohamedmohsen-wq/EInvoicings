package com.example.EInvoicings.Service.imp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.EInvoicings.Model.Dto.UserDto.GetUserDto;
import com.example.EInvoicings.Model.Entity.UserEntity;
import com.example.EInvoicings.Model.Mapper.MapperUser;
import com.example.EInvoicings.Repository.UserRepo;
import com.example.EInvoicings.Service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserImp implements UserService {
	private final UserRepo repo;
	private final MapperUser amp;


	@Override
	public List<GetUserDto> GetAll() {
		List<UserEntity> getAll=this.repo.findAll();
		
		List<GetUserDto> respons=this.amp.DtoList(getAll);
		return respons;
	}

	@Override
	public GetUserDto Get(Long id) {
		UserEntity		 Get=this.repo.getById(id);
		GetUserDto respons=this.amp.Dto(Get);
		return respons;
	}

	@Override
	public GetUserDto send(GetUserDto Dto) {
		UserEntity send=this.amp.Entity(Dto);
		UserEntity send2=this.repo.save(send);
		GetUserDto respons=this.amp.Dto(send2);
		
		
		return respons;
	}

}
