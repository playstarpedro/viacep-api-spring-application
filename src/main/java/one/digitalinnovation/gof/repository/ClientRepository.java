package one.digitalinnovation.gof.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import one.digitalinnovation.gof.model.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
}
