package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzVO {
    private int zzZwt;
    private int zzZx7;

    private zzVO(int i, int i2) {
        this.zzZx7 = i;
        this.zzZwt = i2;
    }

    public static zzVO zzYA(byte[] bArr) throws Exception {
        com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(new com.aspose.words.internal.zzZOR(bArr));
        zzzox.zzq().zzH(zzzox.zzq().getPosition() + 4);
        if (!"LZXC".equals(new String(zzzox.zzQG(4)))) {
            throw new IllegalStateException("Expected section compressed data start signature 'LZXC' here but got something else.");
        }
        int iZzXc = zzzox.zzXc();
        int iZzXc2 = zzzox.zzXc();
        int iZzXc3 = zzzox.zzXc();
        if (iZzXc == 2) {
            iZzXc3 *= 32768;
        }
        return new zzVO(iZzXc2, iZzXc3);
    }

    public final int zz1i() {
        return this.zzZwt;
    }

    public final int zz1j() {
        return this.zzZx7;
    }
}
