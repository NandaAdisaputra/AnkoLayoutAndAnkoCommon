package com.nandaadisaputra.ankolayoutandankocommon

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SecondActivityUI().setContentView(this)
    }

    class SecondActivityUI : AnkoComponent<SecondActivity> {
        override fun createView(ui: AnkoContext<SecondActivity>) = with(ui) {
            scrollView {
                verticalLayout {
                    padding = dip(16)
                    textView {
                        text = "SecondActivity"
                        textAlignment = View.TEXT_ALIGNMENT_CENTER
                        textSize = 24f
                    }.lparams(width = matchParent) {
                        topMargin = dip(8)
                        bottomMargin = dip(6)
                    }
                }
            }
        }
    }
}