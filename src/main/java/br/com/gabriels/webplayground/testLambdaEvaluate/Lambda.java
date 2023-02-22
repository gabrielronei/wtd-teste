package br.com.gabriels.webplayground.testLambdaEvaluate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class Lambda {

    @GetMapping("/lambda/teste-1")
    public ResponseEntity teste() {
        System.out.println("ADICIONANDO QUALQUER COISA");

        return ResponseEntity.ok(Optional.of("eai doidao").map(LambdaLambda::new));
    }

    @GetMapping("/lambda/teste-2")
    public ResponseEntity teste2() {
        OutroLambda outroLambda = new OutroLambda();
        return ResponseEntity.ok(Optional.of("eai doidao").map(outroLambda::metodo));
    }
}
