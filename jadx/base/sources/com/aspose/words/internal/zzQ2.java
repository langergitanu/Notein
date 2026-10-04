package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzQ2 extends zzQ1 {
    public zzQ2() {
        super(4);
    }

    public final zzOQ zzPS() {
        zzOQ zzoq = new zzOQ();
        zz0Q zz0qZzZ = zzQ1.zzZ(zzoq);
        zz0Q zz0qZzZ2 = zzQ1.zzZ(this);
        zzQ1.zzZ(zzoq, zz0qZzZ2);
        for (int i = 0; i < getCount(); i++) {
            zzoq.zzZ(i, zzr(i, 0));
            zzoq.zzV(i, zzQ0.zzU(zzr(i, 1), zzr(i, 2)));
            zzoq.zzW(i, zzr(i, 3));
        }
        int iZzY = zzQ1.zzY(zzoq) * getCount();
        zz0qZzZ2.removeRange(iZzY, zz0qZzZ2.getCount() - iZzY);
        zzQ1.zzZ(this, zz0qZzZ);
        return zzoq;
    }

    public final void zzU(long j, long j2, long j3, long j4) {
        if (getCount() == 0) {
            zzV(j, j2, j3, j4);
            return;
        }
        zzY(0, 0, j);
        zzY(0, 1, j2);
        zzY(0, 2, j3);
        zzY(0, 3, j4);
    }

    public final void zzV(long j, long j2, long j3, long j4) {
        zzz(j);
        zzz(j2);
        zzz(j3);
        zzz(j4);
    }

    public final void zzW(int i, long j) {
        zzY(i, 3, j);
    }

    public final void zzX(int i, long j) {
        zzY(i, 2, j);
    }

    public final void zzY(int i, long j) {
        zzY(i, 1, j);
    }

    public final long zzYa(int i) {
        return zzr(i, 3);
    }

    public final long zzYb(int i) {
        return zzr(i, 2);
    }

    public final long zzYc(int i) {
        return zzr(i, 1);
    }

    public final long zzYd(int i) {
        return zzr(i, 0);
    }

    public final void zzZ(int i, long j) {
        zzY(i, 0, j);
    }

    public zzQ2(int i) {
        super(i, (byte) 0);
    }
}
