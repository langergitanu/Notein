package com.aspose.words.internal;

import com.huawei.hms.network.embedded.C18293o1;
import java.io.EOFException;

/* JADX INFO: loaded from: classes5.dex */
public class zzZOX {
    static final /* synthetic */ boolean zzVr = true;
    private zzZO0 zzMW;
    private zzZOP zzN5;
    private byte[] zzUD;

    public zzZOX(zzZOP zzzop) {
        if (!zzVr && zzzop == null) {
            throw new AssertionError();
        }
        this.zzN5 = zzzop;
        this.zzUD = new byte[16];
        this.zzMW = zzZO0.zzhV();
    }

    private void zzQF(int i) throws Exception {
        if (i <= 0 || i > this.zzUD.length) {
            throw new IllegalArgumentException("numBytes");
        }
        int i2 = 0;
        do {
            int i3 = this.zzN5.read(this.zzUD, i2, i - i2);
            if (i3 == 0) {
                throw new EOFException("End of file reached.");
            }
            i2 += i3;
        } while (i2 < i);
    }

    public final void close() throws Exception {
        this.zzN5.close();
    }

    public final int read(byte[] bArr, int i, int i2) throws Exception {
        return this.zzN5.read(bArr, i, i2);
    }

    public final boolean readBoolean() throws Exception {
        zzQF(1);
        return this.zzUD[0] != 0;
    }

    public final byte readByte() throws Exception {
        return zzX6();
    }

    public final char readChar() throws Exception {
        char[] cArrZzQG = zzQG(1);
        if (zzVr || cArrZzQG.length == 1) {
            return cArrZzQG[0];
        }
        throw new AssertionError();
    }

    public final double readDouble() throws Exception {
        return Double.longBitsToDouble(zzX8());
    }

    public final char[] zzQG(int i) throws Exception {
        if (i < 0) {
            throw new IllegalArgumentException(C18293o1.f55803f);
        }
        if (i == 0) {
            return new char[0];
        }
        char[] cArr = new char[i];
        int iZzQB = this.zzMW.zzQB(i);
        byte[] bArr = new byte[iZzQB];
        int iZzZ = this.zzMW.zzZ(bArr, cArr) - this.zzN5.read(bArr, 0, iZzQB);
        if (iZzZ != 0) {
            this.zzN5.zzU(iZzZ, 1);
        }
        return cArr;
    }

    public final byte zzX6() throws Exception {
        zzQF(1);
        return this.zzUD[0];
    }

    public final long zzX8() throws Exception {
        return (((long) zzXc()) & 4294967295L) | ((4294967295L & ((long) zzXc())) << 32);
    }

    public final short zzX9() throws Exception {
        return zzXa();
    }

    public final short zzXa() throws Exception {
        zzQF(2);
        byte[] bArr = this.zzUD;
        return (short) (((bArr[1] & 255) << 8) | (bArr[0] & 255));
    }

    public final int zzXb() throws Exception {
        return zzXc();
    }

    public final int zzXc() throws Exception {
        zzQF(4);
        byte[] bArr = this.zzUD;
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    public final float zziC() throws Exception {
        return Float.intBitsToFloat(zzXc());
    }

    public final byte[] zzn(int i) throws Exception {
        if (i < 0) {
            throw new IllegalArgumentException(C18293o1.f55803f);
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        do {
            int i4 = this.zzN5.read(bArr, i3, i2);
            if (i4 == 0) {
                break;
            }
            i3 += i4;
            i2 -= i4;
        } while (i2 > 0);
        if (i3 == i) {
            return bArr;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        return bArr2;
    }

    public final zzZOP zzq() {
        return this.zzN5;
    }

    public zzZOX(zzZOP zzzop, zzZO0 zzzo0) {
        this(zzzop);
        if (!zzVr && zzzo0 == null) {
            throw new AssertionError();
        }
        this.zzMW = zzzo0;
    }
}
