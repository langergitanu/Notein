package com.aspose.words.internal;

import com.miui.penengine.p596e.C18773h;

/* JADX INFO: loaded from: classes5.dex */
final class zz2G implements zzH2 {
    private boolean zzGx;
    private zz4X zzgk;
    private long zzl2 = 0;

    public zz2G(zz4X zz4x) {
        this.zzgk = zz4x;
    }

    private void zzW(long[] jArr) throws Exception {
        for (int i = 0; i < 3; i++) {
            this.zzgk.zzZ7(jArr[i]);
            if (i < 2) {
                this.zzgk.zzFh();
            }
        }
        this.zzgk.zzXW(" c ");
    }

    private void zzm(long j) throws Exception {
        this.zzgk.zzZ7(j);
        this.zzgk.zzXW(" l ");
    }

    private void zzn(long j) throws Exception {
        this.zzgk.zzZ7(j);
        this.zzgk.zzXW(" m ");
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzY(zzP5 zzp5) throws Exception {
        if (this.zzGx || !zzp5.isClosed()) {
            return true;
        }
        this.zzgk.zzXV(C18773h.f57233c);
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzP5 zzp5) {
        this.zzGx = true;
        this.zzl2 = 0L;
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzOS zzos) throws Exception {
        if (zzos.zzNu().getCount() <= 0) {
            return true;
        }
        for (int i = 0; i < zzos.zzNu().getCount(); i++) {
            if (this.zzGx) {
                zzn(zzos.zzNu().get(0));
                this.zzGx = false;
            } else {
                zzm(zzos.zzNu().get(i));
            }
        }
        this.zzl2 = zzos.zzNu().get(zzos.zzNu().getCount() - 1);
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzPZ zzpz) throws Exception {
        if (this.zzGx) {
            zzn(zzpz.zzPX());
            this.zzGx = false;
        } else if (!zzZPY.zzD(this.zzl2, zzpz.zzPX())) {
            zzm(zzpz.zzPX());
        }
        zzW(new long[]{zzpz.zzPL(), zzpz.zzPK(), zzpz.zzPW()});
        this.zzl2 = zzpz.zzPW();
        return true;
    }
}
