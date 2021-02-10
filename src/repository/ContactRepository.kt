package repository

import entity.ContactEntity

class ContactRepository {

    companion object {
        private val list = mutableListOf<ContactEntity>()

        fun save(contact: ContactEntity) {
            list.add(contact)
        }

        fun delete(contact: ContactEntity) {

        }
    }

}