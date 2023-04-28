package application;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Produto;
import domain.ProdutoId;


public class buscaIdGET {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cafeteria");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Produto produto = em.find(Produto.class, new ProdutoId("Cafe com Leite", new BigDecimal(4)));
		System.out.println("\nVoce esta buscando pelo " + produto.getId().getNome() + "?");
		
		em.close();
		emf.close();
	}

	}

