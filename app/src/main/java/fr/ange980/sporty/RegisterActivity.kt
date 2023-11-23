package fr.ange980.sporty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import fr.ange980.sporty.databinding.ActivityRegisterFormBinding

class RegisterActivity : AppCompatActivity() {

     private lateinit var binding: ActivityRegisterFormBinding

     lateinit var firebaseAuth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRegisterFormBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firebaseAuth= FirebaseAuth.getInstance()

        binding.button.setOnClickListener{
            val email= binding.emailEt.text.toString()
            val password= binding.passwordEt.text.toString()
            val confpass=binding.confEt.text.toString()

            if(email.isNotEmpty() && password.isNotEmpty() && confpass.isNotEmpty()){
                if(password==confpass){
                    firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener() {
                        if(it.isSuccessful) {
                            val intent=Intent(this,MyfeedActivity::class.java)
                            startActivity(intent)
                        }
                        else {
                            Toast.makeText(this,it.exception.toString(), Toast.LENGTH_SHORT).show()
                        }
                    }
                }else{
                    Toast.makeText(this,"Password is not matching", Toast.LENGTH_SHORT).show()
                }

            }else{
                Toast.makeText(this,"Some fields are empty", Toast.LENGTH_SHORT).show()
            }


        }
        }

    public fun connect(view : View) {
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(Intent(intent))
    }
    }


