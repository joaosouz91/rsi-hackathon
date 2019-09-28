package br.com.rsi.transactionapi.controller;


import br.com.rsi.transactionapi.entity.Conta;
import br.com.rsi.transactionapi.entity.Login;
import br.com.rsi.transactionapi.repository.ContaRepository;
import br.com.rsi.transactionapi.security.AccountCredentials;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TransactionServiceController {

    @Autowired
    ContaRepository contaRepository;

    @GetMapping("/status")
    public String status(@RequestBody Login login) {
        return "OK";
    }

    //usuario
    @PostMapping("/usuario/login")
    public ResponseEntity<String> login(@RequestBody AccountCredentials accountCredentials) {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/usuario/logout")
    public ResponseEntity logout(@PathVariable(value="idPayment", required=true) int idPayment) {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    //conta
    @PostMapping("/conta")
    public ResponseEntity criarConta(@RequestBody Conta conta) {



        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/conta/adicionarSaldo")
    public ResponseEntity<String> adicionarSaldo(@RequestBody String json) {
    	return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/conta/{id}")
    public ResponseEntity<String> deletarConta(@PathVariable(value="idPayment", required=true) int idPayment){
    	return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    //extrato
    @PostMapping("/extrato")
    public ResponseEntity criarItemExtrato(@PathVariable(value="idPayment", required=true) int idPayment) {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/extrato/{id}")
    public ResponseEntity deletarExtrato(@PathVariable(value="idPayment", required=true) int idPayment) {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/extrato/{id}")
    public ResponseEntity recuperarExtratoConta(@PathVariable(value="idPayment", required=true) int idPayment) {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    //transferencia
    @PostMapping("/transferir")
    public ResponseEntity<String> transferirSaldo(@RequestBody String jsonScope) {
    	return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    //usuario
    @PostMapping("/usuario")
    public ResponseEntity<String> adicionarUsuario(@RequestBody String usuarioJson) {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PutMapping("/usuario")
    public ResponseEntity<String> atualizarUsuario(@RequestBody String usuarioJson) {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/usuario/{cpf}")
    public ResponseEntity<String> deletarUsuario(@PathVariable(value="cpf", required=true) String cpf) {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/usuario/{cpf}")
    public ResponseEntity<String> recuperarUsuario(@PathVariable(value="cpf", required=true) String cpf) {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

}
