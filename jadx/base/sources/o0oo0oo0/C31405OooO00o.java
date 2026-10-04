package o0oo0oo0;

import OooO0Oo.C20398OooO0O0;
import androidx.appcompat.widget.C21532OooOOo;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: o0oo0oo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31405OooO00o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[] f112133OooO0OO = {1, 2, 1};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public byte[] f112134OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int[] f112135OooO0O0;

    public final void OooO00o(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        this.f112134OooO00o = new byte[bArr.length - 18];
        this.f112135OooO0O0 = new int[3];
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            if (byteArrayInputStream.read() != 128) {
                throw new IOException("Start marker missing");
            }
            if (byteArrayInputStream.read() != f112133OooO0OO[i2]) {
                throw new IOException("Incorrect record type");
            }
            int i3 = byteArrayInputStream.read() + (byteArrayInputStream.read() << 8) + (byteArrayInputStream.read() << 16) + (byteArrayInputStream.read() << 24);
            if (i3 < 0) {
                throw new IOException(C21532OooOOo.OooO0OO(i3, "PFB record size is negative: "));
            }
            this.f112135OooO0O0[i2] = i3;
            byte[] bArr2 = this.f112134OooO00o;
            if (i >= bArr2.length) {
                throw new EOFException("attempted to read past EOF");
            }
            if (i3 > bArr2.length - i) {
                StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("PFB record size (", i3, ") doesn't fit in buffer, position: ", ", total length: ", i);
                sbOooO0O0.append(this.f112134OooO00o.length);
                throw new IOException(sbOooO0O0.toString());
            }
            int i4 = byteArrayInputStream.read(bArr2, i, i3);
            if (i4 < 0) {
                throw new EOFException();
            }
            i += i4;
        }
    }
}
