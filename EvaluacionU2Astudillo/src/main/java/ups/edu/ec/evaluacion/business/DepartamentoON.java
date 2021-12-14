package ups.edu.ec.evaluacion.business;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.ec.evaluacion.dao.DepartamentoDAO;
import ups.edu.ec.evaluacion.model.Departamento;

@Stateless
public class DepartamentoON implements DepartamentoONLocal, DepartamentoONRemote{
	@Inject
	private DepartamentoDAO daoDep;
	
	public void insertarDepartamento(Departamento departamento) throws Exception{
		daoDep.insert(departamento);
	}
	
	public void actualizarDepartamento(Departamento departamento) throws Exception{
		daoDep.update(departamento);
	}
}
