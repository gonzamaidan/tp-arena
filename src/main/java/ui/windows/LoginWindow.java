package ui.windows;

import java.util.Optional;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import model.Estudiante;
import ui.vm.LoginViewModel;
import ui.vm.NotasViewModel;

@SuppressWarnings("serial")
public class LoginWindow extends SimpleWindow<LoginViewModel> {

	public LoginWindow(WindowOwner parent) {
		super(parent, new LoginViewModel());
	}

	@Override
	protected void addActions(Panel actionPanel) {
		actionPanel.setLayout(new ColumnLayout(2));
		new Button(actionPanel).setCaption("Login").onClick(this::login).setWidth(75);
		new Button(actionPanel).setCaption("Salir").onClick(this::salir).setWidth(75);
		
	}

	@Override
	protected void createFormPanel(Panel formPanel) {
		this.setTitle("Login estudiante");
		formPanel.setLayout(new ColumnLayout(1));
		
		Panel panel = new Panel(formPanel);
		panel.setLayout(new ColumnLayout(2));
		
		new Label(panel).setText("Legajo");
		new TextBox(panel).bindValueToProperty("legajo");
	}

	public void login() {
		String legajo = this.getModelObject().getLegajo();
		Optional<Estudiante> estudiante = this.getModelObject().getEstudiantes().getEstudiante(legajo);
		if(estudiante.isPresent()) {
			NotasViewModel model = new NotasViewModel(legajo);
			NotasWindow notasWindow = new NotasWindow(this, model);
			notasWindow.open();
		}
	}
	
	public void salir() {
		this.close();
	}

}
