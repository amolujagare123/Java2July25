package FinalNStatic.DemoStatic;

/*
import static FinalNStatic.Student2.college;
import static FinalNStatic.Student2.staticMethod1;
import static FinalNStatic.Student2.staticMethod2;*/

import FinalNStatic.Student2;

import static FinalNStatic.Student2.*;

public class TestFinalMethod2 {

    public static void main(String[] args) {

        Student2.staticMethod1();
        Student2.staticMethod2();
        Student2.college = "xyz";

        staticMethod1();
        staticMethod2();
        college = "xyz";
    }
}
