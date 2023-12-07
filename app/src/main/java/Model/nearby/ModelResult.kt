package com.example.aplikasilaundry.model.nearby

import com.example.aplikasilaundry.model.nearby.ModelGeometry
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class ModelResults : Serializable {
    @SerializedName("geometry")
    var modelGeometry: ModelGeometry? = null

    @SerializedName("name")
    var name: String? = null

    @SerializedName("vicinity")
    var vicinity: String? = null

    @SerializedName("place_id")
    var placeId: String? = null

    @SerializedName("rating")
    var rating = 0.0
}