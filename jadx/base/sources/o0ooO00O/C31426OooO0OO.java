package o0ooO00O;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: o0ooO00O.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31426OooO0OO extends AbstractC31424OooO00o implements DataOutput {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final OutputStream f112197OooOooO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final byte[] f112196OooOoo = new byte[8];

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C31427OooO0Oo f112198OooOooo = new C31427OooO0Oo();

    public C31426OooO0OO(OutputStream outputStream) {
        if (outputStream == null) {
            throw new IllegalArgumentException("stream == null!");
        }
        this.f112197OooOooO = outputStream;
    }

    @Override // o0ooO00O.AbstractC31424OooO00o
    public final void OooO0O0(long j) throws IOException {
        OutputStream outputStream;
        long j2 = this.f112191OooOoO0;
        super.OooO0O0(j);
        long j3 = this.f112191OooOoO0;
        int i = (int) (j3 - j2);
        long j4 = ((long) i) + j2;
        C31427OooO0Oo c31427OooO0Oo = this.f112198OooOooo;
        if (j4 > c31427OooO0Oo.f112199OooO00o) {
            throw new IndexOutOfBoundsException("Argument out of cache");
        }
        int i2 = (int) (j2 >> 9);
        int i3 = (int) (j2 & 511);
        if (i2 < c31427OooO0Oo.f112200OooO0O0) {
            throw new IndexOutOfBoundsException("The requested data are already disposed");
        }
        while (true) {
            outputStream = this.f112197OooOooO;
            if (i <= 0) {
                break;
            }
            byte[] bArr = c31427OooO0Oo.f112201OooO0OO.get(i2);
            int iMin = Math.min(512 - i3, i);
            outputStream.write(bArr, i3, iMin);
            i2++;
            i -= iMin;
            i3 = 0;
        }
        int i4 = (int) (j3 >> 9);
        int i5 = c31427OooO0Oo.f112200OooO0O0;
        if (i4 > i5) {
            while (i5 < i4) {
                c31427OooO0Oo.f112201OooO0OO.set(i5, null);
                i5++;
            }
            c31427OooO0Oo.f112200OooO0O0 = i4;
        }
        outputStream.flush();
    }

    public final void OooO0Oo() throws IOException {
        int i;
        OooO00o();
        int i2 = this.f112190OooOoO;
        if (i2 == 0) {
            return;
        }
        int i3 = read();
        if (i3 == -1) {
            i = 0;
            this.f112190OooOoO = 0;
        } else {
            OooO00o();
            OooO0OO(this.f112188OooOo - 1);
            i = ((-1) << (8 - i2)) & i3;
        }
        write(i);
    }

    public final void OooO0o0(int i, long j) throws IOException {
        OooO00o();
        int i2 = this.f112190OooOoO;
        if (i2 > 0) {
            int i3 = read();
            if (i3 == -1) {
                i3 = 0;
            } else {
                OooO00o();
                OooO0OO(this.f112188OooOo - 1);
            }
            int i4 = 8 - i2;
            if (i >= i4) {
                int i5 = (-1) >>> (32 - i4);
                i -= i4;
                write((int) (((long) (i3 & (~i5))) | ((j >> i) & ((long) i5))));
            } else {
                int i6 = i2 + i;
                int i7 = (-1) >>> i;
                int i8 = 8 - i6;
                write((int) (((long) (i3 & (~(i7 << i8)))) | ((((long) i7) & j) << i8)));
                OooO00o();
                OooO0OO(this.f112188OooOo - 1);
                this.f112190OooOoO = i6;
                i = 0;
            }
        }
        while (i > 7) {
            write((int) ((j >> (i - 8)) & ((long) 255)));
            i -= 8;
        }
        if (i > 0) {
            write((int) ((j << (8 - i)) & ((long) 255)));
            OooO00o();
            OooO0OO(this.f112188OooOo - 1);
            this.f112190OooOoO = i;
        }
    }

    @Override // o0ooO00O.AbstractC31424OooO00o
    public final void close() throws IOException {
        C31427OooO0Oo c31427OooO0Oo = this.f112198OooOooo;
        long j = c31427OooO0Oo.f112199OooO00o;
        OooO0OO(j);
        OooO0O0(j);
        OooO00o();
        this.f112192OooOoOO = true;
        c31427OooO0Oo.f112201OooO0OO.clear();
        c31427OooO0Oo.f112199OooO00o = 0L;
    }

    @Override // o0ooO00O.AbstractC31424OooO00o
    public final int read() throws IOException {
        this.f112190OooOoO = 0;
        int iOooO0O0 = this.f112198OooOooo.OooO0O0(this.f112188OooOo);
        if (iOooO0O0 >= 0) {
            this.f112188OooOo++;
        }
        return iOooO0O0;
    }

    @Override // java.io.DataOutput
    public final void write(int i) throws IOException {
        OooO0Oo();
        long j = this.f112188OooOo;
        C31427OooO0Oo c31427OooO0Oo = this.f112198OooOooo;
        if (j >= c31427OooO0Oo.f112199OooO00o) {
            c31427OooO0Oo.OooO0Oo(j);
        }
        c31427OooO0Oo.f112201OooO0OO.get((int) (j >> 9))[(int) (j & 511)] = (byte) i;
        this.f112188OooOo++;
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
        write(str.getBytes());
    }

    @Override // java.io.DataOutput
    public final void writeChar(int i) throws IOException {
        writeShort(i);
    }

    @Override // java.io.DataOutput
    public final void writeChars(String str) throws IOException {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        if (length < 0 || length > charArray.length) {
            throw new IndexOutOfBoundsException();
        }
        for (char c : charArray) {
            writeShort(c);
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
        ByteOrder byteOrder = this.f112189OooOo0o;
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = this.f112196OooOoo;
        if (byteOrder == byteOrder2) {
            bArr[0] = (byte) (i >> 24);
            bArr[1] = (byte) (i >> 16);
            bArr[2] = (byte) (i >> 8);
            bArr[3] = (byte) i;
        } else {
            bArr[3] = (byte) (i >> 24);
            bArr[2] = (byte) (i >> 16);
            bArr[1] = (byte) (i >> 8);
            bArr[0] = (byte) i;
        }
        write(bArr, 0, 4);
    }

    @Override // java.io.DataOutput
    public final void writeLong(long j) throws IOException {
        ByteOrder byteOrder = this.f112189OooOo0o;
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = this.f112196OooOoo;
        if (byteOrder == byteOrder2) {
            bArr[0] = (byte) (j >> 56);
            bArr[1] = (byte) (j >> 48);
            bArr[2] = (byte) (j >> 40);
            bArr[3] = (byte) (j >> 32);
            bArr[4] = (byte) (j >> 24);
            bArr[5] = (byte) (j >> 16);
            bArr[6] = (byte) (j >> 8);
            bArr[7] = (byte) j;
        } else {
            bArr[7] = (byte) (j >> 56);
            bArr[6] = (byte) (j >> 48);
            bArr[5] = (byte) (j >> 40);
            bArr[4] = (byte) (j >> 32);
            bArr[3] = (byte) (j >> 24);
            bArr[2] = (byte) (j >> 16);
            bArr[1] = (byte) (j >> 8);
            bArr[0] = (byte) j;
        }
        write(bArr, 0, 8);
    }

    @Override // java.io.DataOutput
    public final void writeShort(int i) throws IOException {
        ByteOrder byteOrder = this.f112189OooOo0o;
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = this.f112196OooOoo;
        if (byteOrder == byteOrder2) {
            bArr[0] = (byte) (i >> 8);
            bArr[1] = (byte) i;
        } else {
            bArr[1] = (byte) (i >> 8);
            bArr[0] = (byte) i;
        }
        write(bArr, 0, 2);
    }

    @Override // java.io.DataOutput
    public final void writeUTF(String str) throws IOException {
        ByteOrder byteOrder = this.f112189OooOo0o;
        this.f112189OooOo0o = ByteOrder.BIG_ENDIAN;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new DataOutputStream(byteArrayOutputStream).writeUTF(str);
        write(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
        this.f112189OooOo0o = byteOrder;
    }

    @Override // o0ooO00O.AbstractC31424OooO00o
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.f112190OooOoO = 0;
        int iOooO0OO = this.f112198OooOooo.OooO0OO(this.f112188OooOo, bArr, i, i2);
        if (iOooO0OO > 0) {
            this.f112188OooOo += (long) iOooO0OO;
        }
        return iOooO0OO;
    }

    @Override // java.io.DataOutput
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.DataOutput
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        OooO0Oo();
        long j = this.f112188OooOo;
        C31427OooO0Oo c31427OooO0Oo = this.f112198OooOooo;
        c31427OooO0Oo.getClass();
        if (i2 <= bArr.length - i && i2 >= 0 && i >= 0) {
            if (i2 != 0) {
                long j2 = (((long) i2) + j) - 1;
                if (j2 >= c31427OooO0Oo.f112199OooO00o) {
                    c31427OooO0Oo.OooO0Oo(j2);
                }
                int i3 = i2;
                while (i3 > 0) {
                    byte[] bArr2 = c31427OooO0Oo.f112201OooO0OO.get((int) (j >> 9));
                    int i4 = (int) (511 & j);
                    int iMin = Math.min(512 - i4, i3);
                    System.arraycopy(bArr, i, bArr2, i4, iMin);
                    j += (long) iMin;
                    i3 -= iMin;
                    i += iMin;
                }
            }
            this.f112188OooOo += (long) i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
