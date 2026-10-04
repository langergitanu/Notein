package oO0OOOO0;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: oO0OOOO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32952OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f119073OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f119074OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f119075OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OutputStream f119076OooO0Oo;

    /* JADX INFO: renamed from: oO0OOOO0.OooO0o0$OooO00o */
    public static class OooO00o extends IOException {
    }

    public C32952OooO0o0(byte[] bArr, OutputStream outputStream) {
        this.f119076OooO0Oo = outputStream;
        this.f119073OooO00o = bArr;
        this.f119074OooO0O0 = bArr.length;
    }

    public static int OooO00o(int i, int i2) {
        return OooO0OO(i2) + OooO0oo(i);
    }

    public static int OooO0O0(int i, int i2) {
        return OooO0OO(i2) + OooO0oo(i);
    }

    public static int OooO0OO(int i) {
        if (i >= 0) {
            return OooO0o(i);
        }
        return 10;
    }

    public static int OooO0Oo(int i, InterfaceC32958OooOOOo interfaceC32958OooOOOo) {
        return OooO0o0(interfaceC32958OooOOOo) + OooO0oo(i);
    }

    public static int OooO0o(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int OooO0o0(InterfaceC32958OooOOOo interfaceC32958OooOOOo) {
        int serializedSize = interfaceC32958OooOOOo.getSerializedSize();
        return OooO0o(serializedSize) + serializedSize;
    }

    public static int OooO0oO(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int OooO0oo(int i) {
        return OooO0o(i << 3);
    }

    public static C32952OooO0o0 OooOO0(OutputStream outputStream, int i) {
        return new C32952OooO0o0(new byte[i], outputStream);
    }

    public final void OooO() throws IOException {
        if (this.f119076OooO0Oo != null) {
            OooOO0O();
        }
    }

    public final void OooOO0O() throws IOException {
        OutputStream outputStream = this.f119076OooO0Oo;
        if (outputStream == null) {
            throw new OooO00o("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
        outputStream.write(this.f119073OooO00o, 0, this.f119075OooO0OO);
        this.f119075OooO0OO = 0;
    }

    public final void OooOO0o(int i, int i2) throws IOException {
        OooOo(i, 0);
        OooOOO(i2);
    }

    public final void OooOOO(int i) throws IOException {
        if (i >= 0) {
            OooOo0O(i);
        } else {
            OooOo0o(i);
        }
    }

    public final void OooOOO0(int i, int i2) throws IOException {
        OooOo(i, 0);
        OooOOO(i2);
    }

    public final void OooOOOO(int i, InterfaceC32958OooOOOo interfaceC32958OooOOOo) throws IOException {
        OooOo(i, 2);
        OooOOOo(interfaceC32958OooOOOo);
    }

    public final void OooOOOo(InterfaceC32958OooOOOo interfaceC32958OooOOOo) throws IOException {
        OooOo0O(interfaceC32958OooOOOo.getSerializedSize());
        interfaceC32958OooOOOo.OooO00o(this);
    }

    public final void OooOOo(OooO0OO oooO0OO) throws IOException {
        int size = oooO0OO.size();
        int i = this.f119075OooO0OO;
        int i2 = this.f119074OooO0O0;
        int i3 = i2 - i;
        byte[] bArr = this.f119073OooO00o;
        if (i3 >= size) {
            oooO0OO.OooO0Oo(bArr, 0, i, size);
            this.f119075OooO0OO += size;
            return;
        }
        oooO0OO.OooO0Oo(bArr, 0, i, i3);
        int i4 = size - i3;
        this.f119075OooO0OO = i2;
        OooOO0O();
        if (i4 <= i2) {
            oooO0OO.OooO0Oo(bArr, i3, 0, i4);
            this.f119075OooO0OO = i4;
            return;
        }
        if (i3 < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i3);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i4 < 0) {
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("Length < 0: ");
            sb2.append(i4);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int i5 = i3 + i4;
        if (i5 <= oooO0OO.size()) {
            if (i4 > 0) {
                oooO0OO.OooOOo0(this.f119076OooO0Oo, i3, i4);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(39);
            sb3.append("Source end offset exceeded: ");
            sb3.append(i5);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public final void OooOOo0(int i) throws IOException {
        byte b = (byte) i;
        if (this.f119075OooO0OO == this.f119074OooO0O0) {
            OooOO0O();
        }
        int i2 = this.f119075OooO0OO;
        this.f119075OooO0OO = i2 + 1;
        this.f119073OooO00o[i2] = b;
    }

    public final void OooOOoo(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = this.f119075OooO0OO;
        int i2 = this.f119074OooO0O0;
        int i3 = i2 - i;
        byte[] bArr2 = this.f119073OooO00o;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, bArr2, i, length);
            this.f119075OooO0OO += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i, i3);
        int i4 = length - i3;
        this.f119075OooO0OO = i2;
        OooOO0O();
        if (i4 > i2) {
            this.f119076OooO0Oo.write(bArr, i3, i4);
        } else {
            System.arraycopy(bArr, i3, bArr2, 0, i4);
            this.f119075OooO0OO = i4;
        }
    }

    public final void OooOo(int i, int i2) throws IOException {
        OooOo0O((i << 3) | i2);
    }

    public final void OooOo0(long j) throws IOException {
        OooOOo0(((int) j) & 255);
        OooOOo0(((int) (j >> 8)) & 255);
        OooOOo0(((int) (j >> 16)) & 255);
        OooOOo0(((int) (j >> 24)) & 255);
        OooOOo0(((int) (j >> 32)) & 255);
        OooOOo0(((int) (j >> 40)) & 255);
        OooOOo0(((int) (j >> 48)) & 255);
        OooOOo0(((int) (j >> 56)) & 255);
    }

    public final void OooOo00(int i) throws IOException {
        OooOOo0(i & 255);
        OooOOo0((i >> 8) & 255);
        OooOOo0((i >> 16) & 255);
        OooOOo0((i >> 24) & 255);
    }

    public final void OooOo0O(int i) throws IOException {
        while ((i & (-128)) != 0) {
            OooOOo0((i & 127) | 128);
            i >>>= 7;
        }
        OooOOo0(i);
    }

    public final void OooOo0o(long j) throws IOException {
        while (((-128) & j) != 0) {
            OooOOo0((((int) j) & 127) | 128);
            j >>>= 7;
        }
        OooOOo0((int) j);
    }
}
