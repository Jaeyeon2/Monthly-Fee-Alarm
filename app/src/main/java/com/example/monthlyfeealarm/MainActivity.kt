package com.example.monthlyfeealarm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<MonthlyFeeItem>()
        list.add(MonthlyFeeItem("넷플릭스", "베이직 멤버쉽", 13500, "5일", true, 3, "2019-02-08", "넷플릭스 베이직 멤버쉽"))

        val adapter = RecyclerAdapter(list)
        recyclerView.adapter = adapter
    }
}
