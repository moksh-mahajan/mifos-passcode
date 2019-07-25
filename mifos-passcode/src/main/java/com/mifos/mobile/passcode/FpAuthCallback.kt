package com.mifos.mobile.passcode

interface FpAuthCallback {
    fun onFpAuthSuccess()
    fun onFpAuthFailed(errorMessage: String)
    fun onCancel()
}