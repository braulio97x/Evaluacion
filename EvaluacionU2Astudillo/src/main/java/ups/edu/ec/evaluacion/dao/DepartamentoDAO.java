package ups.edu.ec.evaluacion.dao;



import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ups.edu.ec.evaluacion.model.Departamento;

@Stateless
public class DepartamentoDAO {

	@PersistenceContext
	private EntityManager em;
	
	
	public void insert(Departamento dep) {
		em.persist(dep);
	}
	
	public void update(Departamento dep) {
		em.merge(dep);
	}
	
	public Departamento read(String id) {
		Departamento dep = em.find(Departamento.class, id);
		return dep;
	}
	
	public void delete(int id) {
		Departamento dep=em.find(Departamento.class, id);
		em.remove(dep);
	}
	
	
	public List<Departamento> getList(){
		//consulta a las entidades de java no de sql
		List<Departamento>listado =new ArrayList<Departamento>();
		String jpql="SELECT op FROM Departamento op";
				
		
		
		Query query = em.createQuery(jpql, Departamento.class);
		
		listado= query.getResultList();
		//JPQL -> SQL
		
		
		return listado;
		
	}
}
