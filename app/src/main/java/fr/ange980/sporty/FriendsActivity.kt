package fr.ange980.sporty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FriendsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friends)
    }
    public fun maps(view : View) {
        val intent = Intent(this, MapsActivity::class.java)
        startActivity(Intent(intent))
    }
    public fun friends(view : View) {
        val intent = Intent(this, FriendsActivity::class.java)
        startActivity(Intent(intent))
    }

    public fun profile(view : View) {
        val intent = Intent(this, EvenementActivity::class.java)
        startActivity(Intent(intent))
    }
    public fun events(view : View) {
        val intent = Intent(this, EvenementActivity::class.java)
        startActivity(Intent(intent))
    }
}