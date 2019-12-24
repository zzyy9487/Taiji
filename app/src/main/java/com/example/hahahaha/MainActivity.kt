package com.example.hahahaha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var now :Int = 0

        seekBar.setProgress(0)
        gif.layoutParams.width = 0
        gif.layoutParams.height = 0
        imageView1.layoutParams.width = 300
        imageView1.layoutParams.height = 300
        imageView2.layoutParams.width = 300
        imageView2.layoutParams.height = 300
        imageView3.layoutParams.width = 300
        imageView3.layoutParams.height = 300
        imageView4.layoutParams.width = 300
        imageView4.layoutParams.height = 300

        seekBar.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                text.text = progress.toString()
                if (now == 0){
                    imageView1.layoutParams.width = 300 + progress
                    imageView1.layoutParams.height = 300 - progress
                    imageView2.layoutParams.width = 300 - progress
                    imageView2.layoutParams.height = 300 + progress
                    imageView3.layoutParams.width = 300 - progress
                    imageView3.layoutParams.height = 300 + progress
                    imageView4.layoutParams.width = 300 + progress
                    imageView4.layoutParams.height = 300 - progress
                    gif.layoutParams.width = progress * 2
                    gif.layoutParams.height = progress * 2

                    if (progress == 300){
                        gif.visibility = View.VISIBLE
                        imageView1.visibility = View.INVISIBLE
                        imageView2.visibility = View.INVISIBLE
                        imageView3.visibility = View.INVISIBLE
                        imageView4.visibility = View.INVISIBLE
                    } else if (progress == 0) {
                        gif.visibility = View.INVISIBLE
                        imageView1.visibility = View.VISIBLE
                        imageView2.visibility = View.VISIBLE
                        imageView3.visibility = View.VISIBLE
                        imageView4.visibility = View.VISIBLE
                    }
                    else {
                        gif.visibility = View.VISIBLE
                        imageView1.visibility = View.VISIBLE
                        imageView2.visibility = View.VISIBLE
                        imageView3.visibility = View.VISIBLE
                        imageView4.visibility = View.VISIBLE
                    }
                }else{
                    imageView1.layoutParams.height = 300 + progress
                    imageView1.layoutParams.width = 300 - progress
                    imageView2.layoutParams.height = 300 - progress
                    imageView2.layoutParams.width = 300 + progress
                    imageView3.layoutParams.height = 300 - progress
                    imageView3.layoutParams.width = 300 + progress
                    imageView4.layoutParams.height = 300 + progress
                    imageView4.layoutParams.width = 300 - progress
                    gif.layoutParams.width = progress * 2
                    gif.layoutParams.height = progress * 2

                    if (progress == 300){
                        gif.visibility = View.VISIBLE
                        imageView1.visibility = View.INVISIBLE
                        imageView2.visibility = View.INVISIBLE
                        imageView3.visibility = View.INVISIBLE
                        imageView4.visibility = View.INVISIBLE
                    } else if (progress == 0) {
                        gif.visibility = View.INVISIBLE
                        imageView1.visibility = View.VISIBLE
                        imageView2.visibility = View.VISIBLE
                        imageView3.visibility = View.VISIBLE
                        imageView4.visibility = View.VISIBLE
                    }
                    else {
                        gif.visibility = View.VISIBLE
                        imageView1.visibility = View.VISIBLE
                        imageView2.visibility = View.VISIBLE
                        imageView3.visibility = View.VISIBLE
                        imageView4.visibility = View.VISIBLE
                    }
                }

                when(progress){
                    0 -> if (now==0){
                        now =1
                    } else now = 0
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })





    }
}
