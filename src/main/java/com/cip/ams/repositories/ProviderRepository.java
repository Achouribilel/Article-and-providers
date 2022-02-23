package com.cip.ams.repositories;


//import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.cip.ams.entities.Provider;
@Repository
public interface ProviderRepository extends CrudRepository<Provider, Long> {
}
