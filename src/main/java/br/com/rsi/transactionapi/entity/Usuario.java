package br.com.rsi.transactionapi.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class Usuario {

    private Integer id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    private String complemento;
    private Integer numero;
    private Date dataNascimento;
    private String password;
    private String email;

}
