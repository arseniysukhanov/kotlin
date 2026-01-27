// FIR_IDENTICAL
// RUN_PIPELINE_TILL: BACKEND
fun statementTest(){
    val value = 2
    when (value){
        1 -> {val test ="One"}
        2 -> {val test ="Two"}
    }
}

/* GENERATED_FIR_TAGS: equalityExpression, functionDeclaration, integerLiteral, localProperty, propertyDeclaration,
stringLiteral, whenExpression, whenWithSubject */
