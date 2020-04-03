package ua.lviv.iot.spring.project7.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.spring.project7.rest.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    
}
