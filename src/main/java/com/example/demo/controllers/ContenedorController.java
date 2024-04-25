package com.example.demo.controllers;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.Contenedor;

@RestController
@RequestMapping("/contenedor")
public class ContenedorController {

	@GetMapping("/all")
	 public Contenedor showmaquina() {
		
		 int limite = Integer.MAX_VALUE; 

	        for (int i = 1; i <= limite; i++) {
	            System.out.println(i);
	        }
		Contenedor cont = new Contenedor();
		try {
			cont.setName(InetAddress.getLocalHost().getHostName());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return cont;
      
    }
	
}
