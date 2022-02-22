package controllers;

import model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

//    @GetMapping
//    public ModelAndView showForm(){
//        ModelAndView modelAndView = new ModelAndView("view");
//        modelAndView.addObject("employee",new Employee());
//        return modelAndView;
//    }

    @GetMapping
    public ModelAndView create(){
        ModelAndView modelAndView = new ModelAndView("create");
        Employee employee = new Employee();
        modelAndView.addObject("employee",employee);
        return modelAndView;
    }

    @PostMapping
    public ModelAndView addEmployee(@ModelAttribute Employee employee){
        ModelAndView modelAndView = new ModelAndView("view");
        modelAndView.addObject("employee",employee);
        return modelAndView;
    }
}
