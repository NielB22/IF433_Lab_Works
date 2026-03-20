package oop_00000113459_MuhammadDanielAzmi.week7

enum class AppState {
    STARTING,
    RUNNING,
    STOPPED;
}

sealed class ApiResponse {
    data class Success(val data: AppState) : ApiResponse()
    data class Error(val message: String) : ApiResponse()
    object Loading : ApiResponse()
}