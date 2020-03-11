package com.ibm.guns_horses


import android.content.Intent
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private fun SelectingArmy() {
//        val armyButton =

//            findViewById<View>(R.id.ArmyT) as TextView
        val str: String = "Army"

        val intent = Intent(
            this,
            ArmyActivity::class.java
        )
        intent.putExtra("text1", str)
        startActivity(intent)
    }

    private fun SelectingNavy() {
//        val NavyButton =
//            findViewById<View>(R.id.navy2) as ImageButtonButton
//        val str: String = NavyButton.getText().toString()
        val str: String = "Navy"

        val intent = Intent(
            this,
            NavyActivity::class.java
        )
        intent.putExtra("text1", str)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        Log.d("Tag", "creating main activity")
        val ArmyButton =
            findViewById<View>(R.id.Army) as ImageButton
        ArmyButton.setOnClickListener { SelectingArmy() }

        val NavyButton =
            findViewById<View>(R.id.navy2) as ImageButton
        NavyButton.setOnClickListener {
            SelectingNavy()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

    if(requestCode==1) {

        val extras = data?.extras
        val value = extras?.getString("gun1")
        Log.d("gun1", "$value")
    }

    }
}
