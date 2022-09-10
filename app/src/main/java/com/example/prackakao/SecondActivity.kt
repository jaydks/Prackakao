package com.example.prackakao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prackakao.databinding.ActivitySecondBinding
import com.kakao.sdk.user.UserApiClient

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        UserApiClient.instance.me { user, error ->
            binding.nickname.text = "닉네임: ${user?.kakaoAccount?.profile?.nickname}"
        }
    }
}