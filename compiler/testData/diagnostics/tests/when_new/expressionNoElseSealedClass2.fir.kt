// RUN_PIPELINE_TILL: BACKEND
// LANGUAGE: +ContextSensitiveResolutionUsingExpectedType
// FILE: classTest.kt
sealed class Test(){
    class A:Test()
    class B:Test()
    class C:Test()
}

// FILE: main.kt
fun sealedClassTest(value:Test){
    val test = when(value){
        is A -> "A"
        is B -> "B"
        is C -> "C"
    }
}

/* GENERATED_FIR_TAGS: classDeclaration, functionDeclaration, isExpression, localProperty, nestedClass,
primaryConstructor, propertyDeclaration, sealed, smartcast, stringLiteral, whenExpression, whenWithSubject */
