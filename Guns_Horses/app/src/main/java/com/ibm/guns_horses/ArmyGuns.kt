package com.ibm.guns_horses

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import kotlinx.android.synthetic.main.exp.*
import java.util.ArrayList
import kotlin.math.log
var armylist = ArrayList<String>()
class ArmyGuns : Activity() {
    private fun SelectingAk47(btn: Button) {

        val str: String = btn.getText().toString()


        armylist.add(str);


    }
    private fun SelectingSniper(btn: Button) {

        val str: String = btn.getText().toString()



        armylist.add(str);

    }
    private fun SelectingPistol(btn: Button) {

        val str: String = btn.getText().toString()



        armylist.add(str);

    }


        public override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.exp)

            val Ak47Button =
                findViewById<View>(R.id.Ak47) as Button
            Ak47Button.setOnClickListener {
                SelectingAk47(Ak47Button)

            }

            val SniperButton =
                findViewById<View>(R.id.sniper) as Button
            SniperButton.setOnClickListener {
                SelectingSniper(SniperButton)

            }

            val PistolButton =
                findViewById<View>(R.id.pistol) as Button
            PistolButton.setOnClickListener {
                SelectingPistol(PistolButton)

            }


            submit.setOnClickListener {
                intent.putExtra("gun1", armylist)
                setResult(1, intent);
                finish()

            }
        }

}