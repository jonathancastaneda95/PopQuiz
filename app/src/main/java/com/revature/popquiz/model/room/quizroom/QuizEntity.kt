package com.revature.popquiz.model.room.quizroom

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "quiz")
data class QuizEntity (
    @PrimaryKey(autoGenerate = true)
    var id:Int=0,
    @ColumnInfo(name = "title")
    var title: String ="",
    @ColumnInfo(name = "shortDescription")
    var shortDescription: String ="",
    @ColumnInfo(name = "longDescription")
    var longDescription: String ="",
    @ColumnInfo(name = "tags")
    var tags:String="",
    @ColumnInfo(name = "resources")
    var resources:String=""


)