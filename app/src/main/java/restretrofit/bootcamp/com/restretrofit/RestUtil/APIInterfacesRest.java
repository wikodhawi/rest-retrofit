package restretrofit.bootcamp.com.restretrofit.RestUtil;

/**
 * Created by user on 1/10/2018.
 */



//import imarketing.com.imarketing.ModelService.Elektronik.Elektronik;
//import imarketing.com.imarketing.ModelService.InfoKamm.InfoKamm;
//import imarketing.com.imarketing.ModelService.MotorBekas.MotorBekas;
//import imarketing.com.imarketing.ModelService.TukarPoint.TukarPoint;
import restretrofit.bootcamp.com.restretrofit.ModelService.Login.Login;
import restretrofit.bootcamp.com.restretrofit.ModelService.Pegawai.Pegawai;
import restretrofit.bootcamp.com.restretrofit.ModelService.Pegawai.Pegawai_;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by anupamchugh on 09/01/17.
 */

public interface APIInterfacesRest {
   @FormUrlEncoded
   @POST("api/user/login")
   Call<Login> getLogin(@Field("username") String username, @Field("password") String password);

   @GET("api/pegawai/all")
   Call<Pegawai> getListPegawai(@Query("filter") String filter, @Query("field") String field,@Query("start") String start , @Query("limit") String limit);

/*
@GET("api/tbl_tukar_point/all")
Call<TukarPoint> getTukarPoint(@Query("filter") String filter, @Query("field") String field, @Query("start") String start, @Query("limit") String limit);

@GET("api/tbl_motor_bekas/all")
Call<MotorBekas> getMotorBekas(@Query("filter") String filter, @Query("field") String field, @Query("start") String start, @Query("limit") String limit);

@GET("api/tbl_elektronik/all")
Call<Elektronik> getElektronik(@Query("filter") String filter, @Query("field") String field, @Query("start") String start, @Query("limit") String limit);

@GET("api/tbl_info_kamm/all")
 Call<InfoKamm> getInfoKamm(@Query("filter") String filter, @Query("field") String field, @Query("start") String start, @Query("limit") String limit);
*/


}

