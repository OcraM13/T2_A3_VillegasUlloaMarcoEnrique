import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn._

object Programa_02 {
  def main(args: Array[String]): Unit = {
    
    val palabras = ArrayBuffer[String]()
    
    var opcion = 0;
    var cad = " "
    
    do{
      println("Desea agregar una palabra a su lista? 1.SI  0.NO")
        opcion = readInt()
        if(opcion == 1){
          println("Ingrese palabra")
           cad = readLine()
           palabras += cad
        }     
    }while(opcion != 0)
    
   println("Su Lista es: ")
   mostrarLista(palabras)
      
   println()
   println("Ingrese primera palabra: ")
   val palabra1 = readLine()
   println("Ingrese segunda palabra: ")
   val palabra2 = readLine()
   
   sustituirPalabra(palabra1, palabra2, palabras)
   
   println("Su nueva lista es: ")
   mostrarLista(palabras)
  
  }
  
  def mostrarLista(vector : ArrayBuffer[String]) = {
    for(v <- vector)
      print(v + " ")
  }
  
  def sustituirPalabra(palabra1: String, palabra2:String, vector : ArrayBuffer[String]): ArrayBuffer[String] = {
    
    for(x <- 0 until vector.length){
        if(palabra1 == vector(x))
            vector(x) = palabra2
    }
    vector
  }
}