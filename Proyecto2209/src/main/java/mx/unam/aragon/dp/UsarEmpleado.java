
package mx.unam.aragon.dp;


public class UsarEmpleado {
    public static void main(String[] args) {
        Empleado2 emp1 = new Empleado2(1, "Sistemas", 45000.0f, 15);  
        emp1.setNombre("Jose");
        emp1.setApPaterno("Garcia");
        emp1.setApMaterno("Bolaños");
        emp1.setEdad(25);
        emp1.setCurp("GABJ121212HDFTR2");
        
        
        System.out.println("info" +emp1);
        
    }   
}
