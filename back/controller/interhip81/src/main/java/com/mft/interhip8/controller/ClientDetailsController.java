package com.mft.interhip8.controller;

import com.mft.interhip8.dto.ClientDetailsDTO;
import com.mft.interhip8.entity.ClientDetails;
import com.mft.interhip8.service.ClientDetailsService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/clients")
public class ClientDetailsController {

    private final ClientDetailsService clientDetailsService;

    @Autowired
    public ClientDetailsController(ClientDetailsService clientDetailsService) {
        this.clientDetailsService = clientDetailsService;
    }

    @GetMapping("")
    public List<ClientDetailsDTO> getAllClientDetails() {
        return clientDetailsService.getAllClientDetails();
    }

    @GetMapping("/useranme/{clientUserName}")
    public List<ClientDetailsDTO> getClientDetailsByClientUserName(@PathVariable String clientUserName) {
        return clientDetailsService.getClientDetailsByClientUserName(clientUserName);
    }

    @GetMapping("/id/{clientId}")
    public ClientDetailsDTO getClientDetailsById(@PathVariable Long clientId) {
        return clientDetailsService.getClientDetailsById(clientId);
    }

    @PostMapping
    public ClientDetailsDTO createClientDetails(@RequestBody ClientDetailsDTO clientDetailsDTO) {
        return clientDetailsService.createClientDetails(clientDetailsDTO);
    }

    @PutMapping("/update/{clientId}")
    public ClientDetails updateClientDetails(@PathVariable Long clientId, @RequestBody ClientDetailsDTO clientDetailsDTO) {
        return clientDetailsService.updateClientDetails(clientId, clientDetailsDTO);
    }

    @DeleteMapping("/delete/{clientId}")
    public void deleteClientDetails(@PathVariable Long clientId) {
        clientDetailsService.deleteClientDetails(clientId);
    }
}

