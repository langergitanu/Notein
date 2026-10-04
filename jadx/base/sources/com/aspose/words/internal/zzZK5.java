package com.aspose.words.internal;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UTFDataFormatException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZK5 implements DataInput, DataOutput {
    protected byte[] buffer;
    protected int mode;
    boolean zzZNZ;
    protected boolean zzZO0;
    protected int zzZO1;
    protected long zzZO2;
    protected long zzZO3;
    protected long zzZO4;
    protected RandomAccessFile zzZO5;

    public zzZK5(String str, String str2) throws IOException {
        this(str, str2, (byte) 0);
    }

    private int zzK(byte[] bArr, int i, int i2) throws IOException {
        zzZK5 zzzk5;
        while (true) {
            int iZzZ = -1;
            if (this.zzZO0) {
                return -1;
            }
            long j = this.zzZO2;
            long j2 = this.zzZO4;
            int i3 = (int) (j - j2);
            if (i3 > 0) {
                if (i3 >= i2) {
                    i3 = i2;
                }
                System.arraycopy(this.buffer, (int) (j2 - this.zzZO3), bArr, i, i3);
                long j3 = this.zzZO4 + ((long) i3);
                this.zzZO4 = j3;
                if (i3 < i2) {
                    int i4 = i2 - i3;
                    if (i4 > this.buffer.length) {
                        zzzk5 = this;
                        iZzZ = zzzk5.zzZ(j3, bArr, i + i3, i4);
                    } else {
                        zzzk5 = this;
                        seek(j3);
                        if (!zzzk5.zzZO0) {
                            int i5 = zzzk5.zzZO1;
                            iZzZ = i4 > i5 ? i5 : i4;
                            System.arraycopy(zzzk5.buffer, 0, bArr, i + i3, iZzZ);
                        }
                    }
                    if (iZzZ > 0) {
                        zzzk5.zzZO4 += (long) iZzZ;
                        return i3 + iZzZ;
                    }
                }
                return i3;
            }
            seek(j2);
        }
    }

    private void zzV(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = this.buffer;
        int i3 = 0;
        if (i2 >= bArr2.length) {
            flush();
            this.zzZO1 = 0;
            this.zzZO2 = 0L;
            this.zzZO3 = 0L;
            this.zzZO5.seek(this.zzZO4);
            this.zzZO5.write(bArr, i, i2);
            this.zzZO4 += (long) i2;
            return;
        }
        long j = this.zzZO4;
        long j2 = this.zzZO3;
        int length = j >= j2 ? (int) ((((long) bArr2.length) + j2) - j) : 0;
        if (length > 0) {
            i3 = length > i2 ? i2 : length;
            System.arraycopy(bArr, i, bArr2, (int) (j - j2), i3);
            this.zzZNZ = true;
            long j3 = this.zzZO4;
            long j4 = i3;
            long j5 = j3 + j4;
            long j6 = this.zzZO2;
            if (j5 <= j6) {
                j5 = j6;
            }
            this.zzZO2 = j5;
            this.zzZO1 = (int) (j5 - this.zzZO3);
            this.zzZO4 = j3 + j4;
        }
        if (i3 < i2) {
            seek(this.zzZO4);
            int i4 = i2 - i3;
            System.arraycopy(bArr, i + i3, this.buffer, (int) (this.zzZO4 - this.zzZO3), i4);
            this.zzZNZ = true;
            long j7 = this.zzZO4;
            long j8 = i4;
            long j9 = j7 + j8;
            long j10 = this.zzZO2;
            if (j9 <= j10) {
                j9 = j10;
            }
            this.zzZO2 = j9;
            this.zzZO1 = (int) (j9 - this.zzZO3);
            this.zzZO4 = j7 + j8;
        }
    }

    private int zzZ(long j, byte[] bArr, int i, int i2) throws IOException {
        this.zzZO5.seek(j);
        return this.zzZO5.read(bArr, i, i2);
    }

    public final void close() throws IOException {
        try {
            if ((this.mode | 2) > 0 && this.zzZNZ) {
                this.zzZO5.seek(this.zzZO3);
                this.zzZO5.write(this.buffer, 0, this.zzZO1);
            }
        } finally {
            this.zzZO5.close();
        }
    }

    public final void flush() throws IOException {
        if (this.zzZNZ) {
            this.zzZO5.seek(this.zzZO3);
            this.zzZO5.write(this.buffer, 0, this.zzZO1);
            this.zzZNZ = false;
        }
    }

    public final long getFilePointer() throws IOException {
        return this.zzZO4;
    }

    public final long length() throws IOException {
        long length = this.zzZO5.length();
        long j = this.zzZO2;
        return length < j ? j : length;
    }

    public final int read() throws IOException {
        while (true) {
            long j = this.zzZO4;
            if (j < this.zzZO2) {
                byte[] bArr = this.buffer;
                this.zzZO4 = 1 + j;
                return bArr[(int) (j - this.zzZO3)] & 255;
            }
            if (this.zzZO0) {
                return -1;
            }
            seek(j);
        }
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() throws IOException {
        int i = read();
        if (i >= 0) {
            return i != 0;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        int i = read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() throws IOException {
        int i = read();
        int i2 = read();
        if ((i | i2) >= 0) {
            return (char) ((i << 8) + i2);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        readFully(bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        int i = read();
        int i2 = read();
        int i3 = read();
        int i4 = read();
        if ((i | i2 | i3 | i4) >= 0) {
            return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readLine() throws IOException {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            i = read();
            if (i == -1 || i == 10) {
                break;
            }
            stringBuffer.append((char) i);
        }
        if (i == -1 && stringBuffer.length() == 0) {
            return null;
        }
        return stringBuffer.toString();
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        return (((long) readInt()) << 32) + (((long) readInt()) & 4294967295L);
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        int i = read();
        int i2 = read();
        if ((i | i2) >= 0) {
            return (short) ((i << 8) + i2);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readUTF() throws IOException {
        return DataInputStream.readUTF(this);
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() throws IOException {
        int i = read();
        if (i >= 0) {
            return i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        int i = read();
        int i2 = read();
        if ((i | i2) >= 0) {
            return (i << 8) + i2;
        }
        throw new EOFException();
    }

    public final void seek(long j) throws IOException {
        if (j >= this.zzZO3 && j < this.zzZO2) {
            this.zzZO4 = j;
            return;
        }
        if (this.zzZNZ) {
            flush();
        }
        this.zzZO3 = j;
        this.zzZO4 = j;
        byte[] bArr = this.buffer;
        int iZzZ = zzZ(j, bArr, 0, bArr.length);
        this.zzZO1 = iZzZ;
        if (iZzZ < 0) {
            this.zzZO1 = 0;
            this.zzZO0 = true;
        } else {
            this.zzZO0 = false;
        }
        this.zzZO2 = this.zzZO3 + ((long) this.zzZO1);
    }

    public final void setLength(long j) throws IOException {
        if (this.zzZNZ) {
            flush();
        }
        this.zzZO5.setLength(j);
        if (this.zzZO4 > j) {
            seek(j);
        }
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) throws IOException {
        seek(this.zzZO4 + ((long) i));
        return i;
    }

    public final String toString() {
        return "fp=" + this.zzZO4 + ", bs=" + this.zzZO3 + ", de=" + this.zzZO2 + ", ds=" + this.zzZO1 + ", bl=" + this.buffer.length + ", m=" + this.mode + ", bm=" + this.zzZNZ;
    }

    @Override // java.io.DataOutput
    public final void write(int i) throws IOException {
        long j;
        long j2;
        byte[] bArr;
        while (true) {
            j = this.zzZO4;
            j2 = this.zzZO3;
            if (j >= j2) {
                bArr = this.buffer;
                if (j < ((long) bArr.length) + j2) {
                    break;
                }
            }
            seek(j);
        }
        bArr[(int) (j - j2)] = (byte) i;
        this.zzZNZ = true;
        long j3 = this.zzZO2;
        if (j >= j3) {
            this.zzZO1++;
            this.zzZO2 = j3 + 1;
        }
        this.zzZO4 = j + 1;
    }

    @Override // java.io.DataOutput
    public final void writeBoolean(boolean z) throws IOException {
        write(z ? 1 : 0);
    }

    @Override // java.io.DataOutput
    public final void writeByte(int i) throws IOException {
        write(i);
    }

    @Override // java.io.DataOutput
    public final void writeBytes(String str) throws IOException {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            write((byte) str.charAt(i));
        }
    }

    @Override // java.io.DataOutput
    public final void writeChar(int i) throws IOException {
        write((i >>> 8) & 255);
        write(i & 255);
    }

    @Override // java.io.DataOutput
    public final void writeChars(String str) throws IOException {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            write((cCharAt >>> '\b') & 255);
            write(cCharAt & 255);
        }
    }

    @Override // java.io.DataOutput
    public final void writeDouble(double d) throws IOException {
        writeLong(Double.doubleToLongBits(d));
    }

    @Override // java.io.DataOutput
    public final void writeFloat(float f) throws IOException {
        writeInt(Float.floatToIntBits(f));
    }

    @Override // java.io.DataOutput
    public final void writeInt(int i) throws IOException {
        write((i >>> 24) & 255);
        write((i >>> 16) & 255);
        write((i >>> 8) & 255);
        write(i & 255);
    }

    @Override // java.io.DataOutput
    public final void writeLong(long j) throws IOException {
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
    public final void writeShort(int i) throws IOException {
        write((i >>> 8) & 255);
        write(i & 255);
    }

    @Override // java.io.DataOutput
    public final void writeUTF(String str) throws IOException {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            i = (cCharAt <= 0 || cCharAt > 127) ? cCharAt > 2047 ? i + 3 : i + 2 : i + 1;
        }
        if (i > 65535) {
            throw new UTFDataFormatException();
        }
        write((i >>> 8) & 255);
        write(i & 255);
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 > 0 && cCharAt2 <= 127) {
                write(cCharAt2);
            } else if (cCharAt2 > 2047) {
                write(((cCharAt2 >> '\f') & 15) | 224);
                write(((cCharAt2 >> 6) & 63) | 128);
                write((cCharAt2 & '?') | 128);
            } else {
                write(((cCharAt2 >> 6) & 31) | 192);
                write((cCharAt2 & '?') | 128);
            }
        }
    }

    private zzZK5(String str, String str2, byte b) throws IOException {
        this(str, "r".equals(str2) ? 1 : "rw".equals(str2) ? 3 : 0, 4096);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int iZzK = zzK(bArr, i + i3, i2 - i3);
            if (iZzK < 0) {
                throw new EOFException();
            }
            i3 += iZzK;
        }
    }

    public zzZK5(File file, String str) throws IOException {
        this(file.getPath(), str);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        return zzK(bArr, i, i2);
    }

    private zzZK5(String str, int i, int i2) throws IOException {
        this.zzZNZ = false;
        this.mode = i;
        if ((i & 4) > 0) {
            this.mode = i | 2;
        }
        File file = new File(str);
        if ((this.mode & 2) > 0) {
            file.exists();
        }
        if ((this.mode & 4) > 0 && file.exists() && !file.delete()) {
            throw new IOException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Failed to delete ", str));
        }
        if (this.mode == 1 && !new File(str).exists()) {
            throw new FileNotFoundException(str);
        }
        this.zzZO5 = new RandomAccessFile(str, (this.mode & 2) > 0 ? "rw" : "r");
        this.zzZO3 = 0L;
        this.zzZO2 = 0L;
        this.zzZO1 = 0;
        this.zzZO4 = 0L;
        this.buffer = new byte[4096];
        this.zzZO0 = false;
    }

    @Override // java.io.DataOutput
    public final void write(byte[] bArr) throws IOException {
        zzV(bArr, 0, bArr.length);
    }

    @Override // java.io.DataOutput
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        zzV(bArr, i, i2);
    }
}
