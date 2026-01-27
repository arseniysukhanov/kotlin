// FIR_IDENTICAL
// RUN_PIPELINE_TILL: FRONTEND
fun expressionTest() {
    val value = 2
    var test: String = <!NO_ELSE_IN_WHEN!>when<!>(value){
        1-> "one"
        2-> "two"
    }
}

/* GENERATED_FIR_TAGS: assignment, equalityExpression, functionDeclaration, integerLiteral, localProperty,
propertyDeclaration, stringLiteral, whenExpression, whenWithSubject */
