package appexperts.com.theworldofmarvelapp;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.tweetui.TweetUtils;
import com.twitter.sdk.android.tweetui.TweetView;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class NavigationViewActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        generateMarvelHash("144ae9a1d6261ea12ca170b8d47d6df3","75bc31531c853f8b865dd56109aef6689cd68144");

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//
//                Intent intent = new Intent(NavigationViewActivity.this, LoginActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


//        // TODO: Use a more specific parent
//        final ViewGroup parentView = (ViewGroup) getWindow().getDecorView().getRootView();
//        // TODO: Base this Tweet ID on some data from elsewhere in your app
//        long tweetId = 631879971628183552L;
//        TweetUtils.loadTweet(tweetId, new Callback<Tweet>() {
//            @Override
//            public void success(appexperts.com.theworldofmarvelapp.comic.appexperts.com.theworldofmarvelapp.comic.appexperts.com.theworldofmarvelapp.series.appexperts.com.theworldofmarvelapp.series.appexperts.com.theworldofmarvelapp.series.appexperts.com.theworldofmarvelapp.stories.Result<Tweet> result) {
//                TweetView tweetView = new TweetView(NavigationViewActivity.this, result.data);
//                parentView.addView(tweetView);
//            }
//            @Override
//            public void failure(TwitterException exception) {
//                Log.d("TwitterKit", "Load Tweet failure", exception);
//            }
//        });

    }

    public static String generateMarvelHash (String publicKey, String privateKey) {

        String marvelHash = "";

        try {

            String timeStamp    = getUnixTimeStamp();
            String marvelData   = timeStamp + privateKey + publicKey;

            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] hash = messageDigest.digest(marvelData.getBytes());

            StringBuilder stringBuilder = new StringBuilder(2 * hash.length);

            for (byte b : hash)
                stringBuilder.append(String.format("%02x", b&0xff));

            marvelHash = stringBuilder.toString();
            Log.e("Hash", marvelHash);
            Log.e("timestamp", timeStamp);


        } catch (NoSuchAlgorithmException e) {

            System.out.println("[DEBUG]" + " MarvelApiUtils generateMarvelHash - " +
                    "NoSuchAlgorithmException");
            Log.e("Hash", marvelHash);
        }

        return marvelHash;

    }

    public static String getUnixTimeStamp () {

        return String.valueOf(System.currentTimeMillis() / 1000L);
    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation_view, menu);
            // Associate searchable configuration with the SearchView
            SearchManager searchManager =
                    (SearchManager) getSystemService(Context.SEARCH_SERVICE);
            SearchView searchView =
                    (SearchView) menu.findItem(R.id.action_search).getActionView();
            searchView.setSearchableInfo(
                    searchManager.getSearchableInfo(getComponentName()));


            return true;
        }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            return true;
        }
        if (id == R.id.action_settings) {
            return true;
        }
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_signout) {
            Intent intent = new Intent(NavigationViewActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
