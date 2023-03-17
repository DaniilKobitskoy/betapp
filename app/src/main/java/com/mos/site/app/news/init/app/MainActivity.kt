package com.mos.site.app.news.init.app

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mos.site.app.news.init.app.databinding.ActivityMainBinding
import com.mos.site.app.news.init.app.fragments.infomatch
import com.mos.site.app.news.init.app.fragments.mainmatch


lateinit var bindingMain: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)
        supportFragmentManager
            .beginTransaction()
            .replace(bindingMain.container.id, mainmatch())
            .commit()
    }

 fun updatefragment(id: Int){
     val fragmentManager = supportFragmentManager
     val transaction = fragmentManager.beginTransaction()
     transaction.replace(R.id.container,infomatch(id))
     //transaction.addToBackStack(null)
     transaction.commit()
}
}