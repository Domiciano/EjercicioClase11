package co.domi.ejercicioclase11.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;
import co.domi.ejercicioclase11.R;
import co.domi.ejercicioclase11.model.Result;
import co.domi.ejercicioclase11.rows.ResultRow;

import java.util.ArrayList;


public class ResultAdapter extends RecyclerView.Adapter<ResultRow> {

    //Arreglo que hay que adaptar para que sea visible por el usuario
    private ArrayList<Result> results;

    //Agregar un objeto resultado para que sea mostrado en el recyclerview
    public void addResult(Result result){
        results.add(result);
        notifyDataSetChanged();
    }

    //El constructor crea la referencia del arraylist
    public ResultAdapter() {
        results = new ArrayList<>();
    }

    //En este metodo se crea la vista del renglon, sin informacion. Solo el renglon
    //Se crea por cada elemento del arreglo
    @Override
    public ResultRow onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.row, parent, false);
        ResultRow row = new ResultRow(v);
        return row;
    }

    //La vista del renglon (ResultRow) llega a este método
    //que se encarga de ponerle la informacion a cada renglon usando position
    @Override
    public void onBindViewHolder(ResultRow holder, int position) {
        Result result = results.get(position);
        holder.getResultRow().setText(result.toString());
    }

    //Esto le indica al recycler cuantas vistas de renglon debe construir el recycler
    @Override
    public int getItemCount() {
        return results.size();
    }
}

