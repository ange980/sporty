package fr.ange980.sporty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast

class InterestFormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interest_form)

        val sports = listOf("Basket","Foot")

        val autoComplete : AutoCompleteTextView= findViewById(R.id.auto_complete)

        val adapter = ArrayAdapter(this,R.layout.list_sport,sports)

        autoComplete.setAdapter(adapter)

        autoComplete.onItemClickListener= AdapterView.OnItemClickListener {
            adapterView, view, i, l ->
            val sportSelected = adapterView.getItemAtPosition(i)
            Toast.makeText(this, "Sport: $sportSelected", Toast.LENGTH_SHORT).show()
        }
        val freq = listOf("Jamais","Parfois","Souvent","Tout les jours")

        val autoComplete1 : AutoCompleteTextView= findViewById(R.id.auto_complete1)

        val adapter1 = ArrayAdapter(this,R.layout.list_sport,freq)

        autoComplete1.setAdapter(adapter1)

        autoComplete.onItemClickListener= AdapterView.OnItemClickListener {
                adapterView, view, i, l ->
            val freqSelected = adapterView.getItemAtPosition(i)
            Toast.makeText(this, "Sport: $freqSelected", Toast.LENGTH_SHORT).show()
        }
    }
}