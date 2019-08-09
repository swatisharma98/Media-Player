package rcew.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread obj = new Thread()
        {
            public void run()
            {
                try {
                    sleep(4000);

                }
                catch (Exception t)
                {

                }
                finally {
                    Intent l;
                    l= new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(l);
                    finish();
                }
            }
        };
        obj.start();
    }
}
