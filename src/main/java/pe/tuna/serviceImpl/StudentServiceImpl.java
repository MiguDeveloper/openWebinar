package pe.tuna.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.tuna.model.Student;
import pe.tuna.repository.StudentRepository;
import pe.tuna.service.IStudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    public Student getById(int id) {
        return studentRepository.findOne(id);
    }

    public int saveStudent(Student student) {
        if(studentRepository.save(student) != null){
            return 1;
        }else{
            return 0;
        }
    }

    public List<Student> buscarPorNombres(String nombres){
        return studentRepository.findByNombres(nombres);
    }


    public List<Student> buscarPorApellidos(String apellidos){
        return studentRepository.findByApellidos(apellidos);
    }

    public List<Student> buscarPorApellidosyNombres(String nombres, String apellidos){
        return studentRepository.findByNombresAndApellidos(nombres, apellidos);
    }

    public List<Student> buscarPorAmbosOrdenarPorApellidos(String nombres, String apellidos) {
        return studentRepository.findByNombresAndApellidosOrderByApellidos(nombres, apellidos);
    }

    public List<Student> getLstStudentPorNombre(String nombre){
        return studentRepository.getLstStudentPorNombre(nombre);
    }
}
