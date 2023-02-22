package br.com.gabriels.webplayground.testeJackson;

import br.com.gabriels.webplayground.testaListVsSet.PessoaRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.TreeMap;

import static java.util.stream.Collectors.*;

@Controller
public class Teste {

    private PessoaRepository pessoaRepository;

    @PostMapping(value = "/xyz")
    public ResponseEntity<Object> testando(HttpServletRequest request) throws JsonProcessingException {

        TreeMap<String, String> collect = request.getParameterMap().entrySet().stream()
                .collect(groupingBy(Map.Entry::getKey,
                        TreeMap::new,
                        mapping(stringEntry -> stringEntry.getValue()[0], joining())));

        ObjectMapper mapper = new ObjectMapper();
        String jsonResult = mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(collect);

        TestandoJacksonProperty testandoJacksonProperty = mapper.readValue(jsonResult, TestandoJacksonProperty.class);

//        return pessoaRepository.findById(1L)
//                .map(e -> ResponseEntity.badRequest().build())
//                .orElseGet(()->{
//                    Cliente cliente=request.toModel();
//                    clienteRepository.save(cliente);
//                    return ResponseEntity.ok().build(cliente);
//                });
//                .map(ok()::body)

        return ResponseEntity.ok(testandoJacksonProperty);
    }

}
