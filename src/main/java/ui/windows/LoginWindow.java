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

@SuppressWarnings("serial")
public class LoginWindow extends SimpleWindow<LoginViewModel> {

	public LoginWindow(WindowOwner parent) {
		super(parent, new LoginViewModel());
	}

	@Override
	protected void addActions(Panel actionPanel) {
		new Button(actionPanel).setCaption("Login").onClick(this::login);
		
	}

	@Override
	protected void createFormPanel(Panel formPanel) {
		Panel panel = new Panel(formPanel);
		panel.setLayout(new ColumnLayout(2));
		this.setTitle("Login estudiante");
		
		new Label(panel).setText("Legajo");
		new TextBox(panel).bindValueToProperty("legajo");
	}

	public void login() {
		String legajo = this.getModelObject().getLegajo();
		Optional<Estudiante> estudiante = this.getModelObject().getEstudiantes().all().stream().filter(est -> est.tieneLegajo(legajo)).findFirst();
		if(estudiante.isPresent()) System.out.println("Logueado");
		else System.out.println("No existe legajo");
		
		
	}
}
