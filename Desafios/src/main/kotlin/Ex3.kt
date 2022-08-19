class Ex3 {
    fun ex3() {

        encontraMultiplosDe3E5(100)
    }

    private fun encontraMultiplosDe3E5(n: Int) {
        var multiploDe3 = 3
        var multiploDe5 = 5
        for (i in 1..n) {
            var _3 = false
            var _5 = false
            if (i == multiploDe3) {
                multiploDe3 += 3
                _3 = true
            }
            if (i == multiploDe5) {
                multiploDe5 += 5
                _5 = true
            }
            if (_3 && _5) {
                println("Fizzbuzz")
            } else if (_3) {
                println("Fizz")
            } else if (_5) {
                println("Buzz")
            } else {
                println(i)
            }
        }
    }
}