package com.example.EInvoicings.Model.Entity;

import java.time.LocalDateTime;
import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Entity 
@Table(name = "User")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class UserEntity {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "user_id")
	    private Long id;
	 private String username;
	 private String Password;
	 private String role;
	 private String email;
	 
	  @OneToMany(mappedBy = "user", fetch = FetchType.LAZY) 
	    private List<InvoiceEntity> invoice;
	 
	 
	 

}
