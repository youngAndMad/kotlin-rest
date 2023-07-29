package danekercode.rest.utils

import danekercode.rest.dto.EmployeeDTO
import danekercode.rest.exception.InvalidEmployeeRequestException

class Validator {
    companion object {
        fun validate(dto: EmployeeDTO) {
            val sb = StringBuilder()
            if (dto.age !in 19..63) {
                sb.append("age should be between 16-64")
                    .append(System.lineSeparator())
            }
            if (dto.name.isBlank()){
                sb.append("name should not be blank")
                    .append(System.lineSeparator())
            }
            if (dto.surname.isBlank()){
                sb.append("surname should not be blank")
                    .append(System.lineSeparator())
            }

            if (sb.isNotBlank()){
                throw InvalidEmployeeRequestException(sb.toString())
            }
        }
    }
}