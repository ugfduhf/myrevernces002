package com.example.myrevernces002.model.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// اعطيها اسم التيبول تبعها يتخزن في الداتا بيز فعليا
@Entity(tableName = "user_table")
class User(
    //اوتو جنيريت ترو يعني ايدي يزيد لوحده
    @PrimaryKey(autoGenerate = true)
    var id:Int,
    //ممكن تعطي كل رفرنسس اسم في الداتا بيز عن طريق الكولم
    @ColumnInfo(name = "user_name")
    var userNameUs:String,var messageUs:String,var imageUs:Int)
// الان الانتتي خلصناها ثاني شي عندنا في الرووم  الداو  الي هي داتا اكسس اوبجكت عشان تقدر تتعامل معاها
