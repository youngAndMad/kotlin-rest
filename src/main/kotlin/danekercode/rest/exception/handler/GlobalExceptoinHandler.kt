package danekercode.rest.exception.handler

import danekercode.rest.exception.EmployeeNotFoundException
import danekercode.rest.exception.InvalidEmployeeRequestException
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException::class)
    fun handle(e: EmployeeNotFoundException) : ResponseEntity<Any> = ResponseEntity.status(404).body(e.message)

    @ExceptionHandler(InvalidEmployeeRequestException::class)
    fun handle(e: InvalidEmployeeRequestException) : ResponseEntity<Any> = ResponseEntity.status(400).body(e.message)
}