package com.example.EInvoicings.Service.imp;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.EInvoicings.Model.Entity.PaymentEntity;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmailService {
    private final JavaMailSender mailSender;

    
    public void sendEmail(String to, String subject, String text, Float amount, LocalDateTime dueDate, List<PaymentEntity> payments) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        StringBuilder messageBody = new StringBuilder();
        messageBody.append(text)
                   .append("\n")
                   .append("المبلغ: ").append(amount).append("\n")
                   .append("تاريخ الاستحقاق: ").append(dueDate).append("\n")
                   .append("تفاصيل المدفوعات:").append("\n");
        
        // إضافة تفاصيل المدفوعات إذا كانت موجودة
        if (payments != null && !payments.isEmpty()) {
            for (PaymentEntity payment : payments) {
                messageBody.append("- ").append(payment.getAmountPaid()).append("\n"); // افترض أن لديك طريقة getDetails() في PaymentEntity
            }
        } else {
            messageBody.append("لا توجد مدفوعات مسجلة.");
        }
        message.setText(text);
        message.setText(messageBody.toString());
        
        mailSender.send(message);
    }



}
