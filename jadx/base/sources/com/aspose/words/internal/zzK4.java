package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzK4 {
    private ArrayList<zzK3> zzBA = new ArrayList<>();
    private ArrayList<String> zzBz = new ArrayList<>();
    private ArrayList<String> zzBy = new ArrayList<>();

    private boolean zzWW(int i) {
        if (this.zzBA.size() == 0) {
            return true;
        }
        Iterator<zzK3> it = this.zzBA.iterator();
        while (it.hasNext()) {
            if (it.next().zzWV(i)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList<String> zzI1() {
        return this.zzBy;
    }

    public final ArrayList<String> zzI2() {
        return this.zzBz;
    }

    public final ArrayList<zzK3> zzI3() {
        return this.zzBA;
    }

    public final boolean zzS(String str, int i) {
        if (!zzWW(i)) {
            return false;
        }
        if (this.zzBy.size() == 0) {
            return true;
        }
        Iterator<String> it = this.zzBy.iterator();
        while (it.hasNext()) {
            if (zzZYD.zzi(it.next(), str)) {
                return true;
            }
        }
        return false;
    }
}
