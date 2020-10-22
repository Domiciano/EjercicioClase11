package co.domi.ejercicioclase11.rows;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import co.domi.ejercicioclase11.R;


//Los viewholders se refieren a las vistas de renglon
//que aloja el recycler en su interior
public class ResultRow extends RecyclerView.ViewHolder {

    //Como variables globales van los elementos UI del renglon
    public TextView resultRow;

    //En el constructor se hace la referencia de los elementos UI
    public ResultRow(View v) {
        super(v);
        resultRow = v.findViewById(R.id.resultRow);
    }

    public TextView getResultRow() {
        return resultRow;
    }
}
