package br.com.gabriels.webplayground.dynamicInput;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {


    @GetMapping("/save")
    public String salva(NewDynamicInputForm newDynamicInputForm, Model model) {
        System.out.println(newDynamicInputForm);

        model.addAttribute("academicEducationTypes", AcademicEducationType.values());
        return "dynamicInput/form";
    }


    @PostMapping("/save")
    public String salva(@Valid NewDynamicInputForm newDynamicInputForm, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return salva(newDynamicInputForm, model);
        }

        System.out.println(newDynamicInputForm);
        return "dynamicInput/certo";
    }
}
