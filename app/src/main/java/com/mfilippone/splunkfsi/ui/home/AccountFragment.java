package com.mfilippone.splunkfsi.ui.home;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;


import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.mfilippone.splunkfsi.databinding.FragmentAccountBinding;

import java.util.ArrayList;


public class AccountFragment extends Fragment {

    LineChart lineChart;
    LineData lineData;
    LineDataSet lineDataSet;
    ArrayList lineEntries;
private FragmentAccountBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        AccountViewModel accountViewModel =
                new ViewModelProvider(this).get(AccountViewModel.class);

    binding = FragmentAccountBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        lineChart = binding.chart;
        getEntries();
        lineDataSet = new LineDataSet(lineEntries, "Account Value");
        lineData = new LineData(lineDataSet);
        lineChart.setData(lineData);
        lineDataSet.setColors(ColorTemplate.JOYFUL_COLORS);
        lineDataSet.setValueTextColor(Color.BLACK);
        lineDataSet.setValueTextSize(18f);



       /* // Initializing CandleStickChart make Sure to
        // replace it with your id only that
        // you created
        CandleStickChart candleStickChart = binding.candleStick;

        // This Description is visible at Bottom Right side
        candleStickChart.getDescription().setText("GFG");

        // Creating a list to store CandleEntry objects
        List<CandleEntry> entries = new ArrayList<>();

        // Added candlestick dummy data entries here
        // Format will be like entries.add(new CandleEntry(index, high, low, open, close));
        // here f is denoting floating-point number
        entries.add(new CandleEntry(0, 80f, 90f, 70f, 85f)); // Up (green)
        entries.add(new CandleEntry(1, 85f, 95f, 75f, 88f)); // Up (green)
        entries.add(new CandleEntry(2, 88f, 75f, 82f, 85f)); // Down (red)
        entries.add(new CandleEntry(3, 85f, 70f, 78f, 72f)); // Down (red)
        entries.add(new CandleEntry(4, 72f, 68f, 70f, 70f)); // Down (red)
        entries.add(new CandleEntry(5, 70f, 85f, 68f, 82f)); // Up (green)
        entries.add(new CandleEntry(6, 82f, 78f, 80f, 75f)); // Down (red)
        entries.add(new CandleEntry(7, 75f, 70f, 73f, 72f)); // Down (red)
        entries.add(new CandleEntry(8, 72f, 82f, 70f, 80f)); // Up (green)
        entries.add(new CandleEntry(9, 80f, 88f, 75f, 85f)); // Up (green)
        entries.add(new CandleEntry(10, 85f, 92f, 82f, 90f)); // Up (green)
        entries.add(new CandleEntry(11, 90f, 98f, 88f, 95f)); // Up (green)
        entries.add(new CandleEntry(12, 95f, 88f, 90f, 85f)); // Down (red)
        entries.add(new CandleEntry(13, 85f, 78f, 82f, 72f)); // Down (red)
        entries.add(new CandleEntry(14, 72f, 70f, 70f, 68f)); // Down (red)

        // Created a CandleDataSet from the entries
        CandleDataSet dataSet = new CandleDataSet(entries, "Data");

        dataSet.setDrawIcons(false);
        dataSet.setIncreasingColor(Color.GREEN); // Color for up (green) candlesticks
        dataSet.setIncreasingPaintStyle(Paint.Style.FILL); // Set the paint style to Fill for green candlesticks
        dataSet.setDecreasingColor(Color.RED); // Color for down (red) candlesticks
        dataSet.setShadowColorSameAsCandle(true); // Using the same color for shadows as the candlesticks
        dataSet.setDrawValues(false);             // Hiding the values on the chart if not needed

        // Created a CandleData object from the CandleDataSet
        CandleData data = new CandleData(dataSet);

        // Seinft the CandleData to the CandleStickChart
        candleStickChart.setData(data);
        candleStickChart.invalidate();*/



        final TextView textView = binding.textAccount;
        accountViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void getEntries() {
        lineEntries = new ArrayList<>();
        lineEntries.add(new Entry(1, 9000));
        lineEntries.add(new Entry(2, 10800));
        lineEntries.add(new Entry(3, 15100));
        lineEntries.add(new Entry(4, 20300));
        lineEntries.add(new Entry(5, 20390));
        lineEntries.add(new Entry(6, 20500));
    }
}