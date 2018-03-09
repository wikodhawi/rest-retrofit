package restretrofit.bootcamp.com.restretrofit;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONObject;

import restretrofit.bootcamp.com.restretrofit.ModelService.Login.Login;
import restretrofit.bootcamp.com.restretrofit.RestUtil.APIClient;
import restretrofit.bootcamp.com.restretrofit.RestUtil.APIInterfacesRest;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    EditText txtUsername, txtPassword;
    Button btnLogin;
    CheckBox cbRemember;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsername=(EditText)findViewById(R.id.txtUsername);
        txtPassword=(EditText)findViewById(R.id.txtPassword);
        btnLogin=(Button)findViewById(R.id.btnLogin);
        cbRemember=(CheckBox)findViewById(R.id.cbRemember);

        txtUsername.setText("dewabrata");
        txtPassword.setText("1234567890");

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkLogin(txtUsername.getText().toString(),txtPassword.getText().toString());
            }
        });
    }


    APIInterfacesRest apiInterface;
    ProgressDialog progressDialog;
    private void checkLogin(String username, String password)
    {
        apiInterface = APIClient.getClient().create(APIInterfacesRest.class);
        progressDialog=new ProgressDialog(LoginActivity.this);
        progressDialog.setTitle("Loading");
        progressDialog.show();
        Call<Login> loginCall=apiInterface.getLogin(username, password);
        loginCall.enqueue(new Callback<Login>() {
            @Override
            public void onResponse(Call<Login> call, Response<Login> response) {
                progressDialog.dismiss();
                Login userList=response.body();
                if(userList!=null)
                {
                    if(!userList.getData().getUsername().equalsIgnoreCase(""))
                    {
                        Intent intent=new Intent(LoginActivity.this,MenuActivity.class);
                        startActivity(intent);
                    }
                }
                else
                {
                    try {
                        JSONObject jObjError=new JSONObject(response.errorBody().string());
                        Toast.makeText(LoginActivity.this, jObjError.getString("message"), Toast.LENGTH_LONG).show();
                    }
                    catch (Exception e)
                    {
                        Toast.makeText(LoginActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();

                    }

                }
            }

            @Override
            public void onFailure(Call<Login> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(getApplicationContext(), "Maaf koneksi bermasalah", Toast.LENGTH_LONG).show();
                call.cancel();
            }
        });
    }
}
