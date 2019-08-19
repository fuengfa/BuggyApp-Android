package scb.academy.jinglebell.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_hello_profile.*
import scb.academy.jinglebell.R

class helloProfile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_profile)
        var bundle :Bundle ?=intent.extras
        var message = bundle!!.getString("value") // 1
        var strUser: String = intent.getStringExtra("value") // 2
        myname.text = message

    }
}
