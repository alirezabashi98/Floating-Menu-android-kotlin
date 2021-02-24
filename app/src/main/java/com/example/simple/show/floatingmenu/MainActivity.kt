package com.example.simple.show.floatingmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Cast()

        registerForContextMenu(button)

    }

    private fun Cast(){

        button = findViewById(R.id.button)

    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.floting_context_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.item_1 -> Toast.makeText(this,"item 1",Toast.LENGTH_SHORT).show()
            R.id.item_2 -> Toast.makeText(this,"item 2",Toast.LENGTH_SHORT).show()
            R.id.item_3 -> Toast.makeText(this,"item 3",Toast.LENGTH_SHORT).show()
            R.id.item_4 -> Toast.makeText(this,"item 4",Toast.LENGTH_SHORT).show()
            else -> Toast.makeText(this,"else",Toast.LENGTH_SHORT).show()
        }

        return super.onOptionsItemSelected(item)
    }
}