// FIR_IDENTICAL
// RUN_PIPELINE_TILL: BACKEND
fun expressionTest(){
    var test:String
    val value=2

    test = when(value){
        1-> "one"
        2-> "two"
        3-> "three"
        else-> "something"
    }
}

/* GENERATED_FIR_TAGS: assignment, equalityExpression, functionDeclaration, integerLiteral, localProperty,
propertyDeclaration, stringLiteral, whenExpression, whenWithSubject */
