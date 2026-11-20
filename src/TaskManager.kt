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
    fun ViewTask(){
        if(listOfTasks.isEmpty()){
            println("View task is empty No task available.")
            println("Please ADD At least 1 Task")
            return
        }
        listOfTasks.forEach { task ->
            task.displayInfoTask()
        }
    }
    fun taskCompleted(id:Int){
        if(listOfTasks.isEmpty()){
            println(" task is empty No task available.")
            println("Please ADD At least 1 Task")
            return
        }
        val task = listOfTasks.find { it.getId() == id }
        if(task == null){
            println("Task not found.")
            return
        }
        if(task.getStatus() == false){
            task.setStatus(true)
            println("Task is  completed.")
            task.displayInfoTask()
        }
        else{
            println("Task is already complete.")
            task.displayInfoTask()
        }


    }
}