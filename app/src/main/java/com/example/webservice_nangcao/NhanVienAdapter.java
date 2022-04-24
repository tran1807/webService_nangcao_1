package com.example.webservice_nangcao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NhanVienAdapter extends BaseAdapter {

    private MainActivityNV context;
    private int layout;
    private List<NhanVien> nhanvienList;

    public NhanVienAdapter(MainActivityNV context, int layout, List<NhanVien> nhanvienList) {
        this.context = context;
        this.layout = layout;
        this.nhanvienList = nhanvienList;
    }

    @Override
    public int getCount() {
        return nhanvienList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public class ViewHolder {
        ImageButton imgButtonDelete, imgButtonUpdate;
        TextView txtMaNV, txtTenNV, txtTuoi, txtSdt,txtDiachi;
        ImageView imgAnh;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);

            holder.txtMaNV = (TextView) view.findViewById(R.id.textViewwIdd);
            holder.txtTenNV = (TextView) view.findViewById(R.id.textViewwTenNV);
            holder.txtTuoi = (TextView) view.findViewById(R.id.textViewwTuoi);
            holder.txtSdt = (TextView) view.findViewById(R.id.textViewwSdt);
            holder.txtDiachi = (TextView) view.findViewById(R.id.textViewwDiachi);
            holder.imgAnh = (ImageView) view.findViewById(R.id.imageViewAnhh);

            holder.imgButtonUpdate = (ImageButton) view.findViewById(R.id.ImagebuttonUpdate);
            holder.imgButtonDelete = (ImageButton) view.findViewById(R.id.ImagebuttonDelete);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();

        }
        NhanVien nhanVien = nhanvienList.get(i);
        holder.txtMaNV.setText("ID: " + nhanVien.getMaNV());
        holder.txtTenNV.setText("TEN: "+nhanVien.getTenNV());
        holder.txtTuoi.setText("TUOI: "+nhanVien.getTUOI());
        holder.txtSdt.setText("SDT:"+nhanVien.getSDT());
        holder.txtDiachi.setText("DC: "+nhanVien.getDIACHI());


        return view;
    }
}
