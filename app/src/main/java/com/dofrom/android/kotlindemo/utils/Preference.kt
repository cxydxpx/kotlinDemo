package com.dofrom.android.kotlindemo.utils

import android.content.Context
import android.content.SharedPreferences
import com.dofrom.android.kotlindemo.App
import kotlin.reflect.KProperty

/**
 * 作者 Y_MS
 * Created by ${APEN} on 2019-09-16.
 * GitHub：https://github.com/cxydxpx
 */
class Preference<T>(val name: String, private val default: T) {

    companion object {
        private val name = "kotlin_demo"

        private val mPreference: SharedPreferences by lazy {
            App.context.getSharedPreferences(name, Context.MODE_PRIVATE)
        }

    }

    operator fun getValue(thisRef: Any, property: KProperty<*>): T {
        return getSharedPreferences(name, default)
    }

    private fun getSharedPreferences(name: String, default: T): T = with(mPreference) {
        val res: Any = when (default) {
            is Long -> getLong(name, default)
            is String -> getString(name, default)
            is Int -> getInt(name, default)
            is Boolean -> getBoolean(name, default)
            is Float -> getFloat(name, default)
            else -> {
            }
        }
        return res as T
    }

    operator fun setValue(thisRef: Any, property: KProperty<*>, value: T) {
        putSharedPreferences(name, value)
    }

    private fun putSharedPreferences(name: String, value: T) = with(mPreference.edit()) {
        when (value) {
            is Long -> putLong(name, value)
            is String -> putString(name, value)
            is Int -> putInt(name, value)
            is Boolean -> putBoolean(name, value)
            is Float -> putFloat(name, value)
            else -> putString(name, "")
        }.apply()
    }

}