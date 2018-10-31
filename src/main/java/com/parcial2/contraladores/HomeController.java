/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parcial2.contraladores;

import com.parcial2.modelodados.Entrada;
import com.parcial2.modelodados.Pesquisa;
import com.parcial2.modelodados.Saida;
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
    public String novoIndex(Model model) {
        model = criarObjetos(model);
        return "index";
    }
    
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model) {
        model = criarObjetos(model);
        return "index";
    }
    
    @RequestMapping(value = "/salvarEntrada", method = RequestMethod.POST)
    public String salvarEntrada(@ModelAttribute Entrada entrada, Model model){
            entrada.situacaoEntradaf();
            model = criarObjetos(model);
	    return "index";
    }
    
    @RequestMapping(value = "/salvarSaida", method = RequestMethod.POST)
    public String salvarSaida(@ModelAttribute Saida saida, Model model){
            saida.situacaoSaidaf();
            model = criarObjetos(model);
	    return "index";
}
    @RequestMapping(value = "/pesquisaCliente", method = RequestMethod.POST)
    public String salvarSaida(@ModelAttribute Pesquisa pesquisa, Model model){
            pesquisa.pesquisaClientef();
            model = criarObjetos(model);
            return "index";
    }
    
    private Model criarObjetos(Model model){
        model.addAttribute("pesquisa", new Pesquisa());
        model.addAttribute("saida", new Saida());
        model.addAttribute("entrada", new Entrada());
        return model;
    }
}
