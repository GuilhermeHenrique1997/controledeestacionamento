/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parcial2.contraladores;

import com.parcial2.modeloDAO.ClienteDao;
import com.parcial2.modeloDAO.HistoricoDao;
import com.parcial2.modelodados.Historico;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author natan.oliveira
 */
@Controller
public class HistoricoController {

    
 
    @RequestMapping(value = "/historico", method = RequestMethod.GET)
        public String novoHistorico(Model model) {
	
        model.addAttribute("historico", new Historico());
        
        
      //public String novoCliente(Model model) {
      //model.addAttribute("cliente", new Cliente());
        
        
        
        
         try{
            model.addAttribute("clientes", ClienteDao.buscarClientes());
        }catch(Exception ey){
            System.out.println("Clientes ativos não encontrados");
        }
        
        
	//model.addAttribute("funcionario", new Funcionario());
        return "historico";
    
}

    
    
    
    
    
    
    
}

    
    
    
