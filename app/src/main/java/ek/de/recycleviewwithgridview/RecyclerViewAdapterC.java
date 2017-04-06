package ek.de.recycleviewwithgridview;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;

/**
 * Created by Enrico on 02.11.2016.
 */

public class RecyclerViewAdapterC extends RecyclerView.Adapter<ViewHolderC> {
    List<Data> list = Collections.emptyList();
    Context context;

    public RecyclerViewAdapterC(List<Data> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public ViewHolderC onCreateViewHolder(ViewGroup parent, int viewType) {
        //Inflate the layout, initialize the View Holder
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        ViewHolderC holder = new ViewHolderC(v);
        return holder;

    }

    @Override
    public void onBindViewHolder(ViewHolderC holder, int position) {

        //Use the provided View Holder on the onCreateViewHolder method to populate the current row on the RecyclerView
        holder.title.setText(list.get(position).title);

        RecyclerView recyclerView = holder.grid;
        recyclerView.setHasFixedSize(true);
        RecyclerViewAdapterImage adapter = new RecyclerViewAdapterImage(list.get(position).images, context);
        recyclerView.setAdapter(adapter);
        GridLayoutManager layout = new GridLayoutManager(context, 4);
        recyclerView.setLayoutManager(layout);


    }

    @Override
    public int getItemCount() {
        //returns the number of elements the RecyclerView will display
        return list.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    // Insert a new item to the RecyclerView on a predefined position
    public void insert(int position, Data data) {
        list.add(position, data);
        notifyItemInserted(position);
    }

    // Remove a RecyclerView item containing a specified Data object
    public void remove(Data data) {
        int position = list.indexOf(data);
        list.remove(position);
        notifyItemRemoved(position);
    }

}
