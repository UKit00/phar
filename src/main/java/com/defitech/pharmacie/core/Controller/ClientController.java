package com.defitech.pharmacie.core.Controller;

//import com.defitech.pharmacie.core.Entity.Client;
import com.defitech.pharmacie.core.Service.ClientService;
import com.defitech.pharmacie.core.dto.ClientAchatDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    ClientService clientService;

//    @GetMapping
//    public ResponseEntity<List<Client>> getAllClients() {
//        List<Client> clients = clientService.findAll();
//        return ResponseEntity.ok(clients);
//    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Client> getClientById(@PathVariable Long id) {
//        return clientService.findById(id)
//                .map(ResponseEntity.ok())
//                .orElse(ResponseEntity.notFound().build());
//    }

    @GetMapping("/search")
    public ResponseEntity<Long> getClientIdByName(@RequestParam String name) {
        Long clientId = clientService.getClientIdParNom(name);
        return clientId != null ? ResponseEntity.ok(clientId) : ResponseEntity.notFound().build();
    }

    @GetMapping("/achats")
    public ResponseEntity<List<ClientAchatDTO>> getClientInfo() {
        return ResponseEntity.ok(clientService.getClientsInfoEtTotalAchats());
    }
    @GetMapping("/achats/{date}")
    public ResponseEntity<List<ClientAchatDTO>> getClientAchatsParDate(@PathVariable Date date) {
        return ResponseEntity.ok(clientService.getClientAchatsParDate(date));
    }
}
