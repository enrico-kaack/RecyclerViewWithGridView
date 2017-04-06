package ek.de.recycleviewwithgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    final int MAX_GROUPS = 100;
    final int MAX_IMAGES = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Data> data = fill_with_data(MAX_GROUPS, MAX_IMAGES);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.lay_recycl);
        recyclerView.setHasFixedSize(true);
        RecyclerViewAdapterC adapter = new RecyclerViewAdapterC(data, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<Data> fill_with_data(int max_groups, int max_images) {
        List<Data> data = new ArrayList<>();

        List<String> images = new ArrayList<>();

        images.add("http://i.imgur.com/zgxhbClb.jpg");
        images.add("http://i.imgur.com/70QSfp1b.jpg");
        images.add("http://i.imgur.com/Dr1AuIOb.jpg");
        images.add("http://i.imgur.com/1wuZO3Hb.jpg");
        images.add("http://i.imgur.com/TqUFaFOb.jpg");
        images.add("http://i.imgur.com/WvGNWZ1b.jpg");
        images.add("http://i.imgur.com/vwKeYmjb.jpg");
        images.add("http://i.imgur.com/sKqZEYkb.jpg");
        images.add("http://i.imgur.com/8LJJAIcb.jpg");
        images.add("http://i.imgur.com/X9u98N6b.jpg");
        images.add("http://i.imgur.com/KYsjabZb.jpg");
        images.add("http://i.imgur.com/NvOMhMBb.jpg");
        images.add("http://i.imgur.com/bEPmXblb.jpg");
        images.add("http://i.imgur.com/HeQcM8vb.jpg");
        images.add("http://i.imgur.com/zVJazMAb.jpg");
        images.add("http://i.imgur.com/gjS563xb.jpg");
        images.add("http://i.imgur.com/LAbs5tsb.jpg");
        images.add("http://i.imgur.com/L3Sm9O5b.jpg");
        images.add("http://i.imgur.com/fZGo0D1b.jpg");
        images.add("http://i.imgur.com/Jf4EULxb.jpg");
        images.add("http://i.imgur.com/cQn2qFsb.jpg");
        images.add("http://i.imgur.com/ymhSjH1b.jpg");
        images.add("http://i.imgur.com/9TD0NoRb.jpg");
        images.add("http://i.imgur.com/Z3KzNTlb.jpg");
        images.add("http://i.imgur.com/XxRpVwDb.jpg");
        images.add("http://i.imgur.com/nwG8UErb.jpg");
        images.add("http://i.imgur.com/pASxjcrb.jpg");
        images.add("http://i.imgur.com/hZssNRFb.jpg");
        images.add("http://i.imgur.com/9GuOlE6b.jpg");
        images.add("http://i.imgur.com/h7kMsShb.jpg");
        images.add("http://i.imgur.com/I66JhE5b.jpg");
        images.add("http://i.imgur.com/zUw67gRb.jpg");
        images.add("http://i.imgur.com/d8HBgNAb.jpg");
        images.add("http://i.imgur.com/kTnxdaKb.jpg");
        images.add("http://i.imgur.com/JseWMg0b.jpg");
        images.add("http://i.imgur.com/xnj7LXWb.jpg");
        images.add("http://i.imgur.com/0N6QIV3b.jpg");
        images.add("http://i.imgur.com/obumcPib.jpg");
        images.add("http://i.imgur.com/0E4EDbHb.jpg");
        images.add("http://i.imgur.com/C8cEefLb.jpg");
        images.add("http://i.imgur.com/Q6Qv0NKb.jpg");
        images.add("http://i.imgur.com/0xtEeAyb.jpg");
        images.add("http://i.imgur.com/wdk0Ol0b.jpg");
        images.add("http://i.imgur.com/xh45WQIb.jpg");
        images.add("http://i.imgur.com/0gG2L6Qb.jpg");
        images.add("http://i.imgur.com/f1UDHmrb.jpg");
        images.add("http://i.imgur.com/iZDpIBvb.jpg");
        images.add("http://i.imgur.com/gJtqWK6b.jpg");
        images.add("http://i.imgur.com/50U1jYGb.jpg");
        images.add("http://i.imgur.com/yPWnoZHb.jpg");
        images.add("http://i.imgur.com/6VJVDAgb.jpg");
        images.add("http://i.imgur.com/d5nHG0ib.jpg");
        images.add("http://i.imgur.com/nTqsBurb.jpg");
        images.add("http://i.imgur.com/kLsakWOb.jpg");
        images.add("http://i.imgur.com/v6evaG2b.jpg");
        images.add("http://i.imgur.com/kbG9Fokb.jpg");
        images.add("http://i.imgur.com/JjHXWpDb.jpg");
        images.add("http://i.imgur.com/YTXiBFgb.jpg");
        images.add("http://i.imgur.com/GdGtdJNb.jpg");
        images.add("http://i.imgur.com/JiagnmOb.jpg");
        images.add("http://i.imgur.com/kTnxdaKb.jpg");
        images.add("http://i.imgur.com/DGUQHgab.jpg");
        images.add("http://i.imgur.com/VZ15NlDb.jpg");
        images.add("http://i.imgur.com/70QSfp1b.jpg");
        images.add("http://i.imgur.com/WvGNWZ1b.jpg");
        images.add("http://i.imgur.com/70QSfp1b.jpg");
        images.add("http://i.imgur.com/Q9AFjKib.jpg");

        Random ran = new Random();
        for (int groups = 0; groups < max_groups;groups++){
            List<String> list = new ArrayList<>(max_images);

            int min_images = (int) (max_images*0.9);
            int numberOfImages = ran.nextInt(max_images-min_images)+min_images;
            for (int noImages = 0;noImages < numberOfImages; noImages++){
                list.add(images.get(ran.nextInt(images.size())));
            }

            data.add(new Data(String.valueOf(groups), list));

        }

        return data;
    }
}
