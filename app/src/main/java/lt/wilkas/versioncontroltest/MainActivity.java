package lt.wilkas.versioncontroltest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] hello = {"H", "E", "L", "L", "O", " ", "W", "I", "L", "K", "E", "N", "A", "S"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // done something
        TextView view = (TextView) findViewById(R.id.helloView);
        String h = hello("", 0);

        view.setText(h);
    }

    private String hello(String helloString, int index) {
        if (index == hello.length) {
            return "";
        } else {
            helloString = hello[index] + hello(helloString, index + 1);
        }
        return helloString;
    }

    private void AddedNewEmptyMethod() {

        // all good?

    }

    private void AddedAnotherEmptyMethod(){
        //now what? :)
    }

    private String returnPawliux() {

        return new String("paxliux");

    }

    private String returnReturnedPawliux(){
        return returnPawliux();
    }
}
