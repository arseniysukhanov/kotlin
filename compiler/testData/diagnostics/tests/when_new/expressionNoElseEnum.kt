// FIR_IDENTICAL
// RUN_PIPELINE_TILL: BACKEND
enum class Direction{
    NORTH,EAST,SOUTH,WEST
}

fun enumTest(){
    val direction=Direction.SOUTH
    val test = when(direction){
        Direction.NORTH-> "North"
        Direction.SOUTH-> "South"
        Direction.EAST-> "East"
        Direction.WEST -> "West"
    }
}

/* GENERATED_FIR_TAGS: enumDeclaration, enumEntry, equalityExpression, functionDeclaration, localProperty,
propertyDeclaration, smartcast, stringLiteral, whenExpression, whenWithSubject */
