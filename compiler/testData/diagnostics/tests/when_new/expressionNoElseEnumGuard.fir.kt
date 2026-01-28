// RUN_PIPELINE_TILL: FRONTEND
enum class Direction {
    NORTH, EAST, SOUTH, WEST
}

fun enumTest(direction: Direction, value: Int) {
    val test = <!NO_ELSE_IN_WHEN!>when<!> (direction) {
        Direction.NORTH -> "North"
        Direction.SOUTH -> "South"
        Direction.EAST -> "East"
        Direction.WEST if value > 0 -> "West and value is positive"
    }
}

/* GENERATED_FIR_TAGS: andExpression, comparisonExpression, enumDeclaration, enumEntry, equalityExpression,
functionDeclaration, guardCondition, integerLiteral, localProperty, propertyDeclaration, smartcast, stringLiteral,
whenExpression, whenWithSubject */
