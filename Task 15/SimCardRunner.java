class SimCardRunner {

    public static void main(String[] network) {

        SimCard simCard1 = new SimCard();
        simCard1.createSimCard("jio","Unlimited Data",75.00,1);
        simCard1.displaySimCardInfo();

        SimCard simCard2 = new SimCard();
        simCard2.createSimCard("BSNL","Unlimited Talk and Text",40.00,2);
		simCard2.displaySimCardInfo();

        SimCard simCard3 = new SimCard();
        simCard3.createSimCard("VI","Family Plan",60.00,3);
		simCard3.displaySimCardInfo();

        SimCard simCard4 = new SimCard();
        simCard4.createSimCard("AIRTEL","Prepaid Plan",30.00,4);
		simCard4.displaySimCardInfo();

        SimCard simCard5 = new SimCard();
        simCard5.createSimCard("IDEA","Monthly Plan",25.00,5);
        simCard5.displaySimCardInfo();

        SimCard simCard6 = new SimCard();
        simCard6.createSimCard("Metro by T-Mobile","Unlimited Data Plan",50.00,6);
        simCard6.displaySimCardInfo();

        SimCard simCard7 = new SimCard();
        simCard7.createSimCard("Cricket Wireless","Basic Plan",35.00,7);
        simCard7.displaySimCardInfo();

        SimCard simCard8 = new SimCard();
        simCard8.createSimCard("Google Fi","Flexible Plan",20.00,8);
        simCard8.displaySimCardInfo();

        SimCard simCard9 = new SimCard();
        simCard9.createSimCard("Mint Mobile","3-Month Plan",45.00,9);
        simCard9.displaySimCardInfo();

        SimCard simCard10 = new SimCard();
        simCard10.createSimCard("Simple Mobile","Unlimited Plan",50.00,10);
        simCard10.displaySimCardInfo();

        SimCard simCard11 = new SimCard();
        simCard11.createSimCard("H2O Wireless","Monthly Unlimited Plan",27.00,11);
        simCard11.displaySimCardInfo();

        SimCard simCard12 = new SimCard();
        simCard12.createSimCard("Ultra Mobile","International Plan",19.00,12);
        simCard12.displaySimCardInfo();

        SimCard simCard13 = new SimCard();
        simCard13.createSimCard("Red Pocket Mobile","Annual Plan",199.00,13);
        simCard13.displaySimCardInfo();

        SimCard simCard14 = new SimCard();
        simCard14.createSimCard("Straight Talk","Unlimited Nationwide Plan",55.00,14);
        simCard14.displaySimCardInfo();

        SimCard simCard15 = new SimCard();
        simCard15.createSimCard("Visible","Unlimited Everything Plan",40.00,15);
        simCard15.displaySimCardInfo();
    }
}


