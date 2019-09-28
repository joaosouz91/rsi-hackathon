package br.com.rsi.transactionapi.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class Conta implements BaseEntity{

    private Integer id;
    private String cpf;
    private BigDecimal saldo;

    public void alteraSaldo(BigDecimal valor){
        this.saldo = this.saldo.add(valor);
    }

}
