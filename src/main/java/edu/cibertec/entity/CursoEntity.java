package edu.cibertec.entity;



import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "curso")
@Schema(name = "curso" , description = "Entity de Curso")
public class CursoEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idcurso")
    private Integer idCurso;
    @Column(name="nomcurso")
    private String nombreCurso;
    @Column(name="fechainicio")
    private String fechaInicio;
    @Column(name="alumnosmin")
    private int alumnosMinimo;
    @Column(name="alumnosact")
    private int alumnosActual;
    @Column(name="estado")
    private int estado;
}
