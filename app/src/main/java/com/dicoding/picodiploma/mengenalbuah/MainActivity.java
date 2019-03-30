package com.dicoding.picodiploma.mengenalbuah;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Kenalin
    ListView listBuah;
    String buah = "Jambu";
    String namaBuah[] = {"Alpukat", "Apel", "Ceri", "Durian",
            "Jambu air", "Strawberry"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Hubungin
        listBuah = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1,
                android.R.id.text1, namaBuah);
        // Ngapain
        listBuah.setAdapter(adapter);
    }

    // Custom Adatpter
    int gambarBuah[] = {R.drawable.alpukat, R.drawable.apel,
            R.drawable.ceri, R.drawable.durian, R.drawable.jambuair,
            R.drawable.manggis, R.drawable.strawberry};

    public class CustomAdapter extends ArrayAdapter {
        public CustomAdapter(Context context) {
            super(context, R.layout.item_buah, namaBuah);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v = getLayoutInflater().inflate(R.layout.item_buah,
                    null, true);
            ImageView gambar = v.findViewById(R.id.imageView);
            TextView nama = v.findViewById(R.id.textView);
            gambar.setImageResource(gambarBuah[position]);
            nama.setText(namaBuah[position]);
            return v;
        }
    }
}
