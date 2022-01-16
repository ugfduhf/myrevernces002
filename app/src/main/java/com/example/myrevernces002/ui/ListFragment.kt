package com.example.myrevernces002.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.myrevernces002.R
import com.example.myrevernces002.adapter.AdapterRecyclerView
import com.example.myrevernces002.adapter.OnItemclick
import com.example.myrevernces002.databinding.FragmentListBinding
import com.example.myrevernces002.model.entity.User


class ListFragment : Fragment(),OnItemclick {

  lateinit var binding: FragmentListBinding

    var arrayListSecound:ArrayList<User> = ArrayList()

    var userName: String? = null

    val recyclerViewObject : AdapterRecyclerView by lazy {
        AdapterRecyclerView()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //userName = intent.extras!!.get("userName").toString()
        // استقبل بينات من ارقمنت اخر
        userName = arguments?.getString("userName")


        binding.recayclerMaSecoun.adapter = recyclerViewObject

        binding.btnAdd.setOnClickListener {
            arrayListSecound.add(
                User(userName.toString(),binding.edMessageSecound.text.toString(),
                R.drawable.ic_launcher_background
            )
            )
            recyclerViewObject.setuserToArray(arrayListSecound)

            binding.edMessageSecound.setText("")
        }
        recyclerViewObject.onItemclick=this
    }
    override fun onclickItemFun(user: User) {
        super.onclickItemFun(user)
        Toast.makeText(context,"this  name is $userName the message is ${user.messageUs}", Toast.LENGTH_LONG).show()
    }
}