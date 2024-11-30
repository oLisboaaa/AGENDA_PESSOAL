package com.exemplo.agenda;

import javax.swing.SwingUtilities;

import com.exemplo.agenda.controller.ContatoController;
import com.exemplo.agenda.model.ContatoModel;
import com.exemplo.agenda.view.ContatoView;

/**
 * Classe principal que inicializa a aplicação Agenda de COntatos. Responsável
 * por criar as ainstancias dos componentes MVC e iniciar a interface.
 * 
 * @author Daniel Ohata
 * @version 1.0
 */
public class AgendaContatos {
	public static void main(String[] args) {
		// Executa a inicialização da aplicação na thread de eventos do Swing
		SwingUtilities.invokeLater(() -> {
			// Criação das instancias de View, Model e Controller
			ContatoView view = new ContatoView();
			ContatoModel model = new ContatoModel();
			new ContatoController(view, model);

			// Tornando a interface grafica visivel
			view.setVisible(true);
		});
	}
}
