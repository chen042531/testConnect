package com.dongquotations.quotation.myapplication;


import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class personAdapter extends RecyclerView.Adapter<personAdapter.personViewHolder>{
    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<person> personListList;

    //getting the context and product list with constructor
    public personAdapter(Context mCtx, List<person> productList) {
        this.mCtx = mCtx;
        this.personListList = productList;
    }

    @Override
    public personViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.linear_layout, parent, false);
        return new personViewHolder(view);
    }

    @Override
    public void onBindViewHolder(personViewHolder holder, int position) {
        //getting the product of the specified position
        person person = personListList.get(position);

        //binding the data with the viewholder views
        holder.textViewTitle.setText(person.getTitle());
        holder.textViewShortDesc.setText(person.getShortdesc());
        holder.textViewRating.setText(String.valueOf(person.getRating()));
        holder.textViewPrice.setText(String.valueOf(person.getPrice()));



    }


    @Override
    public int getItemCount() {
        return personListList.size();
    }


    class personViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle, textViewShortDesc, textViewRating, textViewPrice;
        ImageView imageView;

        public personViewHolder(View itemView) {
            super(itemView);

            textViewTitle = (TextView)itemView.findViewById(R.id.textViewShortDesc);
            textViewShortDesc = (TextView)itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = (TextView)itemView.findViewById(R.id.textViewRating);
            textViewPrice = (TextView)itemView.findViewById(R.id.textViewPrice);
                   }
    }
}
