class Lamp{
    private var isOn = false

    fun turnOn(){
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }

    fun displayLightStatus(lamp:String){
        println("$lamp status : $isOn")
    }
}

fun main(args: Array<String>) {
    val l1 = Lamp()
    val l2 = Lamp()
    l1.turnOn()
    l2.turnOff()
    l1.displayLightStatus("l1")
    l2.displayLightStatus("l2")
}