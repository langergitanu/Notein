package o0ooO00O;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: o0ooO00O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31424OooO00o implements DataInput {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ByteOrder f112189OooOo0o = ByteOrder.BIG_ENDIAN;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f112188OooOo = 0;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f112191OooOoO0 = 0;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f112190OooOoO = 0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f112192OooOoOO = false;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final byte[] f112193OooOoo0 = new byte[8];

    public final void OooO00o() throws IOException {
        if (this.f112192OooOoOO) {
            throw new IOException("stream is closed");
        }
    }

    public void OooO0O0(long j) throws IOException {
        OooO00o();
        if (j > this.f112188OooOo) {
            throw new IndexOutOfBoundsException("Trying to flush outside of current position");
        }
        if (j < this.f112191OooOoO0) {
            throw new IndexOutOfBoundsException("Trying to flush within already flushed portion");
        }
        this.f112191OooOoO0 = j;
    }

    public final void OooO0OO(long j) throws IOException {
        OooO00o();
        if (j < this.f112191OooOoO0) {
            throw new IllegalArgumentException("trying to seek before flushed pos");
        }
        this.f112190OooOoO = 0;
        this.f112188OooOo = j;
    }

    public abstract void close() throws IOException;

    public final void finalize() throws Throwable {
        if (this.f112192OooOoOO) {
            return;
        }
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public abstract int read() throws IOException;

    public abstract int read(byte[] bArr, int i, int i2) throws IOException;

    @Override // java.io.DataInput
    public final boolean readBoolean() throws IOException {
        int i = read();
        if (i >= 0) {
            return i != 0;
        }
        throw new EOFException("EOF reached");
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        int i = read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException("EOF reached");
    }

    @Override // java.io.DataInput
    public final char readChar() throws IOException {
        return (char) readShort();
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
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        while (i2 > 0) {
            int i3 = read(bArr, i, i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i += i3;
            i2 -= i3;
        }
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        byte[] bArr = this.f112193OooOoo0;
        if (read(bArr, 0, 4) < 0) {
            throw new EOFException();
        }
        if (this.f112189OooOo0o == ByteOrder.BIG_ENDIAN) {
            return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
        }
        return (bArr[0] & 255) | ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8);
    }

    @Override // java.io.DataInput
    public final String readLine() throws IOException {
        StringBuilder sb = new StringBuilder(80);
        boolean z = true;
        while (true) {
            int i = read();
            if (i != -1) {
                if (i == 10) {
                    break;
                }
                if (i == 13) {
                    int i2 = read();
                    if (i2 != 10 && i2 != -1) {
                        OooO00o();
                        OooO0OO(this.f112188OooOo - 1);
                    }
                } else {
                    sb.append((char) i);
                    z = false;
                }
            } else {
                break;
            }
        }
        z = false;
        if (z) {
            return null;
        }
        return sb.toString();
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        byte[] bArr = this.f112193OooOoo0;
        if (read(bArr, 0, 8) < 0) {
            throw new EOFException();
        }
        if (this.f112189OooOo0o == ByteOrder.BIG_ENDIAN) {
            return ((((long) (((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16)) | ((bArr[2] & 255) << 8)) | (bArr[3] & 255))) & 4294967295L) << 32) | (((long) ((bArr[7] & 255) | ((bArr[6] & 255) << 8) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16))) & 4294967295L);
        }
        int i = (bArr[0] & 255) | ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8);
        return (((long) i) & 4294967295L) | ((((long) ((bArr[4] & 255) | (((bArr[5] & 255) << 8) | (((bArr[7] & 255) << 24) | ((bArr[6] & 255) << 16))))) & 4294967295L) << 32);
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        int i;
        byte[] bArr = this.f112193OooOoo0;
        if (read(bArr, 0, 2) < 0) {
            throw new EOFException();
        }
        if (this.f112189OooOo0o == ByteOrder.BIG_ENDIAN) {
            i = (bArr[1] & 255) | (bArr[0] << 8);
        } else {
            i = (bArr[0] & 255) | (bArr[1] << 8);
        }
        return (short) i;
    }

    @Override // java.io.DataInput
    public final String readUTF() throws IOException {
        ByteOrder byteOrder = this.f112189OooOo0o;
        this.f112189OooOo0o = ByteOrder.BIG_ENDIAN;
        int unsignedShort = readUnsignedShort();
        char[] cArr = new char[unsignedShort];
        readFully(new byte[unsignedShort], 0, unsignedShort);
        this.f112189OooOo0o = byteOrder;
        return new DataInputStream(new ByteArrayInputStream(this.f112193OooOoo0)).readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() throws IOException {
        int i = read();
        if (i >= 0) {
            return i;
        }
        throw new EOFException("EOF reached");
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        return readShort() & 65535;
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) throws IOException {
        long j = i;
        OooO00o();
        OooO0OO(this.f112188OooOo + j);
        return (int) j;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        readFully(bArr, 0, bArr.length);
    }
}
