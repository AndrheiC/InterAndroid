package com.acsmarttech.cardview.activity;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.acsmarttech.cardview.R;
import com.acsmarttech.cardview.adapter.PostagemAdapter;
import com.acsmarttech.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //vincula com o objeto criado no xml
        recyclerPostagem = findViewById(R.id.recyclerViewPostagem);

        //Define o layout

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        //Define o adapter
        this.prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);

    }

    public void prepararPostagens(){

        Postagem postagem = new Postagem("Pão Francês (2 unidades)", "Pão Francês quentinho", "R$2,50", R.drawable.paofrances);
        this.postagens.add(postagem);

        postagem = new Postagem("Café com Leite (Large)", "Café com leite grande, cremoso, com pitada de canela em pó e chantily", "R$3,50", R.drawable.cafe);
        this.postagens.add(postagem);

        postagem = new Postagem("Pão de Queijo (3 unidades)", "Pão de queijo mineirinho, recém saído do forno", "R$3,00", R.drawable.paoqueijo);
        this.postagens.add(postagem);

        postagem = new Postagem("Sonho", "Delicioso sonho frito. Sabores: Creme, nata, doce-de-leite, goiabada", "R$5,50", R.drawable.sonho);
        this.postagens.add(postagem);

        postagem = new Postagem("Torta de maçã (fatia)", "Fatia de torta de maçã (150g)", "R$5,50", R.drawable.torta);
        this.postagens.add(postagem);

        postagem = new Postagem("Bolo de Morango com Chocolate (fatia)", "Delicioso bolo de morango com chocolate, molhadinho (200g)", "R$7,00", R.drawable.bolo);
        this.postagens.add(postagem);
    }

    public void openDialog(View view){

        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        dialog.setTitle("Confirma compra?");
        dialog.setMessage("Ao clicar em SIM você estará confirmando a compra");

        dialog.setCancelable(false);
        dialog.setIcon(android.R.drawable.ic_input_add);

        dialog.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Fazer a ação de comprar aqui.
            }
        });

        dialog.setNegativeButton("NÃO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Fazer a ação de cancelamento aqui.
            }
        });

        dialog.create();
        dialog.show();
    }

    public void cancel (View view){

    }
}
