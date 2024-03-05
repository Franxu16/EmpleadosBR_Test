package es.iesmz;

public class EmpleadoBR {
    //Metodos
    public double calcularSalarioBruto(TipoEmpleado tipo, double ventasMes, double horasExtra){
        if(tipo == null || ventasMes < 0 || horasExtra < 0){
            return -1;
        }
        double salarioB;
        switch (tipo){
            case vendedor -> salarioB = 1000;
            case encargado -> salarioB = 1500;
            default -> salarioB = 0;
        }
        double prima = 0;
        if(ventasMes >= 1000){
            prima += 100;
        }
        if(ventasMes >= 1500){
            prima += 200;
        }
        return salarioB + prima + (horasExtra * 20);
    }

    public double calcularSalarioNeto(double salarioB){
        double retencion = 0;
        if(salarioB < 1000){
            retencion = 0;
        }

        if(salarioB >= 1000 && salarioB < 1500){
            retencion = 0.16;
        }

        if(salarioB > 1500){
            retencion = 0.18;
        }
        if(salarioB == 0){
            return -1;
        }
        return salarioB * (1-retencion/100);
    }
}
