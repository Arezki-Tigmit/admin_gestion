package com.example.gestion_com.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gestion_com.CatalogueActivity
import com.example.gestion_com.R
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.startActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        login.setOnClickListener {

            startActivity<CatalogueActivity>()
        }

    }
}