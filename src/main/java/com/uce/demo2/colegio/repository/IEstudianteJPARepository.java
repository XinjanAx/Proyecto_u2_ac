package com.uce.demo2.colegio.repository;

import java.util.List;

import com.uce.demo2.colegio.modelo.Estudiante;




public interface IEstudianteJPARepository {
	
	public void ingresar (Estudiante estudiante);
	public Estudiante buscarPorId (Integer id);
	public void actualizar(Estudiante estudiante);
	public void eliminar (Integer id);
	
	public Estudiante buscarPorCedula(String cedula);
	public List<Estudiante> listaEdadesDecendentes();
	public List<Estudiante> listaEstudiantesGratuitos();
    public List<Estudiante> buscarPorNombreApellido(String nombre,String apellido);
    public Estudiante buscarPorCedulaTypedNamed(String cedula);
	public List<Estudiante> listaEstudiantesGratuitosMenoresA(Integer edad);
    
}
