class TaskManager() {
    private val listOfTasks = mutableListOf<Task>()
    private  var taskId :Int = 0
    fun addTask(name:String,description:String,priority:Priority) {
        if(name.isBlank() || description.isBlank() || priority == null) {
            println("Task name or description cannot be empty.!")
            return
        }
        taskId++
        val task = Task(name, description,taskId, priority,false)
        listOfTasks.add(task)
        println("Task added successfully.")
        task.displayInfoTask()
    }
}