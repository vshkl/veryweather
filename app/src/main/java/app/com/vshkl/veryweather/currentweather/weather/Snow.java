
package app.com.vshkl.veryweather.currentweather.weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Snow {

    @SerializedName("3h")
    @Expose
    private int _3h;

    /**
     * @return The _3h
     */
    public int get3h() {
        return _3h;
    }

    /**
     * @param _3h The 3h
     */
    public void set3h(int _3h) {
        this._3h = _3h;
    }

}