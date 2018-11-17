package denisimus_it.net.colorofmood;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner spinnerColors;
    private TextView textViewDescriptionTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerColors = findViewById(R.id.spinnerColors);
        textViewDescriptionTemp = findViewById(R.id.textViewDescriptionTemp);

    }


    public void onClickFindDescription(View view) {
        int itemPosition = spinnerColors.getSelectedItemPosition();
        textViewDescriptionTemp.setText(getDescriptionByPosition(itemPosition));

    }

    private String getDescriptionByPosition(int itemPosition) {
        String[] descriptionOfTemp = getResources().getStringArray(R.array.description_of_temp);
        return descriptionOfTemp[itemPosition];
    }
}
