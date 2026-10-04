package com.aspose.slides.internal.p468vz;

import com.alibaba.sdk.android.oss.internal.OooO00o;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: com.aspose.slides.internal.vz.to */
/* JADX INFO: loaded from: classes4.dex */
public class C11880to implements DataInput, DataOutput {

    /* JADX INFO: renamed from: c5 */
    protected boolean f39998c5;

    /* JADX INFO: renamed from: ck */
    boolean f39999ck;

    /* JADX INFO: renamed from: du */
    protected long f40000du;

    /* JADX INFO: renamed from: dy */
    protected boolean f40001dy;

    /* JADX INFO: renamed from: fa */
    boolean f40002fa;

    /* JADX INFO: renamed from: h4 */
    protected long f40003h4;

    /* JADX INFO: renamed from: jd */
    protected boolean f40004jd;

    /* JADX INFO: renamed from: k4 */
    protected String f40005k4;

    /* JADX INFO: renamed from: kk */
    protected long f40006kk;

    /* JADX INFO: renamed from: m9 */
    protected int f40007m9;

    /* JADX INFO: renamed from: to */
    protected byte[] f40008to;

    /* JADX INFO: renamed from: up */
    private long f40009up;

    /* JADX INFO: renamed from: x1 */
    protected RandomAccessFile f40010x1;

    public C11880to(File file, String str) {
        this(file.getPath(), str);
    }

