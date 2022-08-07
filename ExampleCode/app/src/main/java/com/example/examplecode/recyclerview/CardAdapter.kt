package com.example.examplecode.recyclerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.graphics.green
import androidx.recyclerview.widget.RecyclerView
import com.example.examplecode.DetailPostView
import com.example.examplecode.R

class CardAdapter(val CardItemList:ArrayList<CardItem>) : RecyclerView.Adapter<CardAdapter.CustomViewHolder>(){

    class CustomViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var title = itemView.findViewById<TextView>(R.id.tv_title)  //글 제목
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cardrecyclerview, parent, false)
        return CustomViewHolder(view).apply {
            itemView.setOnClickListener {
                val curPos:Int=adapterPosition
                val mainitem:CardItem=CardItemList.get(curPos)
                Toast.makeText(parent.context,"제목 : ${mainitem.title}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        //현재 클릭한 위치와 연동
        holder.title.text = CardItemList.get(position).title

        //해당 recyclerview 클릭시 activity 화면 이동
        holder.itemView.setOnClickListener{
            var intent = Intent(holder.itemView?.context, DetailPostView::class.java)
            intent.putExtra("id_extra", position)
            holder.itemView?.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}