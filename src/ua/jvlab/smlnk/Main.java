package ua.jvlab.smlnk;

import ua.jvlab.smlnk.testobject.Phone;

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone();
        // данные для регистрации;
        phone.setPhoneN("0681111111");
        // данные номера дозвона;
        phone.setPhoneCall("0671111111");
        // регистрируемся;
        phone.reestNet();
        // звоним;
        phone.callPh();
    }
}
