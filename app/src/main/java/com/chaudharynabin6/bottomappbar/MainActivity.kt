package com.chaudharynabin6.bottomappbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import com.chaudharynabin6.bottomappbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), Toolbar.OnMenuItemClickListener {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            bottomAppBar.setOnMenuItemClickListener(this@MainActivity)
            fab.setOnClickListener {
                Log.e("fab ...","fab icon clicked")
            }
        }
    }

    override fun onMenuItemClick(item: MenuItem?): Boolean {
        Log.e("menu ...",item.toString())
        return  true
    }
}