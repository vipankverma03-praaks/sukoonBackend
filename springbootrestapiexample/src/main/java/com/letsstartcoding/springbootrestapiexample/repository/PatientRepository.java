package com.letsstartcoding.springbootrestapiexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.letsstartcoding.springbootrestapiexample.model.Patient;


public interface PatientRepository extends JpaRepository<Patient, String> {

}