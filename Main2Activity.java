package rcew.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        songList = (ListView) findViewById(R.id.songList);
        arrayList = new ArrayList<>();
        arrayList.add(new Music("Good Life", "G-Eazy and Kehlani", R.raw.goodlife));
        arrayList.add(new Music("Closer","Chainsmoker",R.raw.closer));
        arrayList.add(new Music("Everyday","Ariana Grande",R.raw.everyday));
        arrayList.add(new Music("Love me like u do","Ellie_Goundling",R.raw.lovemelikeudo));
        arrayList.add(new Music("Let me love u","Justein Beiber",R.raw.letmeloveu));
        arrayList.add(new Music("Shape Of u","Ed Shreen",R.raw.shapeofu));
        arrayList.add(new Music("Dont let me down","Chainsmoker",R.raw.dont));
        arrayList.add(new Music("Blank Space","Taylor",R.raw.blank));
        adapter = new CustomMusicAdapter(this, R.layout.custom_music_item, arrayList);
        songList.setAdapter(adapter);

    }
}
