package br.com.rsi.transactionapi.repository;

import br.com.rsi.transactionapi.dao.BaseDAOImpl;
import br.com.rsi.transactionapi.entity.Conta;
import br.com.rsi.transactionapi.entity.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepository {

    private BaseDAOImpl<Usuario> dao;

}
