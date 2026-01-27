// RUN_PIPELINE_TILL:FRONTEND
fun expressionTypeCheckTest() {
    val value = "Value"
    val test = when (value) {
        <!USELESS_IS_CHECK!>is String<!> -> "String"
        <!REDUNDANT_ELSE_IN_WHEN!>else<!> -> "Not a string"
    }
}

/* GENERATED_FIR_TAGS: functionDeclaration, localProperty, propertyDeclaration, stringLiteral, whenExpression,
whenWithSubject */
