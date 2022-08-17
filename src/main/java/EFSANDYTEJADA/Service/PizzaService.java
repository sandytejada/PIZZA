package EFSANDYTEJADA.Service;

import java.util.List;

import EFSANDYTEJADA.Model.Pizza;



public interface PizzaService {
	
	List<Pizza> listar();
	Pizza ObtenerId(Integer id);	
	void guardar(Pizza pizza);
	void eliminar(Integer id);
	void actualizar(Pizza pizza);	

	void asignarClienteaPizza();
}
