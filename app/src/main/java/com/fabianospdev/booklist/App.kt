package com.fabianospdev.booklist

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.fabianospdev.booklist.manager.DatabaseManager
import com.fabianospdev.booklist.model.AppState

import com.fabianospdev.booklist.ui.main.MainActivity


class App: Application() {

    companion object {
        private val instance: App? = null
        val mainActivity: MainActivity? = null
        val databaseManager: DatabaseManager? = null
        val state: AppState? = AppState()
        var PREFS_NAME: String = "SharedPreferences"
        var prefs: SharedPreferences? = null
    }

    override fun onCreate() {
        super.onCreate()

        val context = applicationContext
        prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }
}