package com.example.myrevernces002.adapter



import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myrevernces002.R
import com.example.myrevernces002.model.entity.User


class AdapterRecyclerView : RecyclerView.Adapter<AdapterRecyclerView.userHolderRecyclerView>() {

    var arrayUser:ArrayList<User> = ArrayList()

    fun setuserToArray(arraryUser:ArrayList<User> = ArrayList() ){
         arrayUser = arraryUser

        notifyDataSetChanged()
    }
    var onItemclick : OnItemclick?=null
   inner class userHolderRecyclerView(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var iv_imageAda:ImageView = itemView.findViewById(R.id.image_item_holder)
        var tv_userNameAda:TextView = itemView.findViewById(R.id.tv_userName_item_hold)
        var tv_messageAda:TextView = itemView.findViewById(R.id.tv_message_item_hold)

        fun bind(user: User){
          iv_imageAda.setImageResource(user.imageUs)
            tv_userNameAda.text = user.userNameUs
            tv_messageAda.text = user.messageUs

            itemView.setOnClickListener {
                onItemclick?.onclickItemFun(user)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): userHolderRecyclerView {
        var view:View = LayoutInflater.from(parent.context).inflate(R.layout.item_user,parent,false)
        return userHolderRecyclerView(view)
    }

    override fun onBindViewHolder(holder: userHolderRecyclerView, position: Int) {
       var user: User = arrayUser.get(position)
        holder.bind(user)
    }

    override fun getItemCount(): Int {
       return arrayUser.size
    }


}