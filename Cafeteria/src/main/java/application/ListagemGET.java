package application;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import domain.Produto;

public class ListagemGET {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cafeteria");
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createQuery("select i from Produto i");
		List<Produto> produtos = query.getResultList();
			for (Produto produto : produtos) {
				System.out.println("\nBebida: " + produto.getId().getNome() + "\nPreco: R$" + produto.getId().getPreco() + "\nDescricao: " + produto.getDescricao());
				
				em.close();
				emf.close();
			}
		
	}

}
