// FIR_IDENTICAL
// RUN_PIPELINE_TILL:FRONTEND
// same as expressionNoFull.kt, however expression can be null
fun expressionTest() {
    val value = 2
    var test: String? = <!NO_ELSE_IN_WHEN!>when<!>(value){
        1-> "one"
        2-> "two"
    }
}

/* GENERATED_FIR_TAGS: assignment, equalityExpression, functionDeclaration, integerLiteral, localProperty, nullableType,
propertyDeclaration, stringLiteral, whenExpression, whenWithSubject */
