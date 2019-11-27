
package com.example.a1818;


import android.annotation.SuppressLint;

import android.graphics.Color;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;

import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import com.github.mikephil.charting.utils.ColorTemplate;


import java.util.ArrayList;

@SuppressLint("Registered")
public class PieChartActivity extends AppCompatActivity {

    PieChart pieChart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piechart);

        pieChart = findViewById(R.id.pieChart1);

//        mChart.OnChartGestureListener(PieChartActivity.this);
//        mChart.OnChartValueSelectedListener(PieChartActivity.this);

        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
        pieChart.setExtraOffsets(5, 10, 5, 5);

        pieChart.setDragDecelerationFrictionCoef(0.95f);

        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(Color.WHITE);
        pieChart.setTransparentCircleRadius(61f);

        ArrayList<PieEntry> yValues = new ArrayList<>();

        yValues.add(new PieEntry(34f, "1"));
        yValues.add(new PieEntry(34f, "2"));
        yValues.add(new PieEntry(34f, "3"));
        yValues.add(new PieEntry(34f, "4"));
        yValues.add(new PieEntry(34f, "5"));
        yValues.add(new PieEntry(34f, "6"));

//        Description description = new Description();
//        description.setText("dddd");
//        description.setTextSize(15);
//        pieChart.setDescription(description);


        pieChart.animateY(1000, Easing.EaseInOutCubic);


        PieDataSet dataSet = new PieDataSet(yValues, "num");
        dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(5f);
        dataSet.setColors(ColorTemplate.PASTEL_COLORS);

        PieData data = new PieData(dataSet);
        data.setValueTextSize(10f);
        data.setValueTextColor(Color.YELLOW);

        pieChart.setData(data);


    }


}
