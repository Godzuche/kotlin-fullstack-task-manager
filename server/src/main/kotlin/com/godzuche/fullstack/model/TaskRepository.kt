package com.godzuche.fullstack.model

import com.godzuche.kmm_fullstack.model.Priority
import com.godzuche.kmm_fullstack.model.Task

interface TaskRepository {
    fun allTasks(): List<Task>
    fun tasksByPriority(priority: Priority): List<Task>
    fun taskByName(name: String): Task?
    fun addOrUpdateTask(task: Task)
    fun removeTask(name: String): Boolean
}