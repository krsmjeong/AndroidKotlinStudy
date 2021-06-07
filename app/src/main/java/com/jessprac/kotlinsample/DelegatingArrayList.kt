package com.jessprac.kotlinsample

class DelegatingArrayList<T>(val innerList: MutableCollection<T> = mutableListOf()) : MutableCollection<T> by innerList