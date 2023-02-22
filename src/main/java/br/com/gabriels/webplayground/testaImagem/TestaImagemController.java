package br.com.gabriels.webplayground.testaImagem;

import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class TestaImagemController {

    @GetMapping("/testaimagem")
    public HttpEntity<byte[]> testa() {

        RestTemplate restTemplate = new RestTemplate();
        var response = restTemplate
                .getForEntity("http://localhost:3000/api/image-generator?gnarusUrl=https://cursos.alura.com.br/degree/certificate/b052234a-9dc9-4860-a9fc-839e18a708b5&lang=pt_BR", byte[].class);
        HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.APPLICATION_PDF);
        header.set(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=qualquer_um.pdf");
        header.setContentLength(response.getBody().length);


        return new HttpEntity<>(response.getBody(), header);
    }

    @GetMapping("/testaimagem2")
    public ResponseEntity<?> testa2() {
        RestTemplate restTemplate = new RestTemplate();


        return ResponseEntity.ok(restTemplate
                .getForEntity("http://localhost:3000/api/image-generator?gnarusUrl=https://cursos.alura.com.br/degree/certificate/b052234a-9dc9-4860-a9fc-839e18a708b5&lang=pt_BR", String.class));
    }


}
