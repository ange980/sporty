package fr.ange980.sporty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class ProfilActivity : AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        val firebaseAuth : FirebaseAuth=FirebaseAuth.getInstance()
        val usernam : FirebaseUser?= firebaseAuth.currentUser
        val us= usernam?.email
        val usern : TextView = findViewById(R.id.username);

        usern.setText(us);
    }
    public fun maps(view : View) {
        val intent = Intent(this, MapsActivity::class.java)
        startActivity(Intent(intent))
    }
    public fun friends(view : View) {
        val intent = Intent(this, FriendsActivity::class.java)
        startActivity(Intent(intent))
    }

    public fun events(view : View) {
        val intent = Intent(this, EvenementActivity::class.java)
        startActivity(Intent(intent))
    }
}