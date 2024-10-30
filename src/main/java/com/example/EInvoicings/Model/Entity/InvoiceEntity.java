package com.example.EInvoicings.Model.Entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Entity 
@Table(name = "Invoice")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class InvoiceEntity {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private Long id;
	 private Float amount;
	 private LocalDateTime issueDate;

	 private LocalDateTime dueDate;
	 private String status;
	 @ManyToOne(fetch = FetchType.LAZY)     
	    @JoinColumn(name = "user_id", nullable = false) 
	    private UserEntity user;
	 
	    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<PaymentEntity> payments = new ArrayList<>();
	   

}
