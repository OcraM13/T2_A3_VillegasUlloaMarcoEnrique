import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn._

object Programa_01 {
  def main(args: Array[String]): Unit = {
    
    val palabras = ArrayBuffer[String]()
    
    println("Cuantas palabras dseas agregar")
    var numero = readInt();
    var cad = ""
    
    for(i <- 0 until numero){
      println("Ingrese palabra "+(i+1))
      cad = readLine()
      palabras += cad
    }
      
    println()
    println("Ingrese una palabra a buscar: ")
    val palabra = readLine()
   
    println("La palabra se repite: " + contarPalabra(palabra, palabras) + " veces.")
  }
  
  def contarPalabra(cadena:String, palabras:ArrayBuffer[String]) : Int = {
    var cont = 0
    
    for(v <- palabras){
        if(cadena == v)
          cont += 1
    }
      
    cont
  }
  
}