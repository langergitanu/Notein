package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzJ2 {
    private zzY0 zzTA;
    private boolean zzz2;
    private zzZYZ zzz3;
    private zzZX0 zzz5;

    public zzJ2(zzY0 zzy0, zzZYZ zzzyz, zzZYZ zzzyz2, boolean z) throws Exception {
        this.zzTA = zzy0;
        this.zzz3 = zzzyz2;
        this.zzz2 = z;
        zzy0.zzq().zzH(((long) zzzyz.zzdZ) & 4294967295L);
        this.zzz5 = zzZX0.zzZ(this.zzTA, zzzyz.zzci, z);
    }

    public final int zzGP() {
        return this.zzz5.zzoI().getCount() - 1;
    }

    public final boolean zzHW() {
        return this.zzz2;
    }

    public final byte[] zzWp(int i) throws Exception {
        int iZzWq = zzWq(i);
        if (iZzWq == 0) {
            return new byte[0];
        }
        zzWr(i);
        return this.zzTA.zzn(iZzWq);
    }

    public final int zzWq(int i) {
        return this.zzz5.zzoI().get(i + 1) - this.zzz5.zzoI().get(i);
    }

    public final void zzWr(int i) throws Exception {
        this.zzTA.zzq().zzH((((long) this.zzz3.zzdZ) & 4294967295L) + ((long) this.zzz5.zzoI().get(i)));
    }
}
