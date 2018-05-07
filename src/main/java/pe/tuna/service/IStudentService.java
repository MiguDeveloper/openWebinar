package pe.tuna.service;

import pe.tuna.model.Student;

import java.util.List;

public interface IStudentService {
    public List<Student> getStudent();
    public Student getById(int id);
    public int saveStudent(Student student);

    public List<Student> buscarPorNombres(String nombres);
    public List<Student> buscarPorApellidos(String apellidos);
    public List<Student> buscarPorApellidosyNombres(String nombres, String apellidos);
    public List<Student> buscarPorAmbosOrdenarPorApellidos(String nombres, String apellidos);
    public List<Student> getLstStudentPorNombre(String nombre);
}
