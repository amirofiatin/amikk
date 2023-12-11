package com.example.aplikasilaundry.model.response

import com.example.aplikasilaundry.model.nearby.ModelResults
import com.google.gson.annotations.SerializedName


class ModelResultNearby {

    @SerializedName("results")
    var modelResults: List<ModelResults>? = null
}