package group.moveon.mobilelabwork1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        setTitle(R.string.title_one);

        /*
        CheckBox checkBox =
        final float scale = this.getResources().getDisplayMetrics().density;
        checkBox.setPadding(checkBox.getPaddingLeft() + (int)(10.0f * scale + 0.5f),
                checkBox.getPaddingTop(),
                checkBox.getPaddingRight(),
                checkBox.getPaddingBottom());
*/
    }

}