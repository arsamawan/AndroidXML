/*
package com.example.myapp3;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.HashMap;

public class dashboard extends AppCompatActivity {


    static final String URL = "https://www.sciencemag.org/rss/news_current.xml";

    static final String KEY_ITEM = "item";     //parent node
    static final String KEY_TITLE = "title";
    static final String KEY_LINK = "link";
    static final String KEY_PUBDATE = "pubDate";
    static final String KEY_GUID = "guid";
    static final String KEY_DESCRIPTION = "description";

    ArrayList<HashMap<String, String>> items;
    ListView lv;
    private ProgressDialog pDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        */
/*AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment2);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);*//*


*/
/*
        items = new ArrayList<>();


        lv = (ListView) findViewById(R.id.listview);

        new dashboard.GetItems().execute();
*//*



    }

    private class GetItems extends AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            // Showing loading dialog
            pDialog = new ProgressDialog(dashboard.this);
            pDialog.setMessage("Loading...");
            pDialog.setCancelable(false);
            pDialog.show();

        }

        @Override

        protected Void doInBackground(Void... voids) {

            System.out.println("background process started");
            XMLParser parser = new XMLParser();
            String xml = parser.sendPostRequest(URL);
            System.out.println(xml);
            Document doc = parser.getDomElement(xml);
            //  System.out.print(doc);

            NodeList nl = doc.getElementsByTagName(KEY_ITEM);
            //looping through all items
            for(int i = 0 ; i<nl.getLength();i++) {
                HashMap<String, String> map = new HashMap<>();
                Element e = (Element) nl.item(i);

                //adding each child to hashmap

                map.put(KEY_LINK, parser.getValue(e, KEY_LINK));
              //  map.put(KEY_PUBDATE, parser.getValue(e, KEY_PUBDATE));
              //  map.put(KEY_GUID, parser.getValue(e, KEY_GUID));

                //adding hashmap to arraylist

                items.add(map);
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            if (pDialog.isShowing()) {
                pDialog.dismiss();
            }
            // display the items
   */
/*         System.out.println("items size = "+items.size());
            ListAdapter adapter = new SimpleAdapter(dashboard.this, items, R.layout.dashboard_main,
                    new String[]{KEY_LINK*//*
*/
/*, KEY_PUBDATE, KEY_GUID*//*
*/
/*},
                    new int[]{R.id.link*//*
*/
/*, R.id.pubDate, R.id.guid*//*
*/
/*});

            lv.setAdapter(adapter);*//*

        }
    }

}
*/
