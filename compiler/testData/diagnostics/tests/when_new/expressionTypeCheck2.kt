// FIR_IDENTICAL
// RUN_PIPELINE_TILL:BACKEND
fun expressionTypeCheckTest() {
    val values: Array<Any> = arrayOf(1, "Something", 2)
    val test: Array<String> = Array<String>(3) { i: Int -> "" }
    for (i in 0..2) {
        test[i] = when (values[i]) {
            is String -> "String"
            is Int -> "Integer"
            else -> "Not a string or integer"
        }
    }
}

/* GENERATED_FIR_TAGS: forLoop, functionDeclaration, isExpression, localProperty, propertyDeclaration, smartcast,
stringLiteral, whenExpression, whenWithSubject */
