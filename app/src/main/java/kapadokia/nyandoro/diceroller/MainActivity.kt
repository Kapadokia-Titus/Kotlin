package kapadokia.nyandoro.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kapadokia.nyandoro.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random


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
          rollDice()
        }
    }

    private fun rollDice() {
        val updateRoll = binding.diceNumber

        // generate a random number between one and six
        val rand  = Random.nextInt(6) +1
        updateRoll.text = rand.toString()
    }
}