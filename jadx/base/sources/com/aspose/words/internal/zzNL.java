package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzNL {
    private zzO8 zzFs;
    private zzN6 zzFz;

    public zzNL(zzO8 zzo8, zzN6 zzn6) {
        this.zzFs = zzo8;
        this.zzFz = zzn6;
    }

    private zzNK zzLX() throws Exception {
        int iZzXc = this.zzFs.zzXc();
        int iZzXc2 = this.zzFs.zzXc();
        return new zzNK(iZzXc == 2 ? zzXt(iZzXc2) : this.zzFs.zzn(iZzXc2), this.zzFz);
    }

    private zzPV[] zzLY() throws Exception {
        this.zzFs.zzXc();
        int iZzXc = this.zzFs.zzXc();
        zzPV[] zzpvArr = new zzPV[iZzXc];
        for (int i = 0; i < iZzXc; i++) {
            zzpvArr[i] = this.zzFs.zzMV();
        }
        return zzpvArr;
    }

    private byte[] zzW(int i, int i2, int i3, int i4) throws Exception {
        if ((i4 & 65536) == 65536) {
            zzLY();
        }
        zzXN zzxn = new zzXN(i, i2, i4, this.zzFs.zzn(i3 * i2));
        try {
            zzZOR zzzor = new zzZOR();
            try {
                zzxn.zzV(zzzor);
                zzzor.zzH(0L);
                return zzzor.zzWy();
            } finally {
                zzzor.close();
            }
        } finally {
            zzxn.dispose();
        }
    }

    private byte[] zzXt(int i) throws Exception {
        zzZOR zzzor = new zzZOR(i + 22);
        try {
            byte[] bArrZzn = this.zzFs.zzn(22);
            zzzor.write(bArrZzn, 0, bArrZzn.length);
            this.zzFs.zzn(2);
            byte[] bArrZzn2 = this.zzFs.zzn(i);
            zzzor.write(bArrZzn2, 0, bArrZzn2.length);
            return zzzor.zzWy();
        } finally {
            zzzor.close();
        }
    }

    private byte[] zze(long j) throws Exception {
        zzO8 zzo8 = this.zzFs;
        return zzo8.zzn((int) (j - zzo8.zzq().getPosition()));
    }

    private zzO0 zzf(long j) throws Exception {
        int iZzXc = this.zzFs.zzXc();
        int iZzXc2 = this.zzFs.zzXc();
        int iZzXc3 = this.zzFs.zzXc();
        int iZzXc4 = this.zzFs.zzXc();
        int iZzXc5 = this.zzFs.zzXc();
        if (iZzXc5 == 0) {
            return new zzO0(zzW(iZzXc, iZzXc2, iZzXc3, iZzXc4));
        }
        if (iZzXc5 == 1) {
            return new zzO0(zze(j));
        }
        throw new IllegalArgumentException();
    }

    public final zzNM zzg(long j) throws Exception {
        this.zzFs.zzXc();
        int iZzXc = this.zzFs.zzXc();
        if (iZzXc == 0) {
            return null;
        }
        if (iZzXc == 1) {
            return zzf(j);
        }
        if (iZzXc == 2) {
            return zzLX();
        }
        throw new IllegalArgumentException();
    }
}
