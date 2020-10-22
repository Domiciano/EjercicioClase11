package co.domi.ejercicioclase11.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.domi.ejercicioclase11.R;
import co.domi.ejercicioclase11.adapters.ResultAdapter;
import co.domi.ejercicioclase11.model.Result;

import android.os.Bundle;
import android.widget.Button;

import java.util.UUID;


public class MainActivity extends AppCompatActivity {

    private Button vote1Btn,vote2Btn,vote3Btn;
    private RecyclerView resultList;
    private ResultAdapter resultAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencia de los views
        resultList = findViewById(R.id.resultList);
        vote1Btn = findViewById(R.id.vote1Btn);
        vote2Btn = findViewById(R.id.vote2Btn);
        vote3Btn = findViewById(R.id.vote3Btn);

        //Configuracion del recyclerview
        resultAdapter = new ResultAdapter();
        resultList.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        resultList.setLayoutManager(layoutManager);
        resultList.setAdapter(resultAdapter);

        //Agregar información al recycler
        resultAdapter.addResult(new Result(UUID.randomUUID().toString(), "Jhon Jackson", 20, 50.0));
        resultAdapter.addResult(new Result(UUID.randomUUID().toString(), "Jack Johnson", 20, 50.0));
        resultAdapter.addResult(new Result(UUID.randomUUID().toString(), "Voto en blanco", 0, 0));

    }
}