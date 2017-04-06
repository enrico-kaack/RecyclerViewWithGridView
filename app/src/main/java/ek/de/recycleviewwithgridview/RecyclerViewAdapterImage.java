package ek.de.recycleviewwithgridview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.Collections;
import java.util.List;

/**
 * Created by Enrico on 04.11.2016.
 */

public class RecyclerViewAdapterImage extends RecyclerView.Adapter<ViewHolderImage>{
    List<String> images = Collections.emptyList();
    Context context;

    public RecyclerViewAdapterImage(List<String> images, Context context) {
        this.images = images;
        this.context = context;
    }

    @Override
    public ViewHolderImage onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item_layout, parent, false);
        ViewHolderImage holder = new ViewHolderImage(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolderImage holder, int position) {
        Glide.with(context).load(images.get(position)).fitCenter().into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return images.size();
    }


    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    // Insert a new item to the RecyclerView on a predefined position
    public void insert(int position, String data) {
        images.add(position, data);
        notifyItemInserted(position);
    }

    // Remove a RecyclerView item containing a specified Data object
    public void remove(String data) {
        int position = images.indexOf(data);
        images.remove(position);
        notifyItemRemoved(position);
    }
}
