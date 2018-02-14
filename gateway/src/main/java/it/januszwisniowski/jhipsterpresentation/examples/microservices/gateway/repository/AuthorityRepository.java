package it.januszwisniowski.jhipsterpresentation.examples.microservices.gateway.repository;

import it.januszwisniowski.jhipsterpresentation.examples.microservices.gateway.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
