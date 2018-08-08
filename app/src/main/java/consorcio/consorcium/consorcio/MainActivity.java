package consorcio.consorcium.consorcio;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import de.codecrafters.tableview.TableView;
import de.codecrafters.tableview.toolkit.SimpleTableDataAdapter;
import de.codecrafters.tableview.toolkit.SimpleTableHeaderAdapter;

public class MainActivity extends AppCompatActivity {

    private static final  String[][] PROBES = {
            {"1", "Pioner", "Chemical", "Jupiter"},
            {"2", "Voyager", "Plasma", "Andromeda"},
            {"3", "Casini", "Solar", "Saturn"},
            {"4", "Spitzer", "Anti-Matter", "Andromeda"},
            {"5", "Apollo", "Chemical", "Moon"},
            {"6", "Curiosity", "Solar", "Mars"}};

    private static String[] HEADERS = {"N°","Name", "Propellant","Destination"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //COMPONENTS DECLARATION
        final TableView<String[]> dataTable = findViewById(R.id.dataTable);
         Button btnCreate = findViewById(R.id.btnCreate);


        //SET DATA TABLE PROPERTIES
        dataTable.setHeaderBackgroundColor(Color.parseColor("#2ecc71"));
        dataTable.setBackgroundColor(Color.rgb(217,223,224));
        dataTable.setHeaderAdapter(new SimpleTableHeaderAdapter(this, HEADERS));
        dataTable.setColumnCount(4);

        //FILL DATA TABLE
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleTableDataAdapter dataAdapter = new SimpleTableDataAdapter(getApplicationContext(), PROBES);
                dataTable.setDataAdapter(dataAdapter);

            }
        });
    }
}
