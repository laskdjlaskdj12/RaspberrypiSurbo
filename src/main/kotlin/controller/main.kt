package controller

import com.pi4j.io.gpio.GpioFactory
import com.pi4j.io.gpio.PinState
import com.pi4j.io.gpio.RaspiPin
import java.util.concurrent.TimeUnit

//동작 시작
fun main(args: Array<String>) {
    val gpio = GpioFactory.getInstance()
    val pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_07, "Surbo", PinState.LOW)
    pin.toggle()
    pin.pulse(200, TimeUnit.MILLISECONDS)
}