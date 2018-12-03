/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parcial2.contraladores;
import com.parcial2.modeloDAO.ClienteDao;
import com.parcial2.modelodados.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    model.addAttribute("cliente", new Cliente());
      
    return "cadastrocliente";
    }
    
    @RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public String salvar(@ModelAttribute Cliente cliente, Model model){
                cliente.informacoesCliente();
                model.addAttribute("cliente", new Cliente());
                
                try{
		ClienteDao.adicionarCliente(cliente);
                
                    System.out.println("Enserido com sucesso no banco de dados");
                }catch(SQLException e){
                    List<String> erros = new ArrayList<>();
                    erros.add("Erros ao inserir registro no banco de dados");
                    model.addAttribute("erros", erros);
                    return "cadastrocliente";              
                }
                
                
	    return "cadastrocliente";
	}
    
    
}
