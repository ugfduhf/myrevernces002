package com.example.myrevernces002.model.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.myrevernces002.model.entity.User


// اسم الداتا بيز
private const val DATABASE_NAME="user_database"
// // سكيما تسويلي اكثر من فيرجن في الهوستري          لو عندي اكثر من انتتي احط , واكمل
@Database(entities = [User::class], version = 1, exportSchema = false)
abstract class UserDatabase : RoomDatabase() {
    //الداتا بيز عشان تقدر تتعامل مع الديتا الي موجوده جوه الانتتي تحتاج وسيط الي هو الداو وانادي الفنكشن الي موجوده داخل الانتر فيس
    abstract fun userDAO(): UserDAO

    // ثاني شي محتاج اسويه هو سنقل تول فنكشن ديزاين بترن
    //وظيفته السنقل هو لو مثلا انت داخل كلاس وممكن
// اكثر من كلاس محتاجين منه اوبجكت انستنس ممكن اسوي حاجه اسمها سنقل تون اقدر اكريت انستنس وحده
    //من الكلاس دا واي احد يناديها او ياخذ منه ابجكت يرجعله نفس الانستنس عشان يوفر في المموري
    // معناه بكريت سنقل تول
    companion object {
        //فولوتايل معناها متشافه لكل الثريد واي حد يبغا يناديها ترجعله نفس الوبجكت
        @Volatile
        private var instanceUData: UserDatabase? = null

        fun getInstance(context: Context): UserDatabase {
            return instanceUData ?: synchronized(Any()) {
                instanceUData ?: buildDatabase(context).also { instanceUData = it }
            }
        }

        private fun buildDatabase(context: Context): UserDatabase {
            return Room.databaseBuilder(context.applicationContext,UserDatabase::class.java,
                DATABASE_NAME).build()
        }
    }
}