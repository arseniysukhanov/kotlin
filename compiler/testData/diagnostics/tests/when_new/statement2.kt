// FIR_IDENTICAL
// RUN_PIPELINE_TILL: BACKEND
class A(test: String) {
    var test = ""
    fun print(text: String) {
        test = text
    }
}

fun statementTest(a: A) {
    val value = 2
    when (value) {
        1 -> a.print("One")
        2 -> a.print("Two")
        3 -> a.print("Three")
        else -> a.print("Something else")
    }
}

/* GENERATED_FIR_TAGS: equalityExpression, functionDeclaration, integerLiteral, localProperty, propertyDeclaration,
stringLiteral, whenExpression, whenWithSubject */
