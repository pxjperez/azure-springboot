package edu.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.cibertec.entity.CursoEntity;
import edu.cibertec.service.CursoService;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/v1/cursos")
@Tag(name = "Curso", description = "Api Curso")
public class CursoController {
    @Autowired
    private CursoService cursoService;

    @GetMapping
    public ResponseEntity<List<CursoEntity>> listarCursos() {
        List<CursoEntity> listarCursos = cursoService.listarCursos();
        return ResponseEntity.status(HttpStatus.OK)
                             .header("Usuer", "jperezgil")
                             .body(listarCursos);
    }

    @GetMapping("{idCurso}")
    public ResponseEntity<CursoEntity> obtenerCurso(@PathVariable("idCurso") Integer idCurso) {

        CursoEntity curso = cursoService.obtenerCurso(idCurso);
        return ResponseEntity.status(HttpStatus.OK)
                             .header("Usuer", "jperezgil")
                             .body(curso);
    }
    
}
