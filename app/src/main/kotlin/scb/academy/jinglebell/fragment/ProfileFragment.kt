package scb.academy.jinglebell.fragment

import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.profile_layout.*
import kotlinx.android.synthetic.main.profile_layout.view.*
import scb.academy.jinglebell.R
import scb.academy.jinglebell.activity.helloProfile

class ProfileFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val  _view = inflater.inflate(R.layout.profile_layout, container, false)

        _view.loginbutton.setOnClickListener {
            val intent = Intent(context, helloProfile::class.java)
            intent.putExtra("value", profile_name.text.toString())
            startActivity(intent)
        }
        return _view
    }
}



