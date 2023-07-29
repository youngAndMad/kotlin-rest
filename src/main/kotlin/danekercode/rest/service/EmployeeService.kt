package danekercode.rest.service

import danekercode.rest.dto.EmployeeDTO
import danekercode.rest.model.Employee
import org.springframework.validation.BindingResult

interface EmployeeService {
    fun findAll(): List<Employee>;

    fun update(id: Long, dto: EmployeeDTO): Employee

    fun save(dto: EmployeeDTO): Employee

    fun delete(id: Long): Boolean

    fun findById(id: Long): Employee
}