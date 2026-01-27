// RUN_PIPELINE_TILL: BACKEND

fun guardTest(value:Int){
    val test = when(value){
        1 -> "One"
        in 2..10 if value<3 -> "Two"
        else if value<4 -> "Three"
        else -> "Not one or two or three"
    }
}

/* GENERATED_FIR_TAGS: equalityExpression, functionDeclaration, integerLiteral, intersectionType, localProperty,
propertyDeclaration, stringLiteral, whenExpression, whenWithSubject */
