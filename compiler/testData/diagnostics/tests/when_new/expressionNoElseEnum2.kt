// FIR_IDENTICAL
// RUN_PIPELINE_TILL: FRONTEND
enum class Direction{
    NORTH,EAST,SOUTH,WEST
}

fun enumTest(){
    val direction=Direction.SOUTH
    val test = <!NO_ELSE_IN_WHEN!>when<!>{
        direction==Direction.NORTH-> "North"
        direction==Direction.SOUTH-> "South"
        direction==Direction.EAST-> "East"
        direction==Direction.WEST -> "West"
    }
}

/* GENERATED_FIR_TAGS: enumDeclaration, enumEntry, equalityExpression, functionDeclaration, localProperty,
propertyDeclaration, smartcast, stringLiteral, whenExpression */
