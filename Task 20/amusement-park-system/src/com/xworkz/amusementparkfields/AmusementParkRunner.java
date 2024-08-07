package com.xworkz.amusementparkfields;

import com.xworkz.amusementparkfields.disneyland.DisneyLand;
import com.xworkz.amusementparkfields.funworld.FunWorld;
import com.xworkz.amusementparkfields.ramojifilmcity.RamojiFilmCity;
import com.xworkz.amusementparkfields.snowworld.SnowWorld;
import com.xworkz.amusementparkfields.wonderla.Wonderla;

public class AmusementParkRunner {

    public static void main(String[] args) {

        DisneyLand disneyLand = new DisneyLand();
        disneyLand.enjoy();

        FunWorld funWorld = new FunWorld();
        funWorld.enjoy();

        RamojiFilmCity ramojiFilmCity = new RamojiFilmCity();
        ramojiFilmCity.enjoy();

        SnowWorld snowWorld = new SnowWorld();
        snowWorld.enjoy();

        Wonderla wonderla = new Wonderla();
        wonderla.enjoy();

    }


}
