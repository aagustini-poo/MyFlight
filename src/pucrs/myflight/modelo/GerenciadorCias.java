package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

	public void adicionar(CiaAerea cia) {
		empresas.add(cia);
	}

	// 
	// é importante usar foreach sempre que possível
	// se acostume a usar!!!
	//
	public CiaAerea buscarPorCodigo(String cod) {
		for (CiaAerea a : empresas) {
			if (a.getCodigo().equals(cod))
				return a;
		}
		return null;
	}
}
