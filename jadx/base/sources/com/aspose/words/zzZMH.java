package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZMH implements Cloneable {
    private String mName;
    private ArrayList<zz7X> zzYwd = new ArrayList<>();
    private ArrayList<zz7X> zzYwc = new ArrayList<>();
    private ArrayList<zz4G> zzYwb = new ArrayList<>();
    private ArrayList<zzZV0> zzYwa = new ArrayList<>();

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final zz7X getBackgroundFillStyle(int i) {
        if (this.zzYwd.size() == 0) {
            return new zz54();
        }
        if (i >= this.zzYwd.size()) {
            i = this.zzYwd.size() - 1;
        }
        return this.zzYwd.get(i);
    }

    public final zzZV0 getEffectStyle(int i) {
        if (this.zzYwa.size() == 0) {
            return new zzZV0();
        }
        if (i >= this.zzYwa.size()) {
            i = this.zzYwa.size() - 1;
        }
        return this.zzYwa.get(i);
    }

    public final zz7X getFillStyle(int i) {
        if (this.zzYwc.size() == 0) {
            return new zz54();
        }
        if (i >= this.zzYwc.size()) {
            i = this.zzYwc.size() - 1;
        }
        return this.zzYwc.get(i);
    }

    public final zz4G getLineStyle(int i) {
        if (this.zzYwb.size() == 0) {
            return new zz4G();
        }
        if (i >= this.zzYwb.size()) {
            i = this.zzYwb.size() - 1;
        }
        return this.zzYwb.get(i);
    }

    public final String getName() {
        return this.mName;
    }

    public final void setName(String str) {
        this.mName = str;
    }

    public final int zzO(zz4G zz4g) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzYwb, zz4g);
        return this.zzYwb.size() - 1;
    }

    public final int zzT(zz7X zz7x) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzYwc, zz7x);
        return this.zzYwc.size() - 1;
    }

    public final int zzU(zz7X zz7x) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzYwd, zz7x);
        return this.zzYwd.size() - 1;
    }

    public final int zzY(zzZV0 zzzv0) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzYwa, zzzv0);
        return this.zzYwa.size() - 1;
    }

    public final int zzZ6A() {
        return this.zzYwd.size();
    }

    public final zzZMH zzZ6B() {
        zzZMH zzzmh = (zzZMH) memberwiseClone();
        zzzmh.zzYwd = new ArrayList<>();
        Iterator<zz7X> it = this.zzYwd.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(zzzmh.zzYwd, it.next().zzZQ6());
        }
        zzzmh.zzYwc = new ArrayList<>();
        Iterator<zz7X> it2 = this.zzYwc.iterator();
        while (it2.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(zzzmh.zzYwc, it2.next().zzZQ6());
        }
        zzzmh.zzYwb = new ArrayList<>();
        Iterator<zz4G> it3 = this.zzYwb.iterator();
        while (it3.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(zzzmh.zzYwb, it3.next().zzZxK());
        }
        zzzmh.zzYwa = com.aspose.words.internal.zzZQG.zzY(this.zzYwa);
        return zzzmh;
    }

    public final int zzZ6x() {
        return this.zzYwa.size();
    }

    public final int zzZ6y() {
        return this.zzYwb.size();
    }

    public final int zzZ6z() {
        return this.zzYwc.size();
    }
}
