package net.androidbootcamp.project_take1;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.ListView;

public class workoutActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] workouts = {"Bench Press", "Dead Lift", "Pull Ups"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_workout_actitivity, R.id.exercises, workouts));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {

        switch(position) {
            case 0:
                startActivity(new Intent(workoutActivity.this, benchActivity.class));
                break;
            case 1:
                startActivity(new Intent(workoutActivity.this, dead_Activity.class));
                break;
            case 2:
                startActivity(new Intent(workoutActivity.this, pullActivity.class));
                break;
        }
    }
}
