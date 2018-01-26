package com.monkwish.attendancemodule

import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by viplo on 26-Jan-18.
 */
class AttendanceAdapter(val attList : ArrayList<AttData>) : RecyclerView.Adapter<AttendanceAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.recyclerview_attendance_card,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return attList.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val user : AttData = attList[position]
        
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val slot = itemView.findViewById<TextView>(R.id.slot)
        val subName = itemView.findViewById<TextView>(R.id.sub_name)
        val subCode = itemView.findViewById<TextView>(R.id.sub_code)
        val faculty = itemView.findViewById<TextView>(R.id.fac_name)
        val roomNo = itemView.findViewById<TextView>(R.id.roomno)
        val progressBar = itemView.findViewById<me.zhanghai.android.materialprogressbar.MaterialProgressBar>(R.id.att_progress_bar)
        val attPerc = itemView.findViewById<TextView>(R.id.att_perc)
    }

}