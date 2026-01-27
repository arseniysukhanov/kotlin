// RUN_PIPELINE_TILL: FRONTEND
fun expressionTest(){
    var test:String
    val value:Int=2

    test = <!NO_ELSE_IN_WHEN!>when<!>{//new frontend does not see that all possibilities are checked
        value<0.5-> "less one"
        value>0.5-> "no less than one"
    }
}

/* GENERATED_FIR_TAGS: assignment, comparisonExpression, functionDeclaration, integerLiteral, localProperty,
propertyDeclaration, stringLiteral, whenExpression */
