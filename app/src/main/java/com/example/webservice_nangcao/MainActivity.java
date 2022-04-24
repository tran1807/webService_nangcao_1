package com.example.webservice_nangcao;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    ImageButton imgbuttonHang, imgbuttonNhanvien, imgbuttonQuaylai, imgbuttonTrogiup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();
    }

    private void Anhxa() {
        imgbuttonHang = (ImageButton) findViewById(R.id.imageButtonHang);
        imgbuttonNhanvien = (ImageButton) findViewById(R.id.imageButtonNhanvien);
        imgbuttonQuaylai = (ImageButton) findViewById(R.id.imageButtonQuaylai);
        imgbuttonTrogiup = (ImageButton) findViewById(R.id.imageButtonTrogiup);


        imgbuttonHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivityHang.class);
                startActivity(intent);
            }
        });
        imgbuttonNhanvien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivityNV.class);
                startActivity(intent);
            }
        });
        imgbuttonQuaylai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Login.class);
                startActivity(intent);
            }
        });
    }




//public void deleteNhanVien(int idNhanVien){
//    RequestQueue requestQueue = Volley.newRequestQueue(this);
//    StringRequest request = new StringRequest(Request.Method.POST, urlDelete,
//            new Response.Listener<String>() {
//                @Override
//                public void onResponse(String response) {
//                    if (response.trim().equals("delete data successful")){
//                        Toast.makeText(MainActivity.this, "Xóa thành công", Toast.LENGTH_SHORT).show();
//                        GetData(urlJson);
//                    } else
//                        Toast.makeText(MainActivity.this, "Xóa không thành công", Toast.LENGTH_SHORT).show();
//                }
//            },
//            new Response.ErrorListener() {
//                @Override
//                public void onErrorResponse(VolleyError error) {
//                    Toast.makeText(MainActivity.this, "Xảy ra lỗi!!!", Toast.LENGTH_SHORT).show();
//                }
//            }
//    ){
//        @Nullable
//        @Override
//        protected Map<String, String> getParams() throws AuthFailureError {
//            Map<String, String> params = new HashMap<>();
//            params.put("MaNV", String.valueOf(idNhanVien));
//            return  params;
//        }
//    };
//    requestQueue.add(request);
//}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.them_nhanvien,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        startActivity(new Intent(MainActivity.this,InsertActivity.class));
        return super.onOptionsItemSelected(item);
    }
}
