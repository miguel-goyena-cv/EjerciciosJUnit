package org.cuatrovientos.dam1.ed.ejerciciosjunit.ej23;

import java.util.ArrayList;
import java.util.Vector;

public class ManageTasksMemory implements ManageTasks {

	private ArrayList<Task> listTask = new ArrayList<Task>();
	private int idTask = 0;
	
	@Override
	public int insertTask(String taskName) {
		Task task = new Task(idTask++, taskName);
		listTask.add(task);
		return idTask-1;
	}

	@Override
	public void removeTask(int id) {
		
		// We use RemoveIf with predicates
		listTask.removeIf(task -> (task.getId() == id));

	}

	@Override
	public void updateTask(Task task) {
	
		//Search for the TASK
		int indexFound = listTask.indexOf(task);
		
		
		if (indexFound != -1) {
			listTask.set(indexFound, task);
		}

	}

	@Override
	public Task searchTask(int id) {
		
		// Search for TASK
		for (Task task: listTask) {
			if (task.getId() == id)
				return task;
		}
		
		//If no TASK, then we return null
		return null;
	}

	@Override
	public Vector<Task> showTasks() {
		return new Vector<Task>(listTask);
	}

}
