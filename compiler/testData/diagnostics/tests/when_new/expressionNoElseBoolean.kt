// FIR_IDENTICAL
// RUN_PIPELINE_TILL: BACKEND
fun whenBoolCheck(flag: Boolean): String {
    return when (flag) {
        true -> "True"
        false -> "False"
    }
}

fun testExpressionBoolean() {
    val flag = true
    val test = whenBoolCheck(flag)
}

/* GENERATED_FIR_TAGS: equalityExpression, functionDeclaration, localProperty, propertyDeclaration, smartcast,
stringLiteral, whenExpression, whenWithSubject */
