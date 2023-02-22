package br.com.gabriels.webplayground.hibernate;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class HibernateTesteController {
    
    
    @PostMapping("/teste/jackson")
    public ResponseEntity jackson(@Valid @RequestBody NovaRequisicaoForm novaRequisicaoForm) {
        return ResponseEntity.ok(novaRequisicaoForm.toString());
    }
    
}
