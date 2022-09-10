package com.example.prackakao

import android.app.Application
import com.kakao.sdk.common.KakaoSdk

class GlobalApplication : Application(){
    override fun onCreate() {
        super.onCreate()

        KakaoSdk.init(this, "aeea8b502853ea59a20224f1be60ec84")
    }
}