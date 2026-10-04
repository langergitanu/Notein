package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZDN extends zzZD5 implements zzZCZ {
    private static final char[] zzWIJ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    protected final byte[] data;
    protected final int zzWII;

    public zzZDN(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("data cannot be null");
        }
        if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.data = zzYGU.zzVI(bArr);
        this.zzWII = i;
    }

    public static byte[] zzl(byte[] bArr, int i) {
        byte[] bArrZzVI = zzYGU.zzVI(bArr);
        if (i > 0) {
            int length = bArr.length - 1;
            bArrZzVI[length] = (byte) ((255 << i) & bArrZzVI[length]);
        }
        return bArrZzVI;
    }

    public final byte[] getBytes() {
        return zzl(this.data, this.zzWII);
    }

    @Override // com.aspose.words.internal.zzZCZ
    public final String getString() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzZD7(byteArrayOutputStream).zzY((zzZDK) this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                char[] cArr = zzWIJ;
                stringBuffer.append(cArr[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(cArr[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new zzZD6(C21111o0ooOoO.OooO00o(e, new StringBuilder("Internal error encoding BitString: ")), e);
        }
    }

    @Override // com.aspose.words.internal.zzZD5, com.aspose.words.internal.zzZDB
    public int hashCode() {
        return this.zzWII ^ zzYGU.hashCode(getBytes());
    }

    public final int intValue() {
        byte[] bArrZzl = this.data;
        int i = this.zzWII;
        if (i > 0 && bArrZzl.length <= 4) {
            bArrZzl = zzl(bArrZzl, i);
        }
        int i2 = 0;
        for (int i3 = 0; i3 != bArrZzl.length && i3 != 4; i3++) {
            i2 |= (bArrZzl[i3] & 255) << (i3 * 8);
        }
        return i2;
    }

    public String toString() {
        return getString();
    }

    @Override // com.aspose.words.internal.zzZD5
    public final zzZD5 zzXL2() {
        return new zzZBQ(this.data, this.zzWII);
    }

    @Override // com.aspose.words.internal.zzZD5
    public final zzZD5 zzXL3() {
        return new zzZCG(this.data, this.zzWII);
    }

    public final int zzXL4() {
        return this.zzWII;
    }

    public final byte[] zzXL5() {
        if (this.zzWII == 0) {
            return zzYGU.zzVI(this.data);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    @Override // com.aspose.words.internal.zzZD5
    public abstract void zzZ(zzZD7 zzzd7) throws IOException;

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzZ(zzZD5 zzzd5) {
        if (!(zzzd5 instanceof zzZDN)) {
            return false;
        }
        zzZDN zzzdn = (zzZDN) zzzd5;
        return this.zzWII == zzzdn.zzWII && zzYGU.zzp(getBytes(), zzzdn.getBytes());
    }

    public static zzZDN zzZ(int i, InputStream inputStream) throws IOException {
        if (i > 0) {
            int i2 = inputStream.read();
            int i3 = i - 1;
            byte[] bArr = new byte[i3];
            if (i3 != 0) {
                if (zzYG9.zzZ(inputStream, bArr) != i3) {
                    throw new EOFException("EOF encountered in middle of BIT STRING");
                }
                if (i2 > 0 && i2 < 8) {
                    byte b = bArr[i - 2];
                    if (b != ((byte) ((255 << i2) & b))) {
                        return new zzZBQ(bArr, i2);
                    }
                }
            }
            return new zzZCG(bArr, i2);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }
}
