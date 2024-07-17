class BatteryRunner {

    public static void main(String[] energy) {

        Battery battery1 = new Battery();
        battery1.brandName = "Duracell";
        battery1.type = "AA";
        battery1.capacity = 2000;
        battery1.voltage = 1.5;
        battery1.rechargeable = false;
        battery1.price = 1.50;
		battery1.id = 1;
        System.out.println("The Battery Brand is: " + battery1.brandName + "\n" +
                           "The Type is: " + battery1.type + "\n" +
                           "The Capacity is: " + battery1.capacity + " mAh\n" +
                           "The Voltage is: " + battery1.voltage + " V\n" +
                           "Rechargeable: " + battery1.rechargeable + "\n" +
                           "The Price is: Rs." + battery1.price + "\n" +
						   "Id is: " + battery1.id + "\n");

        Battery battery2 = new Battery();
        battery2.brandName = "Energizer";
        battery2.type = "AAA";
        battery2.capacity = 1000;
        battery2.voltage = 1.5;
        battery2.rechargeable = false;
        battery2.price = 1.20;
		battery2.id = 2;
        System.out.println("The Battery Brand is: " + battery2.brandName + "\n" +
                           "The Type is: " + battery2.type + "\n" +
                           "The Capacity is: " + battery2.capacity + " mAh\n" +
                           "The Voltage is: " + battery2.voltage + " V\n" +
                           "Rechargeable: " + battery2.rechargeable + "\n" +
                           "The Price is: Rs." + battery2.price + "\n"+
						   "Id is: " + battery2.id + "\n");

        Battery battery3 = new Battery();
        battery3.brandName = "Panasonic";
        battery3.type = "C";
        battery3.capacity = 8000;
        battery3.voltage = 1.5;
        battery3.rechargeable = false;
        battery3.price = 2.00;
		battery3.id = 3;
        System.out.println("The Battery Brand is: " + battery3.brandName + "\n" +
                           "The Type is: " + battery3.type + "\n" +
                           "The Capacity is: " + battery3.capacity + " mAh\n" +
                           "The Voltage is: " + battery3.voltage + " V\n" +
                           "Rechargeable: " + battery3.rechargeable + "\n" +
                           "The Price is: Rs." + battery3.price + "\n" +
						   "Id is: " + battery3.id + "\n");

        Battery battery4 = new Battery();
        battery4.brandName = "Sony";
        battery4.type = "D";
        battery4.capacity = 12000;
        battery4.voltage = 1.5;
        battery4.rechargeable = false;
        battery4.price = 2.50;
		battery4.id = 4;
        System.out.println("The Battery Brand is: " + battery4.brandName + "\n" +
                           "The Type is: " + battery4.type + "\n" +
                           "The Capacity is: " + battery4.capacity + " mAh\n" +
                           "The Voltage is: " + battery4.voltage + " V\n" +
                           "Rechargeable: " + battery4.rechargeable + "\n" +
                           "The Price is: Rs." + battery4.price + "\n" +
						   "Id is: " + battery4.id + "\n");

        Battery battery5 = new Battery();
        battery5.brandName = "AmazonBasics";
        battery5.type = "9V";
        battery5.capacity = 600;
        battery5.voltage = 9.0;
        battery5.rechargeable = false;
        battery5.price = 1.75;
		battery5.id = 5;
        System.out.println("The Battery Brand is: " + battery5.brandName + "\n" +
                           "The Type is: " + battery5.type + "\n" +
                           "The Capacity is: " + battery5.capacity + " mAh\n" +
                           "The Voltage is: " + battery5.voltage + " V\n" +
                           "Rechargeable: " + battery5.rechargeable + "\n" +
                           "The Price is: Rs." + battery5.price + "\n"+
						   "Id is: " + battery5.id + "\n");

        Battery battery6 = new Battery();
        battery6.brandName = "Eneloop";
        battery6.type = "AA";
        battery6.capacity = 2000;
        battery6.voltage = 1.2;
        battery6.rechargeable = true;
        battery6.price = 3.00;
		battery6.id = 6;
        System.out.println("The Battery Brand is: " + battery6.brandName + "\n" +
                           "The Type is: " + battery6.type + "\n" +
                           "The Capacity is: " + battery6.capacity + " mAh\n" +
                           "The Voltage is: " + battery6.voltage + " V\n" +
                           "Rechargeable: " + battery6.rechargeable + "\n" +
                           "The Price is: Rs." + battery6.price + "\n" +
						   "Id is: " + battery6.id + "\n");

        Battery battery7 = new Battery();
        battery7.brandName = "Samsung";
        battery7.type = "18650";
        battery7.capacity = 3000;
        battery7.voltage = 3.7;
        battery7.rechargeable = true;
        battery7.price = 4.00;
		battery7.id = 7;
        System.out.println("The Battery Brand is: " + battery7.brandName + "\n" +
                           "The Type is: " + battery7.type + "\n" +
                           "The Capacity is: " + battery7.capacity + " mAh\n" +
                           "The Voltage is: " + battery7.voltage + " V\n" +
                           "Rechargeable: " + battery7.rechargeable + "\n" +
                           "The Price is: Rs." + battery7.price + "\n"+
						   "Id is: " + battery7.id + "\n");

        Battery battery8 = new Battery();
        battery8.brandName = "LG";
        battery8.type = "18650";
        battery8.capacity = 2500;
        battery8.voltage = 3.7;
        battery8.rechargeable = true;
        battery8.price = 3.50;
		battery8.id = 8;
        System.out.println("The Battery Brand is: " + battery8.brandName + "\n" +
                           "The Type is: " + battery8.type + "\n" +
                           "The Capacity is: " + battery8.capacity + " mAh\n" +
                           "The Voltage is: " + battery8.voltage + " V\n" +
                           "Rechargeable: " + battery8.rechargeable + "\n" +
                           "The Price is: Rs." + battery8.price + "\n" +
						   "Id is: " + battery8.id + "\n");

        Battery battery9 = new Battery();
        battery9.brandName = "Tesla";
        battery9.type = "21700";
        battery9.capacity = 4800;
        battery9.voltage = 3.7;
        battery9.rechargeable = true;
        battery9.price = 5.00;
		battery9.id = 9;
        System.out.println("The Battery Brand is: " + battery9.brandName + "\n" +
                           "The Type is: " + battery9.type + "\n" +
                           "The Capacity is: " + battery9.capacity + " mAh\n" +
                           "The Voltage is: " + battery9.voltage + " V\n" +
                           "Rechargeable: " + battery9.rechargeable + "\n" +
                           "The Price is: Rs." + battery9.price + "\n"+
						   "Id is: " + battery9.id + "\n");

        Battery battery10 = new Battery();
        battery10.brandName = "Apple";
        battery10.type = "Li-ion";
        battery10.capacity = 2800;
        battery10.voltage = 3.7;
        battery10.rechargeable = true;
        battery10.price = 8.00;
		battery10.id = 10;
        System.out.println("The Battery Brand is: " + battery10.brandName + "\n" +
                           "The Type is: " + battery10.type + "\n" +
                           "The Capacity is: " + battery10.capacity + " mAh\n" +
                           "The Voltage is: " + battery10.voltage + " V\n" +
                           "Rechargeable: " + battery10.rechargeable + "\n" +
                           "The Price is: Rs." + battery10.price + "\n"+
						   "Id is: " + battery10.id + "\n");

        Battery battery11 = new Battery();
        battery11.brandName = "Nokia";
        battery11.type = "Li-ion";
        battery11.capacity = 1500;
        battery11.voltage = 3.7;
        battery11.rechargeable = true;
        battery11.price = 4.50;
		battery11.id = 11;
        System.out.println("The Battery Brand is: " + battery11.brandName + "\n" +
                           "The Type is: " + battery11.type + "\n" +
                           "The Capacity is: " + battery11.capacity + " mAh\n" +
                           "The Voltage is: " + battery11.voltage + " V\n" +
                           "Rechargeable: " + battery11.rechargeable + "\n" +
                           "The Price is: Rs." + battery11.price + "\n" +
						   "Id is: " + battery11.id + "\n");

        Battery battery12 = new Battery();
        battery12.brandName = "Xiaomi";
        battery12.type = "Li-Po";
        battery12.capacity = 5000;
        battery12.voltage = 3.7;
        battery12.rechargeable = true;
        battery12.price = 6.00;
		battery12.id = 12;
        System.out.println("The Battery Brand is: " + battery12.brandName + "\n" +
                           "The Type is: " + battery12.type + "\n" +
                           "The Capacity is: " + battery12.capacity + " mAh\n" +
                           "The Voltage is: " + battery12.voltage + " V\n" +
                           "Rechargeable: " + battery12.rechargeable + "\n" +
                           "The Price is: Rs." + battery12.price + "\n" +
						   "Id is: " + battery12.id + "\n");

        Battery battery13 = new Battery();
        battery13.brandName = "Anker";
        battery13.type = "Li-ion";
        battery13.capacity = 10000;
        battery13.voltage = 3.7;
        battery13.rechargeable = true;
        battery13.price = 12.00;
		battery13.id = 13;
        System.out.println("The Battery Brand is: " + battery13.brandName + "\n" +
                           "The Type is: " + battery13.type + "\n" +
                           "The Capacity is: " + battery13.capacity + " mAh\n" +
                           "The Voltage is: " + battery13.voltage + " V\n" +
                           "Rechargeable: " + battery13.rechargeable + "\n" +
                           "The Price is: Rs." + battery13.price + "\n" +
						   "Id is: " + battery13.id + "\n");

        Battery battery14 = new Battery();
        battery14.brandName = "Tenergy";
        battery14.type = "NiMH";
        battery14.capacity = 2200;
        battery14.voltage = 1.2;
        battery14.rechargeable = true;
        battery14.price = 2.50;
		battery14.id = 14;
        System.out.println("The Battery Brand is: " + battery14.brandName + "\n" +
                           "The Type is: " + battery14.type + "\n" +
                           "The Capacity is: " + battery14.capacity + " mAh\n" +
                           "The Voltage is: " + battery14.voltage + " V\n" +
                           "Rechargeable: " + battery14.rechargeable + "\n" +
                           "The Price is: Rs." + battery14.price + "\n" +
						   "Id is: " + battery14.id + "\n");

        Battery battery15 = new Battery();
        battery15.brandName = "GP";
        battery15.type = "Alkaline";
        battery15.capacity = 1500;
        battery15.voltage = 1.5;
        battery15.rechargeable = false;
        battery15.price = 1.00;
		battery15.id = 15;
        System.out.println("The Battery Brand is: " + battery15.brandName + "\n" +
                           "The Type is: " + battery15.type + "\n" +
                           "The Capacity is: " + battery15.capacity + " mAh\n" +
                           "The Voltage is: " + battery15.voltage + " V\n" +
                           "Rechargeable: " + battery15.rechargeable + "\n" +
                           "The Price is: Rs." + battery15.price + "\n"+
						   "Id is: " + battery15.id + "\n");
    }
}

