package it.januszwisniowski.jhipsterpresentation.examples.microservices.bookstore.repository;

import it.januszwisniowski.jhipsterpresentation.examples.microservices.bookstore.domain.Book;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the Book entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
