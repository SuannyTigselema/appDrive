package com.example.appdrive.Fragments;

import android.content.res.ColorStateList;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.appdrive.Models.adaptadorDocumentos;
import com.example.appdrive.Models.documento;
import com.example.appdrive.R;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link frgDocs#newInstance} factory method to
 * create an instance of this fragment.
 */
public class frgDocs extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    RecyclerView recyclerview=null;
    ArrayList<documento> lstDoc;
    public frgDocs() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment frgDocs.
     */
    // TODO: Rename and change types and number of parameters
    public static frgDocs newInstance(String param1, String param2) {
        frgDocs fragment = new frgDocs();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        lstDoc = new ArrayList<>();
        View view = inflater.inflate(R.layout.fragment_frg_docs, container, false);
        recyclerview=(RecyclerView)view.findViewById(R.id.rcvDocs);
        recyclerview.setLayoutManager(new LinearLayoutManager((getContext())));
        llenarLista();
        setHasOptionsMenu(true);
        adaptadorDocumentos adapter = new adaptadorDocumentos(lstDoc);
        recyclerview.setAdapter(adapter);
        return view;
    }
    private void llenarLista()
    {
        lstDoc.add(new documento(R.drawable.pdf,"Guía de ayuno y oración",R.drawable.docpdf1,R.drawable.user,"Lo acabas de abrir"));
        lstDoc.add(new documento(R.drawable.powerpoint,"Accesibilidad Web",R.drawable.docpw3,R.drawable.user,"Lo has abierto hoy"));
        lstDoc.add(new documento(R.drawable.word,"Proyecto Integrador Módulo 8",R.drawable.docword1,R.drawable.user,"Lo has subido hoy"));
        lstDoc.add(new documento(R.drawable.powerpoint,"Estados financieros proyectados",R.drawable.docpw2,R.drawable.user,"Lo has subido hoy"));
    }
    public void onClick(View view) {

    }

}