package com.solutionresort.boilerplate

import spock.lang.Specification

class AppTest extends Specification {

    def "App Test"() {

        expect:
        def app = new App()
        app instanceof App

    }
}
