package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
 var isNewOp = true
    fun buNumberEvent(view: View) {

        if (isNewOp){
            tvShowNumber.text=""
        }
        isNewOp = false
        var tvNumber:String= tvShowNumber.text.toString()
        val buSelect = view as Button

        when (buSelect.id){
            bu0.id-> {
                tvNumber+="0"
            }
            bu1.id-> {
                tvNumber+="1"
            }
            bu2.id-> {
                tvNumber+="2"
            }
            bu3.id-> {
                tvNumber+="3"
            }
            bu4.id-> {
                tvNumber+="4"
            }
            bu5.id-> {
                tvNumber+="5"
            }
            bu6.id-> {
                tvNumber+="6"
            }
            bu7.id-> {
                tvNumber+="7"
            }
            bu8.id-> {
                tvNumber+="8"
            }
            bu9.id-> {
                tvNumber+="9"
            }
            buDot.id-> {
                tvNumber+="."
            }
            buplus.id-> {
                tvNumber = "-" + tvNumber
            }
        }
        tvShowNumber.text = tvNumber
    }

    var oldNumber =""
    var op ="+"
    fun buOpeEvent( view: View){

        oldNumber = tvShowNumber.text.toString()
        isNewOp = true
        val buSelect = view as Button
        when(buSelect.id){
            buDiv.id ->{
                op = "/"
            }
            buMul.id ->{
                op = "*"
            }
            buMinus.id ->{
                op = "-"
            }
            buAdd.id ->{
                op = "+"
            }
        }
    }

    fun buEqualEvent(view: View ){
        val newNumber = tvShowNumber.text.toString()
        var finaNumber:Double?=null
        when(op){
            "/"->{
                finaNumber = oldNumber.toDouble() / newNumber.toDouble()
            }
            "*"->{
                finaNumber = oldNumber.toDouble() * newNumber.toDouble()
            }
            "-"->{
                finaNumber = oldNumber.toDouble() - newNumber.toDouble()
            }
            "+"->{
                finaNumber = oldNumber.toDouble() + newNumber.toDouble()
            }
        }
        tvShowNumber.text = finaNumber.toString()
        isNewOp = true

    }
    fun buClear(view: View){
        isNewOp = true
        tvShowNumber.text="0"
    }
}
