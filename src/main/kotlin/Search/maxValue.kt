package Search

import java.util.Arrays

fun main() {
    var arr = IntArray(100,{(1..500).random()})
    println(Arrays.toString(arr))

    var max = arr[1]

    for (i in arr) {
        if (i> max){
            max = i;
        }
    }

    println(max)
}