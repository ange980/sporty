package fr.ange980.sporty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.auth.FirebaseAuth
import fr.ange980.sporty.databinding.ActivityMainBinding
import fr.ange980.sporty.databinding.ActivityRegisterFormBinding

class SignInActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        firebaseAuth= FirebaseAuth.getInstance()
        binding.button.setOnClickListener{
            val email=binding.emailEt.text.toString()
            val password=binding.paswwordEt.text.toString()

            if(email.isNotEmpty()&& password.isNotEmpty()){
firebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(){
    if(it.isSuccessful){
        val intent=Intent(this,EvenementActivity::class.java)
        startActivity(intent)
    }

}
            }else{

            }
        }
    }
    public fun register(view : View) {
        val intent = Intent(this, RegisterActivity::class.java)

        startActivity(Intent(intent))
    }


}