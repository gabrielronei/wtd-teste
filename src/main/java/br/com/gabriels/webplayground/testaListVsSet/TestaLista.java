package br.com.gabriels.webplayground.testaListVsSet;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestaLista {

    private final PessoaRepository pessoaRepository;

    public TestaLista(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @Transactional
    @PostMapping("/teste/lista")
    public ResponseEntity create(@RequestBody Pessoa pessoa) {

        pessoaRepository.save(pessoa);

        return ResponseEntity.ok().build();
    }

    @Transactional
    @PostMapping("/update/lista")
    public ResponseEntity update(@RequestBody Pessoa pessoa) {

        pessoaRepository.save(pessoa);

        return ResponseEntity.ok().build();
    }
}
