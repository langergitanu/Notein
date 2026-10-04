package oO00000;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import o00o00Oo.C25256OooO00o;

/* JADX INFO: renamed from: oO00000.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31907OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f113735OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f113736OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final byte[] f113737OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f113738OooO0Oo;

    public C31907OooO0o0(int i, byte[] bArr) {
        this.f113735OooO00o = i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byteArray = BigInteger.valueOf(i).toByteArray();
        int i2 = byteArray[0] == 0 ? 1 : 0;
        byteArrayOutputStream.write(byteArray, i2, byteArray.length - i2);
        int length = bArr == null ? 0 : bArr.length;
        this.f113736OooO0O0 = length;
        if (length < 128) {
            byteArrayOutputStream.write(length);
        } else {
            byte[] byteArray2 = BigInteger.valueOf(length).toByteArray();
            int i3 = byteArray2[0] != 0 ? 0 : 1;
            byteArrayOutputStream.write(128 | (byteArray2.length - i3));
            byteArrayOutputStream.write(byteArray2, i3, byteArray2.length - i3);
        }
        this.f113738OooO0Oo = byteArrayOutputStream.size();
        if (bArr != null) {
            byteArrayOutputStream.write(bArr, 0, length);
        }
        this.f113737OooO0OO = byteArrayOutputStream.toByteArray();
    }

    public static C31907OooO0o0 OooO00o(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        int i = b & 255;
        if ((b & 31) == 31) {
            i = (i << 8) | (byteBuffer.get() & 255);
            while ((i & 128) == 128) {
                i = (byteBuffer.get() & 255) | (i << 8);
            }
        }
        int i2 = byteBuffer.get() & 255;
        if (i2 == 128) {
            throw new IllegalArgumentException("Indefinite length not supported");
        }
        if (i2 > 128) {
            int i3 = i2 - 128;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                i4 = (i4 << 8) | (byteBuffer.get() & 255);
            }
            i2 = i4;
        }
        byte[] bArr = new byte[i2];
        byteBuffer.get(bArr);
        return new C31907OooO0o0(i, bArr);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Integer numValueOf = Integer.valueOf(this.f113735OooO00o);
        int i = this.f113736OooO0O0;
        Integer numValueOf2 = Integer.valueOf(i);
        int i2 = this.f113738OooO0Oo;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f113737OooO0OO, i2, i + i2);
        return String.format(locale, "Tlv(0x%x, %d, %s)", numValueOf, numValueOf2, C25256OooO00o.OooO0Oo(0, bArrCopyOfRange.length, bArrCopyOfRange));
    }
}
