package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZX0 extends zzZWZ {
    private zzDB zz9l = zzDB.zzCT();
    private boolean zzz2;

    public zzZX0() {
    }

    public static zzZX0 zzZ(zzY0 zzy0, int i, boolean z) throws Exception {
        zzZX0 zzzx0 = new zzZX0(z);
        int i2 = 0;
        if (z) {
            int i3 = (int) ((((long) i) & 4294967295L) / 2);
            while (i2 < i3) {
                zzzx0.zz9l.add((zzy0.zzX9() & 65535) * 2);
                i2++;
            }
        } else {
            int i4 = (int) ((((long) i) & 4294967295L) / 4);
            while (i2 < i4) {
                zzzx0.zz9l.add(zzy0.zzXc());
                i2++;
            }
        }
        return zzzx0;
    }

    public final void zz7(boolean z) {
        this.zzz2 = z;
    }

    public final boolean zzHW() {
        return this.zzz2;
    }

    @Override // com.aspose.words.internal.zzZWZ
    public final void zzX(zzXZ zzxz) throws Exception {
        for (int i = 0; i < this.zz9l.getCount(); i++) {
            if (this.zzz2) {
                zzxz.zzj(this.zz9l.get(i) / 2);
            } else {
                zzxz.zzl(this.zz9l.get(i));
            }
        }
    }

    public final zzDB zzoI() {
        return this.zz9l;
    }

    public final void zzoJ() {
        int iMax = 0;
        for (int i = 0; i < this.zz9l.getCount(); i++) {
            if (this.zz9l.get(i) % 2 != 0) {
                this.zzz2 = false;
                return;
            }
            iMax = Math.max(iMax, this.zz9l.get(i));
        }
        this.zzz2 = iMax <= 131070;
    }

    private zzZX0(boolean z) {
        this.zzz2 = z;
    }
}
