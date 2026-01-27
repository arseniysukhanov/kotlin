fun box():String{
    val value=2
    val test = when {
        value == 1 -> "Fail"
        value == 2 -> "OK"
        value > 1 ->  "Fail"
        else -> "Fail"
    }
    return test
}