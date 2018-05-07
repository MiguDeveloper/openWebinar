package pe.tuna.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/saludo")
    public String sayHello(Model model){
        model.addAttribute("saludo","Hola Miguel");
        model.addAttribute("mensaje", "Te estamos saludando desde el controlador");
        model.addAttribute("url", "tuna.pe");
        return "saludo/saludo";
    }
}
