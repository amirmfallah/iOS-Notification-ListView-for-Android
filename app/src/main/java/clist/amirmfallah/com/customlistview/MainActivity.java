package clist.amirmfallah.com.customlistview;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AndroidException;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ListAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);
        ArrayList<ListModel> moviesList = new ArrayList<>();
        moviesList.add(new ListModel(android.support.v7.appcompat.R.drawable.abc_ic_star_black_36dp, "Application 1" , "Some Notification!","15m ago"));
        moviesList.add(new ListModel(android.support.v7.appcompat.R.drawable.abc_ic_star_black_36dp, "Application 2" , "Some Notification!","1h ago"));
        moviesList.add(new ListModel(android.support.v7.appcompat.R.drawable.abc_ic_star_black_36dp, "Application 3" , "Some Notification!","2h ago"));
        moviesList.add(new ListModel(android.support.v7.appcompat.R.drawable.abc_ic_star_black_36dp, "Application 4" , "Some Notification!","15m ago"));
        moviesList.add(new ListModel(android.support.v7.appcompat.R.drawable.abc_ic_star_black_36dp, "Application 5" , "Some Notification!","1h ago"));
        moviesList.add(new ListModel(android.support.v7.appcompat.R.drawable.abc_ic_star_black_36dp, "Application 6" , "Some Notification!","2h ago"));
        moviesList.add(new ListModel(android.support.v7.appcompat.R.drawable.abc_ic_star_black_36dp, "Application 7" , "Some Notification!","15m ago"));
        moviesList.add(new ListModel(android.support.v7.appcompat.R.drawable.abc_ic_star_black_36dp, "Application 8" , "Some Notification!","1h ago"));
        mAdapter = new ListAdapter(this,moviesList);
        listView.setAdapter(mAdapter);

    }
}
