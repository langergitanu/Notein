package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzVX {
    private com.aspose.words.internal.zzZOX zzW6;
    private long[] zzZx6;
    private int zzZx7;
    private long zzZx8;
    private zzVP zzZx9;

    public zzVX(zzVO zzvo, zzVK zzvk, com.aspose.words.internal.zzZOX zzzox) {
        this.zzZx7 = zzvo.zz1j();
        this.zzZx9 = new zzVP(zzvo.zz1i());
        this.zzZx8 = zzvk.zz1f();
        this.zzZx6 = zzvk.zz19();
        this.zzW6 = zzzox;
    }

    private byte[] zzA(long j, long j2) throws Exception {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalStateException("Block has invalid length.");
        }
        this.zzW6.zzq().zzH(j);
        return this.zzW6.zzn((int) j2);
    }

    private byte[] zzNt(int i) throws Exception {
        long[] jArr = this.zzZx6;
        long j = jArr[i];
        return this.zzZx9.zzw(zzA(j, jArr[i + 1] - j), (int) this.zzZx8);
    }

    private byte[] zzNu(int i) throws Exception {
        this.zzZx9.reset();
        for (int i2 = i - (i % this.zzZx7); i2 < i; i2++) {
            zzNt(i2);
        }
        return zzNt(i);
    }

    public final byte[] zzZ(zzVV zzvv) throws Exception {
        byte[] bArr = new byte[(int) zzvv.getLength()];
        long j = 0;
        while (j < zzvv.getLength()) {
            long jZz1y = zzvv.zz1y() + j;
            long length = zzvv.getLength() - j;
            long j2 = this.zzZx8;
            int i = (int) (jZz1y / j2);
            long j3 = jZz1y % j2;
            long jMin = Math.min(length, j2 - j3);
            byte[] bArrZzNu = zzNu(i);
            if (bArrZzNu == null) {
                throw new IllegalStateException("Failed to decompress a block");
            }
            System.arraycopy(bArrZzNu, (int) j3, bArr, (int) j, (int) jMin);
            j += jMin;
        }
        return bArr;
    }
}
