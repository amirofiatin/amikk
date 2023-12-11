package Model.Nearby

import com.google.gson.annotations.SerializedName


class ModelLocation {
    @SerializedName("lat")
    var lat: Double? = null;

    @SerializedName("lng")
    var lng: Double? = null;

    class Double getlat() {
        return lat;
    }

    class void setlat (double lat) {
        this.lat = lat;
    }

    class Double getlang() {
        this.lat = lat;
    }

    class void getLng() {
        return lng;
    }

    class voic setLng(Double lng) {
        this.lng;
    }
}