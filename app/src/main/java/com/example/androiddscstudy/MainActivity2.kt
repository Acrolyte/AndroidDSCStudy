package com.example.androiddscstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.androiddscstudy.database.MyDbHandler
import com.example.androiddscstudy.model.Contact

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val db = MyDbHandler(this)

        val contact1: Contact = Contact()
        contact1.name = "Abhinav Pandey"
        contact1.branch = "EN"
        contact1.home = "Mirzapur"
        contact1.date = "22-06-2001"
        contact1.about = "He wants to be Unique and his hobbies are playing E-Sports, travelling, etc."

        val contact2: Contact = Contact()
        contact2.name = "Ayushi Soni"
        contact2.branch = "IT"
        contact2.home = "Mahoba"
        contact2.date = "17-08-2001"
        contact2.about = "She wants to be an Android Developer and her hobbies are poetry, photography, etc."

        val contact3: Contact = Contact()
        contact3.name = "Divya Chaudhary"
        contact3.branch = "IT"
        contact3.home = "Modinagar"
        contact3.date = "28-06-2002"
        contact3.about = "She wants to be Software Developer and her hobby is playing badminton."

        val contact4: Contact = Contact()
        contact4.name = "Prachi Baranwal"
        contact4.branch = "ME"
        contact4.home = "Gorakhpur"
        contact4.date = "01-09-2000"
        contact4.about = "She wants to be Product Designer and her hobby is sketching."

        val contact5: Contact = Contact()
        contact5.name = "Prashant Gupta"
        contact5.branch = "CSE"
        contact5.home = "Bijnor"
        contact5.date = "14-07-2000"
        contact5.about = "He wants to change his class from mid to upper and his hobbies are talking with friends and photography."

        val contact6: Contact = Contact()
        contact6.name = "Saumya Ojha"
        contact6.branch = "ECE"
        contact6.home = "Allahabad"
        contact6.date = "10-11-2001"
        contact6.about = "She wants to be an Optical Engineer and her hobby is dancing."

        val contact7: Contact = Contact()
        contact7.name = "Saurabh Pandey"
        contact7.branch = "CSE"
        contact7.home = "Lucknow"
        contact7.date = "14-12-2000"
        contact7.about = "He wants to chill and his hobby is reading."

        val contact8: Contact = Contact()
        contact8.name = "Ayushi Mishra"
        contact8.branch = "ME"
        contact8.home = "Jhansi"
        contact8.date = "29-03-1999"
        contact8.about = "She wants to be the best Mechanical Engineer and her hobbies are singing and dancing."

        val contact9: Contact = Contact()
        contact9.name = "Vanshika Namdev"
        contact9.branch = "CO"
        contact9.home = "Saharanpur"
        contact9.date = "25-01-2002"
        contact9.about = "She wants to be a Data Scientist and her hobbies are listening music, dancing, painting/sketching, etc."

        val contact10: Contact = Contact()
        contact10.name = "Vineet Kumar"
        contact10.branch = "IT"
        contact10.home = "Gorakhpur"
        contact10.date = "30-08-2000"
        contact10.about = "He wants to be Software Developer and his hobby is listening music."

        val dev: Contact = Contact()
        dev.name = "Arpit Chaurasia"
        dev.branch = "IT"
        dev.home = "Gorakhpur"
        dev.date = "14-02-2000"
        dev.about = "He wants to be a Software Developer and his hobbies are listening music and dancing."

        var imagepic: ImageView

        var nametext : TextView = findViewById(R.id.name_text)
        var branchtext : TextView = findViewById(R.id.branch_text)
        var hometext : TextView = findViewById(R.id.home_text)
        var datetext : TextView = findViewById(R.id.date_text)
        var abouttext: TextView = findViewById(R.id.about_text)

        var con : Contact = Contact()

        var tag = intent.getStringExtra("pic")

        var pick : String = ""
        when (tag) {
            "Abhinav" -> {
                pick = "img1"
                con = contact1
            }
            "Ayushi" -> {
                pick = "img2"
                con = contact2
            }
            "Divya" -> {
                pick = "img3"
                con = contact3
            }
            "Prachi" -> {
                pick = "img4"
                con = contact4
            }
            "Prashant" -> {
                pick = "img5"
                con = contact5
            }
            "Saumya" -> {
                pick = "img6"
                con = contact6
            }
            "Saurabh" -> {
                pick = "img7"
                con = contact7
            }
            "AyushiM" -> {
                pick = "img8"
                con = contact8
            }
            "Vanshika" -> {
                pick = "img9"
                con = contact9
            }
            "Vineet" -> {
                pick = "img10"
                con = contact10
            }
            "DEV" -> {
                pick = "devimg"
                con = dev
            }
            else -> ""
        }
        nametext.text = con.name
        branchtext.text = con.branch
        hometext.text = con.home
        datetext.text = con.date
        abouttext.text = con.about

        val x: Int = this.resources.getIdentifier(pick, "id", packageName)
        imagepic = this.findViewById<ImageView>(x)
        imagepic.alpha = 1f

    }
}