package com.revature.popquiz.model.api.services

import com.revature.popquiz.model.api.services.popquiz.RequestPopQuiz
import com.revature.popquiz.model.api.services.popquiz.ResponsePopQuiz
import com.revature.popquiz.model.api.services.quiz.RequestAllQuizzes
import com.revature.popquiz.model.api.services.quiz.ResponseAllQuizzes
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Service interface containing all service calls for the PopQuiz Api
 */
interface QuizApiService {

    /**
     * Retrieves all quizzes from the server
     */
    @POST("allquizzes")
    suspend fun getQuizzes(@Body RequestAllQuizzes: RequestAllQuizzes): ResponseAllQuizzes

    //Retrieves Pop Quiz from the server
    @POST("popquiz")
    suspend fun getPopQuiz(@Body RequestPopQuiz: RequestPopQuiz): ResponsePopQuiz
}