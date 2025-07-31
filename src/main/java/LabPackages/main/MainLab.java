package LabPackages.main;


// Import here manually
import LabPackages.packageone.*;
import LabPackages.packagetwo.*;
import LabPackages.packagethree.*;
import static java.lang.System.*;
public class MainLab {
    public static void main(String[] args) {
        ClassOne one = new ClassOne();
        ClassTwo two = new ClassTwo();
        ClassThree three = new ClassThree();
        out.println(one.greet()+"\n"+two.greet()+"\n"+three.greet());
    }
}