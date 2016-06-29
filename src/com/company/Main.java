package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Remote> listRemote = new ArrayList<Remote>();


        listRemote.add(new Remote("asdf")) ;
        listRemote.add(new Remote("aaaa")) ;
        listRemote.add(new Remote("bbb")) ;

        for (Remote remote: listRemote) {
            remote.numberButtonPressed();
            remote.channelDown();
            remote.channelUp();
            remote.volumeDown();
            remote.volumeUp();
        }

    }
}
