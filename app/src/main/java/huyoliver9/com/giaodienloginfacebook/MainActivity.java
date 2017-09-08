package huyoliver9.com.giaodienloginfacebook;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView su = (TextView) findViewById(R.id.su);
        su.setPaintFlags(su.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        TextView fg = (TextView) findViewById(R.id.fg);
        fg.setPaintFlags(fg.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

    }
}
