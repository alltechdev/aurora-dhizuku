package com.aurora.store.util

import android.content.Context
import android.content.RestrictionsManager
import androidx.core.content.getSystemService

object ManagedConfigurations {

    const val HIDE_APP_DETAILS_SCREENSHOTS = "managed_hide_app_details_screenshots"

    fun getBoolean(context: Context, key: String, default: Boolean = false): Boolean {
        val restrictionsManager = context.getSystemService<RestrictionsManager>() ?: return default
        val restrictions = restrictionsManager.applicationRestrictions ?: return default
        return restrictions.getBoolean(key, default)
    }
}
