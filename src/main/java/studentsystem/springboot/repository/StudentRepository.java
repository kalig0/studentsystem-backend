package studentsystem.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import studentsystem.springboot.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
