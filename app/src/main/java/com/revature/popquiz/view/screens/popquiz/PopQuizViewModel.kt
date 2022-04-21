package com.revature.popquiz.view.screens.popquiz

import android.app.NotificationChannel
import android.app.NotificationManager.IMPORTANCE_HIGH
import android.content.Context
import android.os.Build
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.revature.popquiz.model.PopQuizRepository
import kotlinx.coroutines.launch

//Ryan wants a foreground service

class PopQuizViewModel: ViewModel() {

    private val popQuizRepository = PopQuizRepository
    init {
        viewModelScope.launch {
            popQuizRepository.getTopic()
        }
    }

    private fun createNotificationChannel(context: Context) {

        //Create the NotificationChannel
        //This is only available in SDK Version 26+
        /**
         * Higher notification importance: shows everywhere, makes noise and peeks. May use full screen intents.
         */

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val notificationChannel = "NotificationChannelName"
            val descriptionText = "NotificationChannelDescriptionText"
            val importance = IMPORTANCE_HIGH
            val channel = NotificationChannel("CHANNEL_ID", notificationChannel, importance).apply {
                description = descriptionText
            }
            //Register the channel
        }

    }
}