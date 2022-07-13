package mylocation.example.marvyanamobilite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button parent_button;

    private Button chauffeur_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parent_button = (Button) findViewById(R.id.parent_button);
        parent_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openParentActivity2();

            }
        });

        chauffeur_button = (Button) findViewById(R.id.chauffeur_button);
        chauffeur_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChauffeurActivity2();
            }
        });

    }

    public void openParentActivity2() {
        Intent intent = new Intent(this, ParentActivity2.class);
        startActivity(intent);

    }

    public void openChauffeurActivity2() {
        Intent intent = new Intent(this, ChauffeurActivity2.class);
        startActivity(intent);
    }
}