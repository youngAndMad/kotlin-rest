package danekercode.rest.exception

class InvalidEmployeeRequestException(
    private val msg:String
):RuntimeException(msg) {
}