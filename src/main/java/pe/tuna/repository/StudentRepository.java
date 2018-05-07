package pe.tuna.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.tuna.model.Student;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

    public List<Student> findByNombres(String nombres);
    public List<Student> findByApellidos(String apellidos);
    public List<Student> findByNombresAndApellidos(String nombres, String apellidos);
    public List<Student> findByNombresAndApellidosOrderByApellidos(String nombres, String apellidos);

    // Consultas nativas: podemos crear consulta SQL, no es tan recomendable
    @Query(value = "SELECT * FROM STUDENT WHERE nombres LIKE CONCAT('%',?,'%')", nativeQuery = true)
    public List<Student> getLstStudentPorNombre(String nombre);
}
