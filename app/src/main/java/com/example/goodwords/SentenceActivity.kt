package com.example.goodwords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class SentenceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<String>() // 명언들을 리스트에 집어 넣는다

        sentenceList.add("검정화면에 대충 흰 글씨를 쓰면 명언이다") // 집어넣는 중
        sentenceList.add("탈모가 온 것 같으면 바로 병원에 가라")
        sentenceList.add("형준이를 위해 10원짜리를 모으자...")
        sentenceList.add("산타마리아가 어떻게 춤추는지 까먹음")
        sentenceList.add("며칠 전만 해도 몰래 병훈이 곁을 맴돌더니...")
        sentenceList.add("근데 여기에 헬스장 비용도 포함된거여서 괜춘한듯")
        sentenceList.add("엽형 트론 2원일때 발굴해서 들어가라고한게")
        sentenceList.add("시공사에서 온 사람이 역시 더하군...")


        val sentenceadapter = ListviewAdapter(sentenceList)
        val listview = findViewById<ListView>(R.id.sentenceListView)

        listview.adapter = sentenceadapter


    }
}