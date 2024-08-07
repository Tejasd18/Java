package com.xworkz.companyfields;

import com.xworkz.companyfields.accenture.Accenture;
import com.xworkz.companyfields.ericsson.Ericsson;
import com.xworkz.companyfields.google.Google;
import com.xworkz.companyfields.ibm.Ibm;
import com.xworkz.companyfields.infosys.Infosys;

public class CompanyRunner {

    public static void main(String[] args) {

        Accenture accenture = new Accenture();
        accenture.services();

        Ericsson ericsson = new Ericsson();
        ericsson.services();

        Google google = new Google();
        google.services();

        Ibm ibm = new Ibm();
        ibm.services();

        Infosys infosys = new Infosys();
        infosys.services();

    }
}
