package br.com.meugrupo.meuartefato; // define o pacote ao qual a classe pertence

// importa a anotação GetMapping (definição do endpoint que responde a
// uma requisição HTTP GET) 
import org.springframework.web.bind.annotation.GetMapping;
// importa a anotação RestController (informa ao SB que a classe será
// responsável por atender requisições HTTP e retornar dados como resposta)
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeuController {
    @GetMapping("/api") // informa caminho
    public String mensagem() { // método mensagem() que retorna uma string
        System.out.println("Resposta da API REST (println).");
        return "Resposta da API REST (retorno).";
    }
}