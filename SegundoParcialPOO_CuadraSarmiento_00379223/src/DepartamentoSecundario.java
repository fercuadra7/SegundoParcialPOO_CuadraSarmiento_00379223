public class DepartamentoSecundario implements Departamento{
   private Empleado empleado;

    @Override
    public void addEmpleado(Empleado e) {
     empleado = e;
    }

    @Override
    public Empleado getEmpleado() {
        return empleado;
    }
}
