package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZP4 implements Cloneable {
    private int zzZYP;
    private String zzZYQ;

    public zzZP4(zzZPR zzzpr) {
        this.zzZYQ = zzZKN.zzU3(zzzpr.zzjZ()) ? "," : zzzpr.zzjZ();
        this.zzZYP = zzzpr.zzjY();
    }

    public final int zzjY() {
        return this.zzZYP;
    }

    public final String zzjZ() {
        return this.zzZYQ;
    }
}
