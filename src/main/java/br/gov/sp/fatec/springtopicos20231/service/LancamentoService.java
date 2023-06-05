package br.gov.sp.fatec.springtopicos20231.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springtopicos20231.entity.Lancamento;
import br.gov.sp.fatec.springtopicos20231.repository.LancamentoRepository;

@Service
public class LancamentoService implements ILancamentoService {

    @Autowired
    private LancamentoRepository lancamentoRepo;

    public List<Lancamento> buscarTodos() {
        return lancamentoRepo.findAll();
    }

    public Lancamento novo(Lancamento lancamento) {
        return lancamentoRepo.save(lancamento);
    }
    
}
