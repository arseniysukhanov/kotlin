// FIR_IDENTICAL
// RUN_PIPELINE_TILL: BACKEND

fun expressionOnlyElseTest(value: Int){
    val test: String = when (value) {
        else -> "Something"
    }
}

/* GENERATED_FIR_TAGS: functionDeclaration, localProperty, propertyDeclaration, stringLiteral, whenExpression,
whenWithSubject */
