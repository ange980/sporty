package fr.ange980.sporty

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Button_to_map : AppCompatActivity() {

    lateinit var showMap: Button // Use lateinit to initialize later

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_to_map)

        showMap = findViewById(R.id.showMap)

        showMap.setOnClickListener {
            val intent = Intent(this@Button_to_map, MapsActivity::class.java)
            startActivity(intent)
        }
    }
}