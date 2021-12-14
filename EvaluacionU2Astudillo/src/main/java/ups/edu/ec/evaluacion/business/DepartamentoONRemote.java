package ups.edu.ec.evaluacion.business;

import javax.ejb.Remote;

import ups.edu.ec.evaluacion.model.Departamento;
@Remote
public interface DepartamentoONRemote {
	public void insertarDepartamento(Departamento departamento) throws Exception;
	public void actualizarDepartamento(Departamento departamento) throws Exception;
	public Departamento buscarDepartamento(int codigo) throws Exception;
}
