package restretrofit.bootcamp.com.restretrofit;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import org.json.JSONObject;

import java.util.List;

import restretrofit.bootcamp.com.restretrofit.ModelService.Login.Login;
import restretrofit.bootcamp.com.restretrofit.ModelService.Pegawai.Pegawai;
import restretrofit.bootcamp.com.restretrofit.ModelService.Pegawai.Pegawai_;
import restretrofit.bootcamp.com.restretrofit.RestUtil.APIClient;
import restretrofit.bootcamp.com.restretrofit.RestUtil.APIInterfacesRest;
import restretrofit.bootcamp.com.restretrofit.adapter.ListOrderAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MenuActivity extends AppCompatActivity {

    Button btnTambah;
    ListView listPegawai;
    List<Pegawai_> listData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnTambah=(Button) findViewById(R.id.btnTambahPegawai);
        listPegawai=(ListView) findViewById(R.id.listPegawai);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity.this,AddPegawai.class);
                startActivity(intent);
            }
        });

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this).build();
        com.nostra13.universalimageloader.core.ImageLoader.getInstance().init(config);
        getData();

//        listPegawai.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//
//                Intent intent = new Intent(MenuActivity.this, AddPegawai.class);
//                intent.putExtra("data", (Parcelable)lstData.get(i));
//
//
//                startActivity(intent);
//
//            }
//        });
        listPegawai.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MenuActivity.this, AddPegawai.class);
                intent.putExtra("data", (Parcelable)listData.get(i));


                startActivity(intent);
            }
        });
    }



    APIInterfacesRest apiInterface;
    ProgressDialog progressDialog;
    private void getData() {
        apiInterface = APIClient.getClient().create(APIInterfacesRest.class);
        progressDialog = new ProgressDialog(MenuActivity.this);
        progressDialog.setTitle("Loading");
        progressDialog.show();
        Call<Pegawai> loginCall = apiInterface.getListPegawai("", "", "", "100");
        loginCall.enqueue(new Callback<Pegawai>() {
            @Override
            public void onResponse(Call<Pegawai> call, Response<Pegawai> response) {
                progressDialog.dismiss();
                Pegawai userList = response.body();
                if (userList != null) {
                    if (userList.getData().getPegawai().size() > 0) {
                        listData=userList.getData().getPegawai();
                        ListOrderAdapter adapter = new ListOrderAdapter(MenuActivity.this, 0, userList.getData().getPegawai());
                        listPegawai.setAdapter(adapter);
                    }


                }

            }

            @Override
            public void onFailure(Call<Pegawai> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(getApplicationContext(), "Maaf koneksi bermasalah", Toast.LENGTH_LONG).show();
                call.cancel();
            }
        });
    }


}
