package ek.de.recycleviewwithgridview;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Enrico on 02.11.2016.
 */

public class ViewHolderC extends RecyclerView.ViewHolder{
    CardView cv;
    TextView title;
    RecyclerView grid;

    ViewHolderC(View itemView) {
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.card_view);
        title = (TextView) itemView.findViewById(R.id.title);
        grid = (RecyclerView) itemView.findViewById(R.id.lay_grid);
    }
}
