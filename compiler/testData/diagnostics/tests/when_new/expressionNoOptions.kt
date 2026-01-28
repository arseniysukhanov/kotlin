// FIR_IDENTICAL
// RUN_PIPELINE_TILL: FRONTEND

fun expressionNoOptionsTest(value: String){
    val test = <!NO_ELSE_IN_WHEN!>when<!> (value) {}
}

/* GENERATED_FIR_TAGS: functionDeclaration, localProperty, propertyDeclaration, whenExpression, whenWithSubject */
