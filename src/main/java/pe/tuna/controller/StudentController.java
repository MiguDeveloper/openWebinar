package pe.tuna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pe.tuna.model.Student;
import pe.tuna.service.IStudentService;

import javax.validation.Valid;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private IStudentService iStudentService;

    @GetMapping("/list")
    public String getAllStudent(Model model){
        model.addAttribute("lstStudents",iStudentService.getStudent());
        return "student/lst";
    }

    @GetMapping
    public String showForm(Model model){
        model.addAttribute("studentForm", new Student());
        return "student/frm";
    }

    @PostMapping("/addStudent")
    public String submit(@Valid @ModelAttribute("studentForm") Student student, BindingResult result, Model model){
        int flgOperacion;
        String view ="";

        if (result.hasErrors()){
            view = "student/frm";
        }else{
            flgOperacion = iStudentService.saveStudent(student);
            if (flgOperacion>0){
                view = "redirect:/list";
            }else {
                view = "student/frm";
            }
        }

        return view;
    }


    @PostMapping("/searchStudent")
    public String search(@RequestParam(name = "firstName", required = true) String firsName,
                         @RequestParam(name = "lastName", required = true) String lastName, Model model){

        List<Student> result = null;

        if(firsName.equals("") && lastName.equals("")){
            result = iStudentService.getStudent();
        }else if (!firsName.equals("") && lastName.equals("")){
            result = iStudentService.getLstStudentPorNombre(firsName);
        }else if (firsName.equals("") && !lastName.equals("")){
            result = iStudentService.buscarPorApellidos(lastName);
        }else{
            result = iStudentService.buscarPorApellidosyNombres(firsName, lastName);
        }
        model.addAttribute("lstStudents", result);

        return "student/lst";
    }

    @GetMapping("/edit/{id}")
    public  String showFormEdit(@PathVariable("id") int id, Model model){
        Student student = iStudentService.getById(id);
        model.addAttribute("studentForm", student);
        model.addAttribute("op", "edit");

        return "student/frm";
    }

    @PostMapping("/edit")
    public String submitEdit(@ModelAttribute("studentForm") Student student, Model model){
        iStudentService.saveStudent(student);
        return "redirect:/list";
    }
}
