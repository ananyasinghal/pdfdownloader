package com.ananya.pdfdownloader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val item = ArrayList<NotesStructure>()
        item.add(
            NotesStructure(
                R.drawable.pdfs,
                "CPU SCHEDULING",
                "https://firebasestorage.googleapis.com/v0/b/notes-46fcd.appspot.com/o/Assignment%20-%20CPU%20Scheduling.pdf?alt=media&token=a6e9f141-d7d7-49ed-8b94-ed74cd7ec2b9"
            )
        )
        item.add(
            NotesStructure(
                R.drawable.pdfs,
                "HYPOTHESIS",
                "https://firebasestorage.googleapis.com/v0/b/notes-46fcd.appspot.com/o/Assignment-V%5BMA2201%5D.pdf?alt=media&token=905c1046-bd02-4026-9b1a-b1280b99b703"
            )
        )
        item.add(
            NotesStructure(
                R.drawable.pdfs,
                "INTERVAL ESTIMATION",
                "https://firebasestorage.googleapis.com/v0/b/notes-46fcd.appspot.com/o/Assignment_4_MA2201.pdf?alt=media&token=25ce2f67-67ad-4838-98b8-d1210110fa89"
            )
        )
        item.add(
            NotesStructure(
                R.drawable.pdfs,
                "OPERATING SYSTEMS",
                "https://firebasestorage.googleapis.com/v0/b/notes-46fcd.appspot.com/o/IT2202%20-%20Operating%20Systems%20-%20Assignment-2.pdf?alt=media&token=07fb5fd1-dbae-427b-86ab-23716197184f"
            )
        )
        val recycler_view  = findViewById<RecyclerView>(R.id.recycler_view)
        recycler_view.layoutManager = LinearLayoutManager(applicationContext)
        val adapter = NotesAdapter(item,this)
        recycler_view.adapter = adapter

    }
}