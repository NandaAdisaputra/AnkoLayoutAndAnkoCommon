package com.nandaadisaputra.ankolayoutandankocommon

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.nandaadisaputra.ankolayoutandankocommon.R.color.blue
import org.jetbrains.anko.*
import org.jetbrains.anko.design.snackbar
import org.jetbrains.anko.sdk27.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainActivityUI().setContentView(this)
    }

    class MainActivityUI : AnkoComponent<MainActivity> {
        override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
            scrollView {
                verticalLayout {
                    padding = dip(16)
                    textView {
                        text = "Marvind Community USM Divisi Android"
                        textAlignment = View.TEXT_ALIGNMENT_CENTER
                        textSize = 24f
                    }.lparams(width = matchParent) {
                        topMargin = dip(8)
                        bottomMargin = dip(6)
                    }
                    imageView {
                        setImageResource(R.drawable.basecampmarvind)
                    }
                        .lparams(width = matchParent) {
                            width = dip(300)
                            height = dip(300)
                            gravity = Gravity.CENTER
                        }
                    button("Anko Toast") {
                        backgroundColor = ContextCompat.getColor(context, blue)
                        textColor = Color.WHITE
                        textSize = 18f
                        textAlignment = View.TEXT_ALIGNMENT_CENTER
                        onClick { toast("Ini adalah Toast di Kotlin") }
                    }.lparams(width = matchParent) {
                        topMargin = dip(8)
                        bottomMargin = dip(6)
                    }
                    button("Anko Alert Dialog") {
                        backgroundColor = ContextCompat.getColor(context, blue)
                        textColor = Color.WHITE
                        textSize = 18f
                        textAlignment = View.TEXT_ALIGNMENT_CENTER
                        onClick {
                            alert("Semagat belajar nya ya", "Ngoding Yuk") {
                                yesButton { toast("Jangan mudah menyerah") }
                                noButton { }
                            }.show()
                        }
                    }.lparams(width = matchParent) {
                        topMargin = dip(8)
                        bottomMargin = dip(6)
                        textAlignment = View.TEXT_ALIGNMENT_CENTER
                    }
                    button("Anko Selector") {
                        backgroundColor = ContextCompat.getColor(context, blue)
                        textColor = Color.WHITE
                        textSize = 18f
                        textAlignment = View.TEXT_ALIGNMENT_CENTER

                        onClick {
                            val club = listOf(
                                "Game Developer",
                                "Android Developer",
                                "Web Developer",
                                "UI UX Designer",
                                "Animator"
                            )
                            selector(
                                "Hallo Developer Marvind",
                                club
                            ) { _, i ->
                                toast("Semangat Belajar Ya")
                            }
                        }
                    }.lparams(width = matchParent) {
                        topMargin = dip(8)
                        bottomMargin = dip(6)
                    }
                    button("Anko Snackbar") {
                        backgroundColor = ContextCompat.getColor(context, blue)
                        textColor = Color.WHITE
                        textSize = 18f
                        textAlignment = View.TEXT_ALIGNMENT_CENTER
                        onClick {
                            snackbar("Hallo Developer Marvind")
                        }
                    }.lparams(width = matchParent) {
                        topMargin = dip(8)
                        bottomMargin = dip(6)
                    }
                    button("Go to Second Activity") {
                        backgroundColor = ContextCompat.getColor(context, blue)
                        textColor = Color.WHITE
                        textSize = 18f
                        textAlignment = View.TEXT_ALIGNMENT_CENTER

                        onClick {
                            toast("Intent ke SecondActivity")
                            startActivity<SecondActivity>()
                        }
                    }.lparams(width = matchParent) {
                        topMargin = dip(8)
                        bottomMargin = dip(6)
                    }

                }
            }
        }

    }
}
