package springangularjs.springangularjs.controllers;

import springangularjs.springangularjs.entities.Operadora;
import springangularjs.springangularjs.repositories.OperadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*", allowedHeaders="*")
public class OperadoraController {
    @Autowired
    private OperadoraRepository operadoraRepository;

    @GetMapping("/operadoras")
    public List<Operadora> getOperadora() {
        return operadoraRepository.findAll();
    }

    @GetMapping("/operadoras/{operadora_id}")
    public Optional<Operadora> getOperadora(@PathVariable Long operadora_id) {
        return operadoraRepository.findById(operadora_id);
    }

    @DeleteMapping("/operadoras/{operadora_id}")
    public boolean deleteOperadora(@PathVariable Operadora operadora_id) {
        operadoraRepository.delete(operadora_id);
         return true;
    }

    @PutMapping("/operadoras")
    public Operadora updateContato(@RequestBody Operadora operadora_id) {
        return operadoraRepository.save(operadora_id);
    }

    @PostMapping("/operadoras")
    public Operadora createOperadora(@RequestBody Operadora operadora) {
        return operadoraRepository.save(operadora);
    }

}