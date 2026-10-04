package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYY6 {
    private int zzXXZ;
    private int zzXY0;
    private int zzZE1;

    public abstract String getNewValue();

    public final String zzKY(String str) {
        zzaH();
        getNewValue();
        return str.replace(zzaH(), getNewValue());
    }

    public final void zzP5(int i) {
        this.zzZE1 = i;
    }

    public final int zzYCC() {
        return this.zzXXZ;
    }

    public final int zzYCD() {
        return this.zzXY0;
    }

    public abstract String zzaH();

    public abstract String zzaI();

    public final int zzaL() {
        return this.zzZE1;
    }

    public final void zztX(int i) {
        this.zzXXZ = i;
    }

    public final void zztY(int i) {
        this.zzXY0 = i;
    }
}
