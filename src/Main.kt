import java.awt.Choice

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//val task1 = Task("Study Kotlin","Finish OOP exercises",1,Priority.High,false)
//    task1.displayInfoTask() // test the class to see if its worked
    var input: Int = 0
    var taskManager = TaskManager()
    do {
        try{

        println("========== SMART TASK MANAGER ==========")
        println("1. Add Task")
        println("2. View Tasks")
        println("3. Mark Task as Completed")
        println("4. Delete Task")
        println("5. Exit")
        println("========================================")

        print("Enter Your Choice: ")
        input = readln().trim().toInt()

        when (input) {
            1 -> {
                var input1 =""
                var description = ""
                var Priorityinput = 0
                var selectedPriority:Priority? = null

                do{
                    try{

                println("========== ADD TASK ==========")
                println("Enter Task Name:")
                    input1 = readln()
                println("Enter Description:")
                    description = readln()
                        println("1.High")
                        println("2.Medium")
                        println("3. Low")
                        println("Enter Priority:")
                        Priorityinput = readln().toInt()
                        when(Priorityinput) {
                            1 -> selectedPriority =  Priority.High
                            2 -> selectedPriority= Priority.Medium
                            3 -> selectedPriority =  Priority.Low
                            else -> println("Invalid input! Please enter a number between 1 and 3.")
                        }
                    }catch(e:Exception){
                        println("Please enter a valid input. or a valid number")
                    }
                }while(Priorityinput<1 || Priorityinput> 3)
                taskManager.addTask(input1, description,selectedPriority!!)
            }
            2 ->  {
            println("========== View TASK ==========")

                taskManager.ViewTask()
            }


            3 -> {

                try{

                println("========== COMPLETE  TASK ==========")
                println("Enter the ID:")
                val id = readln().trim().toInt()
                    taskManager.taskCompleted(id)
                }catch(e:Exception){
                    println("Please enter a valid ID!")
                }

            }
            4 -> {
                println("========== Deleting  TASK ==========")
                var Choice:Char = ' '
                var Id = 0
                try {
                    println("Enter the Id:")
                    Id = readln().trim().toInt()
                    do {

                        println("Are you sure you want to delete: ")
                        Choice = readln()[0]
                        if (Choice == 'y' || Choice == 'Y') {
                            taskManager.RemoveTask(Id, Choice)
                        }
                        if(Choice == 'n' || Choice == 'N') {
                            taskManager.RemoveTask(Id,Choice)
                        }

                    } while (Choice != 'y' && Choice != 'Y' && Choice != 'n' && Choice != 'N')
                }
                    catch(e:Exception){
                        println("Please enter a valid Choice or Id!")
                    }
            }
            5 -> println("Goodbye!")
            else -> println("Invalid input! Please enter a number between 1 and 5.")
          }
        }
        catch(e: NumberFormatException) {
            println("Please enter a number between 1 and 5.")
        }


    } while (input != 5)
}