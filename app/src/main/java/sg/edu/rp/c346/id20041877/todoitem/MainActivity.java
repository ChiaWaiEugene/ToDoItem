package sg.edu.rp.c346.id20041877.todoitem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    ListView lv;
    ArrayList<ToDoItem> al;
    CustomAdapter ca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);

        al= new ArrayList<>();
        Calendar date1 = Calendar.getInstance();
        date1.set(2020, 8, 1);
        Calendar date2 = Calendar.getInstance();
        date2.set(2020, 8, 2);

        ToDoItem item1 = new ToDoItem("Go for movie", date1);
        ToDoItem item2 = new ToDoItem("Go for haircut", date2);
        al.add(item1);
        al.add(item2);

        Calendar date3 = Calendar.getInstance();
        date3.set(2021, 8, 3);
        ToDoItem item3 = new ToDoItem("Complete your notes", date3);
        Calendar date4 = Calendar.getInstance();
        date3.set(2021, 8, 5);
        ToDoItem item4 = new ToDoItem("Complete Your PS enhancement", date3);

        al.add(item3);
        al.add(item4);

        ca = new CustomAdapter(this, R.layout.row, al);
        lv.setAdapter(ca);

    }
}
