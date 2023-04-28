package application;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Especialidade;
import domain.Produto;
import domain.ProdutoId;


public class UpdatePUT {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cafeteria");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Produto produto = em.find(Produto.class, new ProdutoId("Cafe Mocha",new BigDecimal(6)));
		produto.setIngredientes(Especialidade.CHOCOLATE);
		System.out.println("Alterado para: "+ produto.getEspecialidade());
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
