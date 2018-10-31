package com.acsmarttech.cardview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.acsmarttech.cardview.R;
import com.acsmarttech.cardview.model.Postagem;

import java.util.List;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {

    private List<Postagem> postagens;
    public PostagemAdapter(List<Postagem> postagemList) {
        this.postagens = postagemList;
    }


    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {
        View itemLista = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.postagem_detalhe,viewGroup,false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder( MyViewHolder myViewHolder, int i) {

        Postagem postagem = postagens.get(i);
        myViewHolder.nome.setText(postagem.getNome());
        myViewHolder.descricao.setText(postagem.getDescricao());
        myViewHolder.preco.setText(postagem.getPreco());
        myViewHolder.imagem.setImageResource(postagem.getImagem());

    }

    @Override
    public int getItemCount() {
        return postagens.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView nome;
        private TextView descricao;
        private TextView preco;
        private ImageView imagem;

        public MyViewHolder( View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.textViewNome);
            descricao = itemView.findViewById(R.id.textViewPostagem);
            preco = itemView.findViewById(R.id.textViewPreco);
            imagem = itemView.findViewById(R.id.imageViewPostagem);
        }
    }
}
