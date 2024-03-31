package ru.mirea.khrebtovsky.favoritebook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ShareActivity extends AppCompatActivity {

    static final String USER_MESSAGE = "MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
    }

    public void shareBookName(View view) {
        EditText editTextBook = findViewById(R.id.editTextBook);
        String userBook = editTextBook.getText().toString();

        Intent data = new Intent();
        data.putExtra(USER_MESSAGE, userBook);
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}
