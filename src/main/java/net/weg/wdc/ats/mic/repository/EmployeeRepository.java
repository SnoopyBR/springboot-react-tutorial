package net.weg.wdc.ats.mic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.weg.wdc.ats.mic.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
