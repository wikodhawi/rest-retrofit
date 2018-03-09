
package restretrofit.bootcamp.com.restretrofit.ModelService.Login;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Login implements Serializable, Parcelable
{

    @SerializedName("status")
    @Expose
    private boolean status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("token")
    @Expose
    private String token;
    public final static Creator<Login> CREATOR = new Creator<Login>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Login createFromParcel(Parcel in) {
            return new Login(in);
        }

        public Login[] newArray(int size) {
            return (new Login[size]);
        }

    }
    ;
    private final static long serialVersionUID = 2482174497073403376L;

    protected Login(Parcel in) {
        this.status = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.message = ((String) in.readValue((String.class.getClassLoader())));
        this.data = ((Data) in.readValue((Data.class.getClassLoader())));
        this.token = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Login() {
    }

    /**
     * 
     * @param message
     * @param token
     * @param status
     * @param data
     */
    public Login(boolean status, String message, Data data, String token) {
        super();
        this.status = status;
        this.message = message;
        this.data = data;
        this.token = token;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Login withStatus(boolean status) {
        this.status = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Login withMessage(String message) {
        this.message = message;
        return this;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Login withData(Data data) {
        this.data = data;
        return this;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Login withToken(String token) {
        this.token = token;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(status);
        dest.writeValue(message);
        dest.writeValue(data);
        dest.writeValue(token);
    }

    public int describeContents() {
        return  0;
    }

}
