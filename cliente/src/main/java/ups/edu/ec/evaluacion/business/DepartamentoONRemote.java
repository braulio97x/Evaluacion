package ups.edu.ec.evaluacion.business;

import ups.edu.ec.evaluacion.model.Departamento;

public interface DepartamentoONRemote {
	public void insertarDepartamento(Departamento departamento) throws Exception;
	public void actualizarDepartamento(Departamento departamento) throws Exception;
}
