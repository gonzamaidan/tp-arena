package ui.windows;

import java.util.List;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import model.Asignacion;
import ui.vm.NotasViewModel;

@SuppressWarnings("serial")
public class NotasWindow extends SimpleWindow<NotasViewModel> {

	public NotasWindow(WindowOwner parent, NotasViewModel model) {
		super(parent, model);
	}

	@Override
	protected void addActions(Panel arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void createFormPanel(Panel formPanel) {
		formPanel.setLayout(new ColumnLayout(1));
		
		Panel panel = new Panel(formPanel);
		panel.setLayout(new ColumnLayout(3));
		new Label(panel).setText("TAREA");
		new Label(panel).setText("NOTA");
		new Label(panel).setText("APRUEBA");
		
		List<Asignacion> asignaciones = this.getModelObject().getAsignaciones();
		asignaciones.forEach(asignacion -> {
			new Label(panel).setText(asignacion.getTarea().getNombre());
			new Label(panel).setText(asignacion.notaFinal().obtenerCalificacion());
			new Label(panel).setText(asignacion.notaFinal().estaAprobado()? "SI": "NO");
		});
	}

}
