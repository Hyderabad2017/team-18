package com.example.admin_pc.uwh18;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import java.util.ArrayList;
import java.util.List;

import static android.R.attr.entries;

public class ReceipentHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipent_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//display the updated units of blood through a bar chart visualisation
        BarChart barChart = (BarChart) findViewById(R.id.barchart);
        ArrayList<String> labels = new ArrayList<String>();
        // specifying the types of blood that are to be tracked by the recipient institutions
        labels.add("A+");
        labels.add("B+");
        labels.add("AB+");
        labels.add("O+");
        labels.add("AB-");
        labels.add("O-");
        labels.add("A-");
        labels.add("B-");
        List<BarEntry> entries = new ArrayList<BarEntry>();
        entries.add(new BarEntry(3,0));
        entries.add(new BarEntry(1,1));
        entries.add(new BarEntry(6,2));
        entries.add(new BarEntry(1,3));
        entries.add(new BarEntry(2,4));
        entries.add(new BarEntry(9,5));
        entries.add(new BarEntry(6,6));
        entries.add(new BarEntry(8,7));
        BarDataSet bardataset = new BarDataSet(entries, "Cells");
        BarData data = new BarData(labels, bardataset);
        barChart.setData(data);
//will enable a new activity to raise a request 
        
            }
        });
    }
}
