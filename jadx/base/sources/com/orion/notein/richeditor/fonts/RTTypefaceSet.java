package com.orion.notein.richeditor.fonts;

import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: loaded from: classes9.dex */
public class RTTypefaceSet extends ConcurrentSkipListSet<RTTypeface> {
    private RTTypeface tmp = new RTTypeface();

    public boolean contains(String str) {
        this.tmp.setName(str);
        return contains(this.tmp);
    }

    public RTTypeface get(String str) {
        if (!contains(str)) {
            return null;
        }
        for (RTTypeface rTTypeface : this) {
            if (rTTypeface.getName().equals(str)) {
                return rTTypeface;
            }
        }
        return null;
    }
}
