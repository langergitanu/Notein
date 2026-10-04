package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzAQ {
    private zzBW[] zzZeT;
    private int zzZ7m = 1;
    private int zzZ7l = 2;

    public final boolean isEmpty() {
        zzBW[] zzbwArr = this.zzZeT;
        return zzbwArr == null || zzbwArr.length == 0;
    }

    public final void zzJp(int i) {
        this.zzZ7l = i;
    }

    public final void zzJq(int i) {
        this.zzZ7m = i;
    }

    public final void zzZ(zzBW[] zzbwArr) {
        this.zzZeT = zzbwArr;
    }

    public final int zzZEE() {
        return this.zzZ7l;
    }

    public final int zzZEF() {
        return this.zzZ7m;
    }

    public final zzBW[] zzZO0() {
        return this.zzZeT;
    }
}
