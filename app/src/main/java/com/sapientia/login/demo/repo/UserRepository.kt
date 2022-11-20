package com.sapientia.login.demo.repo

import com.sapientia.login.demo.api.login.LoginRequest
import com.sapientia.login.demo.api.login.LoginResponse
import com.sapientia.login.demo.api.login.UserApi
import retrofit2.Response


class UserRepository {
    suspend fun loginUser(loginRequest: LoginRequest): Response<LoginResponse>? {
        return  UserApi.getApi()?.loginUser(loginRequest = loginRequest)
    }
}