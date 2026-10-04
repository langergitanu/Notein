package oOO000oo;

import com.aspose.slides.PatternStyle;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: oOO000oo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34342OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f123272OooO00o = {PatternStyle.Wave, PatternStyle.Horizontal, PatternStyle.Vertical, PatternStyle.Cross, PatternStyle.DownwardDiagonal, PatternStyle.UpwardDiagonal, PatternStyle.DiagonalCross, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f123273OooO0O0 = new byte[128];

    public C34342OooO0o() {
        byte[] bArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            bArr = this.f123273OooO0O0;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.f123272OooO00o;
            if (i >= bArr2.length) {
                bArr[65] = bArr[97];
                bArr[66] = bArr[98];
                bArr[67] = bArr[99];
                bArr[68] = bArr[100];
                bArr[69] = bArr[101];
                bArr[70] = bArr[102];
                return;
            }
            bArr[bArr2[i]] = (byte) i;
            i++;
        }
    }

    public static boolean OooO0OO(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    public final int OooO00o(String str, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        byte[] bArr = new byte[36];
        int length = str.length();
        while (length > 0 && OooO0OO(str.charAt(length - 1))) {
            length--;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            while (i < length && OooO0OO(str.charAt(i))) {
                i++;
            }
            int i4 = i + 1;
            char cCharAt = str.charAt(i);
            byte[] bArr2 = this.f123273OooO0O0;
            byte b = bArr2[cCharAt];
            while (i4 < length && OooO0OO(str.charAt(i4))) {
                i4++;
            }
            int i5 = i4 + 1;
            byte b2 = bArr2[str.charAt(i4)];
            if ((b | b2) < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            int i6 = i2 + 1;
            bArr[i2] = (byte) ((b << 4) | b2);
            if (i6 == 36) {
                byteArrayOutputStream.write(bArr);
                i2 = 0;
            } else {
                i2 = i6;
            }
            i3++;
            i = i5;
        }
        if (i2 > 0) {
            byteArrayOutputStream.write(bArr, 0, i2);
        }
        return i3;
    }

    public final byte[] OooO0O0(int i, int i2, String str) throws IOException {
        if (i < 0 || i2 < 0 || i > str.length() - i2) {
            throw new IndexOutOfBoundsException("invalid offset and/or length specified");
        }
        if ((i2 & 1) != 0) {
            throw new IOException("a hexadecimal encoding must have an even number of characters");
        }
        int i3 = i2 >>> 1;
        byte[] bArr = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            char cCharAt = str.charAt(i);
            byte[] bArr2 = this.f123273OooO0O0;
            i += 2;
            int i5 = bArr2[str.charAt(i + 1)] | (bArr2[cCharAt] << 4);
            if (i5 < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            bArr[i4] = (byte) i5;
        }
        return bArr;
    }
}
