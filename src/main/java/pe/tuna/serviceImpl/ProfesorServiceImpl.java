package pe.tuna.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.tuna.model.Profesor;
import pe.tuna.repository.ProfesorRepo;
import pe.tuna.service.IProfesorService;

import java.util.List;

@Service
public class ProfesorServiceImpl implements IProfesorService {

    @Autowired
    private ProfesorRepo profesorRepo;

    public List<Profesor> getProfesores() {
        return profesorRepo.findAllProfesor();
    }

    public Profesor getById(int id) {
        return profesorRepo.findProfesor(id);
    }
}
