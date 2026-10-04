package com.aspose.words.internal;

import com.aspose.slides.PatternStyle;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYGG implements zzYGE {

    /* JADX INFO: renamed from: eM */
    protected final byte[] f50818eM = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, PatternStyle.Wave, PatternStyle.Horizontal, PatternStyle.Vertical, PatternStyle.Cross, PatternStyle.DownwardDiagonal, PatternStyle.UpwardDiagonal, PatternStyle.DiagonalCross, 55, 56, 57, PatternStyle.Sphere, PatternStyle.Shingle};

    /* JADX INFO: renamed from: eN */
    protected byte f50819eN = 61;

    /* JADX INFO: renamed from: eO */
    protected final byte[] f50820eO = new byte[128];

    public zzYGG() {
        zzXym();
    }

    private static boolean zzX2(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    private void zzXym() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f50820eO;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.f50818eM;
            if (i >= bArr2.length) {
                return;
            }
            this.f50820eO[bArr2[i]] = (byte) i;
            i++;
        }
    }

    private static int zzn(byte[] bArr, int i, int i2) {
        while (i < i2 && zzX2((char) bArr[i])) {
            i++;
        }
        return i;
    }

    private static int zzq(String str, int i, int i2) {
        while (i < i2 && zzX2(str.charAt(i))) {
            i++;
        }
        return i;
    }

    @Override // com.aspose.words.internal.zzYGE
    public final int zzZ(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        int i3;
        int i4 = i2 % 3;
        int i5 = i2 - i4;
        int i6 = i;
        while (true) {
            i3 = i + i5;
            if (i6 >= i3) {
                break;
            }
            int i7 = bArr[i6] & 255;
            int i8 = bArr[i6 + 1] & 255;
            byte b = bArr[i6 + 2];
            outputStream.write(this.f50818eM[(i7 >>> 2) & 63]);
            outputStream.write(this.f50818eM[((i7 << 4) | (i8 >>> 4)) & 63]);
            outputStream.write(this.f50818eM[((i8 << 2) | ((b & 255) >>> 6)) & 63]);
            outputStream.write(this.f50818eM[b & 63]);
            i6 += 3;
        }
        if (i4 == 1) {
            int i9 = bArr[i3] & 255;
            outputStream.write(this.f50818eM[(i9 >>> 2) & 63]);
            outputStream.write(this.f50818eM[(i9 << 4) & 63]);
            outputStream.write(this.f50819eN);
            outputStream.write(this.f50819eN);
        } else if (i4 == 2) {
            int i10 = bArr[i3] & 255;
            int i11 = bArr[i3 + 1] & 255;
            outputStream.write(this.f50818eM[(i10 >>> 2) & 63]);
            outputStream.write(this.f50818eM[((i10 << 4) | (i11 >>> 4)) & 63]);
            outputStream.write(this.f50818eM[(i11 << 2) & 63]);
            outputStream.write(this.f50819eN);
        }
        return ((i5 / 3) * 4) + (i4 == 0 ? 0 : 4);
    }

    @Override // com.aspose.words.internal.zzYGE
    public final int zzZ(byte[] bArr, int i, OutputStream outputStream) throws IOException {
        while (i > 0 && zzX2((char) bArr[i - 1])) {
            i--;
        }
        int i2 = i - 4;
        int i3 = 0;
        int iZzn = zzn(bArr, 0, i2);
        while (iZzn < i2) {
            int i4 = iZzn + 1;
            byte b = this.f50820eO[bArr[iZzn]];
            int iZzn2 = zzn(bArr, i4, i2);
            int i5 = iZzn2 + 1;
            byte b2 = this.f50820eO[bArr[iZzn2]];
            int iZzn3 = zzn(bArr, i5, i2);
            int i6 = iZzn3 + 1;
            byte b3 = this.f50820eO[bArr[iZzn3]];
            int iZzn4 = zzn(bArr, i6, i2);
            int i7 = iZzn4 + 1;
            byte b4 = this.f50820eO[bArr[iZzn4]];
            if ((b | b2 | b3 | b4) >= 0) {
                outputStream.write((b << 2) | (b2 >> 4));
                outputStream.write((b2 << 4) | (b3 >> 2));
                outputStream.write((b3 << 6) | b4);
                i3 += 3;
                iZzn = zzn(bArr, i7, i2);
            } else {
                throw new IOException("invalid characters encountered in base64 data");
            }
        }
        return i3 + zzZ(outputStream, (char) bArr[i2], (char) bArr[i - 3], (char) bArr[i - 2], (char) bArr[i - 1]);
    }

    @Override // com.aspose.words.internal.zzYGE
    public final int zzZ(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        while (length > 0 && zzX2(str.charAt(length - 1))) {
            length--;
        }
        int i = length - 4;
        int i2 = 0;
        int iZzq = zzq(str, 0, i);
        while (iZzq < i) {
            int i3 = iZzq + 1;
            byte b = this.f50820eO[str.charAt(iZzq)];
            int iZzq2 = zzq(str, i3, i);
            int i4 = iZzq2 + 1;
            byte b2 = this.f50820eO[str.charAt(iZzq2)];
            int iZzq3 = zzq(str, i4, i);
            int i5 = iZzq3 + 1;
            byte b3 = this.f50820eO[str.charAt(iZzq3)];
            int iZzq4 = zzq(str, i5, i);
            int i6 = iZzq4 + 1;
            byte b4 = this.f50820eO[str.charAt(iZzq4)];
            if ((b | b2 | b3 | b4) >= 0) {
                outputStream.write((b << 2) | (b2 >> 4));
                outputStream.write((b2 << 4) | (b3 >> 2));
                outputStream.write((b3 << 6) | b4);
                i2 += 3;
                iZzq = zzq(str, i6, i);
            } else {
                throw new IOException("invalid characters encountered in base64 data");
            }
        }
        return i2 + zzZ(outputStream, str.charAt(i), str.charAt(length - 3), str.charAt(length - 2), str.charAt(length - 1));
    }

    private int zzZ(OutputStream outputStream, char c, char c2, char c3, char c4) throws IOException {
        char c5 = this.f50819eN;
        if (c3 == c5) {
            if (c4 == c5) {
                byte[] bArr = this.f50820eO;
                byte b = bArr[c];
                byte b2 = bArr[c2];
                if ((b | b2) >= 0) {
                    outputStream.write((b << 2) | (b2 >> 4));
                    return 1;
                }
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            throw new IOException("invalid characters encountered at end of base64 data");
        }
        if (c4 == c5) {
            byte[] bArr2 = this.f50820eO;
            byte b3 = bArr2[c];
            byte b4 = bArr2[c2];
            byte b5 = bArr2[c3];
            if ((b3 | b4 | b5) >= 0) {
                outputStream.write((b3 << 2) | (b4 >> 4));
                outputStream.write((b4 << 4) | (b5 >> 2));
                return 2;
            }
            throw new IOException("invalid characters encountered at end of base64 data");
        }
        byte[] bArr3 = this.f50820eO;
        byte b6 = bArr3[c];
        byte b7 = bArr3[c2];
        byte b8 = bArr3[c3];
        byte b9 = bArr3[c4];
        if ((b6 | b7 | b8 | b9) >= 0) {
            outputStream.write((b6 << 2) | (b7 >> 4));
            outputStream.write((b7 << 4) | (b8 >> 2));
            outputStream.write((b8 << 6) | b9);
            return 3;
        }
        throw new IOException("invalid characters encountered at end of base64 data");
    }
}
