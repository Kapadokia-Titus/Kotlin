package kapadokia.nyandoro.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import kapadokia.nyandoro.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

   lateinit var binding:ActivityMainBinding
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        diceImage = binding.diceImage
        val rollButton = binding.rollButton
        rollButton.setOnClickListener{
          rollDice()
        }
    }

    private fun rollDice() {
        // generate a random number between one and six
        val rand  = Random.nextInt(6) +1
        val drawableResource = when (rand){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else ->R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
    }
}