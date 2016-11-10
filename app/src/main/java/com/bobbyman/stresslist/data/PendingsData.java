package com.bobbyman.stresslist.data;

import com.bobbyman.stresslist.models.Pending;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bobby1982 on 09-11-2016.
 */

public class PendingsData {

    public List<Pending> notDone() {
        List<Pending> pendings = new ArrayList<>();
        List<Pending> pendingList = Pending.find(Pending.class, "done=0");
        if (pendingList != null && pendingList.size() > 0) {
            pendings.addAll(pendingList);
        }
        return pendings;
    }
}
