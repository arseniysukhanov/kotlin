// RUN_PIPELINE_TILL: BACKEND

fun guardTest(value:Int){
    val test = when(value){
        1 -> "One"
        in 2..10 <!UNSUPPORTED_FEATURE!>if value<3<!> -> "Two"
        else -> "Not one or two"
    }
}

/* GENERATED_FIR_TAGS: equalityExpression, functionDeclaration, integerLiteral, intersectionType, localProperty,
propertyDeclaration, stringLiteral, whenExpression, whenWithSubject */
