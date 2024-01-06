package com.springbootchat.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.springbootchat.model.Mensaje;

@Controller
public class MensajeController {
	
	@MessageMapping("/envio")
	@SendTo("/tema/mensajes")
	public Mensaje envio(Mensaje mensaje) {
		return new Mensaje(mensaje.nombre(), mensaje.contenido());
	}
}
