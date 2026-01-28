// RUN_PIPELINE_TILL: BACKEND
enum class Direction {
    NORTH, EAST, SOUTH, WEST
}

fun enumTest(direction: Direction, value: Int) {
    val test = when (direction) {
        Direction.NORTH -> "North"
        Direction.SOUTH -> "South"
        Direction.EAST -> "East"
        Direction.WEST <!UNSUPPORTED_FEATURE!>if value > 0<!> -> "West and value is positive"
        <!DUPLICATE_LABEL_IN_WHEN!>Direction.WEST<!> -> "West and value is non positive"
    }
}

/* GENERATED_FIR_TAGS: andExpression, comparisonExpression, enumDeclaration, enumEntry, equalityExpression,
functionDeclaration, guardCondition, integerLiteral, localProperty, propertyDeclaration, smartcast, stringLiteral,
whenExpression, whenWithSubject */
