package ups.edu.ec.evaluacion.business;

import javax.ejb.Local;

import ups.edu.ec.evaluacion.model.Departamento;
@Local
public interface DepartamentoONLocal {
	public void insertarDepartamento(Departamento departamento) throws Exception;
	public void actualizarDepartamento(Departamento departamento) throws Exception;
	public Departamento buscarDepartamento(int codigo) throws Exception;
}
