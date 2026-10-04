package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz01 implements zzH2 {
    private boolean zzGx;
    private zzZZX zzdI;

    public zz01(zzZZX zzzzx) {
        this.zzdI = zzzzx;
    }

    private void zzW(long[] jArr) throws Exception {
        for (int i = 0; i < 3; i++) {
            zzl(jArr[i]);
        }
        this.zzdI.zzXB("curveto");
    }

    private void zzl(long j) throws Exception {
        this.zzdI.zzZT(Float.intBitsToFloat((int) j));
        this.zzdI.zzFh();
        this.zzdI.zzZT(zzZPY.zzYC(j));
        this.zzdI.zzFh();
    }

    private void zzm(long j) throws Exception {
        zzl(j);
        this.zzdI.zzXB("lineto");
    }

    private void zzn(long j) throws Exception {
        zzl(j);
        this.zzdI.zzXB("moveto");
    }

    public final void zzB(zzP8 zzp8) {
        try {
            this.zzdI.zzXB("newpath");
            zzp8.zzY(this);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzY(zzP5 zzp5) throws Exception {
        if (!zzp5.isClosed()) {
            return true;
        }
        this.zzdI.zzXB("closepath");
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzP5 zzp5) {
        this.zzGx = true;
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
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzPZ zzpz) throws Exception {
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
