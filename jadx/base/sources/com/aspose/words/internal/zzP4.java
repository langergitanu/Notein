package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzP4 implements zzH2 {
    private zzJ5 zzGP;
    private long zzGT = 0;
    private long zzGS = 0;
    private boolean zzGR = true;
    private boolean zzGQ = true;

    private zzP4(zzJ5 zzj5) {
        this.zzGP = zzj5;
    }

    private boolean zzQ(long j, long j2) {
        if (this.zzGQ) {
            if (this.zzGR) {
                this.zzGS = j;
                this.zzGR = false;
            }
        } else if (!this.zzGP.zzP(this.zzGT, j)) {
            return false;
        }
        this.zzGT = j2;
        this.zzGQ = false;
        return true;
    }

    public static void zzZ(zzP5 zzp5, zzJ5 zzj5) throws Exception {
        zzp5.zzY(new zzP4(zzj5));
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzY(zzP5 zzp5) {
        if (!zzp5.isClosed() || this.zzGR || this.zzGQ || zzZPY.zzD(this.zzGS, this.zzGT)) {
            return true;
        }
        return this.zzGP.zzP(this.zzGT, this.zzGS);
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzP5 zzp5) {
        this.zzGS = 0L;
        this.zzGT = 0L;
        this.zzGR = true;
        this.zzGQ = true;
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzOS zzos) {
        zz0Q zz0qZzNu = zzos.zzNu();
        if (zz0qZzNu.getCount() <= 0) {
            return true;
        }
        if (!zzQ(zz0qZzNu.get(0), zz0qZzNu.get(zz0qZzNu.getCount() - 1))) {
            return false;
        }
        if (zz0qZzNu.getCount() == 1) {
            return true;
        }
        for (int i = 1; i < zz0qZzNu.getCount(); i++) {
            if (!this.zzGP.zzP(zz0qZzNu.get(i - 1), zz0qZzNu.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzPZ zzpz) {
        if (zzQ(zzpz.zzPX(), zzpz.zzPW())) {
            return this.zzGP.zzQ(zzpz.zzPX(), zzpz.zzPL(), zzpz.zzPK(), zzpz.zzPW());
        }
        return false;
    }
}
