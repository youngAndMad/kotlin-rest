package danekercode.rest.service

import danekercode.rest.model.Employee

interface EmployeeService {
    fun findAll() : List<Employee>;


}