package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYYD {
    private int zzEw;
    private byte[] zzTZ;

    public zzYYD(zzYYL zzyyl) throws Exception {
        this.zzEw = (int) (((long) zzyyl.zzXb()) & 4294967295L);
        this.zzTZ = zzyyl.zzn(zzyyl.zzYD0() - 8);
    }

    public final String zzO(com.aspose.words.internal.zzZO0 zzzo0) {
        return zzzo0.zzZn(this.zzTZ);
    }

    public final int zzYCS() {
        byte[] bArr = this.zzTZ;
        if (bArr.length != 4) {
            return -1;
        }
        long jZz8 = ((long) com.aspose.words.internal.zzXU.zz8(com.aspose.words.internal.zzZQK.zzA(bArr, 0))) & 4294967295L;
        if (jZz8 > 2147483647L) {
            return -1;
        }
        return (int) jZz8;
    }

    public final boolean zzu9(int i) {
        return this.zzEw == i;
    }
}
