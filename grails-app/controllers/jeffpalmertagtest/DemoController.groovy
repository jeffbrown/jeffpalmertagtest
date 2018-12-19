package jeffpalmertagtest

class DemoController {

    def index() {
        def result = formatDate(format:'MM/dd/yyyy', date: new Date() - 30)

        render result
    }
}
