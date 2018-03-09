package restretrofit.bootcamp.com.restretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import restretrofit.bootcamp.com.restretrofit.ModelService.Pegawai.Pegawai_;
import restretrofit.bootcamp.com.restretrofit.RestUtil.ImageUtil;

public class AddPegawai extends AppCompatActivity {

    Button btnTambah, btnCapture;
    ListView listPegawai;
    EditText txtNama,txtNoPegawai;
    ImageView imageCamera;

    Pegawai_ data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_pegawai);


        data = getIntent().getParcelableExtra("data");

        btnTambah=(Button) findViewById(R.id.btnSimpan);
        txtNama=(EditText)findViewById(R.id.txtNama);
        txtNoPegawai=(EditText)findViewById(R.id.txtNoPegawai);
        imageCamera=(ImageView)findViewById(R.id.imgCamera);
        btnCapture=(Button)findViewById(R.id.btnCapture);

        if(data!=null) {
            txtNama.setText(data.getNama());
            txtNoPegawai.setText(data.getNoPegawai());
            ImageUtil.displayImage(imageCamera,data.getFoto(),null);
        }

    }
}
