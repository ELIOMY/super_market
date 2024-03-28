
package com.example.supermarket.home;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.supermarket.R;
import com.example.supermarket.databinding.ActivityHomeBinding;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{

    ActivityHomeBinding binding;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //setup view
        ViewPager viewPager = binding.viewPager;
        TextView seeAllTV = binding.seeAllTV;
        RecyclerView recyclerView = binding.recyclerView;

        seeAllTV.setOnClickListener(this);

        //setup adapters
        List<Integer> imagesList = new ArrayList<>();
        imagesList.add(R.drawable.img1);
        imagesList.add(R.drawable.img2);
        imagesList.add(R.drawable.img3);
        imagesList.add(R.drawable.img4);

        ImagePagerAdapter pagerAdapter = new ImagePagerAdapter(imagesList);
        viewPager.setAdapter(pagerAdapter);

        ImageAdapter imageAdapter = new ImageAdapter(imagesList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(imageAdapter);    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(HomeActivity.this, ImagesActivty.class);
        startActivity(intent);
    }
}







