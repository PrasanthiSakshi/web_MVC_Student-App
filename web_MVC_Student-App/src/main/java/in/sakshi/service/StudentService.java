package in.sakshi.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sakshi.binding.Student;
import in.sakshi.entity.StudentEntity;
import in.sakshi.repository.StudentRepository;


@Service
public class StudentService {
	
	@Autowired
	
	private StudentRepository repo;
	
	public boolean saveStudent(Student student) {
		
		StudentEntity entity = new StudentEntity();
		
		BeanUtils.copyProperties(student, entity);
		
		entity.setTimings(Arrays.toString(student.getTimings()));
		System.out.println(entity);
		
		repo.save(entity);
		
		return true;
		
		
	}
	
	
	
	public List<String> getCourses () {
		return Arrays.asList("Java","Phython", "AWS", "Devops");
		}
	public List<String> getTimings () {
		return Arrays.asList("Morning", "Afternoon", "Evening");
	}
}
