package com.example.ativ.capstone;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ativ.capstone.R;

import static com.example.ativ.capstone.R.id.parent;

/**
 * Created by ATIV on 2017-04-14.
 */

public class listviewActivity extends ActionBarActivity {
    ListView list;
    String[] names = {
            "정지웅",
            "박준하",
            "조심재",
            "반현길"
    };

    String[] numbers = {
            "5113262",
            "5439074",
            "5439182",
            "5175352"
    };

    Integer[] images = {
            R.drawable.human1,
            R.drawable.human2,
            R.drawable.human3,
            R.drawable.human4
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        CustomList adapter = new CustomList(listviewActivity.this);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(getBaseContext(), names[+position], Toast.LENGTH_SHORT).show();
            }
        });
    }

    public class CustomList extends ArrayAdapter<String> {
        private final Activity context;
        public CustomList(Activity context) {
            super(context, R.layout.activity_listitem, names);
            this.context = context;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {
            LayoutInflater inflater = context.getLayoutInflater();
            View rowView = inflater.inflate(R.layout.activity_listitem, null, true);
            ImageView imageView = (ImageView) rowView.findViewById(R.id.image);
            TextView name = (TextView) rowView.findViewById(R.id.name);
            TextView major = (TextView) rowView.findViewById(R.id.major);
            TextView number = (TextView) rowView.findViewById(R.id.number);

            name.setText(names[position]);
            imageView.setImageResource(images[position]);
            major.setText("컴퓨터공학");
            number.setText(numbers[position]);
            return rowView;
        }

    }



}
