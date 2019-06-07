package com.todou.nestrefresh.example

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import java.util.ArrayList

class RecyclerAdapterTest : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var mDatas: MutableList<Any> = ArrayList()

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(viewGroup.context)
        val view = layoutInflater.inflate(R.layout.list_item_test, viewGroup, false)
        return TestViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, i: Int) {

    }

    fun updateDatas(datas: List<Any>?) {
        if (datas == null) return
        mDatas.clear()
        mDatas.addAll(datas)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return mDatas.size
    }

    private class TestViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}