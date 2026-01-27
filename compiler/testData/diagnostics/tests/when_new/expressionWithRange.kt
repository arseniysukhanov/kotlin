// FIR_IDENTICAL
//RUN_PIPELINE_TILL: BACKEND

fun testExpressionWithRange(value:Int) {
    val test = when (value) {
        in 1..10 -> "0<value<11"
        in 11..20 -> "10<value<21"
        !in 21..30 -> "value<1 or value>30"
        else -> "20<value<31"
    }
}
/* GENERATED_FIR_TAGS: functionDeclaration, integerLiteral, propertyDeclaration, rangeExpression, stringLiteral,
whenExpression, whenWithSubject */
