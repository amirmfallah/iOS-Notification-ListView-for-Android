package clist.amirmfallah.com.customlistview;

/**
 * Created by Amir Mohammad Fallah on 9/8/2018.
 */


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class ListAdapter extends ArrayAdapter<ListModel> {

    private Context mContext;
    private List<ListModel> moviesList = new ArrayList<>();

    public ListAdapter(@NonNull Context context, ArrayList<ListModel> list) {
        super(context, 0 , list);
        mContext = context;
        moviesList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);

        ListModel item = moviesList.get(position);

        ImageView image = (ImageView)listItem.findViewById(R.id.img_logo);
        image.setImageResource(item.getImage());

        TextView title = (TextView) listItem.findViewById(R.id.txt_title);
        title.setText(item.getmTitle());

        TextView noti = (TextView) listItem.findViewById(R.id.txt_noti);
        noti.setText(item.getNoti());

        TextView date = (TextView) listItem.findViewById(R.id.txt_date);
        date.setText(item.Date());


        return listItem;
    }
}