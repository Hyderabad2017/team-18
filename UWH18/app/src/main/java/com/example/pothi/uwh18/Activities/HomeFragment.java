package com.example.pothi.uwh18.Activities;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;
import com.example.pothi.uwh18.Common.Person;
import com.example.pothi.uwh18.Adapter.Subadapter;
import com.example.pothi.uwh18.R;

import java.util.ArrayList;

/**
 * Created by pothi on 15-07-2017.
 */

public class HomeFragment extends AppCompatActivity {


    ListView lvUsers;
    ArrayList<Person> personArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        personArrayList = new ArrayList<Person>();
        lvUsers = (ListView) findViewById(R.id.lvUsers);

        insertUserDetailsInArrayList();

        System.out.println(personArrayList);
        Subadapter adapter = new Subadapter(HomeFragment.this,personArrayList);
        lvUsers.setAdapter(adapter);
    }

    private void insertUserDetailsInArrayList() {

        Person person = new Person();
        person.setUserName("Mani");
        person.setUserStatus("Cool");
        person.setUserLastSeenDate("09/06/2016");
        person.setProfilePic(R.mipmap.ic_launcher);
        personArrayList.add(person);

        person = new Person();
        person.setUserName("Sai");
        person.setUserStatus("Good");
        person.setUserLastSeenDate("09/06/2016");
        person.setProfilePic(R.mipmap.ic_launcher);
        personArrayList.add(person);

        person = new Person();
        person.setUserName("Ram");
        person.setUserStatus("Nice");
        person.setUserLastSeenDate("09/06/2016");
        person.setProfilePic(R.mipmap.ic_launcher);
        personArrayList.add(person);

        person = new Person();
        person.setUserName("Sita");
        person.setUserStatus("Lazy");
        person.setUserLastSeenDate("09/06/2016");
        person.setProfilePic(R.mipmap.ic_launcher);
        personArrayList.add(person);

        person = new Person();
        person.setUserName("Venkat");
        person.setUserStatus("Sleepy");
        person.setUserLastSeenDate("09/06/2016");
        person.setProfilePic(R.mipmap.ic_launcher);
        personArrayList.add(person);

        person = new Person();
        person.setUserName("Raju");
        person.setUserStatus("Running");
        person.setUserLastSeenDate("09/06/2016");
        person.setProfilePic(R.mipmap.ic_launcher);
        personArrayList.add(person);
    }
}
