/**
 * 
 */
package org.cuatrovientos.dam1.ed.ejerciciosjunit.ej23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class ManageTasksMemoryTest {

	
	ManageTasks taskManager;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
		taskManager = new ManageTasksMemory();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Debe introducir una tarea y luego buscarla.
	 */
	@Test
	void testInsert() {

		// Expected Result
		
		String taskName = "test_task";
		
		// Actual
		int idTask = taskManager.insertTask(taskName);
		Task taskFound = taskManager.searchTask(idTask);
		
		//Asssert
		assertNotNull(taskFound);
		assertEquals(taskFound.getName(), taskName);
		
	}
	
	/**
	 * Debe introducir una tarea y eliminarla. Luego al buscarla no debe estar.
	 */
	@Test
	void testDelete() {

		// Expected Result
		String taskName = "test_task";
		
		// Actual
		int idTask = taskManager.insertTask(taskName);
		taskManager.removeTask(idTask);
		Task taskFound = taskManager.searchTask(idTask);
		
		//Asssert
		assertNull(taskFound);
		
	}
	
	/**
	 * Debe introducir una tarea y modificarla. Por lo tanto, se debe comprobar que se ha modificado. 
	 */
	@Test
	void testUpdate() {

		// Expected Result
		String taskName = "test_task";
		String newName = "test_task2";
		
		// Actual
		int idTask = taskManager.insertTask(taskName);
		taskManager.updateTask(new Task(idTask, newName));
		Task taskFound = taskManager.searchTask(idTask);
		
		//Asssert
		assertNotNull(taskFound);
		assertEquals(taskFound.getName(), newName);
		
	}

}
