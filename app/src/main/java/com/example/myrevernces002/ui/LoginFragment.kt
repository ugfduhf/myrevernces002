package com.example.myrevernces002.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.myrevernces002.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    lateinit var binding : FragmentLoginBinding
    //Global variables
    val userName:String="yasser"
    val password:String="059"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         binding = FragmentLoginBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnLogin.setOnClickListener {

            if (binding.edNameLogin.text.toString().isNullOrEmpty() || binding.edNameLogin.text.toString() != userName){
                Toast.makeText(context, "Enter your correct username", Toast.LENGTH_LONG).show()
            }else if(binding.passwordLogin.text.toString().isNullOrEmpty() || binding.passwordLogin.text.toString() != password){
                Toast.makeText(context, "Empty or Enter your correct password", Toast.LENGTH_LONG).show()
            }else if(binding.edNameLogin.text.toString() == userName && binding.passwordLogin.text.toString() == password){
                Toast.makeText(context, " correct data", Toast.LENGTH_LONG).show()

                // safe Args فايدتها انه بيبتدي يكرت حاجه اسمها فراقمنت دايركشن ويحفظ جواه الاكشن كلها = الاكشن نفسه يستخدمه
                // كانه فانكشن بتاخذ برمتر من نوع استرنق كيف عرف عن طريق الارقمنت في القراف
                // بعد ماعرفت الalgs safe اعرف اكشن وارسل معه بيانات على الدايركشن تظهر بعد اضافه القاس
                var action = LoginFragmentDirections.actionLoginFragmentToListFragment(userName)
                findNavController().navigate(action)
//                var intent = Intent(context, SecoundActivity2::class.java)
//                intent.putExtra("userName",binding.edNameLogin.text.toString())
//                startActivity(intent)
            }
            else {
                true //Toast.makeText(this, "your input field wrong", Toast.LENGTH_LONG).show()
            }

        }
    }
}