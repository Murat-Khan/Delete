package com.murat.helloapp

import java.io.Serializable

data class UserData(
    var userName : String,
    var avatar : String
) : Serializable
