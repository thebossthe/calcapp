package jp.techacademy.yuu.funakoshi.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import jp.techacademy.yuu.funakoshi.calcapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val value3:Float = intent.getFloatExtra("VALUE1", 0.0F)

        binding.textView.text = "$value3"
        Log.d("KotlinLog","結果:$value3")

    }
}