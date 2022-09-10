package periodo2;
public class Periodo2 {
  public static void main (String [] args) {
    //programa de Java para demostrar
    // declaraciones switch case anidadas
    String Branch = "CSE";
    int year = 2;

    switch (year)
      {
        case 1 : 
          System.out.println("Cursos electivos: Ingles, Calculo");
          break;
        case 2:
          switch (Branch) // switch anidado
            {
              case "CSE":
              case "CSE":
                 System.out.println("Cursos electivos : Machine Learning, Big Data");
                break;

              case "ECE":
                System.out.println("Cursos electivos : Preogramacion");
                break;

              default:
                System.out.println("Cursos electivos : Ingenieria de Sofware");
            }
          }
      }
  }