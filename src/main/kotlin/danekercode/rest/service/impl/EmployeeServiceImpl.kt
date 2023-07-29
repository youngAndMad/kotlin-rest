package danekercode.rest.service.impl

import danekercode.rest.dto.EmployeeDTO
import danekercode.rest.exception.EmployeeNotFoundException
import danekercode.rest.model.Employee
import danekercode.rest.repository.EmployeeRepository
import danekercode.rest.service.EmployeeService
import danekercode.rest.utils.Validator
import org.springframework.stereotype.Service

@Service
class EmployeeServiceImpl(
    private val employeeRepository: EmployeeRepository
) : EmployeeService {

    override fun findAll(): List<Employee> = employeeRepository.findAll()

    override fun update(
        id: Long,
        dto: EmployeeDTO
    ): Employee {
        Validator.validate(dto)
        val employee = this.findById(id)
        val updated = Employee(dto)
        updated.id = employee.id
        return employeeRepository.save(updated)
    }

    override fun save(dto: EmployeeDTO): Employee {
        Validator.validate(dto)
        return employeeRepository.save(Employee(dto))
    }

    override fun delete(id: Long): Boolean {
        val employee = this.findById(id)
        employeeRepository.delete(employee)
        return true
    }

    override fun findById(id: Long): Employee = employeeRepository
        .findById(id)
        .orElseThrow { EmployeeNotFoundException(id) }

}