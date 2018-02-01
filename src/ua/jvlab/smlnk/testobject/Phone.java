package ua.jvlab.smlnk.testobject;

import java.util.Arrays;

public class Phone {
    // база номеров для регистрации в сети;
    String[] baseN = new String[]{"0671234567", "0677654321", "0681111111"};
    // база номеров дозвона;
    String[] baseCall = new String[]{"0671111111", "0672222222", "0683333333"};

    String phoneN;
    String phoneCall;

    public String getPhoneN() {
        return phoneN;
    }

    public void setPhoneN(String phoneN) {
        this.phoneN = phoneN;
    }

    public String getPhoneCall() {
        return phoneCall;
    }

    public void setPhoneCall(String phoneCall) {
        this.phoneCall = phoneCall;
    }

    public Phone() {
    }

    public Phone(String phoneN, String phoneCall) {
        this.phoneN = phoneN;
        this.phoneCall = phoneCall;
    }

    public void reestNet() {
        for (int i = 0; i < baseN.length; i++) {
            if (baseN[i].equalsIgnoreCase(phoneN)) System.out.println("Регистрация успешна!");
            else System.out.println("Ошибка регистрации сети");
        }
    }

    public void callPh(){
        for (int i = 0; i < baseCall.length; i++) {
            if (baseCall[i].equalsIgnoreCase(phoneCall)) {
                System.out.println("Набор номера... "+getPhoneCall());}
            else System.out.println("... Номер недоступен");
        }

    }
}



