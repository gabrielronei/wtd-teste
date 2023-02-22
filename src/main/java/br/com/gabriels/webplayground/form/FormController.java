package br.com.gabriels.webplayground.form;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.transaction.Transactional;
import javax.validation.Valid;

@Controller
public class FormController {

    @GetMapping("/form/save")
    public String save() {
        return "form";
    }

    @Transactional
    @PostMapping("/form/save")
    public String save(@Valid TesteForm form) {
        System.out.println(form.getNome());
        return "xpto";
    }

}
