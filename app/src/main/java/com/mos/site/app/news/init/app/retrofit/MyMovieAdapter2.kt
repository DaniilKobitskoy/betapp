package com.mos.site.app.news.init.app.retrofit

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.mos.site.app.news.init.app.R
import com.mos.site.app.news.init.app.dataclass.match

class MyMovieAdapter2(private val context: Context, private val movieList: MutableList<match>):
    RecyclerView.Adapter<MyMovieAdapter2.MyViewHolder2>() {

    class MyViewHolder2(itemView: View): RecyclerView.ViewHolder(itemView){

        val team1: TextView = itemView.findViewById(R.id.teams1)
        val team2: TextView = itemView.findViewById(R.id.teams)
        val koef1: TextView = itemView.findViewById(R.id.koef1)
        val koef2: TextView = itemView.findViewById(R.id.koef2)
        val koef3: TextView = itemView.findViewById(R.id.koef3)
        val kef1: TextView = itemView.findViewById(R.id.kef1)
        val kef2: TextView = itemView.findViewById(R.id.kef2)
        val kef3: TextView = itemView.findViewById(R.id.kef3)
//        val score1: TextView = itemView.findViewById(R.id.score1)
//        val score2: TextView = itemView.findViewById(R.id.score2)
//        val legue: TextView = itemView.findViewById(R.id.legue)
//        val id: ConstraintLayout = itemView.findViewById(R.id.id)
//        val time: TextView = itemView.findViewById(R.id.time)
        fun bind(listItem: match) {
//            id.setOnClickListener {
//                mainActivity.updatefragment(id.id)
//                Toast.makeText(it.context, "Нажал на ${id.id}, констрайн", Toast.LENGTH_SHORT).show()
//            }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder2 {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_match, parent, false)
        return MyViewHolder2(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder2, position: Int) {
        val listItem = movieList[position]
        holder.bind(listItem)
        var text = movieList[position].team2
        holder.koef1.text = movieList[position].markets.totals.first().over.v.toString()
        holder.koef2.text = movieList[position].markets.totals.first().type.toString()
        holder.koef3.text = movieList[position].markets.totals.first().under.v.toString()
        holder.kef1.text = movieList[position].markets.totals.first().over.v.toString()
        holder.kef2.text = movieList[position].markets.totals.first().type.toString()
        holder.kef3.text = movieList[position].markets.totals.first().under.v.toString()
//        holder.team1.text = movieList[position].team1
//        holder.team2.text = movieList[position].team2
//        holder.score1.text = movieList[position].score1.toString()
//        holder.score2.text = movieList[position].score2.toString()
//        holder.legue.text = movieList[position].title
//        holder.id.id = movieList[position].id
//        holder.time.text = movieList[position].minute.toString()
    }

    override fun getItemCount() = movieList.size



}
