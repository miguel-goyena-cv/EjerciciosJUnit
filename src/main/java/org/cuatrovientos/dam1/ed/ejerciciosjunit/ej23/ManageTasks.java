package org.cuatrovientos.dam1.ed.ejerciciosjunit.ej23;

import java.util.Vector;

public interface ManageTasks {

	public int insertTask(String task);

	public void removeTask(int id);

	public void updateTask(Task task);

	public Task searchTask(int id);

	public Vector<Task> showTasks();

}
