package com.mos.site.app.news.init.app.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.mos.site.app.news.init.app.R
import com.mos.site.app.news.init.app.databinding.FragmentInfomatchBinding
import com.mos.site.app.news.init.app.dataclass.match
import com.mos.site.app.news.init.app.dataclass.paramApiItem
import com.mos.site.app.news.init.app.retrofit.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class infomatch(id: Int) : Fragment() {
    lateinit var mService2: RetofitServices2
lateinit var binding: FragmentInfomatchBinding
    lateinit var adapter: MyMovieAdapter2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentInfomatchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mService2 = Common2.retrofitService2
        binding.recyclerMovieList.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerMovieList.layoutManager = layoutManager
        getAllMovieList()
    }

    private fun getAllMovieList() {
        Log.d("matchID", id.toString())
        mService2.getMovieList(token = "23d08d7f89c944908bad56d1813453e698f00839d8144c899b9abef597eaaacd", id).enqueue(object :
            Callback<MutableList<match>> {
            override fun onFailure(call: Call<MutableList<match>>, t: Throwable) {

            }

            override fun onResponse(call: Call<MutableList<match>>, response: Response<MutableList<match>>) {
                adapter = MyMovieAdapter2(requireContext(), response.body() as MutableList<match>)
                adapter.notifyDataSetChanged()
                Log.d("teamAsian", response.body().toString())
                bindingmainmatch.recyclerMovieList.adapter = adapter


            }
        })
    }
}