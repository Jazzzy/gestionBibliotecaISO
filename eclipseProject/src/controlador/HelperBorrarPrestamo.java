package controlador;

import org.w3c.dom.Document;

import accesoADatos.DAOPrestamo;
import accesoADatos.FactoriaDAO;

public class HelperBorrarPrestamo implements Helper {

	private Integer id;

	public HelperBorrarPrestamo(Integer id) {
		super();
		this.id = id;
	}

	@Override
	public Document ejecutar() {

		FactoriaDAO f = FactoriaDAO.newFactoria();
		DAOPrestamo p = f.crearDAOPrestamo();

		Integer error = p.borrarPrestamo(id);

		if (error == 0) {

			// TODO Document
		}
		return null;
	}

}
