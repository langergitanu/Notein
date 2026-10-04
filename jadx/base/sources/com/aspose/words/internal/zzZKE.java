package com.aspose.words.internal;

import java.io.IOException;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public class zzZKE {
    private final boolean zz59;
    protected final ByteOrder zz5a;
    protected final zzZOP zzN5;
    protected zzZOW zzW5;
    protected zzZKI zzZPd;

    public zzZKE(ByteOrder byteOrder, zzZOP zzzop) throws Exception {
        this.zz5a = byteOrder;
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        if (byteOrder == byteOrder2) {
            this.zzZPd = new zzZKI(zzzop);
        } else {
            this.zzW5 = new zzZOW(zzzop);
        }
        this.zz59 = byteOrder == byteOrder2;
        this.zzN5 = zzzop;
    }

    public final int getPosition() throws Exception {
        return (int) this.zzN5.getPosition();
    }

    public final void seek(long j) throws Exception {
        this.zzN5.zzH(j);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.zzN5.write(bArr, i, i2);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    public final void writeByte(int i) throws Exception {
        if (this.zz59) {
            this.zzZPd.writeByte((byte) i);
        } else {
            this.zzW5.writeByte((byte) i);
        }
    }

    public final void writeBytes(byte[] bArr) throws Exception {
        if (this.zz59) {
            this.zzZPd.writeBytes(bArr);
        } else {
            this.zzW5.writeBytes(bArr);
        }
    }

    public final void writeInt(int i) throws Exception {
        if (this.zz59) {
            this.zzZPd.zzl(i);
        } else {
            this.zzW5.zzl(i);
        }
    }

    public final void writeShort(int i) throws Exception {
        if (this.zz59) {
            this.zzZPd.zzj(i);
        } else {
            this.zzW5.zzK((short) i);
        }
    }

    public final void zzH(long j) throws Exception {
        this.zzN5.zzH(j);
    }

    public final void zzX(char[] cArr, int i) throws Exception {
        if (i < 0 || i > cArr.length || i < 0) {
            throw new IndexOutOfBoundsException("off < 0 || len < 0 || off + len > c.length!");
        }
        int i2 = i * 2;
        byte[] bArr = new byte[i2];
        if (this.zz5a == ByteOrder.BIG_ENDIAN) {
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                char c = cArr[i4];
                int i5 = i3 + 1;
                bArr[i3] = (byte) (c >>> '\b');
                i3 += 2;
                bArr[i5] = (byte) c;
            }
        } else {
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                char c2 = cArr[i7];
                int i8 = i6 + 1;
                bArr[i6] = (byte) c2;
                i6 += 2;
                bArr[i8] = (byte) (c2 >>> '\b');
            }
        }
        this.zzN5.write(bArr, 0, i2);
    }

    public final void zzY(short[] sArr, int i) throws Exception {
        if (i < 0 || i > sArr.length || i < 0) {
            throw new IndexOutOfBoundsException("off < 0 || len < 0 || off + len > s.length!");
        }
        int i2 = i * 2;
        byte[] bArr = new byte[i2];
        if (this.zz5a == ByteOrder.BIG_ENDIAN) {
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                short s = sArr[i4];
                int i5 = i3 + 1;
                bArr[i3] = (byte) (s >>> 8);
                i3 += 2;
                bArr[i5] = (byte) s;
            }
        } else {
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                short s2 = sArr[i7];
                int i8 = i6 + 1;
                bArr[i6] = (byte) s2;
                i6 += 2;
                bArr[i8] = (byte) (s2 >>> 8);
            }
        }
        this.zzN5.write(bArr, 0, i2);
    }

    public final zzZOP zzq() {
        return this.zzN5;
    }

    public final void zzX(int[] iArr, int i) throws Exception {
        if (i >= 0 && i <= iArr.length && i >= 0) {
            int i2 = i * 4;
            byte[] bArr = new byte[i2];
            if (this.zz5a == ByteOrder.BIG_ENDIAN) {
                int i3 = 0;
                for (int i4 = 0; i4 < i; i4++) {
                    int i5 = iArr[i4];
                    bArr[i3] = (byte) (i5 >>> 24);
                    bArr[i3 + 1] = (byte) (i5 >>> 16);
                    int i6 = i3 + 3;
                    bArr[i3 + 2] = (byte) (i5 >>> 8);
                    i3 += 4;
                    bArr[i6] = (byte) i5;
                }
            } else {
                int i7 = 0;
                for (int i8 = 0; i8 < i; i8++) {
                    int i9 = iArr[i8];
                    bArr[i7] = (byte) i9;
                    bArr[i7 + 1] = (byte) (i9 >>> 8);
                    int i10 = i7 + 3;
                    bArr[i7 + 2] = (byte) (i9 >>> 16);
                    i7 += 4;
                    bArr[i10] = (byte) (i9 >>> 24);
                }
            }
            this.zzN5.write(bArr, 0, i2);
            return;
        }
        throw new IndexOutOfBoundsException("off < 0 || len < 0 || off + len > i.length!");
    }

    public final void zzY(double[] dArr, int i) throws Exception {
        if (i >= 0 && i <= dArr.length && i >= 0) {
            int i2 = i * 8;
            byte[] bArr = new byte[i2];
            char c = '8';
            if (this.zz5a == ByteOrder.BIG_ENDIAN) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < i) {
                    long jDoubleToLongBits = Double.doubleToLongBits(dArr[i3]);
                    bArr[i4] = (byte) (jDoubleToLongBits >>> c);
                    bArr[i4 + 1] = (byte) (jDoubleToLongBits >>> 48);
                    bArr[i4 + 2] = (byte) (jDoubleToLongBits >>> 40);
                    bArr[i4 + 3] = (byte) (jDoubleToLongBits >>> 32);
                    bArr[i4 + 4] = (byte) (jDoubleToLongBits >>> 24);
                    bArr[i4 + 5] = (byte) (jDoubleToLongBits >>> 16);
                    int i5 = i4 + 7;
                    bArr[i4 + 6] = (byte) (jDoubleToLongBits >>> 8);
                    i4 += 8;
                    bArr[i5] = (byte) jDoubleToLongBits;
                    i3++;
                    c = c;
                }
            } else {
                int i6 = 0;
                for (int i7 = 0; i7 < i; i7++) {
                    bArr[i6] = (byte) Double.doubleToLongBits(dArr[i7]);
                    bArr[i6 + 1] = (byte) (r7 >>> 8);
                    bArr[i6 + 2] = (byte) (r7 >>> 16);
                    bArr[i6 + 3] = (byte) (r7 >>> 24);
                    bArr[i6 + 4] = (byte) (r7 >>> 32);
                    bArr[i6 + 5] = (byte) (r7 >>> 40);
                    int i8 = i6 + 7;
                    bArr[i6 + 6] = (byte) (r7 >>> 48);
                    i6 += 8;
                    bArr[i8] = (byte) (r7 >>> 56);
                }
            }
            this.zzN5.write(bArr, 0, i2);
            return;
        }
        throw new IndexOutOfBoundsException("off < 0 || len < 0 || off + len > d.length!");
    }

    public final void zzX(float[] fArr, int i) throws Exception {
        if (i >= 0 && i <= fArr.length && i >= 0) {
            int i2 = i * 4;
            byte[] bArr = new byte[i2];
            if (this.zz5a == ByteOrder.BIG_ENDIAN) {
                int i3 = 0;
                for (int i4 = 0; i4 < i; i4++) {
                    int iFloatToIntBits = Float.floatToIntBits(fArr[i4]);
                    bArr[i3] = (byte) (iFloatToIntBits >>> 24);
                    bArr[i3 + 1] = (byte) (iFloatToIntBits >>> 16);
                    int i5 = i3 + 3;
                    bArr[i3 + 2] = (byte) (iFloatToIntBits >>> 8);
                    i3 += 4;
                    bArr[i5] = (byte) iFloatToIntBits;
                }
            } else {
                int i6 = 0;
                for (int i7 = 0; i7 < i; i7++) {
                    int iFloatToIntBits2 = Float.floatToIntBits(fArr[i7]);
                    bArr[i6] = (byte) iFloatToIntBits2;
                    bArr[i6 + 1] = (byte) (iFloatToIntBits2 >>> 8);
                    int i8 = i6 + 3;
                    bArr[i6 + 2] = (byte) (iFloatToIntBits2 >>> 16);
                    i6 += 4;
                    bArr[i8] = (byte) (iFloatToIntBits2 >>> 24);
                }
            }
            this.zzN5.write(bArr, 0, i2);
            return;
        }
        throw new IndexOutOfBoundsException("off < 0 || len < 0 || off + len > f.length!");
    }
}
