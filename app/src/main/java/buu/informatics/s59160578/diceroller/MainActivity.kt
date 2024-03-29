package buu.informatics.s59160578.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.TextView
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { resetDice() }

//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = "Dice Rolled!"
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val diceImage: ImageView = findViewById(R.id.dice_image)
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = randomInt.toString()
        diceImage.setImageResource(drawableResource)

    }

    private fun resetDice() {
        diceImage.setImageResource(R.drawable.empty_dice)
//        val randomInt = 0
//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = randomInt.toString()
//        Toast.makeText(this, "button clicked",Toast.LENGTH_SHORT).show()

    }
}
