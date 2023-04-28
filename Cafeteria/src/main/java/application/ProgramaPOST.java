package application;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Especialidade;
import domain.Produto;
import domain.ProdutoId;

public class ProgramaPOST {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cafeteria");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Produto Cafe = new Produto(new ProdutoId("Cafe Expresso",new BigDecimal(2)),"Popular por causa do seu sabor intenso e marcante.",1020,Especialidade.CAFE);
		Produto CafeCleite = new Produto(new ProdutoId("Cafe com Leite",new BigDecimal(4)),"Uma bebida popular para come�ar o dia ou para um momento de pausa.",1010,Especialidade.LEITE);
		Produto CafeChantilly = new Produto(new ProdutoId("Cafe com Chantilly",new BigDecimal(8)),"O chantilly adiciona um sabor doce e uma textura leve e fofa � bebida, deixando seu cafe mais especial.",1050,Especialidade.CHANTILLY);
		Produto Mocha = new Produto(new ProdutoId("Cafe Mocha",new BigDecimal(6)),"O chocolate adiciona um sabor doce e rico ao cafe, tornando-o uma op��o doce e saborosa para o seu dia.",1060,Especialidade.CANELA);
		
		em.persist(Cafe);
		em.persist(CafeCleite);
		em.persist(CafeChantilly);
		em.persist(Mocha);
		
		em.getTransaction().commit();

		em.close();
		emf.close();
		
	}

}
