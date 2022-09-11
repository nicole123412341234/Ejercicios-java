package periodo2;
public class Periodo2 {
  public static void main(String[] args) {
    int contador = 0 //Iniciamos el contadir en cero
    for (int i = 0; i <= 10000; i++) 
      {
        if (i % 20 == 0) //Preguntamos si el residuo es 0 (es multiplo de 20)
        {
             contador++; //Si es multiplo aumentamos el contador en 1
        }
       //Si no es multiplo no hacemos nada 
    }
   //Mostramos el valor del contador
    System.out.println(contador);
  }
}
