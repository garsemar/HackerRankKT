package daysOfCode

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    arr.reverse()

    for(i in arr.indices){
        if(i == 0){
            print(arr[i])
        }
        else{
            print(" ${arr[i]}")
        }
    }
}
