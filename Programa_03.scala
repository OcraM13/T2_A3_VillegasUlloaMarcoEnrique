import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn._


object Programa_03 {
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
   println("Ingrese palabra a eliminar: ")
   val palabra1 = readLine()
   
   eliminarPalabra(palabra1, palabras)
   
   println("Su nueva lista es: ")
   mostrarLista(palabras)
  
  }
  
  def mostrarLista(vector : ArrayBuffer[String]) = {
    for(v <- vector)
      print(v + " ")
  }
  
  def eliminarPalabra(palabra1: String, vector : ArrayBuffer[String]): ArrayBuffer[String] = {
    
    var cont = 0
     for(v <- vector){
        if(palabra1.equals(v))
            vector.remove(cont)
            cont += 1
    }    
    vector
  }
}