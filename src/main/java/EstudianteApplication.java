import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;

import model.Fixture;
import ui.windows.LoginWindow;

public class EstudianteApplication extends Application {

	public static void main(String[] args) {
		Fixture.initialize();
		new EstudianteApplication().start();
	}
	
	@Override
	protected Window<?> createMainWindow() {
		return new LoginWindow(this);
	}

}
