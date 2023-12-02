package fr.ange980.sporty

<<<<<<< HEAD
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import fr.ange980.sporty.databinding.ActivityButtonToMapBinding

class Button_to_map : AppCompatActivity() {

    private lateinit var binding: ActivityButtonToMapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityButtonToMapBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_button_to_map)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}
=======
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
>>>>>>> 94d5d8118e3be2a7633ba97350b92f93a0781a28
