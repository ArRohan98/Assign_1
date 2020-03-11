package com.ibm.guns_horses

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import kotlin.math.log

class ArmyGuns : Activity() {
    private fun SelectingAk47(btn: Button) {

        val str: String = btn.getText().toString()
        //Log.d("Tag1", "$str")

        val intent = Intent(this, ArmyActivity::class.java)
        intent.putExtra("gun1", str)
        setResult(1, intent);
        finish();
    }


        public override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.exp)

            val Ak47Button =
                findViewById<View>(R.id.Ak47) as Button
            Ak47Button.setOnClickListener {
                SelectingAk47(Ak47Button)

            }
        }

}