package com.example.roomexample1

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class ContactsViewModel(application: Application):AndroidViewModel(application) {
    private val repository = ContactsRepository(application)

    val contacts =repository.getContacts()

    fun saveContact(contact: Contact){
        repository.insert(contact)
    }
}