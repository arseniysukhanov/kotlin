fun box():String{
    val value=2
    val test = when(value) {
        1 -> "Fail"
        2 -> "OK"
        3 ->  "Fail"
        else -> "Fail"
    }
    return test
}