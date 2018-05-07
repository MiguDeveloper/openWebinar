package pe.tuna.service;

import pe.tuna.model.Profesor;

import java.util.List;

public interface IProfesorService {
    public List<Profesor> getProfesores();
    public Profesor getById(int id);
}
