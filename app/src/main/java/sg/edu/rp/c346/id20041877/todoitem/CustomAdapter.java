package sg.edu.rp.c346.id20041877.todoitem;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Calendar;

public class CustomAdapter extends ArrayAdapter {
    Context context;
    int layout_id;
    ArrayList<ToDoItem> al;

    public CustomAdapter(Context context, int resource, ArrayList<ToDoItem> al) {
        super(context, resource, al);

        this.context = context;
        this.layout_id = resource;
        this.al = al;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvTitle = rowView.findViewById(R.id.tvTitle);
        TextView tvDate = rowView.findViewById(R.id.tvDate);

        ToDoItem currItem = al.get(position);

        tvTitle.setText(currItem.getTitle());
        tvDate.setText(currItem.toString());

        if (currItem.getDate().get(Calendar.YEAR) == 2021) {
            tvTitle.setTextColor(Color.RED);
            tvDate.setTextSize(20.5f);
        }


        return rowView;
    }


}