    /* JADX INFO: renamed from: du */
    public void m55464du() {
        if (this.f39999ck) {
            try {
                this.f40010x1.seek(this.f40000du);
                this.f40010x1.write(this.f40008to, 0, this.f40007m9);
                this.f39999ck = false;
            } catch (IOException e) {
                throw new com.aspose.slides.exceptions.IOException("exception", e);
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    public int m55465h4() {
        long j = this.f40006kk;
        if (j < this.f40003h4) {
            int i = (int) (j - this.f40000du);
            this.f40006kk = j + 1;
            return this.f40008to[i] & 255;
        }
        if (this.f40001dy) {
            return -1;
        }
        m55469k4(j);
        return m55465h4();
    }

    /* JADX INFO: renamed from: k4 */
    public int m55466k4(long j, byte[] bArr, int i, int i2) {
        try {
            this.f40010x1.seek(j);
            int i3 = this.f40010x1.read(bArr, i, i2);
            return (!this.f40002fa || i3 >= i2) ? i3 : i2;
        } catch (IOException e) {
            throw new com.aspose.slides.exceptions.IOException("exception", e);
        }
    }

    /* JADX INFO: renamed from: kk */
    public long m55471kk() {
        return this.f40006kk;
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        int iM55465h4 = m55465h4();
        if (iM55465h4 >= 0) {
            return iM55465h4 != 0;
        }
        throw new RuntimeException();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        int iM55465h4 = m55465h4();
        if (iM55465h4 >= 0) {
            return (byte) iM55465h4;
        }
        throw new RuntimeException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        int iM55465h4 = m55465h4();
        int iM55465h42 = m55465h4();
        if ((iM55465h4 | iM55465h42) >= 0) {
            return this.f40004jd ? (char) ((iM55465h4 << 8) + iM55465h42) : (char) ((iM55465h42 << 8) + iM55465h4);
        }
        throw new RuntimeException();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        readFully(bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        int iM55465h4 = m55465h4();
        int iM55465h42 = m55465h4();
        int iM55465h43 = m55465h4();
        int iM55465h44 = m55465h4();
        if ((iM55465h4 | iM55465h42 | iM55465h43 | iM55465h44) >= 0) {
            return this.f40004jd ? (iM55465h4 << 24) + (iM55465h42 << 16) + (iM55465h43 << 8) + iM55465h44 : (iM55465h44 << 24) + (iM55465h43 << 16) + (iM55465h42 << 8) + iM55465h4;
        }
        throw new RuntimeException();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = false;
        int iM55465h4 = -1;
        while (!z) {
            iM55465h4 = m55465h4();
            if (iM55465h4 != -1 && iM55465h4 != 10) {
                if (iM55465h4 != 13) {
                    stringBuffer.append((char) iM55465h4);
                } else {
                    long jM55471kk = m55471kk();
                    if (m55465h4() != 10) {
                        m55469k4(jM55471kk);
                    }
                }
            }
            z = true;
        }
        if (iM55465h4 == -1 && stringBuffer.length() == 0) {
            return null;
        }
        return stringBuffer.toString();
    }

    @Override // java.io.DataInput
    public final long readLong() {
        return this.f40004jd ? (((long) readInt()) << 32) + (((long) readInt()) & 4294967295L) : (((long) readInt()) & 4294967295L) + (((long) readInt()) << 32);
    }

    @Override // java.io.DataInput
    public final short readShort() {
        int iM55465h4 = m55465h4();
        int iM55465h42 = m55465h4();
        if ((iM55465h4 | iM55465h42) >= 0) {
            return this.f40004jd ? (short) ((iM55465h4 << 8) + iM55465h42) : (short) ((iM55465h42 << 8) + iM55465h4);
        }
        throw new RuntimeException();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        try {
            return DataInputStream.readUTF(this);
        } catch (IOException e) {
            throw new com.aspose.slides.exceptions.IOException("exception", e);
        }
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        int iM55465h4 = m55465h4();
        if (iM55465h4 >= 0) {
            return iM55465h4;
        }
        throw new RuntimeException();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        int iM55465h4 = m55465h4();
        int iM55465h42 = m55465h4();
        if ((iM55465h4 | iM55465h42) >= 0) {
            return this.f40004jd ? (iM55465h4 << 8) + iM55465h42 : (iM55465h42 << 8) + iM55465h4;
        }
        throw new RuntimeException();
    }

    @Override // java.io.DataInput
    public int skipBytes(int i) {
        m55469k4(m55471kk() + ((long) i));
        return i;
    }

    /* JADX INFO: renamed from: to */
    public long m55474to() {
        try {
            long length = this.f40010x1.length();
            long j = this.f40003h4;
            return length < j ? j : length;
        } catch (IOException e) {
            throw new com.aspose.slides.exceptions.IOException("exception", e);
        }
    }

    public String toString() {
        return "fp=" + this.f40006kk + ", bs=" + this.f40000du + ", de=" + this.f40003h4 + ", ds=" + this.f40007m9 + ", bl=" + this.f40008to.length + ", readonly=" + this.f39998c5 + ", bm=" + this.f39999ck;
    }

    @Override // java.io.DataOutput
    public void write(int i) {
        long j = this.f40006kk;
        long j2 = this.f40003h4;
        if (j < j2) {
            this.f40008to[(int) (j - this.f40000du)] = (byte) i;
            this.f39999ck = true;
            this.f40006kk = j + 1;
            return;
        }
        int i2 = this.f40007m9;
        byte[] bArr = this.f40008to;
        if (i2 == bArr.length) {
            m55469k4(j);
            write(i);
            return;
        }
        bArr[(int) (j - this.f40000du)] = (byte) i;
        this.f39999ck = true;
        this.f40006kk = j + 1;
        this.f40007m9 = i2 + 1;
        this.f40003h4 = j2 + 1;
    }

    @Override // java.io.DataOutput
    public final void writeBoolean(boolean z) {
        write(z ? 1 : 0);
    }

    @Override // java.io.DataOutput
    public final void writeByte(int i) {
        write(i);
    }

    @Override // java.io.DataOutput
    public final void writeBytes(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            write((byte) str.charAt(i));
        }
    }

    @Override // java.io.DataOutput
    public final void writeChar(int i) {
        write((i >>> 8) & 255);
        write(i & 255);
    }

    @Override // java.io.DataOutput
    public final void writeChars(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            write((cCharAt >>> '\b') & 255);
            write(cCharAt & 255);
        }
    }

    @Override // java.io.DataOutput
    public final void writeDouble(double d) {
        writeLong(Double.doubleToLongBits(d));
    }

    @Override // java.io.DataOutput
    public final void writeFloat(float f) {
        writeInt(Float.floatToIntBits(f));
    }

    @Override // java.io.DataOutput
    public final void writeInt(int i) {
        write((i >>> 24) & 255);
        write((i >>> 16) & 255);
        write((i >>> 8) & 255);
        write(i & 255);
    }

    @Override // java.io.DataOutput
    public final void writeLong(long j) {
        write(((int) (j >>> 56)) & 255);
        write(((int) (j >>> 48)) & 255);
        write(((int) (j >>> 40)) & 255);
        write(((int) (j >>> 32)) & 255);
        write(((int) (j >>> 24)) & 255);
        write(((int) (j >>> 16)) & 255);
        write(((int) (j >>> 8)) & 255);
        write(((int) j) & 255);
    }

    @Override // java.io.DataOutput
    public final void writeShort(int i) {
        write((i >>> 8) & 255);
        write(i & 255);
    }

    @Override // java.io.DataOutput
    public final void writeUTF(String str) {
        int i;
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            i2 = (cCharAt < 1 || cCharAt > 127) ? cCharAt > 2047 ? i2 + 3 : i2 + 2 : i2 + 1;
        }
        if (i2 > 65535) {
            throw new RuntimeException();
        }
        write((i2 >>> 8) & 255);
        write(i2 & 255);
        for (int i4 = 0; i4 < length; i4++) {
            int iCharAt = str.charAt(i4);
            if (iCharAt < 1 || iCharAt > 127) {
                if (iCharAt > 2047) {
                    write(((iCharAt >> 12) & 15) | 224);
                    i = ((iCharAt >> 6) & 63) | 128;
                } else {
                    i = ((iCharAt >> 6) & 31) | 192;
                }
                write(i);
                iCharAt = (iCharAt & 63) | 128;
            }
            write(iCharAt);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public int m55475x1(byte[] bArr, int i, int i2) {
        return m55467k4(bArr, i, i2);
    }

    public C11880to(File file, String str, int i) {
        this(file.getPath(), str, i);
    }

    /* JADX INFO: renamed from: k4 */
    public int m55467k4(byte[] bArr, int i, int i2) {
        C11880to c11880to;
        int iM55466k4 = -1;
        if (this.f40001dy) {
            return -1;
        }
        long j = this.f40003h4;
        long j2 = this.f40006kk;
        int i3 = (int) (j - j2);
        if (i3 < 1) {
            m55469k4(j2);
            return m55467k4(bArr, i, i2);
        }
        if (i3 >= i2) {
            i3 = i2;
        }
        System.arraycopy(this.f40008to, (int) (j2 - this.f40000du), bArr, i, i3);
        long j3 = this.f40006kk + ((long) i3);
        this.f40006kk = j3;
        if (i3 < i2) {
            int i4 = i2 - i3;
            if (i4 > this.f40008to.length) {
                c11880to = this;
                iM55466k4 = c11880to.m55466k4(j3, bArr, i + i3, i4);
            } else {
                c11880to = this;
                m55469k4(j3);
                if (!c11880to.f40001dy) {
                    int i5 = c11880to.f40007m9;
                    iM55466k4 = i4 > i5 ? i5 : i4;
                    System.arraycopy(c11880to.f40008to, 0, bArr, i + i3, iM55466k4);
                }
            }
            if (iM55466k4 > 0) {
                c11880to.f40006kk += (long) iM55466k4;
                return i3 + iM55466k4;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: kk */
    public void m55472kk(long j) {
        if (this.f39999ck) {
            m55464du();
        }
        try {
            this.f40010x1.setLength(j);
            if (this.f40006kk > j) {
                m55469k4(j);
            }
        } catch (IOException e) {
            throw new com.aspose.slides.exceptions.IOException("exception", e);
        }
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int iM55475x1 = m55475x1(bArr, i + i3, i2 - i3);
            if (iM55475x1 < 0) {
                throw new RuntimeException();
            }
            i3 += iM55475x1;
        }
    }

    @Override // java.io.DataOutput
    public void write(byte[] bArr) {
        m55473kk(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: x1 */
    public void m55476x1(long j) {
        if (this.f39999ck) {
            m55464du();
        }
        this.f40000du = j;
        this.f40006kk = j;
        byte[] bArr = this.f40008to;
        int iM55466k4 = m55466k4(j, bArr, 0, bArr.length);
        this.f40007m9 = iM55466k4;
        if (iM55466k4 <= 0) {
            this.f40007m9 = 0;
            this.f40001dy = true;
        } else {
            this.f40001dy = false;
        }
        this.f40003h4 = this.f40000du + ((long) this.f40007m9);
    }

    public C11880to(String str, String str2) {
        this(str, str2, 8092);
        this.f40005k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public void m55468k4() {
        if (this.f40010x1 == null) {
            return;
        }
        m55464du();
        try {
            long length = this.f40010x1.length();
            if (!this.f39998c5) {
                long j = this.f40009up;
                if (j != 0 && j != length) {
                    this.f40010x1.setLength(j);
                }
            }
            this.f40010x1.close();
            this.f40010x1 = null;
        } catch (IOException e) {
            throw new com.aspose.slides.exceptions.IOException("exception", e);
        }
    }

    /* JADX INFO: renamed from: kk */
    public void m55473kk(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f40008to;
        int i3 = 0;
        if (i2 >= bArr2.length) {
            if (this.f39999ck) {
                m55464du();
            }
            try {
                this.f40010x1.seek(this.f40006kk);
                this.f40010x1.write(bArr, i, i2);
                long j = this.f40006kk + ((long) i2);
                this.f40006kk = j;
                this.f40000du = j;
                this.f40007m9 = 0;
                this.f40003h4 = j + ((long) 0);
                return;
            } catch (IOException e) {
                throw new com.aspose.slides.exceptions.IOException("exception", e);
            }
        }
        long j2 = this.f40006kk;
        long j3 = this.f40000du;
        int length = j2 >= j3 ? (int) ((((long) bArr2.length) + j3) - j2) : 0;
        if (length > 0) {
            i3 = length > i2 ? i2 : length;
            System.arraycopy(bArr, i, bArr2, (int) (j2 - j3), i3);
            this.f39999ck = true;
            long j4 = this.f40006kk;
            long j5 = i3;
            long j6 = j4 + j5;
            long j7 = this.f40003h4;
            if (j6 <= j7) {
                j6 = j7;
            }
            this.f40003h4 = j6;
            this.f40007m9 = (int) (j6 - this.f40000du);
            this.f40006kk = j4 + j5;
        }
        if (i3 < i2) {
            m55469k4(this.f40006kk);
            int i4 = i2 - i3;
            System.arraycopy(bArr, i + i3, this.f40008to, (int) (this.f40006kk - this.f40000du), i4);
            this.f39999ck = true;
            long j8 = this.f40006kk;
            long j9 = i4;
            long j10 = j8 + j9;
            long j11 = this.f40003h4;
            if (j10 <= j11) {
                j10 = j11;
            }
            this.f40003h4 = j10;
            this.f40007m9 = (int) (j10 - this.f40000du);
            this.f40006kk = j8 + j9;
        }
    }

    @Override // java.io.DataOutput
    public void write(byte[] bArr, int i, int i2) {
        m55473kk(bArr, i, i2);
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m55477x1() {
        return this.f40010x1 == null;
    }

    public C11880to(String str, String str2, int i) {
        this.f39999ck = false;
        this.f40009up = 0L;
        this.f40002fa = false;
        this.f40005k4 = str;
        try {
            this.f40010x1 = new RandomAccessFile(str, str2);
            this.f39998c5 = str2.equals("r");
            m55463k4(i);
        } catch (FileNotFoundException e) {
            throw new com.aspose.slides.exceptions.FileNotFoundException(OooO00o.OooO00o("File not found File: ", str), str, e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m55463k4(int i) {
        this.f40000du = 0L;
        this.f40003h4 = 0L;
        this.f40007m9 = 0;
        this.f40006kk = 0L;
        this.f40008to = new byte[i];
        this.f40001dy = false;
    }

    /* JADX INFO: renamed from: k4 */
    public void m55469k4(long j) {
        this.f40001dy = false;
        if (j < this.f40000du || j >= this.f40003h4) {
            m55476x1(j);
        } else {
            this.f40006kk = j;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m55470k4(boolean z) {
        this.f39998c5 = z;
    }
}
