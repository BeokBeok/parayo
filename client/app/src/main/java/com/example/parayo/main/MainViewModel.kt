package com.example.parayo.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.parayo.R
import com.example.parayo.base.BaseViewModel
import com.example.parayo.domain.ParayoRemoteRepository
import com.example.parayo.domain.entity.ParayoSignUpRequest
import com.example.parayo.util.Result
import com.example.parayo.util.succeeded
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(
    private val parayoRemoteRepository: ParayoRemoteRepository
) : BaseViewModel() {

    val email = MutableLiveData("")
    val name = MutableLiveData("")
    val password = MutableLiveData("")

    private val _hello = MutableLiveData<String>()
    val hello: LiveData<String> get() = _hello

    private val _successLogin = MutableLiveData<Boolean>()
    val successLogin: LiveData<Boolean> get() = _successLogin

    fun getHello() = viewModelScope.launch {
        _hello.value = parayoRemoteRepository.getHello().data as? String ?: ""
    }

    fun doSignUp() = viewModelScope.launch {
        val signUpData = ParayoSignUpRequest(
            email = email.value,
            name = name.value,
            password = password.value
        )

        if (checkValidData(signUpData)) return@launch

        parayoRemoteRepository.doSignUp(signUpData).let {
            if (it.succeeded) {
                _successLogin.value = it.succeeded
            } else {
                _throwable.value = (it as Result.Failure).exception
            }
        }
    }

    private fun checkValidData(signUpRequest: ParayoSignUpRequest): Boolean =
        when {
            signUpRequest.isNotValidEmail() -> {
                _throwable.value = IllegalStateException(R.string.msg_err_invalid_email.toString())
                true
            }
            signUpRequest.isNotValidPassword() -> {
                _throwable.value =
                    IllegalStateException(R.string.msg_err_invalid_password.toString())
                true
            }
            signUpRequest.isNotValidName() -> {
                _throwable.value = IllegalStateException(R.string.msg_err_invalid_name.toString())
                true
            }
            else -> false
        }
}