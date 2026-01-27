// RUN_PIPELINE_TILL: BACKEND
// LANGUAGE: +ContextSensitiveResolutionUsingExpectedType
// FILE: classTest.kt
sealed class Test() {
    class A : Test()
    class B : Test()
    class C : Test()
}

// FILE: main.kt
fun sealedClassTest(value: Test) {
    val test = <!NO_ELSE_IN_WHEN!>when<!> (value) {
        is <!UNRESOLVED_REFERENCE!>A<!> -> "A"
        is <!UNRESOLVED_REFERENCE!>B<!> -> "B"
        is <!UNRESOLVED_REFERENCE!>C<!> -> "C"
    }
}

/* GENERATED_FIR_TAGS: classDeclaration, functionDeclaration, isExpression, localProperty, nestedClass,
primaryConstructor, propertyDeclaration, sealed, smartcast, stringLiteral, whenExpression, whenWithSubject */
