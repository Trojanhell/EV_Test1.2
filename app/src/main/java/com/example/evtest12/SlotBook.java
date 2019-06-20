package com.example.evtest12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.SearchView;
import android.widget.Toast;

public class SlotBook extends AppCompatActivity {


    SearchView mySearchView;
    ListView myList;
    private Button Back;

    // ArrayList<String> list;
    //   ArrayAdapter<String> adapter;
    String []listviewitems = new String[]{
            "Sector 17 G, Near Bus Stand, Chandigarh",
            "Sector 35, Khukhrain Bhavan, Chandigarh",
            "Sector 43 B, Near SBI Bank, Chandigarh",
            "Sector 22 C, Civil hospital, Chandigarh",
            "Sector 20 C, Sai Temple, Chandigarh",
            "Sector 17 G, Near Bus Stand, Chandigarh",
            "Sector 35, Khukhrain Bhavan, Chandigarh",
            "Sector 43 B, Near SBI Bank, Chandigarh",
            "Sector 22 C, Civil hospital, Chandigarh",
            "Sector 20 C, Sai Temple, Chandigarh",
            "Sector 17 G, Near Bus Stand, Chandigarh",
            "Sector 35, Khukhrain Bhavan, Chandigarh",
            "Sector 43 B, Near SBI Bank, Chandigarh",
            "Sector 22 C, Civil hospital, Chandigarh",
            "Sector 20 C, Sai Temple, Chandigarh",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slot_book);


        Back = (Button)findViewById(R.id.back_btn);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SlotBook.this, nav_activity.class);
                startActivity(intent);
            }
        });

        mySearchView = (SearchView)findViewById(R.id.searchView);
        myList = (ListView)findViewById(R.id.myList);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listviewitems);
        myList.setAdapter(adapter);

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String templistview = listviewitems[position].toString();
                Intent intent = new Intent(SlotBook.this, timeSlot1.class);
                startActivity(intent);
            }
        });
/*
        list = new ArrayList<String>();

        list.add("Sector 17 G, Near Bus Stand, Chandigarh");
        list.add("Sector 35, Khukhrain Bhavan, Chandigarh");
        list.add("Sector 43 B, Near SBI Bank, Chandigarh");
        list.add("Sector 22 C, Civil hospital, Chandigarh");
        list.add("Sector 20 C, Sai Temple, Chandigarh");
        list.add("Sector 17 G, Near Bus Stand, Chandigarh");
        list.add("Sector 20 C, Sai Temple, Chandigarh");
        list.add("Sector 22 C, Civil hospital, Chandigarh");
        list.add("Sector 43 B, Near SBI Bank, Chandigarh");
        list.add("Sector 35, Khukhrain Bhavan, Chandigarh");
        list.add("Sector 17 G, Near Bus Stand, Chandigarh");

*/
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listviewitems);

        myList.setAdapter(adapter);

        final ArrayAdapter<String> finalAdapter = adapter;
        mySearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                finalAdapter.getFilter().filter(s);

                return false;
            }
        });

    }

}

/*
    private Button book1;
    RadioGroup g1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slot_book);


        book1 = findViewById(R.id.btn4);
        book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SlotBook.this, timeSlot1.class);
                startActivity(intent);
            }
        });


/*
        g1 = (RadioGroup)findViewById(R.id.G1);

        g1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId==R.id.rb1)
                {
                    Toast.makeText(SlotBook.this, "Sector 17 G, Near Bus Stand, Chandigarh",Toast.LENGTH_SHORT).show();
                }
                if (checkedId==R.id.rb2)
                {
                    Toast.makeText(SlotBook.this, "Sector 35, Khukhrain Bhavan, Chandigarh",Toast.LENGTH_SHORT).show();
                }
                if (checkedId==R.id.rb3)
                {
                    Toast.makeText(SlotBook.this, "Sector 43 B, Near SBI Bank, Chandigarh",Toast.LENGTH_SHORT).show();
                }
                if (checkedId==R.id.rb4)
                {
                    Toast.makeText(SlotBook.this, "Sector 22 C, Civil hospital, Chandigarh",Toast.LENGTH_SHORT).show();
                }
                if (checkedId==R.id.rb5)
                {
                    Toast.makeText(SlotBook.this, "Sector 20 C, Sai Temple, Chandigarh",Toast.LENGTH_SHORT).show();
                }
                if (checkedId==R.id.rb6)
                {
                    Toast.makeText(SlotBook.this, "Sector 17 G, Near Bus Stand, Chandigarh",Toast.LENGTH_SHORT).show();
                }
                if (checkedId==R.id.rb7)
                {
                    Toast.makeText(SlotBook.this, "Sector 35, Khukhrain Bhavan, Chandigarh",Toast.LENGTH_SHORT).show();
                }
                if (checkedId==R.id.rb8)
                {
                    Toast.makeText(SlotBook.this, "Sector 43 B, Near SBI Bank, Chandigarh",Toast.LENGTH_SHORT).show();
                }
                if (checkedId==R.id.rb9)
                {
                    Toast.makeText(SlotBook.this, "Sector 22 C, Civil hospital, Chandigarh",Toast.LENGTH_SHORT).show();
                }
                if (checkedId==R.id.rb10)
                {
                    Toast.makeText(SlotBook.this, "Sector 20 C, Sai Temple, Chandigarh",Toast.LENGTH_SHORT).show();
                }
                if (checkedId==R.id.rb11)
                {
                    Toast.makeText(SlotBook.this, "Sector 17 G, Near Bus Stand, Chandigarh",Toast.LENGTH_SHORT).show();
                }
                if (checkedId==R.id.rb12)
                {
                    Toast.makeText(SlotBook.this, "Sector 35, Khukhrain Bhavan, Chandigarh",Toast.LENGTH_SHORT).show();
                }
                if (checkedId==R.id.rb13)
                {
                    Toast.makeText(SlotBook.this, "Sector 43 B, Near SBI Bank, Chandigarh",Toast.LENGTH_SHORT).show();
                }
                if (checkedId==R.id.rb14)
                {
                    Toast.makeText(SlotBook.this, "Sector 22 C, Civil hospital, Chandigarh",Toast.LENGTH_SHORT).show();
                }
                if (checkedId==R.id.rb15)
                {
                    Toast.makeText(SlotBook.this, "Sector 20 C, Sai Temple, Chandigarh",Toast.LENGTH_SHORT).show();
                }
                if (checkedId==R.id.rb16)
                {
                    Toast.makeText(SlotBook.this, "Sector 20 C, Sai Temple, Chandigarh",Toast.LENGTH_SHORT).show();
                }
            }
        });*/

/*

    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();

        overridePendingTransition(R.anim.goup, R.anim.godown);
    }
}*/