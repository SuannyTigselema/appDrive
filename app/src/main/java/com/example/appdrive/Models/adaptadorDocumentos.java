package com.example.appdrive.Models;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.appdrive.R;

import java.util.ArrayList;

public class adaptadorDocumentos extends RecyclerView.Adapter<adaptadorDocumentos.MyViewHolder> {
    private static final int TYPE_HEADER=0;
    private static final int TYPE_LIST=0;


    private ArrayList<documento> mLista;
    public ImageView imgTipoArchivo;
    public TextView lblTitulo;
    public ImageView imgDoc;
    public ImageView imgperfil;
    public TextView lblFecha;

    public adaptadorDocumentos(ArrayList<documento> lstMensaje) {
       // mContext = context;
        this.mLista=lstMensaje;
    }

    //Métodos propios del RecyclerdView

    //infla los items al recyclerd
    @NonNull
    @Override
    public adaptadorDocumentos.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
           view= LayoutInflater.from(parent.getContext())
                   .inflate(R.layout.ly_itemdoc,null,false);
           return new MyViewHolder(view);

    }

    //enlaza cada vista del viewholder con los datos de la Lista de productos
    @Override
    public void onBindViewHolder(@NonNull adaptadorDocumentos.MyViewHolder holder, int position) {

        imgTipoArchivo.setImageResource(mLista.get(position).getImgTipoArchivo());
        lblTitulo.setText(mLista.get(position).getLblTitulo());
        imgDoc.setImageResource(mLista.get(position).getImgDoc());
        imgperfil.setImageResource(mLista.get(position).getImgperfil());
        lblFecha.setText(mLista.get(position).getLblFecha());
    }

    //Devuelve la cantidad del elementos del recyclerd
    @Override
    public int getItemCount() {
        return mLista.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        int view_type;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imgTipoArchivo=(ImageView)itemView.findViewById(R.id.imgTipoArchivo);
            lblTitulo=(TextView)itemView.findViewById(R.id.lblTitulo);
            imgDoc=(ImageView)itemView.findViewById(R.id.imgDoc);
            imgperfil=(ImageView)itemView.findViewById(R.id.imgperfil);
            lblFecha=(TextView) itemView.findViewById(R.id.lblFecha);

        }
    }

}
