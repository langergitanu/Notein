package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz61 implements zzH2 {
    private boolean zzGx;
    private long zzl2 = 0;
    private zz6C zzll;

    public zz61(zz6C zz6c) {
        this.zzll = zz6c;
    }

    private void zzW(long[] jArr) throws Exception {
        this.zzll.zzwM().zzZb(jArr[0]);
        this.zzll.zzwM().zzK((byte) 81);
        this.zzll.zzwM().zzZb(jArr[1]);
        this.zzll.zzwM().zzK((byte) 82);
        this.zzll.zzwM().zzZb(jArr[2]);
        this.zzll.zzwM().zzK((byte) 69);
        this.zzll.zzwM().zzM((byte) -109);
    }

    private void zzm(long j) throws Exception {
        this.zzll.zzwM().zzZb(j);
        this.zzll.zzwM().zzK((byte) 69);
        this.zzll.zzwM().zzM((byte) -101);
    }

    private void zzn(long j) throws Exception {
        this.zzll.zzwM().zzZb(j);
        this.zzll.zzwM().zzK((byte) 76);
        this.zzll.zzwM().zzM((byte) 107);
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzY(zzP5 zzp5) throws Exception {
        if (this.zzGx || !zzp5.isClosed()) {
            return true;
        }
        this.zzll.zzwM().zzM((byte) -124);
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
