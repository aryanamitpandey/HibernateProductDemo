package Developer.StudentManagement.Service;

import java.util.List;

import Developer.StudentManagement.Entity.Student;

public interface StudentService {

    public Student saveStudent(Student student);

    public Student getStudentById(Integer id);

    public List<Student> getAllStudents();

    public Student updateStudent(Student student, Integer oldStudentId);

    public void deleteStudent(Integer id);
    
}
