package pe.tuna.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

// Entity: la clase sera tratada como una entidad
@Entity
// name: sera mapeada como una tabla en la BD, llamada STUDENT
@Table(name = "STUDENT")
public class Student {

    // Id representa la PK de la tabla, se autogenerara
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // modificamos el nombre por enombre por defecto de la columna
    @Column(name="id")
    private int id;

    @NotEmpty
    @Column(name = "nombres")
    private String nombres;

    @NotEmpty
    @Column(name = "apellidos")
    private String apellidos;

    public Student() {
    }

    public Student(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
