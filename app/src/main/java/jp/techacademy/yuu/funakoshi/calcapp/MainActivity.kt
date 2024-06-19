package jp.techacademy.yuu.funakoshi.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.util.Log
import jp.techacademy.yuu.funakoshi.calcapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button1.setOnClickListener(this)
        binding.button2.setOnClickListener(this)
        binding.button3.setOnClickListener(this)
        binding.button4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, SecondActivity::class.java)
        val editText1 = findViewById<EditText>(R.id.editText1)
        val userInput1 = editText1.text.toString()
        val editText2 = findViewById<EditText>(R.id.editText2)
        val userInput2 = editText2.text.toString()

        val Value1: Float = userInput1.toFloatOrNull() ?: 0.0f
        val Value2: Float = userInput2.toFloatOrNull() ?: 0.0f
        Log.d("KotlinLog","入力１、Valur1:$Value1")
        Log.d("KotlinLog","入力２、Valur2:$Value2")

        when (v?.id) {
            R.id.button1 -> {
                var Value3:Float = Value1 + Value2
                intent.putExtra("VALUE1", Value3)
                Log.d("KotlinLog","+Valur3:$Value3")
            }
            R.id.button2 -> {
                var Value3:Float = Value1 - Value2
                intent.putExtra("VALUE1", Value3)
                Log.d("KotlinLog","-Valur3:$Value3")
            }
            R.id.button3 -> {
                var Value3:Float = Value1 * Value2
                intent.putExtra("VALUE1", Value3)
                Log.d("KotlinLog","*Valur3:$Value3")
            }
            R.id.button4 -> {
                var Value3:Float = Value1 / Value2
                intent.putExtra("VALUE1", Value3)
                Log.d("KotlinLog","/Valur3:$Value3")
            }
        }
        startActivity(intent)
    }
}