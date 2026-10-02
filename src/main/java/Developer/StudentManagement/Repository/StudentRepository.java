package Developer.StudentManagement.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import Developer.StudentManagement.Entity.Student;


public interface StudentRepository extends JpaRepository<Student, Integer> {

    public Optional<Student> findByName(String name);




    
    
}
