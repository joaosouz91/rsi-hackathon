package br.com.rsi.transactionapi.repository;

import br.com.rsi.transactionapi.dao.BaseDAOImpl;
import br.com.rsi.transactionapi.dto.ContaDTO;
import br.com.rsi.transactionapi.entity.Conta;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContaRepository {

    private BaseDAOImpl<Conta> dao = new BaseDAOImpl<Conta>();

    public ContaDTO getConta(){

        return null;
    }

    public List<ContaDTO> get(){

        return null;
    }

}
