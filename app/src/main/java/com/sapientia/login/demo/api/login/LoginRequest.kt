package com.sapientia.login.demo.api.login

import com.google.gson.annotations.SerializedName


data class LoginRequest(
    @SerializedName("email")
    var email: String,
    @SerializedName("passwordKey")
    var password: String
)