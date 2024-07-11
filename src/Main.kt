//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main(){
  val numeros = arrayOf(1, 2, 3, 4, 5, 6)
  println(sumarPares(numeros))
}
fun sumarPares(numeros: Array<Int>): Int {
  return numeros.filter{ it % 2 == 0 }.sum ()

}
