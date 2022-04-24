package com.example.webservice_nangcao;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HangAdapter extends BaseAdapter {

    private MainActivityHang context;
    private int layout;
    private List<Hang> hangList;

    public HangAdapter(MainActivityHang context, int layout, List<Hang> hangList) {
        this.context = context;
        this.layout = layout;
        this.hangList = hangList;
    }

    @Override
    public int getCount() {
        return hangList.size();
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
        TextView txtMahang, txtTenhang, txtNamsx, txtSoluong,txtLoai;
        ImageView imgAnh;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);

            holder.txtMahang = (TextView) view.findViewById(R.id.textViewwId);
            holder.txtTenhang = (TextView) view.findViewById(R.id.textViewwTenhang);
            holder.txtNamsx = (TextView) view.findViewById(R.id.textViewwNamsx);
            holder.txtSoluong = (TextView) view.findViewById(R.id.textViewwSoluong);
            holder.txtLoai = (TextView) view.findViewById(R.id.textViewwLoai);
            holder.imgAnh = (ImageView) view.findViewById(R.id.imageViewAnhh);

            holder.imgButtonUpdate = (ImageButton) view.findViewById(R.id.ImagebuttonUpdate);
            holder.imgButtonDelete = (ImageButton) view.findViewById(R.id.ImagebuttonDelete);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();

        }
        Hang hang = hangList.get(i);
        holder.txtMahang.setText("ID: " + hang.getMaHang());
        holder.txtTenhang.setText("TEN: "+hang.getTenHang());
        holder.txtNamsx.setText("NAMSX: "+hang.getNamSanXuat());
        holder.txtSoluong.setText("Sl: "+hang.getSoluong());
        holder.txtLoai.setText("LOAI: "+hang.getLoai());

        holder.imgButtonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, UpdateActivity.class);
                intent.putExtra("dataNhanVien", hang);
                context.startActivity(intent);
            }
        });
//        holder.imgButtonDelete.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                delete(hang.getTenHang(), hang.getMaHang());
//            }
//        });

        return view;
    }

//    private void delete(String name, int manv) {
//        AlertDialog.Builder builder = new AlertDialog.Builder(context);
//        builder.setMessage("Ban co muon xoa sinh vien " + name + " khong?");
//        builder.setPositiveButton("Co", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                context.deleteNhanVien(manv);
//            }
//        });
//        builder.setNegativeButton("Khong", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//
//            }
//        });
//        builder.show();
//    }
}
