package com.app.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button spotifyBtn,scoresBtn,libraryBtn,buildBiggerBtn,xyzreaderBtn,capstoneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spotifyBtn = (Button)findViewById(R.id.spotifyBtn);
        scoresBtn = (Button)findViewById(R.id.scoresBtn);
        libraryBtn = (Button)findViewById(R.id.libraryBtn);
        buildBiggerBtn = (Button)findViewById(R.id.buildBiggerBtn);
        xyzreaderBtn = (Button)findViewById(R.id.xyzReaderBtn);
        capstoneBtn = (Button)findViewById(R.id.capstoneBtn);

        spotifyBtn.setOnClickListener(this);
        scoresBtn.setOnClickListener(this);
        libraryBtn.setOnClickListener(this);
        buildBiggerBtn.setOnClickListener(this);
        xyzreaderBtn.setOnClickListener(this);
        capstoneBtn.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.spotifyBtn){
            Toast.makeText(this,getResources().getString(R.string.spotify_btn_text),Toast.LENGTH_SHORT).show();
        }else if(view.getId()==R.id.scoresBtn){
            Toast.makeText(this,getResources().getString(R.string.scores_btn_text),Toast.LENGTH_SHORT).show();
        }else if(view.getId()==R.id.libraryBtn){
            Toast.makeText(this,getResources().getString(R.string.library_btn_text),Toast.LENGTH_SHORT).show();
        }else if(view.getId()==R.id.buildBiggerBtn){
            Toast.makeText(this,getResources().getString(R.string.build_bigger_btn_text),Toast.LENGTH_SHORT).show();
        }else if(view.getId()==R.id.xyzReaderBtn){
            Toast.makeText(this,getResources().getString(R.string.xyz_reader_btn_text),Toast.LENGTH_SHORT).show();
        }else if(view.getId()==R.id.capstoneBtn){
            Toast.makeText(this,getResources().getString(R.string.capstone_btn_text),Toast.LENGTH_SHORT).show();
        }

    }
}
