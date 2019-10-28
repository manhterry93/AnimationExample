package itto.pl.animationexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import androidx.core.view.ViewCompat.animate
import android.R.attr.rotation
import android.view.ViewPropertyAnimator
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_label.setOnClickListener {
            val propertyAnimator = tv_label.animate().rotation(360f).setDuration(5000)
            propertyAnimator.alpha(0f).duration = 5000
        }
    }
}
