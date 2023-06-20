package com.mft.interhip8.service;

import com.mft.interhip8.dto.ClientDetailsDTO;
import com.mft.interhip8.entity.ClientDetails;
import com.mft.interhip8.repository.ClientDetailsRepository;
import com.mft.interhip8.controller.ClientDetailsMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import java.util.List;

@Service
public class ClientDetailsService {

    private final ClientDetailsRepository clientDetailsRepository;
    private final ClientDetailsMapper clientDetailsMapper;

    @Autowired
    public ClientDetailsService(ClientDetailsRepository clientDetailsRepository, ClientDetailsMapper clientDetailsMapper) {
        this.clientDetailsRepository = clientDetailsRepository;
        this.clientDetailsMapper = clientDetailsMapper;
    }


    public List<ClientDetailsDTO> getAllClientDetails() {

        List<ClientDetails> clientDetailsList = new ArrayList<>();
        clientDetailsRepository.findAll().forEach(clientDetailsList::add);
        return clientDetailsMapper.toDtoList(clientDetailsList);
    }

    public ClientDetailsDTO getClientDetailsById(Long clientId) {
        ClientDetails clientDetails = clientDetailsRepository.findById(clientId)
                .orElseThrow(() -> new NoSuchElementException("ClientDetails not found with id: " + clientId));
        return clientDetailsMapper.toDto(clientDetails);
    }

    public List<ClientDetailsDTO> getClientDetailsByClientUserName(String clientUserName) {
        List<ClientDetails> clientDetailsList = clientDetailsRepository.findByClientUserName(clientUserName);
        return clientDetailsMapper.toDtoList(clientDetailsList);
    }

    public ClientDetailsDTO createClientDetails(ClientDetailsDTO clientDetailsDTO) {
        if (clientDetailsRepository.existsById(clientDetailsDTO.getClientId())) {
        	throw new IllegalArgumentException("Client ID already exists");
    	}
	ClientDetails clientDetails = clientDetailsMapper.toEntity(clientDetailsDTO);
        ClientDetails savedClientDetails = clientDetailsRepository.save(clientDetails);
        return clientDetailsMapper.toDto(savedClientDetails);
    }


    public ClientDetails updateClientDetails(Long clientId, ClientDetailsDTO clientDetailsDTO) {
        ClientDetails clientDetails = clientDetailsRepository.findById(clientId)
                .orElseThrow(() -> new NoSuchElementException("ClientDetails not found with id: " + clientId));
        return clientDetailsRepository.save(clientDetailsMapper.toEntity(clientDetailsDTO));
    }

    public void deleteClientDetails(Long clientId) {
 	ClientDetails clientDetails = clientDetailsRepository.findById(clientId)
                .orElseThrow(() -> new NoSuchElementException("ClientDetails not found with id: " + clientId));        
	clientDetailsRepository.deleteById(clientId);
    }
}
