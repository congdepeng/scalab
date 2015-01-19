package lang.syntax.app;

import scala.App;
import scala.Function0;

public class JavaClassImplementsApp implements App {

    @Override
    public long executionStart() {
        return 0;
    }

    @Override
    public void delayedInit(Function0 body) {

    }

    @Override
    public String[] args() {
        return new String[0];
    }

    @Override
    public void main(String[] args) {
        System.out.println("main override");
    }

}
