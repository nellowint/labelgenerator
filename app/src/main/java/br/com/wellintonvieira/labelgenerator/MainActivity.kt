package br.com.wellintonvieira.labelgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.wellintonvieira.labelgenerator.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}