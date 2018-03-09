
package restretrofit.bootcamp.com.restretrofit.ModelService.Pegawai;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pegawai_ implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("nama")
    @Expose
    private String nama;
    @SerializedName("no_pegawai")
    @Expose
    private String noPegawai;
    @SerializedName("foto")
    @Expose
    private String foto;
    public final static Creator<Pegawai_> CREATOR = new Creator<Pegawai_>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Pegawai_ createFromParcel(Parcel in) {
            return new Pegawai_(in);
        }

        public Pegawai_[] newArray(int size) {
            return (new Pegawai_[size]);
        }

    }
    ;
    private final static long serialVersionUID = -1040351360030941061L;

    protected Pegawai_(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.nama = ((String) in.readValue((String.class.getClassLoader())));
        this.noPegawai = ((String) in.readValue((String.class.getClassLoader())));
        this.foto = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Pegawai_() {
    }

    /**
     * 
     * @param id
     * @param noPegawai
     * @param foto
     * @param nama
     */
    public Pegawai_(String id, String nama, String noPegawai, String foto) {
        super();
        this.id = id;
        this.nama = nama;
        this.noPegawai = noPegawai;
        this.foto = foto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Pegawai_ withId(String id) {
        this.id = id;
        return this;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Pegawai_ withNama(String nama) {
        this.nama = nama;
        return this;
    }

    public String getNoPegawai() {
        return noPegawai;
    }

    public void setNoPegawai(String noPegawai) {
        this.noPegawai = noPegawai;
    }

    public Pegawai_ withNoPegawai(String noPegawai) {
        this.noPegawai = noPegawai;
        return this;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Pegawai_ withFoto(String foto) {
        this.foto = foto;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(nama);
        dest.writeValue(noPegawai);
        dest.writeValue(foto);
    }

    public int describeContents() {
        return  0;
    }

}
