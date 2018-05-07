package pe.tuna.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.tuna.model.Empleado;

import javax.validation.Valid;


@Controller
public class EmpleadoController {

    @GetMapping("/empleado")
    public String showForm(Model model){
        model.addAttribute("empleadoForm", new Empleado());
        return "empleado/form";
    }

    @PostMapping("/addEmpleado")
    public String submit(@Valid @ModelAttribute("empleadoForm") Empleado empleado, BindingResult result, Model model){
        String view = "";
        if(result.hasErrors()){
            view = "empleado/form";
        }else{
            model.addAttribute("empleado",empleado);
            view = "empleado/detalle";
        }

        return view;
    }
}
