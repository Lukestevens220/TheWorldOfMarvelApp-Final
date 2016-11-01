package appexperts.com.theworldofmarvelapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import io.fabric.sdk.android.Fabric;
/**
 * @version 1.1
 * @author Luke
 */
public class MainActivity extends AppCompatActivity {

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "uukA3szldtWU2fIk1ljHsfLqh";
    private static final String TWITTER_SECRET = "YAPR3DanSeIi4tEFTwgQWDbtD9zdCMwJMSoZbrNXx2WMSI7WGT";


//    private static final String MARVEL_KEY = "144ae9a1d6261ea12ca170b8d47d6df3";
//    private static final String MARVEL_SECRET = "75bc31531c853f8b865dd56109aef6689cd68144";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));
        setContentView(R.layout.activity_main);
    }
}
