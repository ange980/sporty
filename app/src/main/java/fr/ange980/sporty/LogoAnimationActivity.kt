package fr.ange980.sporty

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import java.util.Timer
import java.util.TimerTask

class LogoAnimationActivity : AppCompatActivity() {

    private lateinit var timer: Timer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo_animation)

        val videoView: VideoView = findViewById(R.id.videoView)
        videoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.animation))


        // Set media controller
        val mediaController = MediaController(this)
        videoView.setMediaController(mediaController)

        videoView.start()

        timer = Timer()
        timer.schedule(object : TimerTask() {
            override fun run() {
                val intent = Intent(this@LogoAnimationActivity,RegisterActivity::class.java)
                startActivity(intent)
                finish()
            }
        }, 3000)
    }
}
