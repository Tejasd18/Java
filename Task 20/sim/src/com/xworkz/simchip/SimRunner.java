package com.xworkz.simchip;

import com.xworkz.simchip.airtel.Airtel;
import com.xworkz.simchip.bsnl.Bsnl;
import com.xworkz.simchip.jio.Jio;
import com.xworkz.simchip.sim.Sim;
import com.xworkz.simchip.vi.Vi;

public class SimRunner {

    public static void main(String[] args) {

        Sim airtel = new Airtel();
        airtel.authentication();

        Sim bsnl = new Bsnl();
        bsnl.authentication();

        Sim jio = new Jio();
        jio.authentication();

        Sim vi = new Vi();
        vi.authentication();

    }
}
