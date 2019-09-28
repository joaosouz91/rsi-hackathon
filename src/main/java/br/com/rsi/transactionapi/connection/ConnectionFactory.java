package br.com.rsi.transactionapi.connection;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("hackathon");

    public static EntityManagerFactory getEmf() {
        return emf;
    }
}
