package br.gov.sp.fatec.springtopicos20231.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springtopicos20231.entity.Lancamento;
import br.gov.sp.fatec.springtopicos20231.service.ILancamentoService;

@RestController
@CrossOrigin
@RequestMapping(value = "/lancamento")
public class LancamentoController {

    @Autowired
    private ILancamentoService service;

    @GetMapping
    public List<Lancamento> buscarTodos() {
        return service.buscarTodos();
    }

    @PostMapping
    public Lancamento novo(@RequestBody Lancamento lancamento) {
        return service.novo(lancamento);
    }
    
}
