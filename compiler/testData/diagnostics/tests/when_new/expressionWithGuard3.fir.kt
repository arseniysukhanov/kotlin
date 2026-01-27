// RUN_PIPELINE_TILL: BACKEND

fun guardTest(value:Int){
    val test = when(value){
        1 -> "One"
        in 2..10 if (value<3 || value>9) -> "Two or ten"
        else if (value>4 && value<6) -> "Five"
        else -> "Something else"
    }
}

/* GENERATED_FIR_TAGS: equalityExpression, functionDeclaration, integerLiteral, intersectionType, localProperty,
propertyDeclaration, stringLiteral, whenExpression, whenWithSubject */
