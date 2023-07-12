package fr.orsys.msa.gc.front;

import fr.orsys.msa.gc.front.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Controller
@RequiredArgsConstructor
public class HomeController {

    final ClientService clientService;

    @GetMapping("/")
    public String home(Model model) throws UnknownHostException {
        String hostName = InetAddress.getLocalHost().getHostName();
        model.addAttribute("hostname", hostName);
        model.addAttribute("clients", clientService.getAllClients());
        return "listClients";
    }
}
