package br.com.rsi.transactionapi.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class Extrato implements BaseEntity {

    private Integer id;
    private Conta conta;
}
