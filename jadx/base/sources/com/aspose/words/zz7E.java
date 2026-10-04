package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zz7E extends com.aspose.words.internal.zz6 implements com.aspose.words.internal.zzH2 {
    private boolean zzGx;
    private zzYM5[] zzZ3t;
    private zzYM6[] zzZ3u;
    private zz2G zzZ3x;
    private Shape zzZ3y;
    private ArrayList<zzYM6> zzZ3w = new ArrayList<>();
    private ArrayList<zzYM2> zzZ3v = new ArrayList<>();

    public zz7E(Shape shape, zz2G zz2g) throws Exception {
        this.zzZ3y = shape;
        this.zzZ3x = zz2g;
        zzZAG();
        this.zzZ3u = new zzYM6[this.zzZ3w.size()];
        for (int i = 0; i < this.zzZ3w.size(); i++) {
            this.zzZ3u[i] = this.zzZ3w.get(i);
        }
        this.zzZ3t = new zzYM5[this.zzZ3v.size() / 2];
        for (int i2 = 0; i2 < this.zzZ3v.size() / 2; i2++) {
            int i3 = i2 * 2;
            this.zzZ3t[i2] = new zzYM5(this.zzZ3v.get(i3), this.zzZ3v.get(i3 + 1));
        }
    }

    private void zzW(long[] jArr) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZ3w, new zzYM6(1, 1));
        for (int i = 0; i < 3; i++) {
            zzXV(jArr[i]);
        }
    }

    private void zzXV(long j) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZ3v, new zzYM2(com.aspose.words.internal.zzAN.zzZB(Float.intBitsToFloat((int) j))));
        com.aspose.words.internal.zzZQG.zzZ(this.zzZ3v, new zzYM2(com.aspose.words.internal.zzAN.zzZB(com.aspose.words.internal.zzZPY.zzYC(j))));
    }

    private void zzZAG() throws Exception {
        zz2O zz2o = (zz2O) com.aspose.words.internal.zzZKW.zzZ(this.zzZ3y.zzY9i(), zz2O.class);
        if (zz2o == null) {
            return;
        }
        zz7F.zzY(zz2o.zzZTf(), this.zzZ3x).zzZ(this);
    }

    private void zzm(long j) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZ3w, new zzYM6(0, 1));
        zzXV(j);
    }

    private void zzn(long j) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZ3w, new zzYM6(2, 0));
        zzXV(j);
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzY(com.aspose.words.internal.zzP5 zzp5) {
        if (zzp5.isClosed()) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzZ3w, new zzYM6(3, 1));
        }
        return true;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzZG zzzg) throws Exception {
        zzzg.zzZ0().zzY(this);
        com.aspose.words.internal.zzZQG.zzZ(this.zzZ3w, new zzYM6(4, 0));
    }

    public final zzYM5[] zzZAE() {
        return this.zzZ3t;
    }

    public final zzYM6[] zzZAF() {
        return this.zzZ3u;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(com.aspose.words.internal.zzP5 zzp5) {
        this.zzGx = true;
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(com.aspose.words.internal.zzOS zzos) {
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
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(com.aspose.words.internal.zzPZ zzpz) {
        if (this.zzGx) {
            zzn(zzpz.zzPX());
            this.zzGx = false;
        } else {
            zzm(zzpz.zzPX());
        }
        zzW(new long[]{zzpz.zzPL(), zzpz.zzPK(), zzpz.zzPW()});
        return true;
    }
}
