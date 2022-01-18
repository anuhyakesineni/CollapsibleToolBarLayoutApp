package com.example.collapsibletoolbarlayoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_market_analysis.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arrow_flag=0


        var str= "Anuhya123"

        var upper = false
        var lower = false
        var num = false
        var spl_char=false
        for( c in str){
            if( c in 'A'..'Z'){
                upper = true
            }
            else if( c in 'a'..'z')
                lower= true
            else if(c in '0'..'9')
                num=true
            else if(c !in 'a'..'z' && c !in 'A'..'Z' && c !in '0'..'9'){
                spl_char=true
            }
        }
        if(upper&&lower&&num&&spl_char){
            Toast.makeText(this, "yes", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this, "no", Toast.LENGTH_SHORT).show()
        }
        arrow.setOnClickListener {
            if(arrow_flag ==0){
                arrow.setImageResource(R.drawable.arrow_up)
                cardView5.visibility = View.VISIBLE
                cardView6.visibility = View.VISIBLE
                cardView7.visibility = View.VISIBLE
                cardView8.visibility = View.VISIBLE
                cardView9.visibility = View.VISIBLE
                cardView10.visibility = View.VISIBLE
                cardView11.visibility = View.VISIBLE
                arrow_flag=1
            }
            else {
                arrow.setImageResource(R.drawable.arrow_down)
                cardView5.visibility = View.GONE
                cardView6.visibility = View.GONE
                cardView7.visibility = View.GONE
                cardView8.visibility = View.GONE
                cardView9.visibility = View.GONE
                cardView10.visibility = View.GONE
                cardView11.visibility = View.GONE

                arrow_flag=0
            }


        }

        var l= ArrayList<AllLists>()
        l.add(AllLists("text1","text","text"))
        l.add(AllLists("text2","text","text"))
        l.add(AllLists("text3","text","text"))
        l.add(AllLists("text4","text","text"))
        l.add(AllLists("text5","text","text"))
        l.add(AllLists("text6","text","text"))
        l.add(AllLists("text7","text","text"))
        l.add(AllLists("text8","text","text"))
        l.add(AllLists("text9","text","text"))
        l.add(AllLists("text10","text","text"))
        l.add(AllLists("text11","text","text"))
        l.add(AllLists("text12","text","text"))





        var layoutmanager = LinearLayoutManager(this)
        layoutmanager.orientation = LinearLayoutManager.VERTICAL
        rcvAllListings.layoutManager = layoutmanager
        var myAdapter = AllListsAdapter(this, l)
        rcvAllListings.adapter = myAdapter










    }




}