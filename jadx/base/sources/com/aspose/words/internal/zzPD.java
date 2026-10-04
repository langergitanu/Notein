package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzPD {
    private zzPO zzHh;
    private int mLength = 0;
    private int zzL4 = 0;
    private int zzVL = 0;

    public final int getLength() {
        return this.mLength;
    }

    public final int getType() {
        return this.zzL4;
    }

    public final int getWidth() {
        return this.zzVL;
    }

    public final void setLength(int i) {
        this.mLength = i;
    }

    public final void setType(int i) {
        this.zzL4 = i;
    }

    public final void setWidth(int i) {
        this.zzVL = i;
    }

    public final String toString() {
        return zzZKN.format("Type:{0} Length:{1} Width:{2}", zzPC.toString(this.zzL4), zzPE.toString(this.mLength), zzPE.toString(this.zzVL));
    }

    public final zzPO zzOx() {
        return this.zzHh;
    }

    public final zzPD zzOy() {
        zzPD zzpd = new zzPD();
        zzpd.zzL4 = this.zzL4;
        zzpd.mLength = this.mLength;
        zzpd.zzVL = this.zzVL;
        zzpd.zzHh = this.zzHh;
        return zzpd;
    }

    public final void zzZ(zzPO zzpo) {
        this.zzHh = zzpo;
    }
}
