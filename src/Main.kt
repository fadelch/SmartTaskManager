//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//val task1 = Task("Study Kotlin","Finish OOP exercises",1,Priority.High,false)
//    task1.displayInfoTask() // test the class to see if its worked
    var input: Int = 0

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
            1 -> println("Add Task selected")
            2 -> println("View Tasks selected")
            3 -> println("Mark Task as Completed selected")
            4 -> println("Delete Task selected")
            5 -> println("Goodbye!")
            else -> println("Invalid input! Please enter a number between 1 and 5.")
          }
        }
        catch(e: NumberFormatException) {
            println("Please enter a number between 1 and 5.")
        }


    } while (input != 5)
}