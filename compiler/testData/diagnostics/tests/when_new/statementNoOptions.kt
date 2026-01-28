// FIR_IDENTICAL
// RUN_PIPELINE_TILL: BACKEND

fun statementNoOptionsTest(value: String){
    when (value) {}
}

/* GENERATED_FIR_TAGS: functionDeclaration, whenExpression, whenWithSubject */
