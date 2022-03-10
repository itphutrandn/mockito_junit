package h2.console.h2console_junittest_mock.repositories;

import h2.console.h2console_junittest_mock.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {


}
