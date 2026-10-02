package Developer.StudentManagement.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Developer.StudentManagement.Entity.Student;
import Developer.StudentManagement.Service.StudentService;

@RestController 
@RequestMapping("/api")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable Integer id){
        return studentService.getStudentById(id);
    }
    @GetMapping("/all")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student newstudent, @RequestParam Integer oldStudentId){
        Student updatedStudent = studentService.updateStudent(newstudent, oldStudentId);
        return updatedStudent;
        
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Integer id){
        studentService.deleteStudent(id);
    }
    
}
