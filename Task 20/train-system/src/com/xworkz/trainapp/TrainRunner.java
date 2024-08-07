package com.xworkz.trainapp;

import com.xworkz.trainapp.chennaiexpress.ChennaiExpress;
import com.xworkz.trainapp.golgumbazepresss.GolgumbazExpress;
import com.xworkz.trainapp.rajdhaniexpress.RajdhaniExpress;
import com.xworkz.trainapp.shatabdiexpress.ShatabdiExpress;
import com.xworkz.trainapp.train.Train;
import com.xworkz.trainapp.vandebharath.VandeBharath;

public class TrainRunner {

    public static void main(String[] args) {

        Train chennaiExpress = new ChennaiExpress();
        chennaiExpress.travel();

        Train golgumbazExpress = new GolgumbazExpress();
        golgumbazExpress.travel();

        Train rajdhaniExpress = new RajdhaniExpress();
        rajdhaniExpress.travel();

        Train shatabdiExpress = new ShatabdiExpress();
        shatabdiExpress.travel();

        Train vandeBharath = new VandeBharath();
        vandeBharath.travel();

    }
}
