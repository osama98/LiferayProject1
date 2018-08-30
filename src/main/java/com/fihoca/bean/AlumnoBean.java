package com.fihoca.bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.fihoca.dao.AlumnoDao;
import com.fihoca.model.Alumno;

@ManagedBean(name="alumno")
@RequestScoped
public class AlumnoBean implements Serializable{
	
	private static final long serialVersionUID = 1715935052239888761L;
	AlumnoDao alumnoDao = new AlumnoDao();
	
	private int idAlumno;
	private String nombre;
	private String apellidos;
	private String dni;
	
	
	public AlumnoBean(){
		
	}
	
	public AlumnoBean(int idAlumno, String nombre, String apellidos, String dni) {
		super();
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	public int getIdAlumno() {
		return idAlumno = 1;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
	public Alumno[] getAlumnosList(){
		Alumno[] alumnosList = alumnoDao.getAlumnos();
		return alumnosList;
	}
	
	public String submit() throws Exception{
		
		Alumno alumno = new Alumno();
		alumno.setIdAlumno(idAlumno);
		alumno.setNombre(nombre);
		alumno.setApellidos(apellidos);
		alumno.setDni(dni);
		
		alumnoDao.add(alumno);
		
		
		return "view";
	}

	
}
