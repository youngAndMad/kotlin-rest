package danekercode.rest.controller

import danekercode.rest.dto.EmployeeDTO
import danekercode.rest.service.EmployeeService
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("employee")
class EmployeeController(
    private val employeeService: EmployeeService
) {

    @GetMapping
    fun findAll() = employeeService.findAll()

    @GetMapping("{id}")
    fun findById(@PathVariable id: Long) = employeeService.findById(id)

    @PostMapping
    fun save(
        @RequestBody @Valid dto: EmployeeDTO
    ) = employeeService.save(dto)

    @DeleteMapping("{id}")
    fun deleteById(@PathVariable id: Long) = employeeService.delete(id)

    @PutMapping("{id}")
    fun update(
        @PathVariable id: Long,
        @RequestBody dto: EmployeeDTO
    ) = employeeService.update(id, dto)

}