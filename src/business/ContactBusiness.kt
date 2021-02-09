package business

import java.lang.Exception

class ContactBusiness {

    fun validate(name: String, phone: String) {
        if (name == "") {
            throw Exception(" Nome é obrigatório ! ")
        }
        if (phone == "") {
            throw Exception(" Telefone é obrigatório ! ")
        }
    }

    fun validateDelete(name: String, phone: String) {
        if (name == "" || phone == "") {
            throw Exception(" É necessario informar um cotato antes de remover. ")
        }
    }

    fun save(name: String, phone: String) {
        validate(name, phone)
    }

    fun delete(name: String, phone: String) {
        validateDelete(name, phone)
    }

}