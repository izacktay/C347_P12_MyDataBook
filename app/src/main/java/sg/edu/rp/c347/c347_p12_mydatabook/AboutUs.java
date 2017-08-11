package sg.edu.rp.c347.c347_p12_mydatabook;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class AboutUs extends AppCompatActivity {

    ActionBar ab;
    TextView tvCreated, tv;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        tv = (TextView)findViewById(R.id.textView);
        tvCreated = (TextView)findViewById(R.id.tvCreated);
        iv = (ImageView)findViewById(R.id.imageView);

        tvCreated.setText("Created By : Kenny, Issac, Edwin");
        String imageUrl = "https://upload.wikimedia.org/wikipedia/commons/8/80/Republic_Polytechnic_Logo.jpg";
        Picasso.with(this).load(imageUrl).into(iv);
        tv.setText("C347 Android Programming II Republic Polytechnic");
    }
}
