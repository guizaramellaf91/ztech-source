package br.com.zaratech.ztech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zaratech.ztech.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String>{
	
	Authority findByName(String name);
	
}
