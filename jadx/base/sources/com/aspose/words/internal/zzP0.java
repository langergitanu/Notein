package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzP0 extends zzPL {
    private zzPV zzGH;
    private zzPV[] zzGI;
    private long zzGJ;
    private zzP8 zzSq;

    public zzP0(zzP8 zzp8, long j) {
        super(5);
        this.zzSq = zzp8;
        this.zzGJ = j;
        zzXR(4);
    }

    public final void zzJ(zzPV zzpv) {
        this.zzGH = zzpv;
    }

    public final boolean zzNS() throws Exception {
        zzP8 zzp8 = this.zzSq;
        if (zzp8 == null || zzp8.getCount() == 0) {
            return true;
        }
        zzZQ4 zzzq4ZzS = zzP6.zzS(this.zzSq);
        return (zzAN.zzf(zzzq4ZzS.getWidth()) || zzAN.zzf(zzzq4ZzS.getHeight())) ? false : true;
    }

    public final zzPV zzNT() {
        return this.zzGH;
    }

    public final zzPV[] zzNU() {
        return this.zzGI;
    }

    public final long zzNV() {
        return this.zzGJ;
    }

    @Override // com.aspose.words.internal.zzPL, com.aspose.words.internal.zzOG, com.aspose.words.internal.zzPY
    public final zzPY zzPI() {
        zzP0 zzp0 = (zzP0) super.zzPI();
        zzp0.zzSq = this.zzSq.zzO8();
        zzPV[] zzpvArr = this.zzGI;
        if (zzpvArr != null && zzpvArr.length > 0) {
            zzp0.zzGI = (zzPV[]) zzpvArr.clone();
        }
        return zzp0;
    }

    public final void zzR(zzP8 zzp8) {
        this.zzSq = zzp8;
    }

    public final zzP8 zzUu() {
        return this.zzSq;
    }

    public final void zzY(zzPV[] zzpvArr) {
        this.zzGI = zzpvArr;
    }

    @Override // com.aspose.words.internal.zzPL, com.aspose.words.internal.zzPY
    public final void zzZ(zzH5 zzh5) throws Exception {
        if (this.zzGI != null) {
            int i = 0;
            while (true) {
                zzPV[] zzpvArr = this.zzGI;
                if (i >= zzpvArr.length) {
                    break;
                }
                zzpvArr[i] = zzh5.zzZ(zzpvArr[i]);
                i++;
            }
        }
        zzPV zzpv = this.zzGH;
        if (zzpv != null) {
            this.zzGH = zzh5.zzZ(zzpv);
        }
        super.zzZ(zzh5);
    }

    public final void zzo(long j) {
        this.zzGJ = j;
    }

    @Override // com.aspose.words.internal.zzPY
    public final void zzZ(zzPW zzpw) throws Exception {
        zzpw.zzY(this);
    }
}
