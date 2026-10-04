package com.aspose.words.internal;

import com.aspose.slides.PatternStyle;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYGB implements zzYGE {

    /* JADX INFO: renamed from: eM */
    protected final byte[] f50815eM = {PatternStyle.Wave, PatternStyle.Horizontal, PatternStyle.Vertical, PatternStyle.Cross, PatternStyle.DownwardDiagonal, PatternStyle.UpwardDiagonal, PatternStyle.DiagonalCross, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: eO */
    protected final byte[] f50816eO = new byte[128];

    public zzYGB() {
        zzXym();
    }

    private static boolean zzX2(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    private void zzXym() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f50816eO;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.f50815eM;
            if (i >= bArr2.length) {
                byte[] bArr3 = this.f50816eO;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
            this.f50816eO[bArr2[i]] = (byte) i;
            i++;
        }
    }

    @Override // com.aspose.words.internal.zzYGE
    public final int zzZ(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        for (int i3 = i; i3 < i + i2; i3++) {
            byte b = bArr[i3];
            outputStream.write(this.f50815eM[(b & 255) >>> 4]);
            outputStream.write(this.f50815eM[b & 15]);
        }
        return i2 * 2;
    }

    @Override // com.aspose.words.internal.zzYGE
    public final int zzZ(byte[] bArr, int i, OutputStream outputStream) throws IOException {
        while (i > 0 && zzX2((char) bArr[i - 1])) {
            i--;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            while (i2 < i && zzX2((char) bArr[i2])) {
                i2++;
            }
            int i4 = i2 + 1;
            byte b = this.f50816eO[bArr[i2]];
            while (i4 < i && zzX2((char) bArr[i4])) {
                i4++;
            }
            int i5 = i4 + 1;
            byte b2 = this.f50816eO[bArr[i4]];
            if ((b | b2) >= 0) {
                outputStream.write((b << 4) | b2);
                i3++;
                i2 = i5;
            } else {
                throw new IOException("invalid characters encountered in Hex data");
            }
        }
        return i3;
    }

    @Override // com.aspose.words.internal.zzYGE
    public final int zzZ(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        while (length > 0 && zzX2(str.charAt(length - 1))) {
            length--;
        }
        int i = 0;
        int i2 = 0;
        while (i < length) {
            while (i < length && zzX2(str.charAt(i))) {
                i++;
            }
            int i3 = i + 1;
            byte b = this.f50816eO[str.charAt(i)];
            while (i3 < length && zzX2(str.charAt(i3))) {
                i3++;
            }
            int i4 = i3 + 1;
            byte b2 = this.f50816eO[str.charAt(i3)];
            if ((b | b2) >= 0) {
                outputStream.write((b << 4) | b2);
                i2++;
                i = i4;
            } else {
                throw new IOException("invalid characters encountered in Hex string");
            }
        }
        return i2;
    }
}
