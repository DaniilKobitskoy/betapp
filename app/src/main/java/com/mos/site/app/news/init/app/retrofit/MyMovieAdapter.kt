package com.mos.site.app.news.init.app.retrofit

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

import androidx.recyclerview.widget.RecyclerView
import com.mos.site.app.news.init.app.MainActivity
import com.mos.site.app.news.init.app.R
import com.mos.site.app.news.init.app.bindingMain
import com.mos.site.app.news.init.app.dataclass.paramApiItem

class MyMovieAdapter(private val context: Context, private val movieList: MutableList<paramApiItem>):
    RecyclerView.Adapter<MyMovieAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val team1: TextView = itemView.findViewById(R.id.team1)
        val team2: TextView = itemView.findViewById(R.id.team2)
val score1:TextView = itemView.findViewById(R.id.score1)
val score2:TextView = itemView.findViewById(R.id.score2)
val legue:TextView = itemView.findViewById(R.id.legue)
val id: ConstraintLayout = itemView.findViewById(R.id.id)
val time: TextView = itemView.findViewById(R.id.time)
        fun bind(listItem: paramApiItem) {
            val context = itemView.context
            val activity : MainActivity = context as MainActivity
id.setOnClickListener {

    activity.updatefragment(id.id)
}
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(itemView)
    }
    override fun getItemCount() = movieList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val listItem = movieList[position]
        holder.bind(listItem)
var text = movieList[position].team2
        holder.team1.text = movieList[position].team1
        holder.team2.text = movieList[position].team2
        holder.score1.text = movieList[position].score1.toString()
        holder.score2.text = movieList[position].score2.toString()
        holder.legue.text = movieList[position].title
        holder.id.id = movieList[position].id
        holder.time.text = movieList[position].minute.toString()
        println(text)
    }

}
