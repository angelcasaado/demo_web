package com.example.controllers;


import com.example.entities.Person;
import com.example.repositories.PersonRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ControllerPrueba {
    @Autowired
    private PersonRepository personRepository;
    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("personForum", new Person());
        return "formulario"; // nombre del template Thymeleaf: formulario.html
    }

    @PostMapping("/formulario")
    public String procesarFormulario(@Valid @ModelAttribute("personForum") Person form,
                                     BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "formulario"; // Volver a mostrar formulario con errores
        }
        personRepository.save(form);
        // Aquí procesas el formulario válido (guardar, enviar email...)
        return "index"; // Página de éxito (crea exito.html)
    }
}





