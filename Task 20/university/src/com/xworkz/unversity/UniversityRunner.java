package com.xworkz.unversity;

import com.xworkz.unversity.cambridge.Cambridge;
import com.xworkz.unversity.harvard.Harvad;
import com.xworkz.unversity.standford.Standford;
import com.xworkz.unversity.tokyo.Tokyo;
import com.xworkz.unversity.vtu.Vtu;

import java.util.Stack;

public class UniversityRunner {

    public static void main(String[] args) {

        Cambridge cambridge = new Cambridge();
        cambridge.business();

        Harvad harvad = new Harvad();
        harvad.business();

        Standford standford = new Standford();
        standford.business();

        Tokyo tokyo = new Tokyo();
        tokyo.business();

        Vtu vtu = new Vtu();
        vtu.business();

    }
}
