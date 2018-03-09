
package restretrofit.bootcamp.com.restretrofit.ModelService.Login;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("pass")
    @Expose
    private String pass;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("avatar")
    @Expose
    private String avatar;
    @SerializedName("banned")
    @Expose
    private String banned;
    @SerializedName("last_login")
    @Expose
    private String lastLogin;
    @SerializedName("last_activity")
    @Expose
    private String lastActivity;
    @SerializedName("date_created")
    @Expose
    private String dateCreated;
    @SerializedName("forgot_exp")
    @Expose
    private Object forgotExp;
    @SerializedName("remember_time")
    @Expose
    private Object rememberTime;
    @SerializedName("remember_exp")
    @Expose
    private Object rememberExp;
    @SerializedName("verification_code")
    @Expose
    private Object verificationCode;
    @SerializedName("top_secret")
    @Expose
    private Object topSecret;
    @SerializedName("ip_address")
    @Expose
    private String ipAddress;
    public final static Creator<Data> CREATOR = new Creator<Data>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        public Data[] newArray(int size) {
            return (new Data[size]);
        }

    }
    ;
    private final static long serialVersionUID = -7174714870728949542L;

    protected Data(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.email = ((String) in.readValue((String.class.getClassLoader())));
        this.pass = ((String) in.readValue((String.class.getClassLoader())));
        this.username = ((String) in.readValue((String.class.getClassLoader())));
        this.fullName = ((String) in.readValue((String.class.getClassLoader())));
        this.avatar = ((String) in.readValue((String.class.getClassLoader())));
        this.banned = ((String) in.readValue((String.class.getClassLoader())));
        this.lastLogin = ((String) in.readValue((String.class.getClassLoader())));
        this.lastActivity = ((String) in.readValue((String.class.getClassLoader())));
        this.dateCreated = ((String) in.readValue((String.class.getClassLoader())));
        this.forgotExp = ((Object) in.readValue((Object.class.getClassLoader())));
        this.rememberTime = ((Object) in.readValue((Object.class.getClassLoader())));
        this.rememberExp = ((Object) in.readValue((Object.class.getClassLoader())));
        this.verificationCode = ((Object) in.readValue((Object.class.getClassLoader())));
        this.topSecret = ((Object) in.readValue((Object.class.getClassLoader())));
        this.ipAddress = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data() {
    }

    /**
     * 
     * @param topSecret
     * @param rememberExp
     * @param avatar
     * @param banned
     * @param rememberTime
     * @param pass
     * @param id
     * @param username
     * @param lastLogin
     * @param lastActivity
     * @param email
     * @param verificationCode
     * @param dateCreated
     * @param fullName
     * @param forgotExp
     * @param ipAddress
     */
    public Data(String id, String email, String pass, String username, String fullName, String avatar, String banned, String lastLogin, String lastActivity, String dateCreated, Object forgotExp, Object rememberTime, Object rememberExp, Object verificationCode, Object topSecret, String ipAddress) {
        super();
        this.id = id;
        this.email = email;
        this.pass = pass;
        this.username = username;
        this.fullName = fullName;
        this.avatar = avatar;
        this.banned = banned;
        this.lastLogin = lastLogin;
        this.lastActivity = lastActivity;
        this.dateCreated = dateCreated;
        this.forgotExp = forgotExp;
        this.rememberTime = rememberTime;
        this.rememberExp = rememberExp;
        this.verificationCode = verificationCode;
        this.topSecret = topSecret;
        this.ipAddress = ipAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Data withId(String id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Data withEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Data withPass(String pass) {
        this.pass = pass;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Data withUsername(String username) {
        this.username = username;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Data withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Data withAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public String getBanned() {
        return banned;
    }

    public void setBanned(String banned) {
        this.banned = banned;
    }

    public Data withBanned(String banned) {
        this.banned = banned;
        return this;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Data withLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
        return this;
    }

    public String getLastActivity() {
        return lastActivity;
    }

    public void setLastActivity(String lastActivity) {
        this.lastActivity = lastActivity;
    }

    public Data withLastActivity(String lastActivity) {
        this.lastActivity = lastActivity;
        return this;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Data withDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    public Object getForgotExp() {
        return forgotExp;
    }

    public void setForgotExp(Object forgotExp) {
        this.forgotExp = forgotExp;
    }

    public Data withForgotExp(Object forgotExp) {
        this.forgotExp = forgotExp;
        return this;
    }

    public Object getRememberTime() {
        return rememberTime;
    }

    public void setRememberTime(Object rememberTime) {
        this.rememberTime = rememberTime;
    }

    public Data withRememberTime(Object rememberTime) {
        this.rememberTime = rememberTime;
        return this;
    }

    public Object getRememberExp() {
        return rememberExp;
    }

    public void setRememberExp(Object rememberExp) {
        this.rememberExp = rememberExp;
    }

    public Data withRememberExp(Object rememberExp) {
        this.rememberExp = rememberExp;
        return this;
    }

    public Object getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(Object verificationCode) {
        this.verificationCode = verificationCode;
    }

    public Data withVerificationCode(Object verificationCode) {
        this.verificationCode = verificationCode;
        return this;
    }

    public Object getTopSecret() {
        return topSecret;
    }

    public void setTopSecret(Object topSecret) {
        this.topSecret = topSecret;
    }

    public Data withTopSecret(Object topSecret) {
        this.topSecret = topSecret;
        return this;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Data withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(email);
        dest.writeValue(pass);
        dest.writeValue(username);
        dest.writeValue(fullName);
        dest.writeValue(avatar);
        dest.writeValue(banned);
        dest.writeValue(lastLogin);
        dest.writeValue(lastActivity);
        dest.writeValue(dateCreated);
        dest.writeValue(forgotExp);
        dest.writeValue(rememberTime);
        dest.writeValue(rememberExp);
        dest.writeValue(verificationCode);
        dest.writeValue(topSecret);
        dest.writeValue(ipAddress);
    }

    public int describeContents() {
        return  0;
    }

}
