package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz5J {
    private zz67 zzZ1k;
    private zz67 zzZ1l;
    private zz5I zzZ1n = new zz5I();
    private zz5I zzZ1m = new zz5I();

    private zz5I zzHF(int i) {
        if (this.zzZ1n.getType() == i) {
            return this.zzZ1n;
        }
        if (this.zzZ1m.getType() == i) {
            return this.zzZ1m;
        }
        return null;
    }

    private float zzZyu() {
        return this.zzZ1m.zzZze() + this.zzZ1k.zzZzq();
    }

    private float zzZyv() {
        return this.zzZ1n.zzZze() + this.zzZ1l.zzZzq();
    }

    private zz5R zzZyw() {
        return zz5R.zzY1(this.zzZ1n.getType(), this.zzZ1m.getType());
    }

    public final float getSize() {
        return Math.abs(zzZyw().zzo(zzZyv(), zzZyu()));
    }

    public final float zzHG(int i) {
        return zzHF(i).zzZze();
    }

    public final boolean zzHH(int i) {
        return zzHF(i) != null;
    }

    public final void zzP(int i, float f) {
        zz5I zz5iZzHF = zzHF(i);
        if (zz5iZzHF != null) {
            zz5iZzHF.zzYR(f);
        }
    }

    public final void zzY(zz67 zz67Var) {
        this.zzZ1k = zz67Var;
    }

    public final void zzZ(zz67 zz67Var) {
        this.zzZ1l = zz67Var;
    }

    public final zz5I zzZys() {
        return this.zzZ1m;
    }

    public final zz5I zzZyt() {
        return this.zzZ1n;
    }

    public final float zzZyx() {
        return zzZyw().zzp(zzZyv(), zzZyu());
    }

    public final float zzZyy() {
        return zzZyw().zzq(zzZyv(), zzZyu());
    }

    public final float zzZyz() {
        return zzZyw().zzr(zzZyv(), zzZyu());
    }

    public final void zzra() {
        this.zzZ1n.zzYR(Float.POSITIVE_INFINITY);
        this.zzZ1m.zzYR(Float.POSITIVE_INFINITY);
    }
}
