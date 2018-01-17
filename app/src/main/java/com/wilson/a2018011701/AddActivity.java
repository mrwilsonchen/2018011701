package com.wilson.a2018011701;

/**
 * Created by Student on 2018/1/17.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.wilson.a2018011701.data.Student;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }
    public void clickAdd(View v)
    {

        EditText ed1 = (EditText) findViewById(R.id.editText);
        EditText ed2 = (EditText) findViewById(R.id.editText2);
        EditText ed3 = (EditText) findViewById(R.id.editText3);
        int id;
        int score;
        System.out.println(ed1.getText());
        if(ed1.getText().length()!= 0)
        //if(Integer.valueOf(ed1.getText())!= null)
        {    Log.d("DA", "INT");
            id=Integer.valueOf(ed1.getText().toString());
            String name = ed2.getText().toString();
            System.out.println(name);
            System.out.println(name.toString());
            //Integer.valueOf(name.toString());
            /*
            MainActivity.dao.add(new Student(id, name, score));
            finish();
            */
        }
        else {
            Log.d("DA", "Empty");
        }

//        id=Integer.valueOf(ed1.getText().toString());

/*

*/
    }
}
