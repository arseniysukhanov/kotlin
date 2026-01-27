// RUN_PIPELINE_TILL: BACKEND
// LANGUAGE: +ContextSensitiveResolutionUsingExpectedType

enum class Direction{
    NORTH,EAST,SOUTH,WEST
}

fun enumTest(){
    val direction=Direction.SOUTH
    val test = when(direction){
        NORTH-> "North"
        SOUTH-> "South"
        EAST-> "East"
        WEST-> "West"
    }
}

/* GENERATED_FIR_TAGS: enumDeclaration, enumEntry, equalityExpression, functionDeclaration, localProperty,
propertyDeclaration, smartcast, stringLiteral, whenExpression, whenWithSubject */
