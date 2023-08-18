package in.sakshi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sakshi.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity,Integer> {

}
