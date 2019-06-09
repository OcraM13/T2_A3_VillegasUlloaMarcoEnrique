import scala.io.StdIn._
import scala.collection.mutable.ArrayBuffer

object Programa_07 {
  def main(args: Array[String]): Unit = {
      val palabras = List("radar", "oro", "rajar", "rallar", "salas", "casa", "perro", "caja", "dinero", "pantalla")
      val result = ArrayBuffer[String]()
      
      println("Su lista es: ")
      mostrarLista(palabras)
      println()
      obtenerPalindromas(palabras, result)
      println("Palabras Palíndromas:")
      mostrarLista(result)
  }
  
  def mostrarLista(vector : List[String]) = {
    for(v <- vector)
      print(v + " ")
  }
  
  def mostrarLista(vector : ArrayBuffer[String]) = {
    for(v <- vector)
      print(v + " ")
  }
    
  def obtenerPalindromas(palabras: List[String], result : ArrayBuffer[String]) : ArrayBuffer[String] = {
    
    var palin = ""
    
    for(e <- palabras){
        palin = e.toLowerCase.filter(c => c.isLetter)
        if (palin == palin.reverse)
          result += e
    }  
    result  
  }
}