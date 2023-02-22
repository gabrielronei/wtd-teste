package br.com.gabriels.webplayground.restTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {

    @Autowired
    private BuscaPokemonService buscaPokemonService;

    @GetMapping("/pokemon")
    public ResponseEntity busca() {
        buscaPokemonService.busca();
        return ResponseEntity.ok().build();
    }

}
