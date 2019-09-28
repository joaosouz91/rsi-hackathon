package br.com.rsi.transactionservice.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class Conta {

    private Integer id;
    private String cpf;
    private BigDecimal saldo;

}
