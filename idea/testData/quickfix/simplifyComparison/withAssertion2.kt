// "Simplify comparison" "true"
// WITH_RUNTIME
fun test() {
    val s = ""
    assert(<caret>s != null && true)
}