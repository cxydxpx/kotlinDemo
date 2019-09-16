package com.dofrom.android.kotlindemo.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.dofrom.android.kotlindemo.utils.Constant
import com.dofrom.android.kotlindemo.utils.Preference

/**
 * 作者 Y_MS
 * Created by ${APEN} on 2019-09-16.
 * GitHub：https://github.com/cxydxpx
 */
abstract class BaseActivity : AppCompatActivity(){

    protected var isLogin : Boolean by Preference(Constant.LOGIN_KEY,false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getResLayout())
        initView();
    }

    abstract fun getResLayout(): Int

    abstract fun initView()

}
