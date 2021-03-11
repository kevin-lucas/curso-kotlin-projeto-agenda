package repository

import entity.ContactEntity

class ContactRepository {

    companion object {
        private val listContacts = mutableListOf<ContactEntity>()

        fun save(contact: ContactEntity) {
            listContacts.add(contact)
        }

        fun delete(contact: ContactEntity) {
        }
    }
}