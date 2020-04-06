package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;

@Controller
public class MainController {

	@GetMapping("/login")
	public String enviarForm(Usuario usuario) {
		return "login";
	}
	
	@PostMapping("/validacion")
	public String procesarForm(Usuario usuario) {
		
		
		
		String user = "admin";
		String password = "admin";
		
		if(usuario.getUsuario().equals(user) && usuario.getPassword().equals(password)) {
			return "validacionCorrecta";
		}else {
			return "validacionIncorrecta";
		}
		
		
	}
}
