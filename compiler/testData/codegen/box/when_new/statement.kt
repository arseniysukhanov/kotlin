fun box():String{
    val test=2
    when(test) {
        1 -> return "Fail"
        2 -> return "OK"
        3 -> return "Fail"
        else -> return "Fail"
    }
}