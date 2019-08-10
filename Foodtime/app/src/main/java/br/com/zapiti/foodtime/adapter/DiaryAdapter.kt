package br.com.zapiti.foodtime.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.zapiti.foodtime.R
import br.com.zapiti.foodtime.model.Diary

class DiaryAdapter(
    val mDataset: ArrayList<Diary>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var click: ((position: Int) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return FilterViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.adapter_diary, parent, false)
        )
    }

    override fun getItemCount() = 15

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
       // val filter = mDataset[position]



    }

    inner class FilterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)



}