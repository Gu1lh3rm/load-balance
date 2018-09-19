package springangularjs.springangularjs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springangularjs.springangularjs.entities.Server;
import springangularjs.springangularjs.repositories.ServerRepository;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins="*", allowedHeaders="*")
public class ServerController {

    @Autowired
    private ServerRepository serverRepository;

    @GetMapping
    public List<Server> getUrl() throws UnknownHostException {

        Server server = new Server(1,InetAddress.getLocalHost().getHostName());

        List<Server> lista = new ArrayList<>();

        lista.add(server);

        return lista;

    }

    @GetMapping("/api/servers")
    public List<Server> getServers(){
        return serverRepository.findAll();
    }

    @GetMapping("/api/servers/{server_id}")
    public Server getServer(@PathVariable Integer server_id) {
        return serverRepository.findById(server_id).orElseThrow(() -> new IllegalArgumentException("Not found"));
    }


}
