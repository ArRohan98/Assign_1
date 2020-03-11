package com.ibm.guns_horses
import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import java.util.*


class NavyActivity : Activity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.navy)
        val listView =
            findViewById<View>(R.id.Navylist) as ListView

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
            myStringArray.add("$value Ammunation")


            myAdapterInstance.notifyDataSetChanged()

        }

    }
}