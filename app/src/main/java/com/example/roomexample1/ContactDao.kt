package com.example.roomexample1

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ContactDao {
    @Insert
    fun insert(contact: Contact)

    @Update
    fun update(contact: Contact)

    @Delete
    fun delete(contact: Contact)

    @Query("SELECT *FROM  "+Contact.TABLE_NAME +" ORDER BY last_name,first_name")
    fun getOrderedAgenda():LiveData<List<Contact>>
}