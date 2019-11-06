package com.tjoeun.storeactivity.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.tjoeun.storeactivity.Data.StoreDatas
import com.tjoeun.storeactivity.R
import java.util.zip.Inflater

class StoreAdapter(context:Context, res:Int, list:ArrayList<StoreDatas>) : ArrayAdapter<StoreDatas>(context,res,list){

    var mContext = context
    var mList = list
    var inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if(tempRow == null){
            tempRow = inf.inflate(R.layout.stire_detail_item,null)
        }

        var row = tempRow!!

        var mData = mList.get(position)
        var name = row.findViewById<TextView>(R.id.detailName)
        var company = row.findViewById<TextView>(R.id.detailCompany)

        name.text = mData.dName
        company.text = mData.dCompany

        return row
    }

}