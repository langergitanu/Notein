package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zz3H {
    private zzZYV<int[]> zzhQ = new zzZYV<>();
    private zzJO zzhR;

    public zz3H(zzJO zzjo) {
        this.zzhR = zzjo;
    }

    private void zzZL(int i, int i2) {
        zzY(i, new int[]{i2});
    }

    public final boolean zzHo() {
        return this.zzhR.zzHo();
    }

    public abstract int zzTV(int i);

    public final void zzTW(int i) {
        this.zzhR.zzWP(i);
        zzZL(this.zzhR.zzPl().zzpP().zzSx(i).getGlyphIndex(), i);
    }

    public final void zzY(int i, int[] iArr) {
        if (this.zzhQ.zzVE(zzTV(i))) {
            return;
        }
        this.zzhQ.set(zzTV(i), iArr);
    }

    public final void zzZM(int i, int i2) {
        int iZzWQ = this.zzhR.zzWQ(i);
        if (i2 != 0) {
            this.zzhR.zzg(i2, iZzWQ);
            zzZL(i, i2);
        }
    }

    public abstract zzZYV<Integer> zzuc();

    public abstract zzZYV<Integer> zzud();

    public final void zzue() {
        for (int i = 0; i < this.zzhR.zzTt().getCount(); i++) {
            zzZL(this.zzhR.zzTt().zzVY(i).intValue(), this.zzhR.zzTt().zzT3(i));
        }
    }

    public final zzZYV<int[]> zzuf() {
        return this.zzhQ;
    }

    public final zzJO zzug() {
        return this.zzhR;
    }

    public final void zzY(zzZOP zzzop) throws Exception {
        this.zzhR.zzY(zzzop);
    }
}
