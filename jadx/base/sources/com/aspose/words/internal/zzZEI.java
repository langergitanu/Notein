package com.aspose.words.internal;

import com.aspose.slides.PatternStyle;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZEI extends zzZEA {
    protected byte[] zzWJU;
    protected int zzWK0;
    protected int zzWM0;
    private final OutputStream zzWM4;

    public zzZEI(OutputStream outputStream, zzZHB zzzhb, String str, boolean z) throws IOException {
        super(zzzhb, str, z);
        this.zzWM0 = 0;
        this.zzWM4 = outputStream;
        this.zzWJU = zzzhb.zzXP3();
        this.zzWK0 = 0;
    }

    private void zzU(byte b, byte b2) throws IOException {
        if (this.zzWM0 != 0) {
            zzXLW();
        }
        if (this.zzWK0 + 1 >= this.zzWJU.length) {
            zzXLZ();
        }
        byte[] bArr = this.zzWJU;
        int i = this.zzWK0;
        int i2 = i + 1;
        this.zzWK0 = i2;
        bArr[i] = b;
        this.zzWK0 = i + 2;
        bArr[i2] = b2;
    }

    private void zzYY(String str) throws IOException, zzZQS {
        if (this.zzWJG) {
            zzZU(str, this.zzWOV);
        }
        zzr(str, 0, str.length());
    }

    private void zzgk(int i) throws IOException {
        flush();
        throw new IOException("Unpaired surrogate character (0x" + Integer.toHexString(i) + ")");
    }

    private void zzx9(String str) throws IOException {
        zzr(str, 0, str.length());
    }

    private void zzxa(String str) throws IOException {
        if (this.zzWM0 != 0) {
            zzXLW();
        }
        int length = str.length();
        int i = this.zzWK0;
        byte[] bArr = this.zzWJU;
        int i2 = 0;
        if (i + length >= bArr.length) {
            if (length > bArr.length) {
                zzr(str, 0, length);
                return;
            } else {
                zzXLZ();
                i = this.zzWK0;
            }
        }
        this.zzWK0 += length;
        while (i2 < length) {
            bArr[i] = (byte) str.charAt(i2);
            i2++;
            i++;
        }
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void flush() throws IOException {
        zzXLZ();
        this.zzWM4.flush();
    }

    @Override // com.aspose.words.internal.zzZEA
    public final OutputStream getOutputStream() {
        return this.zzWM4;
    }

    @Override // com.aspose.words.internal.zzZEA
    public final Writer getWriter() {
        return null;
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zz0(String str, String str2) throws IOException, zzZQS {
        zzf((byte) 32);
        zzYY(str);
        zzU((byte) 61, (byte) 34);
        int length = str2.length();
        if (length > 0) {
            Writer writer = this.zzWJA;
            if (writer != null) {
                writer.write(str2, 0, length);
            } else {
                zzxv(str2);
            }
        }
        zzf((byte) 34);
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzOT(boolean z) throws IOException {
        flush();
        byte[] bArr = this.zzWJU;
        if (bArr != null) {
            this.zzWJU = null;
            this.zzWM6.zzXt(bArr);
        }
        if (this.zzWM5) {
            this.zzWM4.close();
        }
    }

    public abstract void zzQ(char[] cArr, int i, int i2) throws IOException;

    public abstract void zzR(char[] cArr, int i, int i2) throws IOException;

    @Override // com.aspose.words.internal.zzZEA
    public final void zzVV(String str) throws IOException {
        Writer writer = this.zzWJB;
        if (writer != null) {
            writer.write(str);
        } else {
            zzxr(str);
        }
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzVX(String str) throws IOException {
        if (this.zzWM0 != 0) {
            zzXLW();
        }
        zzr(str, 0, str.length());
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzW(String str, String str2, String str3, String str4) throws IOException, zzZQS {
        zzxa("<!DOCTYPE ");
        zzxa(str);
        if (str2 != null) {
            if (str3 != null) {
                zzxa(" PUBLIC \"");
                zzr(str3, 0, str3.length());
                zzxa("\" \"");
            } else {
                zzxa(" SYSTEM \"");
            }
            zzr(str2, 0, str2.length());
            zzf((byte) 34);
        }
        if (str4 != null && str4.length() > 0) {
            zzU((byte) 32, (byte) 91);
            zzr(str4, 0, str4.length());
            zzf((byte) 93);
        }
        zzf((byte) 62);
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzX(String str, char[] cArr, int i) throws IOException, zzZQS {
        zzf((byte) 32);
        zzYY(str);
        zzU((byte) 61, (byte) 34);
        if (i > 0) {
            Writer writer = this.zzWJA;
            if (writer != null) {
                writer.write(cArr, 0, i);
            } else {
                zzR(cArr, 0, i);
            }
        }
        zzf((byte) 34);
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzXA(String str, String str2) throws IOException {
        zzU((byte) 60, PatternStyle.Shingle);
        if (str != null && str.length() > 0) {
            zzx9(str);
            zzf((byte) 58);
        }
        zzx9(str2);
        zzf((byte) 62);
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzXB(String str, String str2) throws IOException, zzZQS {
        if (str == null || str.length() == 0) {
            zzxg(str2);
            return;
        }
        zzf((byte) 60);
        zzYY(str);
        zzf((byte) 58);
        zzYY(str2);
    }

    @Override // com.aspose.words.internal.zzZEA
    public final int zzXC(String str, String str2) throws IOException, zzZQS {
        zzU((byte) 60, (byte) 63);
        zzYY(str);
        if (str2 != null && str2.length() > 0) {
            zzf((byte) 32);
            int iZzxs = zzxs(str2);
            if (iZzxs >= 0) {
                return iZzxs;
            }
        }
        zzU((byte) 63, (byte) 62);
        return -1;
    }

    public final void zzXLW() throws IOException {
        int i = this.zzWM0;
        this.zzWM0 = 0;
        zzgk(i);
    }

    public final void zzXLX() throws IOException {
        zzxa("]]>");
    }

    public final void zzXLY() throws IOException {
        zzxa("<![CDATA[");
    }

    public final void zzXLZ() throws IOException {
        byte[] bArr;
        int i = this.zzWK0;
        if (i <= 0 || (bArr = this.zzWJU) == null) {
            return;
        }
        this.zzWK0 = 0;
        this.zzWM4.write(bArr, 0, i);
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzXM0() throws IOException {
        if (this.zzWJD) {
            zzxa(" />");
        } else {
            zzU(PatternStyle.Shingle, (byte) 62);
        }
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzXM1() throws IOException {
        zzf((byte) 62);
    }

    @Override // com.aspose.words.internal.zzZEA
    public final int zzXM2() {
        return this.zzWK0;
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzY(char[] cArr, int i, int i2) throws IOException {
        Writer writer = this.zzWJB;
        if (writer != null) {
            writer.write(cArr, i, i2);
        } else {
            zzQ(cArr, i, i2);
        }
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzZ(String str, String str2, char[] cArr, int i) throws IOException, zzZQS {
        zzf((byte) 32);
        zzYY(str);
        zzf((byte) 58);
        zzYY(str2);
        zzU((byte) 61, (byte) 34);
        if (i > 0) {
            Writer writer = this.zzWJA;
            if (writer != null) {
                writer.write(cArr, 0, i);
            } else {
                zzR(cArr, 0, i);
            }
        }
        zzf((byte) 34);
    }

    public final void zzf(byte b) throws IOException {
        if (this.zzWM0 != 0) {
            zzXLW();
        }
        if (this.zzWK0 >= this.zzWJU.length) {
            zzXLZ();
        }
        byte[] bArr = this.zzWJU;
        int i = this.zzWK0;
        this.zzWK0 = i + 1;
        bArr[i] = b;
    }

    public final int zzgl(int i) throws IOException {
        int i2 = this.zzWM0;
        this.zzWM0 = 0;
        if (i2 < 55296 || i2 > 56319) {
            zzgk(i2);
        }
        if (i < 56320 || i > 57343) {
            zzgk(i);
        }
        int i3 = (i - 56320) + ((i2 - 55296) << 10) + 65536;
        if (i3 <= 1114111) {
            return i3;
        }
        throw new IOException("Illegal surrogate character pair, resulting code 0x" + Integer.toHexString(i3) + " above legal XML character range");
    }

    public final int zzgm(int i) throws IOException {
        int i2;
        byte[] bArr = this.zzWJU;
        int i3 = this.zzWK0;
        if (i3 + 10 >= bArr.length) {
            zzXLZ();
            i3 = this.zzWK0;
        }
        int i4 = i3 + 1;
        bArr[i3] = 38;
        if (i >= 256) {
            int i5 = i3 + 2;
            bArr[i4] = 35;
            int i6 = i3 + 3;
            bArr[i5] = 120;
            int i7 = 20;
            int i8 = i6;
            do {
                int i9 = (i >> i7) & 15;
                if (i9 > 0 || i8 != i6) {
                    int i10 = i8 + 1;
                    bArr[i8] = (byte) (i9 < 10 ? i9 + 48 : i9 + 87);
                    i8 = i10;
                }
                i7 -= 4;
            } while (i7 > 0);
            int i11 = i & 15;
            i2 = i8 + 1;
            bArr[i8] = (byte) (i11 < 10 ? i11 + 48 : i11 + 87);
        } else if (i == 38) {
            bArr[i4] = 97;
            int i12 = i3 + 3;
            bArr[i3 + 2] = 109;
            i2 = i3 + 4;
            bArr[i12] = 112;
        } else if (i == 60) {
            int i13 = i3 + 2;
            bArr[i4] = 108;
            i2 = i3 + 3;
            bArr[i13] = 116;
        } else if (i == 62) {
            int i14 = i3 + 2;
            bArr[i4] = 103;
            i2 = i3 + 3;
            bArr[i14] = 116;
        } else if (i == 39) {
            bArr[i4] = 97;
            bArr[i3 + 2] = 112;
            int i15 = i3 + 4;
            bArr[i3 + 3] = 111;
            i2 = i3 + 5;
            bArr[i15] = 115;
        } else if (i == 34) {
            bArr[i4] = 113;
            bArr[i3 + 2] = 117;
            int i16 = i3 + 4;
            bArr[i3 + 3] = 111;
            i2 = i3 + 5;
            bArr[i16] = 116;
        } else {
            bArr[i4] = 35;
            int i17 = i3 + 3;
            bArr[i3 + 2] = 120;
            if (i >= 16) {
                int i18 = i >> 4;
                int i19 = i3 + 4;
                bArr[i17] = (byte) (i18 < 10 ? i18 + 48 : i18 + 87);
                i &= 15;
                i17 = i19;
            }
            i2 = i17 + 1;
            bArr[i17] = (byte) (i < 10 ? i + 48 : i + 87);
        }
        int i20 = i2 + 1;
        bArr[i2] = 59;
        this.zzWK0 = i20;
        return i20;
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzh(String str, String str2, String str3) throws IOException, zzZQS {
        zzf((byte) 32);
        zzYY(str);
        zzf((byte) 58);
        zzYY(str2);
        zzU((byte) 61, (byte) 34);
        int length = str3.length();
        if (length > 0) {
            Writer writer = this.zzWJA;
            if (writer != null) {
                writer.write(str3, 0, length);
            } else {
                zzxv(str3);
            }
        }
        zzf((byte) 34);
    }

    @Override // com.aspose.words.internal.zzZEA
    public abstract void zzr(String str, int i, int i2) throws IOException;

    @Override // com.aspose.words.internal.zzZEA
    public final void zzxf(String str) throws IOException {
        zzU((byte) 60, PatternStyle.Shingle);
        zzx9(str);
        zzf((byte) 62);
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzxg(String str) throws IOException, zzZQS {
        zzf((byte) 60);
        zzYY(str);
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzxh(String str) throws IOException, zzZQS {
        if (this.zzWM0 != 0) {
            zzXLW();
        }
        zzf((byte) 38);
        zzYY(str);
        zzf((byte) 59);
    }

    @Override // com.aspose.words.internal.zzZEA
    public final int zzxi(String str) throws IOException {
        zzxa("<!--");
        int iZzxt = zzxt(str);
        if (iZzxt >= 0) {
            return iZzxt;
        }
        zzxa("-->");
        return -1;
    }

    @Override // com.aspose.words.internal.zzZEA
    public final int zzxj(String str) throws IOException {
        zzxa("<![CDATA[");
        int iZzxu = zzxu(str);
        if (iZzxu >= 0) {
            return iZzxu;
        }
        zzxa("]]>");
        return -1;
    }

    public abstract void zzxr(String str) throws IOException;

    public abstract int zzxs(String str) throws IOException, zzZQS;

    public abstract int zzxt(String str) throws IOException;

    public abstract int zzxu(String str) throws IOException;

    public abstract void zzxv(String str) throws IOException;
}
