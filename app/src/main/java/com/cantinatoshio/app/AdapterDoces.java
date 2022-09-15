package com.cantinatoshio.app;


import android.content.Context;
import android.content.Intent;
import android.text.style.AlignmentSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterDoces extends RecyclerView.Adapter<AdapterDoces.ViewHolder>
{
    private Context context;
    private List<Doces> doce;



    public AdapterDoces(Context context, List<Doces> doce) {
        this.context = context;
        this.doce = doce;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_itens, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.descricao.setText(doce.get(position).getDescricao());
        holder.titulo.setText(doce.get(position).getTitulo());
        holder.preco.setText(doce.get(position).getPreco());
        holder.imgDoces.setImageResource(doce.get(position).getimgDoces());
        holder.imgDoces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, TelaAberta.class);

                intent.putExtra("Preco", doce.get(position).getPreco());
                intent.putExtra("Descricao", doce.get(position).getDescricao());
                intent.putExtra("imgDoce", doce.get(position).getimgDoces());

                context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
            }
        });
    }

    @Override
    public int getItemCount() {
        return doce.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView descricao, titulo, preco;
        ImageView imgDoces;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            descricao = itemView.findViewById(R.id.DescDoce);
            titulo = itemView.findViewById(R.id.NomeDoce);
            preco = itemView.findViewById(R.id.precoProduto);
            imgDoces = itemView.findViewById(R.id.imgDoce);
        }
    }
}
