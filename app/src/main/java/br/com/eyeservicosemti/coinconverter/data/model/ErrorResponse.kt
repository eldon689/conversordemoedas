package br.com.eyeservicosemti.coinconverter.data.model

data class ErrorResponse (
    val status: Long,
    val code: String,
    val message: String
)
