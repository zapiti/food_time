package br.com.zapiti.foodtime.view

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import br.com.zapiti.foodtime.R
import br.com.zapiti.foodtime.fragment.ConfigFragment
import br.com.zapiti.foodtime.fragment.DashboardFragment
import br.com.zapiti.foodtime.fragment.DiaryFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var textMessage: TextView
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                switchToDiaryFrag()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                switchToDashFrag()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                switchToConfigFrag()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponent()
    }

    private fun initComponent() {
        switchToDiaryFrag()
        main_navigation_view.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }


    fun switchToDiaryFrag() {
        val manager = supportFragmentManager
        manager.beginTransaction().replace(R.id.main_frame_layout, DiaryFragment()).commit()
    }
    fun switchToDashFrag() {
        val manager = supportFragmentManager
        manager.beginTransaction().replace(R.id.main_frame_layout, DashboardFragment()).commit()
    }
    fun switchToConfigFrag() {
        val manager = supportFragmentManager
        manager.beginTransaction().replace(R.id.main_frame_layout, ConfigFragment()).commit()
    }

}
