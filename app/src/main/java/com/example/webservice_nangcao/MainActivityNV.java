package com.example.webservice_nangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivityNV extends AppCompatActivity {
    String urlJson = "http://lenhutran1807-001-site1.htempurl.com/jsonnhanvien.php";
    String urlDelete = "http://lenhutran1807-001-site1.htempurl.com/delete.php";

    ListView lvNhanvien;
    ArrayList<NhanVien> listNhanvien;
    NhanVienAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_nv);

        lvNhanvien = findViewById(R.id.listviewNhanvien);
        listNhanvien = new ArrayList<>();

        adapter = new NhanVienAdapter(MainActivityNV.this,R.layout.dong_nhan_vien,listNhanvien);
        lvNhanvien.setAdapter(adapter);
        GetData(urlJson);


    }
    private void GetData(String url) {
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.POST, url, null,
                new Response.Listener<JSONArray>() {

                    @Override
                    public void onResponse(JSONArray response) {
                        listNhanvien.clear();
                        for (int i = 0;i < response.length();i++){
                            try {
                                JSONObject object = response.getJSONObject(i);
                                listNhanvien.add(new NhanVien(
                                        object.getInt("Id"),
                                        object.getString("Ten"),
                                        object.getInt("Tuoi"),
                                        object.getInt("Sdt"),
                                        object.getString("Diachi")
                                ));

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                        adapter.notifyDataSetChanged();
                    }

                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivityNV.this, "Lỗi!", Toast.LENGTH_SHORT).show();
                    }
                }

        );
        requestQueue.add(jsonArrayRequest);

    }
}