package com.example.supermarket.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.supermarket.R;
import com.example.supermarket.databinding.ActivityImagesBinding;

import java.util.ArrayList;
import java.util.List;

public class ImagesActivty extends AppCompatActivity {
    ActivityImagesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityImagesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        RecyclerView recyclerView = binding.recyclerView;

        List<Integer> imagesList = new ArrayList<>();
        imagesList.add(R.drawable.img1);
        imagesList.add(R.drawable.img2);
        imagesList.add(R.drawable.img3);
        imagesList.add(R.drawable.img4);

        ImageAdapter imageAdapter = new ImageAdapter(imagesList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(imageAdapter);
    }
}