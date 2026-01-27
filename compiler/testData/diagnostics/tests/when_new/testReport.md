# Tests
## Compilation tests
Directory: compiler/testData/diagnostics/tests/when\_new

Test that `when` expressions work.
 
* expression.kt

Tests that `when` statements work.

 * statement.kt  
 * statement2.kt

Test that `when` without a subject works.

 * expressionWithoutSubject.kt

Test that statement `when` with some cases being not covered works.

 * statementNoFull.kt

Test that expression `when` with some cases being not covered doesn't work.

 * expressionNoFull.kt

Same as previous but checks if expression `when` would work with variable which can be null.

 * expressionNoFull2.kt

Test if expression `when` works without else if all cases are covered.

 * expressionNoElse.kt
    - Does work with a previous version of frontend but not with the new one

Test if expression `when` works without else if all cases are covered, but this time it is less obvious. It checs if variable is bigger than 0.5 or less that 0.5, without accounting for it being equal to 0.5, but because checked value is `Integer` it still covers all cases.

 * expressionNoElse2.kt
    - Does work with a previous version of frontend but not with the new one.

Test if expression `when` works without else if all cases are covered and checked value is a `Enum`.

 * expressionNoElseEnum.kt
    - Works for both fronteds.

Test if expression `when` works without else if all cases are covered and checked value is a `Enum`, however `when` is without a subject. Check of enum is done inside options themselves.

 * expressionNoElseEnum2.kt
    - Does not work for both fronteds.

Test if expression `when` works without else if all cases are covered and checked value is a `Enum` with context-sensitive resolution.

 * expressionNoElseEnum3.kt
    - Works only for new frontend.

Test if option in `when` has multiple possible conditions.

 * statementWithMultipleOptions.kt

Test if expression `when` works if checks are about value type.

 * expressionTypeCheck.kt
    - Both frontends notice that that type of the variable is already known and so check is useless. New frontend also finds else in this case to be redundantant. 

Test if expression `when` works if checks are about value type, with different type of values being checked.

 * expressionTypeCheck2.kt
    - Both frontends work and non reports else as redundantant even though for all provided values exists an appropriate option.

Test if expression `when` works if checks are about value type without else, where it checks if value `is String` or `!is String`.

 * expressionNoElseTypeCheck.kt
    - Does not work with both frontends.

Test if expression `when` works without else if all cases are covered and checked value is a `Boolean`.

 * expressionNoElseBoolean.kt
    - Works for both fronteds.

Test if expression `when` works without else if all cases are covered and its checks are about value type for sealed class.

 * expressionNoElseSealedClass.kt
    - Works for both frontends.

Test if expression `when` works without else if all cases are covered and its checks are about value type for sealed class with context-sensitive resolution.

 * expressionNoElseSealedClass2.kt
    - Works only for new frontend.

Test if expression `when` works with ranges.

 * expressionWithRange.kt

Test if expression `when` works with ranges, but of the ranges of the wrong type.

 * expressionWithRange.kt
    - Both frontends don't work, however they provide different error with new frontend having a more meaningfull one.

Test if expression `when` works with guard conditions.

 * expressionWithGuard.kt
    - Only new frontend supports this feature.

Test if expression `when` works with guard conditions with additional `else if`.

 * expressionWithGuard2.kt
    - Only new frontend supports this feature.

Test if expression `when` works with guard conditions with additional `else if` and multiple subconditions.

 * expressionWithGuard3.kt
    - Only new frontend supports this feature.

Test if expression `when` can be used to define a value with different type depending on conditions.

 * expressionWithStrangeType.kt
    - Works for both frontends

Test if expression `when` can be used to define a value with different type depending on conditions. Here I have tried the same thing, however the variable which I was assigning was also assigned inside when with a value of a different type.

 * expressionWithStrangeType2.kt
    - Both frontends show error.

Test if expression `when` can be used to define a value with different type depending on conditions. Here I have tried the same thing, however the variable which I was assigning was also assigned inside when with a value but this time with a variable of the same type.

 * expressionWithStrangeType3.kt
    - Both frontends show error however errors a bit strange, they both say that there is type mismatch which is not exactly the case in my opinion. So I would say that error messages here are not correct even though it probably makes sense that should not be compiled.

## Runtime tests
Directory: compiler/testData/codegen/box/when\_new

Test if statement `when` works.

 * statement.kt

Test if expression `when` works.

 * expression.kt

In other languages similar structure to `when` often checks all options even if one already was executed, so this test checks if after finding first correct option `when` slips into the next correct one.

 * expressionSlip.kt
