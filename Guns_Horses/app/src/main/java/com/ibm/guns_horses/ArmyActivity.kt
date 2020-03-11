package com.ibm.guns_horses


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import java.util.*


class ArmyActivity : Activity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.army)
        val listView =
            findViewById<View>(R.id.Armylist1) as ListView

        val extras = intent.extras
        if (extras != null) {
            val value = extras.getString("text1") as String

            val layoutID = android.R.layout.simple_list_item_1

            val myStringArray =
                ArrayList<String>()

            val myAdapterInstance: ArrayAdapter<String>
            myAdapterInstance = ArrayAdapter(this, layoutID, myStringArray)

            listView.setAdapter(myAdapterInstance)


            myStringArray.add("$value Guns(Clickable!)")
            myStringArray.add("$value Horses")


            myAdapterInstance.notifyDataSetChanged()


            listView.onItemClickListener = OnItemClickListener { parent, view, position, id ->

                val i = Intent(this, ArmyGuns::class.java)
                startActivityForResult(i, 1)

            }
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 1) {

            val extras = data?.extras
            val value = extras?.getString("gun1")
            Log.d("gun1", "$value")
        }
    }
}