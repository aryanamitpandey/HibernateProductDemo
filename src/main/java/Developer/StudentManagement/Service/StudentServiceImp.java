package Developer.StudentManagement.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import Developer.StudentManagement.Entity.Student;
import Developer.StudentManagement.Repository.StudentRepository;


@Service 
public class StudentServiceImp implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImp(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
        // Implementation for saving a student
    }

    @Override 
    public Student getStudentById(Integer id){
        return studentRepository.findById(id).orElseThrow(()->new RuntimeException("Student not found with id: "+id));
    }

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @Override 
    public Student updateStudent(Student newstudent, Integer oldStudentId){
        Optional<Student> optional = studentRepository.findById(oldStudentId);
        if(optional.isPresent()){
            System.out.println("Student with ID " + oldStudentId + " is present");
            Student oldStudent = optional.get();
            oldStudent.setName(newstudent.getName());
            oldStudent.setEmail(newstudent.getEmail());
            oldStudent.setCourse(newstudent.getCourse());
            oldStudent.setPhoneNumber(newstudent.getPhoneNumber());
             studentRepository.save(oldStudent);
        }
        else{
            System.out.println("Student with ID " + oldStudentId + " is not present then create new");
            studentRepository.save(newstudent);
        
        }
        return newstudent;
    }

    @Override 
    public void deleteStudent(Integer id){
        studentRepository.deleteById(id);
    }
    
}
