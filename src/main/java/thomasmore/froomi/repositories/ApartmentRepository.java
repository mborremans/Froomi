package thomasmore.froomi.repositories;

import org.springframework.data.repository.CrudRepository;
import thomasmore.froomi.model.Apartment;

public interface ApartmentRepository extends CrudRepository<Apartment, Integer> {
}
