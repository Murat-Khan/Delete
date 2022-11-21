package com.murat.helloapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.murat.helloapp.databinding.ItemUserBinding

class UserAdapter(
  var userList: ArrayList<UserData>,
  val onClick : (position:Int)->Unit

) :RecyclerView.Adapter<UserAdapter.UserHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
       return UserHolder(ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: UserHolder, position: Int) {
       holder.onBind(userList[position], position)
    }

    fun deleteItem(pos: Int){
        userList.removeAt(pos)
        notifyItemRemoved(pos)
    }

    override fun getItemCount() = userList.size



    inner  class UserHolder(private val binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root){
        fun onBind(user : UserData, position: Int) {
            itemView.setOnClickListener {
                onClick(position)
            }

            Glide.with(binding.profileImage).load(user.avatar).into(binding.profileImage)
            binding.avatarName.text = user.userName
        }

    }

}