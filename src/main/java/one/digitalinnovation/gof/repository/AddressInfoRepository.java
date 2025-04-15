package one.digitalinnovation.gof.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import one.digitalinnovation.gof.model.AddressInfo;

@Repository
public interface AddressInfoRepository extends CrudRepository<AddressInfo, String> {
}
