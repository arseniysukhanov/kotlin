// RUN_PIPELINE_TILL: FRONTEND
fun expressionEmptyTest(){
    val test = when(<!SYNTAX!><!>) {
        <!CONDITION_TYPE_MISMATCH!>1<!> -> "one"
        <!CONDITION_TYPE_MISMATCH!>2<!> -> "two"
        else -> "something, which is not 1 or 2"
    }
}

/* GENERATED_FIR_TAGS: functionDeclaration, integerLiteral, localProperty, propertyDeclaration, stringLiteral,
whenExpression */
