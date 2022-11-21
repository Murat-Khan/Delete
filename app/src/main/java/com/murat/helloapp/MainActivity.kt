package com.murat.helloapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
    }

    /*override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        menuInflater.inflate(R.menu.menu,menu)
        super.onCreateOptionsMenu(menu)
    }*/

    /*  override fun onCreateOptionsMenu(menu: Menu?): Boolean {
          requireActivity().menuInflater.inflate(R.menu.menu,menu)
          return super.requireActivity().onCreateOptionsMenu(menu)
      }*/


}