package jeffpalmertagtest

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class DemoControllerSpec extends Specification implements ControllerUnitTest<DemoController> {

    void "test something"() {
        when:
        controller.index()

        then:
        notThrown Exception
    }

    Set<String> getIncludePlugins() {
        ['groovyPages', 'urlMappings']
    }
}
