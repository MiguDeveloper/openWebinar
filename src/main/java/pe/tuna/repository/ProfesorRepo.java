package pe.tuna.repository;

import org.springframework.stereotype.Repository;
import pe.tuna.model.Asignatura;
import pe.tuna.model.Profesor;

import java.util.*;

@Repository
public class ProfesorRepo {
    private Map<Integer, Profesor> profes;
    List<Asignatura> lstAsignatura, lstAsignatura2, lstAsignatura3;

    public ProfesorRepo() {
        profes = new HashMap<Integer, Profesor>();
        lstAsignatura = new ArrayList<Asignatura>();

        lstAsignatura.add(new Asignatura(0,"base de datos", 8));
        lstAsignatura.add(new Asignatura(1,"Estructura de datos", 8));
        lstAsignatura.add(new Asignatura(2,"Programación avanzada", 8));

        lstAsignatura2 = new ArrayList<Asignatura>();
        lstAsignatura2.add(new Asignatura(0,"Perú contemporaneo", 8));
        lstAsignatura2.add(new Asignatura(1,"Ciencias sociales", 8));

        lstAsignatura3 = new ArrayList<Asignatura>();
        lstAsignatura3.add(new Asignatura(0,"Arquitectura de computadoras", 8));
        lstAsignatura3.add(new Asignatura(1,"redes de computadpras", 8));

        profes.put(1, new Profesor(1,"Miguel", "Sistemas","miguel.peru.seo@gmail.com", lstAsignatura));
        profes.put(2, new Profesor(2,"Jorge","Historia", "coquich@gmail.com", lstAsignatura2));
        profes.put(3, new Profesor(3, "Alex", "Redes", "alex_chg1@hotmail.com", lstAsignatura3));

    }

    public Profesor findProfesor(int id){
        if(profes.containsKey(id)){
            return profes.get(id);
        }

        return null;
    }

    public List<Profesor> findAllProfesor(){
        return new LinkedList<Profesor>(profes.values());
    }
}
