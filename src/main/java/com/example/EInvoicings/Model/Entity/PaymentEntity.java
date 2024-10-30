package com.example.EInvoicings.Model.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Entity 
@Table(name = "Payment")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class PaymentEntity {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private Long id;
	 private LocalDateTime paymentDate;
	 private Float amountPaid;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "invoice_id", nullable = false)
	    private InvoiceEntity invoice;

}
