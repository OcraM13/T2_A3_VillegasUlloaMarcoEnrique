import scala.io.StdIn._
import scala.collection.mutable.ArrayBuffer

object Programa_05 {
  def main(args: Array[String]): Unit = {
    
    val palabras1 = ArrayBuffer[String]()
    val palabras2 = ArrayBuffer[String]()
    
   println("Ingrese datos para la primera lista")
   crearLista(palabras1)
   
   println("Su Lista 1 es: ")
   mostrarLista(palabras1)  
   println()
   
   println("Ingrese datos para la segunda lista")
   crearLista(palabras2)
   
   println("Su Lista 2 es: ")
   mostrarLista(palabras2)   
   println("-------------------------------------------------------")
   
   
   eliminarPalabra(palabras1)
   
   println("Su nueva lista es:")
   mostrarLista(palabras1)
  }
  
  def crearLista(palabras : ArrayBuffer[String]) : ArrayBuffer[String] = {
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
      
      palabras
  }
  
  def mostrarLista(vector : ArrayBuffer[String]) = {
    for(v <- vector)
      print(v + " ")
  }

  def eliminarPalabra(vector : ArrayBuffer[String]): ArrayBuffer[String] = {
    
    var cont = 0
    var pal = ""
    
    for(x <- 0 to vector.length){
      for(j <- 0 to vector.length){
        if(x != j){
          if(vector(x).equals(vector(j)))
            vector.remove(cont)
        }
       cont += 1
      }
    }    
    vector
  }
}