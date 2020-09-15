package kapadokia.nyandoro.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kapadokia.nyandoro.diceroller.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

   lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)


        val rollButton = binding.rollButton
        rollButton.text ="Hey dummy"
        rollButton.setOnClickListener{
            Toast.makeText(this, "Hey dummy you clicked me", Toast.LENGTH_LONG).show()
        }
    }
}