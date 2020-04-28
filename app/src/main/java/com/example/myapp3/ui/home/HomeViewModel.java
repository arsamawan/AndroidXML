package com.example.myapp3.ui.home;

import android.os.StrictMode;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapp3.XMLParser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.HashMap;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }


    static final String URL = "https://www.sciencemag.org/rss/news_current.xml";

    static final String KEY_ITEM = "item";     //parent node
    static final String KEY_TITLE = "title";
    static final String KEY_LINK = "link";
    static final String KEY_PUBDATE = "pubDate";
    static final String KEY_GUID = "guid";
    static final String KEY_DESCRIPTION = "description";

    ArrayList<HashMap<String, String>> items = new ArrayList<>();
    public ArrayList<HashMap<String, String>> getText() {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        System.out.println("background process started--- in HOME");
        XMLParser parser = new XMLParser();
        String xml = parser.sendPostRequest(URL);
        System.out.println(xml);
        Document doc = parser.getDomElement(xml);
        //  System.out.print(doc);

        NodeList nl = doc.getElementsByTagName(KEY_ITEM);
        //looping through all items
        for (int i = 0; i < nl.getLength(); i++) {
            HashMap<String, String> map = new HashMap<>();
            Element e = (Element) nl.item(i);

            //adding each child to hashmap


            map.put(KEY_PUBDATE, parser.getValue(e, KEY_PUBDATE));


            //adding hashmap to arraylist

            items.add(map);





        }
        return items;

    }
}