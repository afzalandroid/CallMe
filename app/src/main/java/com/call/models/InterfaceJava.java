package com.call.models;

import android.webkit.JavascriptInterface;

import com.call.activities.CallActivity;

public class InterfaceJava {


CallActivity callActivity;

    public InterfaceJava(CallActivity callActivity) {
        this.callActivity = callActivity;
    }

    @JavascriptInterface
    public void onPeerConnected(){
        callActivity.onPeerConnected();
    }
}
