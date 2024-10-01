import java.util.Scanner;
public class trbajfinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar la cantidad de vendedores: ");
        int CantDeTrab = scanner.nextInt();
        scanner.nextLine();
        String[] CodigoVendedor = new String[CantDeTrab];
        String[] NombreVendedor = new String[CantDeTrab];
        double[] VentasRealizadas = new double[CantDeTrab];
        double ComisionVendedor = 0, ComisionSupervisor = 0;
        double TotalComisionesVendedores=0, TotalComisionesSupervisores=0;
        //Proceso
        for (int i=0;i<CantDeTrab;i++){
            System.out.println("Ingresar codigo del vendedor(a)("+(i+1)+") :");
            CodigoVendedor[i]= scanner.nextLine();
            System.out.println("Ingresar el nombre del vendedor(a)("+(i+1)+") :");
            NombreVendedor[i]= scanner.nextLine();
        }
        for (int i = 0; i <CantDeTrab; i++) {
            System.out.println("Ingrese el monto de ventas que percibio " + NombreVendedor[i] + " (cÃ³digo " + CodigoVendedor[i] + "):");
            VentasRealizadas[i] = scanner.nextDouble();
        }
        for (int i=0;i<VentasRealizadas.length;i++){
            if (VentasRealizadas[i]>=4000 && VentasRealizadas[i]<=7000){
                ComisionVendedor=VentasRealizadas[i]*0.04;
                ComisionSupervisor=VentasRealizadas[i]*0.01;
            } else if (VentasRealizadas[i]>7000 && VentasRealizadas[i]<10000){
                ComisionVendedor=VentasRealizadas[i]*0.06;
                ComisionSupervisor=VentasRealizadas[i]*0.02;
            } else if (VentasRealizadas[i]>10000){
                ComisionVendedor=VentasRealizadas[i]*0.08;
                ComisionSupervisor=VentasRealizadas[i]*0.03;
            }
            TotalComisionesSupervisores+=ComisionSupervisor;
            TotalComisionesVendedores+=ComisionVendedor;
            //Salida
            System.out.printf("\nLa comision del vendedor(a) %s es: %.2f",NombreVendedor[i],ComisionVendedor);
            System.out.printf("\nLa comision que percibe el supervisor por la venta de %s es: %.2f",NombreVendedor[i],ComisionSupervisor);
        }
        System.out.printf("\nEl suma total de comisiones que reciben los vendedores es: %.2f",TotalComisionesVendedores);
        System.out.printf("\nEl supervisor recibe por la venta total de sus vendedores es: %.2f",TotalComisionesSupervisores);
        System.out.printf("\nEl monto total de comisiones es: %.2f",(TotalComisionesVendedores+TotalComisionesSupervisores));
    }
}
