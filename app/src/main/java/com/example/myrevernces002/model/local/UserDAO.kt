package com.example.myrevernces002.model.local

import androidx.room.*
import com.example.myrevernces002.model.entity.User

@Dao
interface UserDAO {
    //هذا الاوبشن يسوي مثلا اذا فيه نفس المسنخدم يبدله
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertOrUpdateUser(user: User)
    @Delete
    fun deleteUser(user: User)

    @Query("select * from user_table")
    fun getUsers():List<User>
}