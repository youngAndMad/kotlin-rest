package danekercode.rest.exception.handler

import danekercode.rest.exception.EmployeeNotFoundException
import danekercode.rest.exception.InvalidEmployeeRequestException
import org.springframework.http.HttpStatusCode
import org.springframework.http.ProblemDetail
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException::class)
    fun handle(e: EmployeeNotFoundException) : ProblemDetail = ProblemDetail
            .forStatusAndDetail(HttpStatusCode.valueOf(404), e.message.toString())

    @ExceptionHandler(InvalidEmployeeRequestException::class)
    fun handle(e: InvalidEmployeeRequestException) : ProblemDetail = ProblemDetail
            .forStatusAndDetail(HttpStatusCode.valueOf(400), e.message.toString())
}