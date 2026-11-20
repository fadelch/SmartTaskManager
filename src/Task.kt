class Task()
{
 private  var name = ""
   private var desc = ""
   private var Id = 0
   private var priority:Priority = Priority.Low
   private var iscompleted:Boolean = false
    fun getId():Int{
        return Id
    }
    fun setStatus( status:Boolean){
        this.iscompleted = status
    }
    fun getStatus():Boolean{
        return iscompleted
    }
    constructor(name: String, desc: String, id: Int, priority: Priority, iscompleted: Boolean) : this(){
        this.name = name
        this.desc = desc
        this.Id = id
        this.priority = priority
        this.iscompleted = iscompleted
    }
    fun displayInfoTask(){
        println("Task Id: $Id\nName: $name\ndesc: $desc\nPriority: $priority\nisCompleted: $iscompleted")
    }
}