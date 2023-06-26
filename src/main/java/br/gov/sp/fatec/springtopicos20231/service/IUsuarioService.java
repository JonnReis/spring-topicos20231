package br.gov.sp.fatec.springtopicos20231.service;

import java.util.List;

import br.gov.sp.fatec.springtopicos20231.entity.Usuario;

public interface IUsuarioService {
    
    public Usuario novoUsuario(Usuario usuario);

    public Usuario novoUsuario(String nome, String senha);

    public List<Usuario> buscarTodosUsuarios();

    public Usuario buscarPorId(Long id);

}
