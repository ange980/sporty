package fr.ange980.sporty

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class EvenementActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_evenement)
    }

    public fun maps(view: View) {
        val intent = Intent(this, MapsActivity::class.java)
        startActivity(Intent(intent))
    }

    public fun friends(view: View) {
        val intent = Intent(this, FriendsActivity::class.java)
        startActivity(Intent(intent))
    }

    public fun profile(view: View) {
        val intent = Intent(this, ProfilActivity::class.java)
        startActivity(Intent(intent))
    }

    public fun events(view: View) {
        val intent = Intent(this, EvenementActivity::class.java)
        startActivity(Intent(intent))
    }

    public fun bask(view: View) {
        val intent = Intent(this, BasketballActivity::class.java)
        startActivity(Intent(intent))
    }

    public fun dans(view: View) {
        val intent = Intent(this, DanseActivity::class.java)
        startActivity(Intent(intent))
    }

    public fun lien(view: View) {
// Remplacez "https://example.com" par l'URL de la page web que vous souhaitez ouvrir
        val webpage: Uri = Uri.parse("https://www.paris2024.org/fr/")
        val intent = Intent(Intent.ACTION_VIEW, webpage)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
}