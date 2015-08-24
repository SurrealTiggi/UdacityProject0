package baptista.tiago.project0;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Button mApp1;
    private Button mApp2;
    private Button mApp3;
    private Button mApp4;
    private Button mApp5;
    private Button mApp6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mApp1 = (Button) findViewById(R.id.app1Button);
        mApp2 = (Button) findViewById(R.id.app2Button);
        mApp3 = (Button) findViewById(R.id.app3Button);
        mApp4 = (Button) findViewById(R.id.app4Button);
        mApp5 = (Button) findViewById(R.id.app5Button);
        mApp6 = (Button) findViewById(R.id.app6Button);

        mApp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch the Movie Streamer App", Toast.LENGTH_SHORT).show();
            }
        });

        mApp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch the Scores App", Toast.LENGTH_SHORT).show();
            }
        });

        mApp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch the Library App", Toast.LENGTH_SHORT).show();
            }
        });

        mApp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch the Build it Bigger App", Toast.LENGTH_SHORT).show();
            }
        });

        mApp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch the XYZ Reader app", Toast.LENGTH_SHORT).show();
            }
        });

        mApp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch the Capstone personal app", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
