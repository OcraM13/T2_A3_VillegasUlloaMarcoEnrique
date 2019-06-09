import scala.io.StdIn._
import scala.collection.mutable.ArrayBuffer

object Programa_10 {
  def main(args: Array[String]): Unit = {
    
    val numeros = List[Int](1,1,1,3,5,1,1,3,3)
    val result = ArrayBuffer[Int]()  
    
    println("La lista es:")
    mostrarLista(numeros)
    
    println()
    println("Empaquetar lista:")
    empaquetar(numeros, result)
    mostrarLista(result)
  }
  
  def mostrarLista(vector : List[Int]) = {
    for(v <- vector)
      print(v + " ")
  }
  
  def mostrarLista(vector : ArrayBuffer[Int]) = {
    for(v <- vector)
      print(v + " ")
  }
  
  def empaquetar(vector : List[Int], result : ArrayBuffer[Int]) : ArrayBuffer[Int]= {
    var cont = 0
    var numAnt = 0
    
    for(x <- 0 to vector.length){
      numAnt = vector(x)
      if(vector(x).equals(numAnt)){
        numAnt = vector(x-1)
        cont +=1
      }
      result += vector(x)
      result += cont
    }
    result
  }
}