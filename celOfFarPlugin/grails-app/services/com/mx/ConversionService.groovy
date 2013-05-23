package com.mx

class ConversionService {
    static transactional = false

    def convertCelsiusToFahrenheit = {   tempInCelsius ->

        def tempInFah = ((9.0/5.0) * tempInCelsius) + 32
        tempInFah

    }

    def convertFahrenheitToCelsius = { tempInFah ->

        def tempInCelsius = (tempInFah - 32) * (5.0/9.0)
        tempInCelsius

    }
}
