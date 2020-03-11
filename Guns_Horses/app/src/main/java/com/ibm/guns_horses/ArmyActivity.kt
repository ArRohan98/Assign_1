package com.ibm.guns_horses


import android.app.Activity
import android.content.Intent
import android.os.Bundle
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


            myStringArray.add("$value Guns")
            myStringArray.add("$value Horses")


            myAdapterInstance.notifyDataSetChanged()


            listView.onItemClickListener = OnItemClickListener { parent, view, position, id ->

                        val i = Intent(this, ArmyGuns::class.java)
                        startActivity(i)

                }
        }

    }
//    fun onItemClick(
//        l: AdapterView<*>?,
//        v: View?,
//        position: Int,
//        id: Long
//    ) {
//        Log.i("HelloListView", "You clicked Item: $id at position:$position")
//        // Then you start a new Activity via Intent
//        val intent = Intent(this, ArmyGuns::class.java)
//        intent.putExtra("position", position)
//        // Or / And
//        intent.putExtra("id", id)
//        startActivity(intent)
//    }
}