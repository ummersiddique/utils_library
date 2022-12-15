package com.example.utils_library

object TestUtils {

    private external fun checkfopen(filepath: String): Boolean
    private external fun runsu(command: String): Boolean
    private external fun statfile(filepath: String): Boolean
    private external fun runls(filepath: String, filename: String, exactMatch: Boolean): Boolean
    private external fun runpmlist(packageName: String, exactMatch: Boolean): Boolean
    private external fun checkifstream(filepath: String): Boolean

    init {
        System.loadLibrary("native2.cpp")
    }

    fun testUtilsMethod() {

    }

    fun anotherTestMethod() {

    }
}