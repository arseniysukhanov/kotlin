// FIR_IDENTICAL
// RUN_PIPELINE_TILL: BACKEND
fun statementTest() {
    val value = 2
    when (value) {
        1, 2 -> {
            val test = "One or two"
        }
        3 -> {
            val test = "Three"
        }
        else -> {
            val test = "Something else"
        }
    }
}

/* GENERATED_FIR_TAGS: disjunctionExpression, equalityExpression, functionDeclaration, integerLiteral, localProperty,
propertyDeclaration, stringLiteral, whenExpression, whenWithSubject */
