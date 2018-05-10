package com.andrei.modelagemconceitual.services;

import org.springframework.mail.SimpleMailMessage;

import com.andrei.modelagemconceitual.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
