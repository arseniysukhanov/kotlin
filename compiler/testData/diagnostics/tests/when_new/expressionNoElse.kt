// RUN_PIPELINE_TILL: FRONTEND
fun expressionTest(){
    var test:String
    val value=2

    test = when{//new frontend does not see that all possibilities are checked
        value<1-> "less one"
        value>=1-> "no less than one"
    }
}

/* GENERATED_FIR_TAGS: assignment, comparisonExpression, equalityExpression, functionDeclaration, integerLiteral,
localProperty, propertyDeclaration, stringLiteral, whenExpression, whenWithSubject */
