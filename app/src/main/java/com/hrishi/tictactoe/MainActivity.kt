package com.hrishi.tictactoe

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hrishi.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val game = TicTacToe(3)

        binding.button1.setOnClickListener {
            if(game.move(0,0)){
                binding.button1.text = game.turn.toString()
                binding.button1.isEnabled = false
                binding.button1.setBackgroundColor(Color.RED)

                if(game.status != Status.ONGOINING){
                    Toast.makeText(this, game.status.toString(), Toast.LENGTH_LONG).show()
                }
            }else{
                Toast.makeText(this, "Invalid Move", Toast.LENGTH_SHORT).show()
            }
        }

        binding.button2.setOnClickListener {
            if(game.move(0,1)){
                binding.button2.text = game.turn.toString()
                binding.button2.isEnabled = false
                binding.button2.setBackgroundColor(Color.RED)

                if(game.status != Status.ONGOINING){
                    Toast.makeText(this, game.status.toString(), Toast.LENGTH_LONG).show()
                }
            }else{
                Toast.makeText(this, "Invalid Move", Toast.LENGTH_SHORT).show()
            }
        }

        binding.button3.setOnClickListener {
            if(game.move(0,2)){
                binding.button3.text = game.turn.toString()
                binding.button3.isEnabled = false
                binding.button3.setBackgroundColor(Color.RED)

                if(game.status != Status.ONGOINING){
                    Toast.makeText(this, game.status.toString(), Toast.LENGTH_LONG).show()
                }
            }else{
                Toast.makeText(this, "Invalid Move", Toast.LENGTH_SHORT).show()
            }
        }

        binding.button4.setOnClickListener {
            if(game.move(1,0)){
                binding.button4.text = game.turn.toString()
                binding.button4.isEnabled = false
                binding.button4.setBackgroundColor(Color.RED)

                if(game.status != Status.ONGOINING){
                    Toast.makeText(this, game.status.toString(), Toast.LENGTH_LONG).show()
                }
            }else{
                Toast.makeText(this, "Invalid Move", Toast.LENGTH_SHORT).show()
            }
        }

        binding.button5.setOnClickListener {
            if(game.move(1,1)){
                binding.button5.text = game.turn.toString()
                binding.button5.isEnabled = false
                binding.button5.setBackgroundColor(Color.RED)

                if(game.status != Status.ONGOINING){
                    Toast.makeText(this, game.status.toString(), Toast.LENGTH_LONG).show()
                }
            }else{
                Toast.makeText(this, "Invalid Move", Toast.LENGTH_SHORT).show()
            }
        }

        binding.button6.setOnClickListener {
            if(game.move(1,2)){
                binding.button6.text = game.turn.toString()
                binding.button6.isEnabled = false
                binding.button6.setBackgroundColor(Color.RED)

                if(game.status != Status.ONGOINING){
                    Toast.makeText(this, game.status.toString(), Toast.LENGTH_LONG).show()
                }
            }else{
                Toast.makeText(this, "Invalid Move", Toast.LENGTH_SHORT).show()
            }
        }

        binding.button7.setOnClickListener {
            if(game.move(2,0)){
                binding.button7.text = game.turn.toString()
                binding.button7.isEnabled = false
                binding.button7.setBackgroundColor(Color.RED)

                if(game.status != Status.ONGOINING){
                    Toast.makeText(this, game.status.toString(), Toast.LENGTH_LONG).show()
                }
            }else{
                Toast.makeText(this, "Invalid Move", Toast.LENGTH_SHORT).show()
            }
        }

        binding.button8.setOnClickListener {
            if(game.move(2,1)){
                binding.button8.text = game.turn.toString()
                binding.button8.isEnabled = false
                binding.button8.setBackgroundColor(Color.RED)

                if(game.status != Status.ONGOINING){
                    Toast.makeText(this, game.status.toString(), Toast.LENGTH_LONG).show()
                }
            }else{
                Toast.makeText(this, "Invalid Move", Toast.LENGTH_SHORT).show()
            }
        }

        binding.button9.setOnClickListener {
            if(game.move(2,2)){
                binding.button9.text = game.turn.toString()
                binding.button9.isEnabled = false
                binding.button9.setBackgroundColor(Color.RED)

                if(game.status != Status.ONGOINING){
                    Toast.makeText(this, game.status.toString(), Toast.LENGTH_LONG).show()
                }
            }else{
                Toast.makeText(this, "Invalid Move", Toast.LENGTH_SHORT).show()
            }
        }

    }
}