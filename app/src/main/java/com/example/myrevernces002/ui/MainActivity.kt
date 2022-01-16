package com.example.myrevernces002.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.myrevernces002.R
import com.example.myrevernces002.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Global references
    //هنا بنسوي نكريت اوبجكت البيندق
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        // هنا بدال ماكنت اشوار على الاكتفتي مين استخدم بايدنق
        setContentView(binding.root)
        //فوق عرفناها وهنا نربطهم بال


        //يعني تحط مستمع اول ما يكلك على البتن يتوجه الى داله اون كلك وينفذ
        // بعد ما تعرفها وتعرف الفنكشن تعملها استدعاء للفنكشن وتعطيها الكلاس المنفذ الي هو المينb
        // btn_login.setOnClickListener(this)

        //الطريقة الثالثه هي انك تستدعي اون كلك لسنر وتنفذ على طول الكود جوتها على طول
        //!edt_password.text.toString().isNullOrEmpty()

    }
}