package oOO000oo;

import com.aspose.slides.PatternStyle;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: oOO000oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34339OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f123268OooO00o = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, PatternStyle.Wave, PatternStyle.Horizontal, PatternStyle.Vertical, PatternStyle.Cross, PatternStyle.DownwardDiagonal, PatternStyle.UpwardDiagonal, PatternStyle.DiagonalCross, 55, 56, 57, PatternStyle.Sphere, PatternStyle.Shingle};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f123269OooO0O0 = new byte[128];

    public C34339OooO0O0() {
        byte[] bArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            bArr = this.f123269OooO0O0;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.f123268OooO00o;
            if (i >= bArr2.length) {
                return;
            }
            bArr[bArr2[i]] = (byte) i;
            i++;
        }
    }

    public static boolean OooO0O0(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    public static int OooO0OO(int i, int i2, String str) {
        while (i < i2 && OooO0O0(str.charAt(i))) {
            i++;
        }
        return i;
    }

    public final int OooO00o(String str, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        char c;
        byte[] bArr = new byte[54];
        int length = str.length();
        while (length > 0 && OooO0O0(str.charAt(length - 1))) {
            length--;
        }
        if (length == 0) {
            return 0;
        }
        int i = length;
        int i2 = 0;
        while (true) {
            c = 4;
            if (i <= 0 || i2 == 4) {
                break;
            }
            if (!OooO0O0(str.charAt(i - 1))) {
                i2++;
            }
            i--;
        }
        int iOooO0OO = OooO0OO(0, i, str);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            byte[] bArr2 = this.f123269OooO0O0;
            if (iOooO0OO >= i) {
                if (i3 > 0) {
                    byteArrayOutputStream.write(bArr, 0, i3);
                }
                int iOooO0OO2 = OooO0OO(iOooO0OO, length, str);
                int iOooO0OO3 = OooO0OO(iOooO0OO2 + 1, length, str);
                int iOooO0OO4 = OooO0OO(iOooO0OO3 + 1, length, str);
                int iOooO0OO5 = OooO0OO(iOooO0OO4 + 1, length, str);
                char cCharAt = str.charAt(iOooO0OO2);
                char cCharAt2 = str.charAt(iOooO0OO3);
                char cCharAt3 = str.charAt(iOooO0OO4);
                char cCharAt4 = str.charAt(iOooO0OO5);
                int i5 = 2;
                if (cCharAt3 == '=') {
                    if (cCharAt4 != '=') {
                        throw new IOException("invalid characters encountered at end of base64 data");
                    }
                    byte b = bArr2[cCharAt];
                    byte b2 = bArr2[cCharAt2];
                    if ((b | b2) < 0) {
                        throw new IOException("invalid characters encountered at end of base64 data");
                    }
                    byteArrayOutputStream.write((b << 2) | (b2 >> 4));
                    i5 = 1;
                } else if (cCharAt4 == '=') {
                    byte b3 = bArr2[cCharAt];
                    byte b4 = bArr2[cCharAt2];
                    byte b5 = bArr2[cCharAt3];
                    if ((b3 | b4 | b5) < 0) {
                        throw new IOException("invalid characters encountered at end of base64 data");
                    }
                    byteArrayOutputStream.write((b3 << 2) | (b4 >> 4));
                    byteArrayOutputStream.write((b4 << 4) | (b5 >> 2));
                } else {
                    byte b6 = bArr2[cCharAt];
                    byte b7 = bArr2[cCharAt2];
                    byte b8 = bArr2[cCharAt3];
                    byte b9 = bArr2[cCharAt4];
                    if ((b6 | b7 | b8 | b9) < 0) {
                        throw new IOException("invalid characters encountered at end of base64 data");
                    }
                    byteArrayOutputStream.write((b6 << 2) | (b7 >> 4));
                    byteArrayOutputStream.write((b7 << 4) | (b8 >> 2));
                    byteArrayOutputStream.write(b9 | (b8 << 6));
                    i5 = 3;
                }
                return i4 + i5;
            }
            int i6 = iOooO0OO + 1;
            byte b10 = bArr2[str.charAt(iOooO0OO)];
            int iOooO0OO6 = OooO0OO(i6, i, str);
            int i7 = iOooO0OO6 + 1;
            byte b11 = bArr2[str.charAt(iOooO0OO6)];
            int iOooO0OO7 = OooO0OO(i7, i, str);
            int i8 = iOooO0OO7 + 1;
            byte b12 = bArr2[str.charAt(iOooO0OO7)];
            int iOooO0OO8 = OooO0OO(i8, i, str);
            char c2 = c;
            int i9 = iOooO0OO8 + 1;
            byte b13 = bArr2[str.charAt(iOooO0OO8)];
            if ((b10 | b11 | b12 | b13) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            bArr[i3] = (byte) ((b10 << 2) | (b11 >> 4));
            int i10 = i3 + 2;
            bArr[i3 + 1] = (byte) ((b11 << 4) | (b12 >> 2));
            i3 += 3;
            bArr[i10] = (byte) (b13 | (b12 << 6));
            i4 += 3;
            if (i3 == 54) {
                byteArrayOutputStream.write(bArr);
                i3 = 0;
            }
            iOooO0OO = OooO0OO(i9, i, str);
            c = c2;
        }
    }
}
