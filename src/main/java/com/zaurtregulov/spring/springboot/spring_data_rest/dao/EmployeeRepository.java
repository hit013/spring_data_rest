package com.zaurtregulov.spring.springboot.spring_data_rest.dao;




import com.zaurtregulov.spring.springboot.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeRepository extends JpaRepository <Employee, Integer>{


}
