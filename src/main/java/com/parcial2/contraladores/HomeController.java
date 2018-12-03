/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parcial2.contraladores;

import com.parcial2.modeloDAO.ClienteDao;
import com.parcial2.modeloDAO.HomeDao;
import com.parcial2.modelodados.Entrada;
import com.parcial2.modelodados.Pesquisa;
import com.parcial2.modelodados.Saida;
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
public class HomeController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String novoIndex(Model model) throws SQLException {
        model = criarObjetos(model);
        ClienteDao.buscarClientes();
        return "index";
    }
    
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model) throws SQLException {
        model = criarObjetos(model);
        ClienteDao.buscarClientes();
        return "index";
    }
    
    @RequestMapping(value = "/salvarEntrada", method = RequestMethod.POST)
    public String salvarEntrada(@ModelAttribute Entrada entrada, Model model) throws SQLException{
            entrada.situacaoEntradaf();
            model = criarObjetos(model);
            
            try{
                HomeDao.addentradaCliente(entrada);
                  System.out.println("Enserido com sucesso no banco de dados");
                }catch(SQLException e){
                    List<String> erros = new ArrayList<>();
                    erros.add("Erros ao inserir registro no banco de dados");
                    model.addAttribute("erros", erros);
                 //  return "/";              
                }

	    return "index";
    }
    
    @RequestMapping(value = "/salvarSaida", method = RequestMethod.POST)
    public String salvarSaida(@ModelAttribute Saida saida, Model model) throws SQLException{
            saida.situacaoSaidaf();
            model = criarObjetos(model);
            
            try{
                
                HomeDao.addsaidaCliente(saida);
                  System.out.println("Enserido com sucesso no banco de dados");
                }catch(SQLException e){
                    List<String> erros = new ArrayList<>();
                    erros.add("Erros ao inserir registro no banco de dados");
                    model.addAttribute("erros", erros);
                   // return "/";              
                }

	    return "index";
                                               
}
    @RequestMapping(value = "/pesquisaCliente", method = RequestMethod.POST)
    public String salvarSaida(@ModelAttribute Pesquisa pesquisa, Model model) throws SQLException{
            //pesquisa.pesquisaClientef();
            pesquisa.pesquisaClientef();
            model = criarObjetos(model);
            return "index";
    }
    
    private Model criarObjetos(Model model) throws SQLException{
        model.addAttribute("pesquisa", new Pesquisa());
        model.addAttribute("saida", new Saida());
        model.addAttribute("entrada", new Entrada());
        try{
            model.addAttribute("clientes", ClienteDao.buscarClientes());
        }catch(Exception ey){
            System.out.println("Clientes ativos não encontrados");
        }

        return model;
    }
}
