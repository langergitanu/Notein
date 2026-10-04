package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZZP extends zzJ5 {
    private long zzGS = 0;
    private long zzGT = 0;
    private int zzva = 0;
    private boolean zzdd = false;

    private zzZZP() {
    }

    private boolean getResult() {
        return this.zzdd && this.zzva == 5 && zzJ6.zzN(this.zzGT, this.zzGS);
    }

    public static boolean zzz(zzP8 zzp8) throws Exception {
        if (zzp8.zzO7().size() != 1) {
            return false;
        }
        zzZZP zzzzp = new zzZZP();
        zzP4.zzZ(zzp8.zzO7().get(0), zzzzp);
        return zzzzp.getResult();
    }

    @Override // com.aspose.words.internal.zzJ5
    public final boolean zzP(long j, long j2) {
        if (zzJ6.zzN(j, j2)) {
            return true;
        }
        if ((Float.intBitsToFloat((int) j) != Float.intBitsToFloat((int) j2) && zzZPY.zzYC(j) != zzZPY.zzYC(j2)) || this.zzva > 4) {
            this.zzdd = false;
            return false;
        }
        if (!this.zzdd) {
            this.zzdd = true;
            this.zzGS = j;
            this.zzGT = j2;
            this.zzva = 2;
            return true;
        }
        if (!zzJ6.zzN(this.zzGT, j)) {
            this.zzdd = false;
            return false;
        }
        this.zzGT = j2;
        this.zzva++;
        return true;
    }

    @Override // com.aspose.words.internal.zzJ5
    public final boolean zzQ(long j, long j2, long j3, long j4) {
        this.zzdd = false;
        return false;
    }
}
