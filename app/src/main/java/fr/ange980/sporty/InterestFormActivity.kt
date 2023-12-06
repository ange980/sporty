package fr.ange980.sporty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast

class InterestFormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interest_form)

        val sports = listOf("Basket", "Foot")

        val autoComplete: AutoCompleteTextView = findViewById(R.id.auto_complete)

        val adapter = ArrayAdapter(this, R.layout.list_sport, sports)

        autoComplete.setAdapter(adapter)

        autoComplete.onItemClickListener =
            AdapterView.OnItemClickListener { adapterView, view, i, l ->
                val sportSelected = adapterView.getItemAtPosition(i)
                Toast.makeText(this, "Sport: $sportSelected", Toast.LENGTH_SHORT).show()
            }
        val autoComplete2: AutoCompleteTextView = findViewById(R.id.auto_complete2)

        val adapter2 = ArrayAdapter(this, R.layout.list_sport, sports)

        autoComplete2.setAdapter(adapter2)

        autoComplete2.onItemClickListener =
            AdapterView.OnItemClickListener { adapterView, view, i, l ->
                val sportSelected = adapterView.getItemAtPosition(i)
                Toast.makeText(this, "Sport: $sportSelected", Toast.LENGTH_SHORT).show()
            }

        val freq = listOf("Débutant", "Intermédiaire", "Fort", "Pro")

        val autoComplete1: AutoCompleteTextView = findViewById(R.id.auto_complete1)

        val adapter1 = ArrayAdapter(this, R.layout.list_sport, freq)

        autoComplete1.setAdapter(adapter1)

        autoComplete.onItemClickListener =
            AdapterView.OnItemClickListener { adapterView, view, i, l ->
                val freqSelected = adapterView.getItemAtPosition(i)
                Toast.makeText(this, "Niveau: $freqSelected", Toast.LENGTH_SHORT).show()
            }


        val autoComplete3: AutoCompleteTextView = findViewById(R.id.auto_complete3)

        val adapter3 = ArrayAdapter(this, R.layout.list_sport, freq)

        autoComplete3.setAdapter(adapter3)

        autoComplete3.onItemClickListener =
            AdapterView.OnItemClickListener { adapterView, view, i, l ->
                val freqSelected = adapterView.getItemAtPosition(i)
                Toast.makeText(this, "Niveau: $freqSelected", Toast.LENGTH_SHORT).show()
            }
    }
    fun even (view : View){
        val intent = Intent(this,EvenementActivity::class.java)
        startActivity(intent)
    }
}