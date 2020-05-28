package com.example.TrabajoFacultativa2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
//se declaracion genral del arrelgo
    ArrayList<Model>models=new ArrayList<>();

    RecyclerView mRecycleView;
    Adapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecycleView=findViewById(R.id.recycleview1);
        mRecycleView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter= new Adapter(this, getMyList());
        mRecycleView.setAdapter(myAdapter);
    }

    private ArrayList<Model> getMyList(){
        Model m=new Model();

        m.setTitulo("Facultativa II");
        m.setDescripcion ("Descripción de Facultativa II");
        m.setImagen(R.drawable.app);
        m.setProfesor("Saira Cienfuego");
        m.setDia("28 de mayo de 2019");
        m.setHora("03:10");
        m.setFechaentrega("04 de junio del 2020");
        models.add(m);

        m=new Model();

        m.setTitulo("Investigación Aplicada");
        m.setDescripcion ("Describe la asignatura de Investigacion Aplicada");
        m.setImagen(R.drawable.files);
        m.setProfesor("Jazcar Bravo");
        m.setDia("27 de mayo de 2019");
        m.setHora("03:10");
        m.setFechaentrega("03 de junio del 2020");
        models.add(m);

        m=new Model();
        m.setTitulo("Planificación TIC");
        m.setDescripcion ("Descripción de Planificación TIC");
        m.setProfesor("Miriam Tèllez");
        m.setDia("24 de mayo del 2020");
        m.setHora("10:00");
        m.setFechaentrega("31 de mayo del 2020");
        m.setImagen(R.drawable.pc);
        models.add(m);

        return models;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.cerrar:
                this.finish();
            case R.id.agregar:

                final Dialog dlg = new Dialog(this);
                dlg.setContentView(R.layout.agregar_layout);
                dlg.setTitle("Añadir Clases");
                dlg.setCancelable(false);

                Button buttonagregar = (Button) dlg.findViewById(R.id.btnagregar);
                Button buttoncancelar = (Button) dlg.findViewById(R.id.btncancelar);

                buttonagregar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // se crea una variable para guardar lo que tiene editText
                        EditText editText_asigna=(EditText) dlg.findViewById(R.id.editText_nombreasig);
                        EditText editText_descrip=(EditText)dlg.findViewById(R.id.editText_descrip);
                        EditText editText_profe=(EditText)dlg.findViewById(R.id.editText_Profesor);
                        EditText editText_dia=(EditText)dlg.findViewById(R.id.editText_Dia);
                        EditText editText_hora=(EditText)dlg.findViewById(R.id.editText_hora);
                        EditText editText_fechaentr=(EditText)dlg.findViewById(R.id.editText_fechaentre);

                        Model model=new Model();//
                       model.setTitulo(editText_asigna.getText().toString());

                       model.setDescripcion(editText_descrip.getText().toString());

                       model.setProfesor(editText_profe.getText().toString());

                       model.setImagen(R.drawable.files);

                       model.setDia(editText_dia.getText().toString());
                       model.setHora(editText_hora.getText().toString());
                       model.setFechaentrega(editText_fechaentr.getText().toString());
                        models.add(model);/// para agregar al arreglo
                        myAdapter= new Adapter(v.getContext(), models);//para actualizar el recycleView
                        mRecycleView.setAdapter(myAdapter);
                        dlg.cancel();//
                    }


                });

                buttoncancelar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dlg.cancel();
                    }
                });

                dlg.show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}

