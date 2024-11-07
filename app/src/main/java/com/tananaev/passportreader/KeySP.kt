package com.tananaev.passportreader

import java.io.Serializable
import java.security.spec.KeySpec


interface KeySP : Serializable, KeySpec {
    val key: ByteArray?
}