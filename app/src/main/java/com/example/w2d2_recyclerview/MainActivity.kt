package com.example.w2d2_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        wordList.layoutManager = LinearLayoutManager(this)
        val testData = createTestData()

        // Create the PartAdapter
        // 1st parameter: our generated testData
        // 2nd parameter: item click handler function (implemented below) as function parameter
        wordList.adapter = WordListAdapter(testData) { word : String -> partItemClicked(word) }
    }

    private fun createTestData(): MutableList<String> = mutableListOf("word1", "word2", "word3", "word4")

    private fun partItemClicked(word: String) {
        Toast.makeText(this, "Clicked: $word", Toast.LENGTH_LONG).show()
    }
}
