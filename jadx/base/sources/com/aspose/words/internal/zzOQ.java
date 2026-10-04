package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzOQ extends zzQ1 {
    public zzOQ() {
        super(3);
    }

    private void zzX(long j, long j2, long j3) {
        zzz(j);
        zzz(j2);
        zzz(j3);
    }

    private float zzXS(int i) {
        return zzQ0.zzZ(zzr(i, 0), zzr(i, 1), zzr(i, 2));
    }

    public final float zzNt() {
        float fZzXS = 0.0f;
        for (int i = 0; i < getCount(); i++) {
            fZzXS += zzXS(i);
        }
        return fZzXS;
    }

    public final void zzV(int i, long j) {
        zzY(i, 1, j);
    }

    public final void zzW(int i, long j) {
        zzY(i, 2, j);
    }

    public final long zzXT(int i) {
        return zzr(i, 1);
    }

    public final void zzY(zzOQ zzoq, int i) {
        zzX(zzoq.zzr(i, 0), zzoq.zzr(i, 1), zzoq.zzr(i, 2));
    }

    public final long zzYa(int i) {
        return zzr(i, 2);
    }

    public final long zzYd(int i) {
        return zzr(i, 0);
    }

    public final void zzZ(int i, long j, long j2, long j3) {
        if (i == getCount()) {
            zzX(j, j2, j3);
            return;
        }
        zzY(i, 0, j);
        zzY(i, 1, j2);
        zzY(i, 2, j3);
    }

    public final void zzZ(int i, long j) {
        zzY(i, 0, j);
    }
}
