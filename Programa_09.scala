import scala.io.StdIn._
import scala.collection.mutable.ArrayBuffer

object Programa_09 {
  def main(args: Array[String]): Unit = {
    val numeros = List(2, 4, 6, 8, 10, 7, 9, 3, 1)
    val numPrimos = ArrayBuffer[Int]() 
    val rFactorial = ArrayBuffer[Int]() 
    
    println("Lista de Números: ")
    mostrarLista(numeros)
    println()
    println("--------------------------------------")
    println("Números Primos")
    obtenerNumPrimos(numeros, numPrimos)
    mostrarLista(numPrimos)
    println("--------------------------------------")
    obtenerSumaProm(numeros)
    println("-----------------------------------")
    println("Factorial: ")
    calcularfactorial(numeros, rFactorial)
    mostrarLista(rFactorial)
    
  }
   
  def obtenerNumPrimos(numeros: List[Int], result : ArrayBuffer[Int]) : ArrayBuffer[Int] = {
    for(v <- numeros){
        if(v % 2 != 0)
          result += v
    }
    result
  }
  
  def obtenerSumaProm(numeros: List[Int]) = {
    var sum = 0.0
    var cont = 0
    
    for(v <- numeros){
        sum += v
        cont += 1
    }
    
    println("La suma es: " + sum)
    println("EL promedio es: " + (sum/cont))
  }
  
  def calcularfactorial(numeros: List[Int], result : ArrayBuffer[Int]) : ArrayBuffer[Int] = {    
    for(v <- numeros){
      result += Factorial(v)
    }
    result
  }
  
  def Factorial(x:Int): Int = {
    
   if(x == 0){
    1
   }
   else{
     return x * Factorial(x-1)
   }
  }
  
  def mostrarLista(vector : List[Int]) = {
    for(v <- vector)
      print(v + " ")
  }
  
  def mostrarLista(vector : ArrayBuffer[Int]) = {
    for(v <- vector)
      print(v + " ")
  }
}