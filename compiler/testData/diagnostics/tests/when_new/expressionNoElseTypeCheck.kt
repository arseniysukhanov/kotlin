// FIR_IDENTICAL
// RUN_PIPELINE_TILL:FRONTEND
fun expressionTypeCheckTest() {
    val values: Array<Any> = arrayOf(1, "Something", 2)
    val test: Array<String> = Array<String>(3) { i: Int -> "" }
    for (i in 0..2) {
        test[i] = <!NO_ELSE_IN_WHEN!>when<!> (values[i]) {
            is String -> "String"
            !is String -> "Not a string"
        }
    }
}

/* GENERATED_FIR_TAGS: assignment, forLoop, functionDeclaration, integerLiteral, isExpression, lambdaLiteral,
localProperty, propertyDeclaration, rangeExpression, smartcast, stringLiteral, whenExpression, whenWithSubject */
