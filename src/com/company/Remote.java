package com.company;

/**
 * Created by lenoubun16 on 6/28/16.
 */
public abstract class Remote {
    boolean mNeedsBatteries;
    boolean mSupportsUsb;

    public Remote(boolean needsBatteries, boolean supportsUsb ) {
        mNeedsBatteries = needsBatteries;
        mSupportsUsb = supportsUsb;
    }

    public boolean getNeedsBatteries() {
        return mNeedsBatteries;
    }

    public boolean getSupportsUsb() {
        return mSupportsUsb;
    }

    public void setmNeedsBatteries(boolean needsBatteries) {
        mNeedsBatteries = needsBatteries;
    }

    public void setmSupportsUsb(boolean supportsUsb) {
        mSupportsUsb = supportsUsb;
    }

    public abstract void channelUp();
    public abstract void channelDown();
    public abstract void volumeUp();
    public abstract void volumeDown();

    public void numberButtonPressed() {
        System.out.println("Power button pressed");
    }

    public void numberButtonPressed(int num) {
        System.out.println("Changing channel to" + num);
    }

}
