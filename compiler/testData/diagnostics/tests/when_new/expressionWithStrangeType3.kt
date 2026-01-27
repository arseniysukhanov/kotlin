//RUN_PIPELINE_TILL: FRONTEND

fun testExpressionWithStrangeType(value: Boolean){
        var <!ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE!>test<!>:Int
        test=when(value){
        true -> <!TYPE_MISMATCH!>test = 3<!>
        false -> 0
    }

}

/* GENERATED_FIR_TAGS: assignment, equalityExpression, functionDeclaration, integerLiteral, localProperty,
propertyDeclaration, smartcast, stringLiteral, whenExpression, whenWithSubject */
