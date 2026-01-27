//RUN_PIPELINE_TILL: FRONTEND

fun testExpressionWithStrangeType(value: Boolean){
        var test = 0
        test=when(value){
        true -> test = 3
        false -> 0
    }

}

/* GENERATED_FIR_TAGS: assignment, equalityExpression, functionDeclaration, integerLiteral, localProperty,
propertyDeclaration, smartcast, stringLiteral, whenExpression, whenWithSubject */
