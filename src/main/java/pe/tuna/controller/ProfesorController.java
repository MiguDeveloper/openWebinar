package pe.tuna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.tuna.service.IProfesorService;
import pe.tuna.serviceImpl.ProfesorServiceImpl;

@Controller
@RequestMapping("/profesor")
public class ProfesorController {

    @Autowired
    private ProfesorServiceImpl iProfesorService;

    @GetMapping("/list")
    public String getProfesores(Model model){
        model.addAttribute("lstProfesores", iProfesorService.getProfesores());
        return "profesor/lst";
    }

    @GetMapping("/detail/{idProf}")
    public String detalle(@PathVariable("idProf") int id, Model model){
        model.addAttribute("profesor", iProfesorService.getById(id));
        return "profesor/mnt";
    }

    @GetMapping("/detail/{idProf}/curso/{idAsig}")
    public String asignatura(@PathVariable("idProf") int idProf, @PathVariable("idAsig") int idAsig, Model model){
        model.addAttribute("asignatura",iProfesorService.getById(idProf).getLstAsignaturas().get(idAsig));
        return "profesor/asignatura";
    }

}
