package banco;

public class PruebaBanco
{
  
  public static void main (String args[]){
  	Banco b1 = new Banco();
	
	Titular pedro = new Titular("122","pedro","garcia",30);
	Titular pepe= new Titular("123","pepe","garcia",30);
	Titular carlos = new Titular("124","carlos","garcia",30);

	Cuenta c1 = new CC(pedro,200);
	Cuenta c2 = new FI(pepe);
	Cuenta c3 = new CV(carlos,1000);

	b1.añadirCuenta(c1);
	b1.añadirCuenta(c2);
	b1.añadirCuenta(c3);

	Cuenta x = b1.buscarCuenta(pedro);
	System.out.println(x.getSaldo());

	Cuenta y = b1.buscarCuentaDNI("124");
	System.out.println(y.getSaldo());
        
        try {
            y.sacarDinero(10000000); 
        }catch (NoHayDinero e){
            System.out.println("No hay dinero suficiente, falta: "+e.getNegativo()+"�");
             e.printStackTrace();
        }
        
        
        System.out.println(y.getSaldo());



  }



}
