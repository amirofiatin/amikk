package com.example.aplikasilaundry.model.nearby

import Model.nearby.ModelLocation
import com.google.gson.annotations.SerializedName


class ModelGeometry {
    @SerializedName("location")
    var modelLocation: ModelLocation? = null
}