/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parcial2.contraladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author natan.oliveira
 */

@Controller
public class ClienteController {
    
    @RequestMapping(value = "/cadastrocliente", method = RequestMethod.GET)
    public String novoCliente(Model model) {
		
    //model.addAttribute("Cadastrocliente", new Cadastrocliente());
    return "cadastrocliente";
    }
    
    
    
    
}
