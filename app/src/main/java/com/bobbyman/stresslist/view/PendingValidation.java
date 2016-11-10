package com.bobbyman.stresslist.view;

import com.bobbyman.stresslist.models.Pending;

/**
 * Created by Bobby1982 on 09-11-2016.
 */

public class PendingValidation {

    private CreateCallBack callback;

    public PendingValidation(CreateCallBack callback) {
        this.callback = callback;
    }

    public void init(String name){
        if (name.trim().length()>0){
            Pending pending=new Pending();
            pending.setName(name);
            pending.setDone(false);
            pending.save();
            callback.success(pending);
        } else {
            callback.fail();
        }
    }
}
