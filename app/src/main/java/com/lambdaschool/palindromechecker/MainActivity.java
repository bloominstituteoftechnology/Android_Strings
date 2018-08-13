package com.lambdaschool.palindromechecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editInput;
    TextView textOutput;
    Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editInput = findViewById(R.id.edit_input);
        textOutput = findViewById(R.id.text_output);
        buttonSubmit = findViewById(R.id.button_submit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String target = editInput.getText().toString();
                boolean valid = true;
                for(int i = 0; i < target.length(); ++i) {
                    if(!(target.charAt(i) == target.charAt(target.length() - 1 - i))) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {
                    textOutput.setText(String.format("%s %s", target, getString(R.string.success_response)));
                } else {
                    textOutput.setText(String.format("%s %s", target, getString(R.string.fail_response)));
                }
            }
        });
    }
}
