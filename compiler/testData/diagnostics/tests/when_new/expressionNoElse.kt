// FIR_IDENTICAL
// RUN_PIPELINE_TILL: FRONTEND
fun expressionTest() {
    val value = 2
    var test: String = <!NO_ELSE_IN_WHEN!>when<!> {//new frontend does not see that all possibilities are checked
        value < 1 -> "less one"
        value >= 1 -> "no less than one"
    }
}

/* GENERATED_FIR_TAGS: assignment, comparisonExpression, equalityExpression, functionDeclaration, integerLiteral,
localProperty, propertyDeclaration, stringLiteral, whenExpression, whenWithSubject */
