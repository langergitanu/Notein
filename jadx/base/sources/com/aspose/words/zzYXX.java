package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYXX {
    private int[] zzXXH;
    private boolean zzXXI;

    public zzYXX(zzYYL zzyyl) throws Exception {
        zzyyl.zzQk(60);
        this.zzXXI = zzyyl.zzX8() == 4778124914501567049L;
        zzyyl.zzQk(8);
        int iZzX9 = zzyyl.zzX9() & 65535;
        this.zzXXH = new int[iZzX9];
        for (int i = 0; i < iZzX9; i++) {
            int iZzYD0 = zzyyl.zzYD0();
            zzyyl.zzQk(4);
            this.zzXXH[i] = iZzYD0;
        }
    }

    private int zzU(zzYYL zzyyl, int i) throws Exception {
        int length;
        int i2 = this.zzXXH[i];
        int i3 = i + 1;
        if (zztT(i3)) {
            length = this.zzXXH[i3];
        } else {
            if (zzyyl.zzq().getLength() > 2147483647L) {
                throw new IllegalStateException("Invalid record index.");
            }
            length = (int) zzyyl.zzq().getLength();
        }
        return length - i2;
    }

    public final int zzT(zzYYL zzyyl) throws Exception {
        for (int i = 0; i < this.zzXXH.length; i++) {
            if (zzV(zzyyl, i)) {
                return i;
            }
        }
        return -1;
    }

    public final boolean zzV(zzYYL zzyyl, int i) throws Exception {
        if (zzU(zzyyl, i) < 8) {
            return false;
        }
        zzyyl.zzq().zzH(this.zzXXH[i]);
        return zzyyl.zzX8() == 4778131524304327257L;
    }

    public final void zzW(zzYYL zzyyl, int i) throws Exception {
        zzyyl.zzq().zzH(this.zzXXH[i]);
    }

    public final zzYYL zzX(zzYYL zzyyl, int i) throws Exception {
        return new zzYYL(new com.aspose.words.internal.zzZOR(zzY(zzyyl, i)));
    }

    public final byte[] zzY(zzYYL zzyyl, int i) throws Exception {
        int iZzU = zzU(zzyyl, i);
        byte[] bArr = new byte[iZzU];
        zzyyl.zzq().zzH(this.zzXXH[i]);
        zzyyl.zzX(bArr, iZzU);
        return bArr;
    }

    public final boolean zzYCt() {
        return this.zzXXI;
    }

    public final boolean zztT(int i) {
        return i >= 0 && i < this.zzXXH.length;
    }
}
