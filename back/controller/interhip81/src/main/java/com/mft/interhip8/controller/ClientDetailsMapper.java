package com.mft.interhip8.controller;

import com.mft.interhip8.dto.ClientDetailsDTO;
import com.mft.interhip8.entity.ClientDetails;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
@Component
public class ClientDetailsMapper {

    public ClientDetailsDTO toDto(ClientDetails clientDetails) {
        if (clientDetails == null) {
            return null;
        }

        ClientDetailsDTO clientDetailsDTO = new ClientDetailsDTO();
        clientDetailsDTO.setClientId(clientDetails.getClientId());
        clientDetailsDTO.setClientUserName(clientDetails.getClientUserName());
        clientDetailsDTO.setClientName(clientDetails.getClientName());
        clientDetailsDTO.setClientSurname(clientDetails.getClientSurname());
        clientDetailsDTO.setClientCompany(clientDetails.getClientCompany());
        clientDetailsDTO.setClientLEI(clientDetails.getClientLEI());
        clientDetailsDTO.setClientEmail(clientDetails.getClientEmail());
        clientDetailsDTO.setClientPhone(clientDetails.getClientPhone());
        clientDetailsDTO.setClientDemoFlag(clientDetails.isClientDemoFlag());
        clientDetailsDTO.setClientStatus(clientDetails.getClientStatus());
        clientDetailsDTO.setClientDateCreated(clientDetails.getClientDateCreated());
        clientDetailsDTO.setClientDateUpdated(clientDetails.getClientDateUpdated());
        clientDetailsDTO.setClientUserCreated(clientDetails.getClientUserCreated());
        clientDetailsDTO.setClientUserUpdated(clientDetails.getClientUserUpdated());

        return clientDetailsDTO;
    }

    public List<ClientDetailsDTO> toDtoList(List<ClientDetails> clientDetailsList) {
        return clientDetailsList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public ClientDetails toEntity(ClientDetailsDTO clientDetailsDTO) {
        if (clientDetailsDTO == null) {
            return null;
        }

        ClientDetails clientDetails = new ClientDetails();
        clientDetails.setClientId(clientDetailsDTO.getClientId());
        clientDetails.setClientUserName(clientDetailsDTO.getClientUserName());
        clientDetails.setClientName(clientDetailsDTO.getClientName());
        clientDetails.setClientSurname(clientDetailsDTO.getClientSurname());
        clientDetails.setClientCompany(clientDetailsDTO.getClientCompany());
        clientDetails.setClientLEI(clientDetailsDTO.getClientLEI());
        clientDetails.setClientEmail(clientDetailsDTO.getClientEmail());
        clientDetails.setClientPhone(clientDetailsDTO.getClientPhone());
        clientDetails.setClientDemoFlag(clientDetailsDTO.isClientDemoFlag());
        clientDetails.setClientStatus(clientDetailsDTO.getClientStatus());
        clientDetails.setClientDateCreated(clientDetailsDTO.getClientDateCreated());
        clientDetails.setClientDateUpdated(clientDetailsDTO.getClientDateUpdated());
        clientDetails.setClientUserCreated(clientDetailsDTO.getClientUserCreated());
        clientDetails.setClientUserUpdated(clientDetailsDTO.getClientUserUpdated());

        return clientDetails;
    }
}

