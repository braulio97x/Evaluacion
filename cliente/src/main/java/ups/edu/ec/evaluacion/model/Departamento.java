package ups.edu.ec.evaluacion.model;

import java.io.Serializable;

public class Departamento implements Serializable {
	

 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private int codido;

 private String direccion;


 private int numDepartamento;

 private int numPiso;
public int getCodido() {
	return codido;
}
public void setCodido(int codido) {
	this.codido = codido;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public int getNumDepartamento() {
	return numDepartamento;
}
public void setNumDepartamento(int numDepartamento) {
	this.numDepartamento = numDepartamento;
}
public int getNumPiso() {
	return numPiso;
}
public void setNumPiso(int numPiso) {
	this.numPiso = numPiso;
}
 
 
 
 
}
