package com.zoomcar.zcnetwork.listeners

import com.zoomcar.zcnetwork.error.JavaServiceNetworkError
import com.zoomcar.zcnetwork.error.NetworkError

/*
  * @created 07/01/2020 - 12:20 PM
  * @project ZC-Network-Client
  * @author Paras
*/
interface ZcNetworkAnalyticsListener {
    fun responseTimeEvent(timeDiff: Long, status: String, requestCode: Int, requestTag: String?)
    fun failureEvent(error: NetworkError)
    fun javaServiceFailureEvent(error: JavaServiceNetworkError)
}