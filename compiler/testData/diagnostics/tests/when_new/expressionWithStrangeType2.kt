//RUN_PIPELINE_TILL: FRONTEND

fun testExpressionWithStrangeType(value: Boolean){
    var test=when(value){
        true -> (<!ASSIGNMENT_IN_EXPRESSION_CONTEXT!><!UNRESOLVED_REFERENCE!>test<!>="1"<!>).<!DEBUG_INFO_MISSING_UNRESOLVED!>toInt<!>()
        false -> 0
    }

}

/* GENERATED_FIR_TAGS: assignment, equalityExpression, functionDeclaration, integerLiteral, localProperty,
propertyDeclaration, smartcast, stringLiteral, whenExpression, whenWithSubject */
