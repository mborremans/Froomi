package thomasmore.froomi.repositories;

import org.springframework.data.repository.CrudRepository;
import thomasmore.froomi.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
