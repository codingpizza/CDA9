package com.codingpizza.cda9

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    private var imageView: ImageView? = null
    private var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.imageView)
        button = findViewById(R.id.button)

        button?.setOnClickListener { loadImage() }
    }

    private fun loadImage() {
        imageView?.let {
            Glide.with(this)
                .load("https://s22.postimg.cc/572fvlmg1/vlad-baranov-767980-unsplash.jpg")
                .into(it)
        }
    }

}
