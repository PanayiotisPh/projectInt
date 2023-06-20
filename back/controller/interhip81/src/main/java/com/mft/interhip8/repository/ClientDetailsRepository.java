package com.mft.interhip8.repository;

import com.mft.interhip8.entity.ClientDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientDetailsRepository extends CrudRepository<ClientDetails, Long> {
	List<ClientDetails> findByClientStatus(String clientStatus);
    	List<ClientDetails> findByClientUserName(String clientUsername);
}

