package com.xworkz.socialmedia;

import com.xworkz.socialmedia.snapchat.Snapchat;
import com.xworkz.socialmedia.tiktok.Tiktok;
import com.xworkz.socialmedia.whatsapp.Whatsapp;
import com.xworkz.socialmedia.youtube.Youtube;

public class SocialMediaRunner {

    public static void main(String[] args) {

        Snapchat snapchat = new Snapchat();
        snapchat.timePass();

        Tiktok tiktok = new Tiktok();
        tiktok.timePass();

        Whatsapp whatsapp = new Whatsapp();
        whatsapp.timePass();

        Youtube youtube = new Youtube();
        youtube.timePass();

    }
}
