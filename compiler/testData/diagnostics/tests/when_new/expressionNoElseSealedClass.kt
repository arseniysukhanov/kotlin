// FIR_IDENTICAL
// RUN_PIPELINE_TILL: BACKEND
// FILE: classTest.kt
sealed class Test(){
    class A:Test()
    class B:Test()
    class C:Test()
}

// FILE: main.kt

fun sealedClassTest(value:Test){
    val test = when(value){
        is Test.A -> "A"
        is Test.B -> "B"
        is Test.C -> "C"
    }
}

/* GENERATED_FIR_TAGS: classDeclaration, equalityExpression, functionDeclaration, localProperty, nestedClass,
primaryConstructor, propertyDeclaration, sealed, stringLiteral, whenExpression, whenWithSubject */
