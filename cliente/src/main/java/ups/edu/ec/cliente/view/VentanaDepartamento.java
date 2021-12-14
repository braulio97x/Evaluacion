package ups.edu.ec.cliente.view;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;

import ups.edu.ec.evaluacion.business.DepartamentoONRemote;
import ups.edu.ec.evaluacion.model.Departamento;





public class VentanaDepartamento {

	private DepartamentoONRemote depRemote;
	
	
	
	public void conectar() throws Exception {
		try {
			final Hashtable<String, Comparable> jndiProperties = new Hashtable<String, Comparable>();
			jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,
					"org.wildfly.naming.client.WildFlyInitialContextFactory");
			jndiProperties.put("jboss.naming.client.ejb.context", true);

			jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
			jndiProperties.put(Context.SECURITY_PRINCIPAL, "cesar");
			jndiProperties.put(Context.SECURITY_CREDENTIALS, "cesar");

			final Context context = new InitialContext(jndiProperties);

			final String lookupName = "ejb:/EvaluacionU2Astudillo/DepartamentoON!ups.edu.ec.evaluacion.business.DepartamentoONRemote";

			this.depRemote = (DepartamentoONRemote) context.lookup(lookupName);

		} catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		}
	}

	
	public void insertarDepartamento(Departamento dep) {
		/*
		Persona p =new Persona();
		p.setCedula("010688778578");
		p.setDireccion("Quito");
		p.setNombre("Juan Robles");
		*/
		try {
			depRemote.insertarDepartamento(dep);
			System.out.println("Departamento insertado");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public Departamento buscar(int casilla) {
		Departamento d=new Departamento();
		try {
			d=depRemote.buscarDepartamento(casilla);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		}
		
		return d;
		
	}
	
	
	/*
	public Persona buscar(String casilla) {
		Persona p=new Persona();
		try {
			p=cliRemote.buscarPersona(casilla);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		}
		
		return p;
		
	}
	*/
	
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CrearPersona cr=new CrearPersona();
		//VentanaPersona vtnper =new VentanaPersona();
		
		
		
				
		try {
			cr.setVisible(true);
			//vtnper.conectar();
			
			//vtnper.insertarPersona();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	*/

}
