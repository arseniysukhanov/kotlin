// RUN_PIPELINE_TILL: BACKEND
// LANGUAGE: +ContextSensitiveResolutionUsingExpectedType

enum class Direction{
    NORTH,EAST,SOUTH,WEST
}

fun enumTest(){
    val direction=Direction.SOUTH
    val test = <!NO_ELSE_IN_WHEN!>when<!>(direction){
        <!UNRESOLVED_REFERENCE!>NORTH<!>-> "North"
        <!UNRESOLVED_REFERENCE!>SOUTH<!>-> "South"
        <!UNRESOLVED_REFERENCE!>EAST<!>-> "East"
        <!UNRESOLVED_REFERENCE!>WEST<!>-> "West"
    }
}

/* GENERATED_FIR_TAGS: enumDeclaration, enumEntry, equalityExpression, functionDeclaration, localProperty,
propertyDeclaration, smartcast, stringLiteral, whenExpression, whenWithSubject */
