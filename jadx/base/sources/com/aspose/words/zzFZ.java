package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzFZ implements Cloneable {
    private ArrayList<zzZCM> zzZeQ;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final ArrayList<zzZCM> zzZNX() {
        if (this.zzZeQ == null) {
            this.zzZeQ = new ArrayList<>();
        }
        return this.zzZeQ;
    }

    public final zzFZ zzZNY() {
        zzFZ zzfz = (zzFZ) memberwiseClone();
        if (this.zzZeQ != null) {
            zzfz.zzZeQ = new ArrayList<>();
            for (int i = 0; i < this.zzZeQ.size(); i++) {
                zzfz.zzZeQ.add(this.zzZeQ.get(i).zzZFm());
            }
        }
        return zzfz;
    }

    public final void zze(ArrayList<zzZCM> arrayList) {
        this.zzZeQ = arrayList;
    }
}
