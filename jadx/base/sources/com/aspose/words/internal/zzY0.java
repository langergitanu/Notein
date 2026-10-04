package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzY0 {
    private zzZOX zzW6;

    public zzY0(zzZOP zzzop) {
        this.zzW6 = new zzZOX(zzzop);
    }

    public final byte readByte() throws Exception {
        return this.zzW6.zzX6();
    }

    public final int zzX(byte[] bArr, int i) throws Exception {
        return this.zzW6.read(bArr, 0, i);
    }

    public final byte zzX6() throws Exception {
        return this.zzW6.zzX6();
    }

    public final int zzX7() throws Exception {
        byte[] bArrZzn = this.zzW6.zzn(3);
        int i = 0;
        int i2 = 1;
        for (int i3 = 2; i3 >= 0; i3--) {
            i += (bArrZzn[i3] & 255) * i2;
            i2 <<= 8;
        }
        return i;
    }

    public final long zzX8() throws Exception {
        return zzXU.zzP(this.zzW6.zzX8());
    }

    public final short zzX9() throws Exception {
        return zzXU.zzY(this.zzW6.zzXa());
    }

    public final short zzXa() throws Exception {
        return zzXU.zzZ(this.zzW6.zzXa());
    }

    public final int zzXb() throws Exception {
        return zzXU.zz8(this.zzW6.zzXc());
    }

    public final int zzXc() throws Exception {
        return zzXU.zz9(this.zzW6.zzXc());
    }

    public final boolean zzXd() throws Exception {
        return this.zzW6.zzq().getPosition() == this.zzW6.zzq().getLength() - 1;
    }

    public final char[] zzm(int i) throws Exception {
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = (char) (this.zzW6.zzX6() & 255);
        }
        return cArr;
    }

    public final byte[] zzn(int i) throws Exception {
        return this.zzW6.zzn(i);
    }

    public final zzZOP zzq() {
        return this.zzW6.zzq();
    }
}
