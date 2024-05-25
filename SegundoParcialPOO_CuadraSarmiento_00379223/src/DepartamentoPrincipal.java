import java.util.ArrayList;
import java.util.Iterator;

public class DepartamentoPrincipal implements Departamento{

    private ArrayList<Empleado> empleados = new ArrayList<>();


    @Override
    public void addEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void removeEmpleado(Empleado e){
      while (searchEmpleado(e.getName())){
          empleados.remove(e);
      }
    }

    public boolean searchEmpleado(String ID){
        Iterator iterator = empleados.iterator();
        boolean ans = false;
        int aux = 0;

        while(iterator.hasNext()){
            if (empleados.get(aux).getID().equals(ID)){
            ans = true;
            break;
            }
        }
        return ans;
    }


    @Override
    public Empleado getEmpleado() {
        Iterator iterator = empleados.iterator();
        int aux = 0;
        Empleado e = null;

        while (iterator.hasNext()) {

            if (empleados.get(aux).getID().equals(getEmpleado().ID)) {
                e = empleados.get(aux);
            }

            aux++;
        }

        return e;
    }

}
