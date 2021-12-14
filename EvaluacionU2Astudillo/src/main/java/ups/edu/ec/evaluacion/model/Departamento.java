package ups.edu.ec.evaluacion.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_Departamento")
public class Departamento {
	
@Id
@Column(name = "dep_codigo")
 private int codido;
@Column(name = "dep_direccion")
 private String direccion;

@Column(name = "dep_numDepartamento")
 private int numDepartamento;
@Column(name = "dep_numPiso")
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
