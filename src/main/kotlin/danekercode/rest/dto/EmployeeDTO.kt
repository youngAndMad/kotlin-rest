package danekercode.rest.dto

import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank

data class EmployeeDTO(
    @NotBlank(message = "name should not be empty")
    val name: String,
    @NotBlank(message = "surname should not be empty")
    val surname: String,
    @Min(value = 18, message = "age should be between 18-64")
    @Max(value = 64, message = "age should be between 18-64")
    val age: Int
)
