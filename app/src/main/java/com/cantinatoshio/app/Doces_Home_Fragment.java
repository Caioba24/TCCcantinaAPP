package com.cantinatoshio.app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class Doces_Home_Fragment extends Fragment
{
    RecyclerView listaDoces;
    List<Doces> doces;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_doces_home, container, false);

        listaDoces = view.findViewById(R.id.recyclerViewdoce);

        doces = new ArrayList<>();

        doces.add(new Doces("R$ 1.30", "Hamburgao", "Delicioso" ,R.drawable.hamburgao));
        doces.add(new Doces("R$ 2.00", "Coxinha", "Frango com cremily" ,R.drawable.coxinha));
        doces.add(new Doces("R$ 300.00", "Coca-Lata", "Trincando" ,R.drawable.coca));
        doces.add(new Doces("R$ 100.00", "Guarana-Lata", "Gelada ta?!" ,R.drawable.guarana));

        AdapterDoces adapterDoces = new AdapterDoces(getContext(), doces);

        listaDoces.setLayoutManager(new LinearLayoutManager(getContext()));

        listaDoces.hasFixedSize();

        listaDoces.setAdapter(adapterDoces);

        return view;
    }
}