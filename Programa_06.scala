import scala.io.StdIn._
import scala.collection.mutable.ArrayBuffer

object Programa_06 {
  def main(args: Array[String]): Unit = {
    
    val numeros = ArrayBuffer[Int]()
    val result = ArrayBuffer[Int]()
    
   println("Ingrese numero")
   crearLista(numeros)
   
   println("Su Lista es: ")
   mostrarLista(numeros)  
   println()
   
   println("Lista de Resultados:")
   sumatoria(numeros, result)
   mostrarLista(result)
   
  }
  
  def crearLista(numeros : ArrayBuffer[Int]) : ArrayBuffer[Int] = {
      var opcion = 0;
      var num = 0
    
      do{
        println("Desea agregar un numero a su lista? 1.SI  0.NO")
        opcion = readInt()
        if(opcion == 1){
          println("Ingrese numero")
           num = readInt()
           numeros += num
        }     
    }while(opcion != 0)
      
      numeros
  }
  
  def mostrarLista(vector : ArrayBuffer[Int]) = {
    for(v <- vector)
      print(v + " ")
  }
  
  def sumatoria(vector1 : ArrayBuffer[Int], vector2 : ArrayBuffer[Int]) : ArrayBuffer[Int] = {
    
    var sum = 0
    
    for(v <- vector1){
      
        sum = sum + v
        vector2 += sum
    }
    
    vector2
  }
}