package danekercode.rest.exception

class EmployeeNotFoundException(
    private val id: Long
) : RuntimeException("employee with id $id not found") {
}