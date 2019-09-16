package com.dofrom.android.kotlindemo.activity

import android.content.Intent
import com.dofrom.android.kotlindemo.MainActivity
import com.dofrom.android.kotlindemo.R
import com.dofrom.android.kotlindemo.base.BaseActivity
import kotlinx.android.synthetic.main.activity_splash.*

/**
 * 作者 Y_MS
 * Created by ${APEN} on 2019-09-16.
 * GitHub：https://github.com/cxydxpx
 */
class SplashActivity : BaseActivity() {
    override fun getResLayout(): Int {
        return R.layout.activity_splash
    }

    override fun initView() {
//        tv_content.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(v: View?) {
//                Intent(this@SplashActivity, MainActivity::class.java).run {
//                    startActivity(this)
//                }
//            }
//        })

        tv_content.setOnClickListener {
            Intent(this@SplashActivity, MainActivity::class.java).run {
                startActivity(this)
            }
        }

    }
}