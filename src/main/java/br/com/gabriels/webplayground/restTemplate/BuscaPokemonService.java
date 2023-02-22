package br.com.gabriels.webplayground.restTemplate;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BuscaPokemonService {


    public void busca() {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<PokemonReponse> entity = restTemplate.getForEntity("https://pokeapi.co/api/v2/pokemon/pikachu", PokemonReponse.class);

        System.out.println(entity.getBody());
    }
}
