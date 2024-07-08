package com.akirachix.enwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WalletAdapter (var walletArticles: List<Cards>)
    : RecyclerView.Adapter<WalletViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.enwallet_cards, parent,false)
        return WalletViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: WalletViewHolder, position: Int) {
        holder.tvIn.text = walletArticles[position].toString()
    }

    override fun getItemCount(): Int {
        return walletArticles.size
    }
}

class WalletViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val tvIn = itemView.findViewById<TextView>(R.id.tvIn)
    val tvKes = itemView.findViewById<TextView>(R.id.tvKes)


}