package com.amazing.stamp.models

import android.net.Uri

data class FeedModel(
    val writer: String,
    val imageUris: ArrayList<Uri>,
    val content: String,
    val startTime: String,
    val endTime: String,
    val friends: ArrayList<String>,
    val createdAt: String,
    val place: String // GPS 기능 구현후에
)