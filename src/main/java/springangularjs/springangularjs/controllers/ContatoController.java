package springangularjs.springangularjs.controllers;

import springangularjs.springangularjs.entities.Contato;
import springangularjs.springangularjs.repositories.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*", allowedHeaders="*")
public class ContatoController {
    @Autowired
    private ContatoRepository contatoRepository;

    
    @GetMapping("/contatos")		
    public List<Contato> getContatos() {
        return contatoRepository.find();
        
    }	
    
    
    @GetMapping("/contatos/{contato_id}")
    public Contato getContato(@PathVariable Long contato_id) {
        return contatoRepository.findById(contato_id).orElseThrow(() -> new IllegalArgumentException("Not found"));

    }

    @DeleteMapping("/contatos/{contato_id}")
    public boolean deleteContato(@PathVariable Contato contato_id) {
        contatoRepository.delete(contato_id);
         return true;
    }

    @PutMapping("/contatos")
    public Contato updateContato(@RequestBody Contato contato_id) {
        return contatoRepository.save(contato_id);
    }

    @PostMapping("/contatos")
    public Contato createContato(@RequestBody Contato contato) {
        return contatoRepository.save(contato);
    }

}