// FIR_IDENTICAL
// RUN_PIPELINE_TILL: BACKEND
fun expressionTest(){
    var test:String
    val value=2

    test = when{
        value == 1-> "one"
        value == 2-> "two"
        value < 4 && value > 2 -> "three"
        else-> "something"
    }
}

/* GENERATED_FIR_TAGS: andExpression, assignment, comparisonExpression, equalityExpression, functionDeclaration,
integerLiteral, localProperty, propertyDeclaration, stringLiteral, whenExpression */
