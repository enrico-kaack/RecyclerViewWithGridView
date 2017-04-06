package ek.de.recycleviewwithgridview;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Enrico on 04.11.2016.
 */

public class ViewHolderImage extends RecyclerView.ViewHolder{
    CardView cv;
    ImageView imageView;

    public ViewHolderImage(View itemView) {
        super(itemView);
        this.cv = (CardView)itemView.findViewById(R.id.lay_grid);
        this.imageView = (ImageView)itemView.findViewById(R.id.imageView);
    }
}
