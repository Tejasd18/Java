package com.xworkz.engineerfield;

import com.xworkz.engineerfield.aidsengineer.AidsEngineer;
import com.xworkz.engineerfield.civilengineer.CivilEngineer;
import com.xworkz.engineerfield.csengineer.CsEngineer;
import com.xworkz.engineerfield.cybersecurityengineer.CyberSecurityEngineer;
import com.xworkz.engineerfield.ecengineer.EcEngineer;
import com.xworkz.engineerfield.isengineer.IsEngineer;
import com.xworkz.engineerfield.mechengineer.MechEngineer;

public class EngineerRunner {

    public static void main(String[] args) {

        AidsEngineer aidsEngineer = new AidsEngineer();
        aidsEngineer.solveProblem();

        CivilEngineer civilEngineer = new CivilEngineer();
        civilEngineer.solveProblem();

        CsEngineer csEngineer = new CsEngineer();
        csEngineer.solveProblem();

        CyberSecurityEngineer cyberSecurityEngineer = new CyberSecurityEngineer();
        cyberSecurityEngineer.solveProblem();

        EcEngineer ecEngineer = new EcEngineer();
        ecEngineer.solveProblem();

        IsEngineer isEngineer = new IsEngineer();
        isEngineer.solveProblem();

        MechEngineer mechEngineer = new MechEngineer();
        mechEngineer.solveProblem();

    }
}
