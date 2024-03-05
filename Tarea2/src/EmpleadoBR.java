public class EmpleadoBR {
    //Metodos
    public static double calcularSalarioBruto(TipoEmpleado tipo, double ventasMes, double horasExtra){
        if(tipo == null || ventasMes < 0 || horasExtra < 0){
            return -1;
        }
        double salarioB = 0;
        double prima = 0;
        if(tipo.equals(TipoEmpleado.vendedor)) salarioB = 1000;
        else if(tipo.equals(TipoEmpleado.encargado)) salarioB = 1500;

        if(ventasMes >= 1000 && ventasMes < 1500) prima = 100;
        else if(ventasMes >= 1500) prima = 200;

        return salarioB + prima + (horasExtra * 20);
    }

    public static float calcularSalarioNeto(float salarioB){
        float retencion = 0;
        if(salarioB < 0){
            return -1;
        } else if(salarioB < 1000){
            retencion = 0;
        } else if(salarioB >= 1000 && salarioB < 1500){
            retencion = 16.0f / 100;
        }else if(salarioB >= 1500){
            retencion = 18.0f / 100;
        }
        return salarioB * (1-retencion);
    }
}
