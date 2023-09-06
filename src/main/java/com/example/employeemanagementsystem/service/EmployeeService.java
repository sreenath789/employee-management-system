package com.example.employeemanagementsystem.service;

import com.example.employeemanagementsystem.model.Employee;
import com.example.employeemanagementsystem.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    IEmployeeRepo iEmployeeRepo;

    public ResponseEntity<String> createEmployee(Employee employee) {
        iEmployeeRepo.save(employee);
        return new ResponseEntity<>("Employee created successfully", HttpStatus.CREATED);
    }

    public List<Employee> getAllEmployees() {
        return iEmployeeRepo.findAll();
    }

    public ResponseEntity<String> updateEmployee(int id, Employee employee) {
        if(iEmployeeRepo.existsById(id)){
            Employee existed = iEmployeeRepo.findById(id).get();
            if(employee.getEmail()!=null){
                existed.setEmail(employee.getEmail());
            }
            if(employee.getFirstName()!=null){
                existed.setFirstName(employee.getFirstName());
            }
            if(employee.getLastName()!=null){
                existed.setLastName(employee.getLastName());
            }
            if(employee.getMobileNumber()!=null){
                existed.setMobileNumber(employee.getMobileNumber());
            }
            if(employee.getSalary()!=0){
                existed.setSalary(employee.getSalary());
            }
            if(employee.getAddress()!=null){
                existed.setAddress(employee.getAddress());
            }
            if(employee.getJobRole()!=null){
                existed.setJobRole(employee.getJobRole());
            }
            iEmployeeRepo.save(existed);
            return new ResponseEntity<>("Employee updated successfully", HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("Employee id not found",HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Employee> getEmployeeById(int id) {
        if(iEmployeeRepo.existsById(id)){
            Employee employee = iEmployeeRepo.findById(id).get();
            return new ResponseEntity<>(employee,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<String> deleteEmployee(int id) {
        if(iEmployeeRepo.existsById(id)){
            iEmployeeRepo.deleteById(id);
            return new ResponseEntity<>("employee deleted successfully",HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("Employee id not found",HttpStatus.NOT_FOUND);
        }
    }
}
