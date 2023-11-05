package dao;

import bean.Empleado;

public class EmpleadoDAO {
	
	db.Db db = new db.Db("planilla");
	
	
	public boolean login(Empleado empleado) {
		
		db.Sentencia(String.format("call sp_getEmpleadoLogin('%s', '%s')", empleado.getDni(), empleado.getPasswordd()));
		empleado.setEmpleado(db.getRegistro());
		return empleado.getId() > 0;
	}

}