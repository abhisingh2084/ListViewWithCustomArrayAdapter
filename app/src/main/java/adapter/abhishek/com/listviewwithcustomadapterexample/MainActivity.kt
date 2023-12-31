package adapter.abhishek.com.listviewwithcustomadapterexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val languages= arrayOf("C language", "C++ Language", "Java", "Python", "JavaScript", "Angular", "NodeJs", "kotlin", ".Net", "Linux",
        "SAS Programming", "R Programming")
        val langImage= arrayOf(R.drawable.clang, R.drawable.cplus, R.drawable.java, R.drawable.python, R.drawable.javascript, R.drawable.angular, R.drawable.nodejs, R.drawable.kotlin, R.drawable.net, R.drawable.linux, R.drawable.sasprograming, R.drawable.rprograming)
        setContentView(R.layout.activity_main)
        //MyListAdapter is the name of the adapter we are going to create
        val myAdapter=MyListAdapter(this,languages,langImage)
        listView.adapter=myAdapter
    }
}
