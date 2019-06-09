import scala.io.StdIn._
import scala.collection.mutable.ArrayBuffer

object Programa_08 {
  def main(args: Array[String]): Unit = {
      val numeros = List[String]("161", "2992", "3003", "2882", "5005","10", "145", "32")
      val result = ArrayBuffer[String]()
      
      println("Su lista es: ")
      mostrarLista(numeros)
      println()

      println("Números Capicúas:")
      obtenerCapicuas(numeros, result)
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
    
  def obtenerCapicuas(numeros: List[String], result : ArrayBuffer[String]) : ArrayBuffer[String] = {
    
    var cap = ""
    
    for(e <- numeros){
        cap = e.toLowerCase.filter(c => c.isLetter)
        if (cap == cap.reverse)
          result += e
    }  
    result  
  }
}