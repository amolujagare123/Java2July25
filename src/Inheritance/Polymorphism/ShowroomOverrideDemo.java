package Inheritance.Polymorphism;

class Showroom {

     void channels() {
        System.out.println("Showroom: Generic channel control.");
    }

    void volumeControl() {
        System.out.println("Showroom: Generic volume control.");
    }

    void settings() {
        System.out.println("Showroom: Generic settings.");
    }
}

class Onida extends Showroom {

    void channels() {
        System.out.println("Onida TV: Switching channels.");
    }

    void volumeControl() {
        System.out.println("Onida TV: Adjusting volume.");
    }

    void settings() {
        System.out.println("Onida TV: Opening settings.");
    }
}

class Samsang extends Showroom {
    void channels() {
        System.out.println("Samsang TV: Switching channels.");
    }

    void volumeControl() {
        System.out.println("Samsang TV: Adjusting volume.");
    }

    void settings() {
        System.out.println("Samsang TV: Opening settings.");
    }
}

class LG extends Showroom {
    void channels() {
        System.out.println("LG TV: Switching channels.");
    }

    void volumeControl() {
        System.out.println("LG TV: Adjusting volume.");
    }

    void settings() {
        System.out.println("LG TV: Opening settings.");
    }
}

public class ShowroomOverrideDemo {
    public static void main(String[] args) {
        Showroom onida = new Onida();


        onida.channels();
        onida.volumeControl();
        onida.settings();

        Showroom samsang = new Samsang();
        samsang.channels();
        samsang.volumeControl();
        samsang.settings();

        Showroom lg = new LG();
        lg.channels();
        lg.volumeControl();
        lg.settings();
    }
}
