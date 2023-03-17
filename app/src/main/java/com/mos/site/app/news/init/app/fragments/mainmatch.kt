package com.mos.site.app.news.init.app.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.mos.site.app.news.init.app.R
import com.mos.site.app.news.init.app.databinding.FragmentMainmatchBinding
import com.mos.site.app.news.init.app.dataclass.paramApiItem
import com.mos.site.app.news.init.app.retrofit.Common
import com.mos.site.app.news.init.app.retrofit.MyMovieAdapter
import com.mos.site.app.news.init.app.retrofit.RetrofitServices
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

lateinit var bindingmainmatch: FragmentMainmatchBinding
lateinit var mService: RetrofitServices
lateinit var layoutManager: LinearLayoutManager


class mainmatch : Fragment() {

    lateinit var adapter: MyMovieAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bindingmainmatch = FragmentMainmatchBinding.inflate(inflater, container, false)
        return bindingmainmatch.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mService = Common.retrofitService
        bindingmainmatch.recyclerMovieList.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(requireContext())
        bindingmainmatch.recyclerMovieList.layoutManager = layoutManager
        getAllMovieList()
    }

    private fun getAllMovieList() {
        mService.getMovieList(token = "23d08d7f89c944908bad56d1813453e698f00839d8144c899b9abef597eaaacd").enqueue(object : Callback<MutableList<paramApiItem>> {
            override fun onFailure(call: Call<MutableList<paramApiItem>>, t: Throwable) {

            }

            override fun onResponse(call: Call<MutableList<paramApiItem>>, response: Response<MutableList<paramApiItem>>) {
                adapter = MyMovieAdapter(requireContext(), response.body() as MutableList<paramApiItem>)
                adapter.notifyDataSetChanged()
                Log.d("teamAsian", response.body().toString())
                bindingmainmatch.recyclerMovieList.adapter = adapter


            }
        })
    }


    companion object {

        fun newInstance() =
            mainmatch()
    }
}