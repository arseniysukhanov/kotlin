//RUN_PIPELINE_TILL: FRONTEND

fun testExpressionWithRange(value: Int) {
    val chars = 'a'..'c'
    val test = when (<!TYPE_MISMATCH!>value<!>) {
        in 1..10 -> "0<value<11"
        <!TYPE_MISMATCH_IN_RANGE!>in<!> chars -> "Error"
        !in 21..30 -> "value<1 or value>30"
        else -> "20<value<31"
    }
}

/* GENERATED_FIR_TAGS: functionDeclaration, integerLiteral, localProperty, propertyDeclaration, rangeExpression,
stringLiteral, whenExpression, whenWithSubject */
