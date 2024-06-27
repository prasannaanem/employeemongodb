package com.employeemongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.employeemongodb.entity.Employee;
@Repository
public interface EmployeeRepo extends MongoRepository<Employee, String>{

}
