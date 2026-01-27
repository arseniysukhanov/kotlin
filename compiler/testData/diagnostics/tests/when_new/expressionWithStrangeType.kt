// FIR_IDENTICAL
//RUN_PIPELINE_TILL: BACKEND

fun testExpressionWithStrangeType(value: Boolean){
    val test=when(value){
        true -> "True"
        false -> 0
    }

}

/* GENERATED_FIR_TAGS: equalityExpression, functionDeclaration, integerLiteral, intersectionType, localProperty,
propertyDeclaration, smartcast, stringLiteral, whenExpression, whenWithSubject */
