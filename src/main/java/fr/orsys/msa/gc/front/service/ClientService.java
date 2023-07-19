package fr.orsys.msa.gc.front.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "clients-api", url = "${app.services.clients.uri}")
public interface ClientService {

    @GetMapping("/api/clients")
    List<Client> getAllClients();
}
