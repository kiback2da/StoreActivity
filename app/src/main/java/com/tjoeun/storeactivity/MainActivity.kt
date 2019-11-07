package com.tjoeun.storeactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjoeun.storeactivity.Adapter.StoreAdapter
import com.tjoeun.storeactivity.Data.StoreDatas
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var storeList = ArrayList<StoreDatas>()
    var adapter:StoreAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addDate()

        adapter = StoreAdapter(this, R.layout.stire_detail_item,storeList)
        storeListView.adapter = adapter
    }

    fun addDate(){
        storeList.add(StoreDatas("1. 아스팔트 8: 에어본","GameLoaft", 4.0F))
        storeList.add(StoreDatas("2. Minecraft","Mojang",4.5F))
        storeList.add(StoreDatas("3. 아스팔트 7: 히트","GameLoaft",2.0F))
        storeList.add(StoreDatas("4. 팔라독","FazeCat",1.0F))
        storeList.add(StoreDatas("5. Plants vs Zombie","EA Swiss Sari",5.0F))
        storeList.add(StoreDatas("6. 스왐피","Disney",2.5F))

    }
}
