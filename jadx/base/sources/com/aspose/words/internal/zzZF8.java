package com.aspose.words.internal;

import OooOo.C20485OooOoO;
import OooOoo.C20593OooO0Oo;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZF8 extends zzZFE {
    int[] zzWM9;
    private final boolean zzWMG;
    private byte[] zzWMJ;
    final InputStream zzWMK;
    boolean zzWMa;
    int zzWMb;
    boolean zzWMc;
    boolean zzWMd;
    boolean zzWMe;
    private int zzWMh;
    private int zzWMi;
    String zzWMk;

    private zzZF8(String str, zzZF7 zzzf7, InputStream inputStream) {
        super(str, zzzf7);
        this.zzWMe = true;
        this.zzWMd = false;
        this.zzWMc = false;
        this.zzWMa = false;
        this.zzWMk = null;
        this.zzWM9 = null;
        this.zzWMK = inputStream;
        this.zzWMh = 0;
        this.zzWMi = 0;
        this.zzWMG = true;
    }

    private byte nextByte() throws IOException, zzZFV {
        if (this.zzWMi >= this.zzWMh) {
            zzXNi();
        }
        byte[] bArr = this.zzWMJ;
        int i = this.zzWMi;
        this.zzWMi = i + 1;
        return bArr[i];
    }

    private void zzU(String str, int i, boolean z) throws zzZFV {
        if (this.zzWMc) {
            zzYU(str, i);
            if (z != this.zzWMe) {
                zzxT(androidx.core.database.OooO00o.OooO00o("Declared encoding '", str, "' has different endianness (", z ? "big" : "little", " endian) than what physical ordering appeared to be; cannot decode"));
            }
        }
    }

    private int zzXNa() throws IOException, zzZFV {
        int i = 0;
        while (true) {
            int iZzXNc = zzXNc();
            if (iZzXNc > 32 && iZzXNc != 133) {
                this.zzWMi--;
                return i;
            }
            if (iZzXNc == 13 || iZzXNc == 10) {
                zzgK(iZzXNc);
            } else if (iZzXNc == 0) {
                zzXNl();
            }
            i++;
        }
    }

    private int zzXNb() throws IOException, zzZFV {
        int i = 0;
        while (true) {
            int iZzXNd = zzXNd();
            if (iZzXNd > 32) {
                this.zzWMi -= this.zzWMb;
                return i;
            }
            if (iZzXNd == 13 || iZzXNd == 10) {
                zzgL(iZzXNd);
            } else if (iZzXNd == 0) {
                zzXNl();
            }
            i++;
        }
    }

    private int zzXNc() throws IOException, zzZFV {
        byte bNextByte;
        int i = this.zzWMi;
        if (i < this.zzWMh) {
            byte[] bArr = this.zzWMJ;
            this.zzWMi = i + 1;
            bNextByte = bArr[i];
        } else {
            bNextByte = nextByte();
        }
        int i2 = this.zzWM9[bNextByte & 255];
        return i2 < 0 ? -i2 : i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int zzXNd() throws IOException, zzZFV {
        byte bNextByte;
        byte bNextByte2;
        byte bNextByte3;
        byte bNextByte4;
        int i;
        int i2;
        int i3;
        int i4 = this.zzWMi;
        if (i4 < this.zzWMh) {
            byte[] bArr = this.zzWMJ;
            this.zzWMi = i4 + 1;
            bNextByte = bArr[i4];
        } else {
            bNextByte = nextByte();
        }
        int i5 = this.zzWMi;
        if (i5 < this.zzWMh) {
            byte[] bArr2 = this.zzWMJ;
            this.zzWMi = i5 + 1;
            bNextByte2 = bArr2[i5];
        } else {
            bNextByte2 = nextByte();
        }
        if (this.zzWMb != 2) {
            int i6 = this.zzWMi;
            if (i6 < this.zzWMh) {
                byte[] bArr3 = this.zzWMJ;
                this.zzWMi = i6 + 1;
                bNextByte3 = bArr3[i6];
            } else {
                bNextByte3 = nextByte();
            }
            int i7 = this.zzWMi;
            if (i7 < this.zzWMh) {
                byte[] bArr4 = this.zzWMJ;
                this.zzWMi = i7 + 1;
                bNextByte4 = bArr4[i7];
            } else {
                bNextByte4 = nextByte();
            }
            if (!this.zzWMe) {
                int i8 = (bNextByte2 & 255) << 8;
                int i9 = bNextByte & 255;
                i = i9 | i8 | ((bNextByte3 & 255) << 16) | (bNextByte4 << 24);
                if (i == 0) {
                    zzXNl();
                }
                return i;
            }
            i2 = (bNextByte << 24) | ((bNextByte2 & 255) << 16) | ((bNextByte3 & 255) << 8);
            i3 = bNextByte4 & 255;
        } else if (this.zzWMe) {
            i2 = (bNextByte & 255) << 8;
            i3 = bNextByte2 & 255;
        } else {
            i2 = bNextByte & 255;
            i3 = (bNextByte2 & 255) << 8;
        }
        i = i2 | i3;
        if (i == 0) {
        }
        return i;
    }

    private int zzXNe() throws IOException, zzZFV {
        byte bNextByte;
        int i = 0;
        while (true) {
            int i2 = this.zzWMi;
            if (i2 < this.zzWMh) {
                byte[] bArr = this.zzWMJ;
                this.zzWMi = i2 + 1;
                bNextByte = bArr[i2];
            } else {
                bNextByte = nextByte();
            }
            if ((bNextByte & 255) > 32) {
                this.zzWMi--;
                return i;
            }
            if (bNextByte == 13 || bNextByte == 10) {
                zzg(bNextByte);
            } else if (bNextByte == 0) {
                zzXNl();
            }
            i++;
        }
    }

    private boolean zzXNf() throws IOException, zzZFV {
        int i = this.zzWMb;
        if (i == 1) {
            if (!zzgM(6)) {
                return false;
            }
            byte[] bArr = this.zzWMJ;
            int i2 = this.zzWMi;
            if (bArr[i2] != 60 || bArr[i2 + 1] != 63 || bArr[i2 + 2] != 120 || bArr[i2 + 3] != 109 || bArr[i2 + 4] != 108 || (bArr[i2 + 5] & 255) > 32) {
                return false;
            }
            this.zzWMi = i2 + 6;
            return true;
        }
        if (i == -1) {
            if (!zzgM(6)) {
                return false;
            }
            int i3 = this.zzWMi;
            if (zzXNc() == 60 && zzXNc() == 63 && zzXNc() == 120 && zzXNc() == 109 && zzXNc() == 108 && zzXNc() <= 32) {
                return true;
            }
            this.zzWMi = i3;
            return false;
        }
        if (!zzgM(i * 6)) {
            return false;
        }
        int i4 = this.zzWMi;
        if (zzXNd() == 60 && zzXNd() == 63 && zzXNd() == 120 && zzXNd() == 109 && zzXNd() == 108 && zzXNd() <= 32) {
            return true;
        }
        this.zzWMi = i4;
        return false;
    }

    private void zzXNg() throws IOException, zzZFV {
        this.zzWMb = 0;
        this.zzWMe = true;
        if (zzgM(4)) {
            byte[] bArr = this.zzWMJ;
            int i = (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
            if (i == -16842752) {
                zzxO("3412");
            } else if (i == -131072) {
                this.zzWMb = 4;
                this.zzWMi = 4;
                this.zzWMe = false;
            } else if (i == 65279) {
                this.zzWMe = true;
                this.zzWMb = 4;
                this.zzWMi = 4;
            } else if (i != 65534) {
                int i2 = i >>> 16;
                if (i2 != 65279) {
                    if (i2 != 65534) {
                        if ((i >>> 8) != 15711167) {
                            switch (i) {
                                case 60:
                                    this.zzWMe = true;
                                    this.zzWMb = 4;
                                    break;
                                case 15360:
                                    zzxO("2143");
                                    break;
                                case 3932160:
                                    zzxO("3412");
                                    break;
                                case 3932223:
                                    this.zzWMb = 2;
                                    this.zzWMe = true;
                                    break;
                                case 1006632960:
                                    this.zzWMb = 4;
                                    this.zzWMe = false;
                                    break;
                                case 1006649088:
                                    this.zzWMb = 2;
                                    this.zzWMe = false;
                                    break;
                                case 1010792557:
                                    this.zzWMb = 1;
                                    this.zzWMe = true;
                                    break;
                                case 1282385812:
                                    this.zzWMb = -1;
                                    this.zzWMa = true;
                                    this.zzWM9 = zzZFG.zzXNz();
                                    break;
                            }
                        } else {
                            this.zzWMi = 3;
                            this.zzWMb = 1;
                            this.zzWMe = true;
                        }
                    } else {
                        this.zzWMb = 2;
                        this.zzWMi = 2;
                        this.zzWMe = false;
                    }
                } else {
                    this.zzWMb = 2;
                    this.zzWMi = 2;
                    this.zzWMe = true;
                }
            } else {
                zzxO("2143");
            }
            int i3 = this.zzWMi;
            this.zzWMd = i3 > 0;
            this.zzWMu = -i3;
            this.zzWMs = i3;
        }
        boolean z = this.zzWMb != 0;
        this.zzWMc = z;
        if (z) {
            return;
        }
        this.zzWMb = 1;
        this.zzWMe = true;
    }

    private void zzXNi() throws IOException, zzZFV {
        int i;
        int i2 = this.zzWMu;
        int i3 = this.zzWMh;
        this.zzWMu = i2 + i3;
        this.zzWMs -= i3;
        this.zzWMi = 0;
        InputStream inputStream = this.zzWMK;
        if (inputStream == null) {
            i = -1;
        } else {
            byte[] bArr = this.zzWMJ;
            i = inputStream.read(bArr, 0, bArr.length);
        }
        this.zzWMh = i;
        if (i <= 0) {
            throw new zzZFW(" in xml declaration", zzlj());
        }
    }

    private void zzYU(String str, int i) throws zzZFV {
        if (!this.zzWMc || i == this.zzWMb) {
            return;
        }
        if (this.zzWMa) {
            zzxT("Declared encoding '" + str + "' incompatible with auto-detected physical encoding (EBCDIC variant), can not decode input since actual code page not known");
        }
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "Declared encoding '", str, "' uses ", " bytes per character; but physical encoding appeared to use ");
        sbOooO0OO.append(this.zzWMb);
        sbOooO0OO.append("; cannot decode");
        zzxT(sbOooO0OO.toString());
    }

    public static zzZF8 zzZ(String str, zzZF7 zzzf7, InputStream inputStream) {
        return new zzZF8(str, zzzf7, inputStream);
    }

    private void zzg(byte b) throws IOException, zzZFV {
        byte bNextByte;
        if (b == 13) {
            int i = this.zzWMi;
            if (i < this.zzWMh) {
                byte[] bArr = this.zzWMJ;
                this.zzWMi = i + 1;
                bNextByte = bArr[i];
            } else {
                bNextByte = nextByte();
            }
            if (bNextByte != 10) {
                this.zzWMi--;
            }
        }
        this.zzWMt++;
        this.zzWMs = this.zzWMi;
    }

    private void zzgK(int i) throws IOException, zzZFV {
        if (i == 13 && zzXNc() != 10) {
            this.zzWMi--;
        }
        this.zzWMt++;
        this.zzWMs = this.zzWMi;
    }

    private void zzgL(int i) throws IOException, zzZFV {
        if (i == 13 && zzXNd() != 10) {
            this.zzWMi -= this.zzWMb;
        }
        this.zzWMt++;
        this.zzWMs = this.zzWMi;
    }

    private boolean zzgM(int i) throws IOException {
        int i2;
        int i3 = this.zzWMh - this.zzWMi;
        while (i3 < i) {
            InputStream inputStream = this.zzWMK;
            if (inputStream == null) {
                i2 = -1;
            } else {
                byte[] bArr = this.zzWMJ;
                int i4 = this.zzWMh;
                i2 = inputStream.read(bArr, i4, bArr.length - i4);
            }
            if (i2 <= 0) {
                return false;
            }
            this.zzWMh += i2;
            i3 += i2;
        }
        return true;
    }

    private static void zzxO(String str) throws IOException {
        throw new CharConversionException(C20593OooO0Oo.OooO0O0("Unsupported UCS-4 endianness (", str, ") detected"));
    }

    private int zzxP(String str) throws IOException, zzZFV {
        int length = str.length();
        for (int i = 1; i < length; i++) {
            int iZzXNc = zzXNc();
            if (iZzXNc == 0) {
                zzXNl();
            }
            if (iZzXNc != str.charAt(i)) {
                return iZzXNc;
            }
        }
        return 0;
    }

    private int zzxQ(String str) throws IOException, zzZFV {
        int length = str.length();
        for (int i = 1; i < length; i++) {
            int iZzXNd = zzXNd();
            if (iZzXNd == 0) {
                zzXNl();
            }
            if (iZzXNd != str.charAt(i)) {
                return iZzXNd;
            }
        }
        return 0;
    }

    private int zzxR(String str) throws IOException, zzZFV {
        byte bNextByte;
        int length = str.length();
        for (int i = 1; i < length; i++) {
            int i2 = this.zzWMi;
            if (i2 < this.zzWMh) {
                byte[] bArr = this.zzWMJ;
                this.zzWMi = i2 + 1;
                bNextByte = bArr[i2];
            } else {
                bNextByte = nextByte();
            }
            if (bNextByte == 0) {
                zzXNl();
            }
            int i3 = bNextByte & 255;
            if (i3 != str.charAt(i)) {
                return i3;
            }
        }
        return 0;
    }

    private String zzxS(String str) throws zzZFV {
        String strZzUv = zzZFJ.zzUv(str);
        if (strZzUv == "UTF-8") {
            zzYU(strZzUv, 1);
            return strZzUv;
        }
        if (strZzUv == "ISO-8859-1") {
            zzYU(strZzUv, 1);
            return strZzUv;
        }
        if (strZzUv == "US-ASCII") {
            zzYU(strZzUv, 1);
            return strZzUv;
        }
        if (strZzUv == "UTF-16") {
            zzYU(strZzUv, 2);
            return strZzUv;
        }
        if (strZzUv == "UTF-16LE") {
            zzU(strZzUv, 2, false);
            return strZzUv;
        }
        if (strZzUv == "UTF-16BE") {
            zzU(strZzUv, 2, true);
            return strZzUv;
        }
        if (strZzUv == "UTF-32") {
            zzYU(strZzUv, 4);
            return strZzUv;
        }
        if (strZzUv == "UTF-32LE") {
            zzU(strZzUv, 4, false);
            return strZzUv;
        }
        if (strZzUv == "UTF-32BE") {
            zzU(strZzUv, 4, true);
        }
        return strZzUv;
    }

    @Override // com.aspose.words.internal.zzZFE
    public final String getInputEncoding() {
        return this.zzWMk;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0049 A[PHI: r7
      0x0049: PHI (r7v1 int) = (r7v0 int), (r7v2 int) binds: [B:35:0x0055, B:29:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.aspose.words.internal.zzZFE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzT(char[] cArr, int i) throws IOException, zzZFV {
        int iZzXNc;
        byte bNextByte;
        int length = cArr.length;
        int i2 = this.zzWMb;
        int i3 = 0;
        boolean z = i2 == 1;
        boolean z2 = !z && i2 > 1;
        while (i3 < length) {
            int i4 = 10;
            if (z) {
                int i5 = this.zzWMi;
                if (i5 < this.zzWMh) {
                    byte[] bArr = this.zzWMJ;
                    this.zzWMi = i5 + 1;
                    bNextByte = bArr[i5];
                } else {
                    bNextByte = nextByte();
                }
                if (bNextByte == 0) {
                    zzXNl();
                }
                if (bNextByte == 13 || bNextByte == 10) {
                    zzg(bNextByte);
                } else {
                    i4 = bNextByte;
                }
                i4 &= 255;
            } else if (z2) {
                iZzXNc = zzXNd();
                if (iZzXNc == 13 || iZzXNc == 10) {
                    zzgL(iZzXNc);
                } else {
                    i4 = iZzXNc;
                }
            } else {
                iZzXNc = zzXNc();
                if (iZzXNc == 13 || iZzXNc == 10) {
                    zzgK(iZzXNc);
                }
            }
            if (i4 == i) {
                if (i3 < length) {
                    return i3;
                }
                return -1;
            }
            if (i3 < length) {
                cArr[i3] = (char) i4;
                i3++;
            }
        }
        return -1;
    }

    @Override // com.aspose.words.internal.zzZFE
    public final int zzXNm() throws IOException, zzZFV {
        byte bNextByte;
        int i = this.zzWMb;
        if (i == 1) {
            zzXNe();
        } else if (i == -1) {
            zzXNa();
        } else {
            zzXNb();
        }
        int i2 = this.zzWMb;
        if (i2 != 1) {
            return i2 == -1 ? zzXNc() : zzXNd();
        }
        int i3 = this.zzWMi;
        if (i3 < this.zzWMh) {
            byte[] bArr = this.zzWMJ;
            this.zzWMi = i3 + 1;
            bNextByte = bArr[i3];
        } else {
            bNextByte = nextByte();
        }
        return bNextByte & 255;
    }

    @Override // com.aspose.words.internal.zzZFE
    public final int zzXNn() throws IOException, zzZFV {
        byte bNextByte;
        int i = this.zzWMb;
        if (i != 1) {
            return i == -1 ? zzXNc() : zzXNd();
        }
        int i2 = this.zzWMi;
        if (i2 < this.zzWMh) {
            byte[] bArr = this.zzWMJ;
            this.zzWMi = i2 + 1;
            bNextByte = bArr[i2];
        } else {
            bNextByte = nextByte();
        }
        return bNextByte & 255;
    }

    @Override // com.aspose.words.internal.zzZFE
    public final void zzXNo() {
        int i = this.zzWMb;
        if (i < 0) {
            this.zzWMi += i;
        } else {
            this.zzWMi -= i;
        }
    }

    @Override // com.aspose.words.internal.zzZFE
    public final int zzXNt() {
        int i = this.zzWMi - this.zzWMs;
        int i2 = this.zzWMb;
        return i2 > 1 ? i / i2 : i;
    }

    @Override // com.aspose.words.internal.zzZFE
    public final int zzXNv() {
        int i = this.zzWMu + this.zzWMi;
        int i2 = this.zzWMb;
        return i2 > 1 ? i / i2 : i;
    }

    @Override // com.aspose.words.internal.zzZFE
    public final zzZQY zzlj() {
        int i = this.zzWMu;
        int i2 = this.zzWMi;
        int i3 = i + i2;
        int i4 = i2 - this.zzWMs;
        int i5 = this.zzWMb;
        if (i5 > 1) {
            i3 /= i5;
            i4 /= i5;
        }
        return new zzZF2(this.zzYrz, this.zzWMS, i3 - 1, this.zzWMt, i4);
    }

    @Override // com.aspose.words.internal.zzZFE
    public final int zzxU(String str) throws IOException, zzZFV {
        int i = this.zzWMb;
        return i != 1 ? i == -1 ? zzxP(str) : zzxQ(str) : zzxR(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d3  */
    @Override // com.aspose.words.internal.zzZFE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Reader zzZ(zzZHC zzzhc, boolean z, int i) throws IOException, zzZQS {
        String strZzxS;
        zzZFN zzzf6;
        int iZzXPH = zzzhc.zzXPH();
        if (iZzXPH < 128) {
            iZzXPH = 128;
        }
        if (this.zzWMJ == null) {
            this.zzWMJ = zzzhc.zzh4(iZzXPH);
        }
        zzXNg();
        if (zzXNf()) {
            zzQ(z, i);
            String str = this.zzWMq;
            strZzxS = str != null ? zzxS(str) : null;
            if (strZzxS == null) {
                if (this.zzWMa) {
                    String str2 = this.zzWMq;
                    if (str2 == null || str2.length() == 0) {
                        zzxT("Missing encoding declaration: underlying encoding looks like an EBCDIC variant, but no xml encoding declaration found");
                    }
                    strZzxS = this.zzWMq;
                } else {
                    int i2 = this.zzWMb;
                    strZzxS = i2 == 2 ? this.zzWMe ? "UTF-16BE" : "UTF-16LE" : i2 == 4 ? this.zzWMe ? "UTF-32BE" : "UTF-32LE" : "UTF-8";
                }
            }
            this.zzWMk = strZzxS;
            if (strZzxS != "UTF-8") {
                zzzf6 = new zzZF5(zzzhc, this.zzWMK, this.zzWMJ, this.zzWMi, this.zzWMh, this.zzWMG);
            } else if (strZzxS == "ISO-8859-1") {
                zzzf6 = new zzZFF(zzzhc, this.zzWMK, this.zzWMJ, this.zzWMi, this.zzWMh, this.zzWMG);
            } else if (strZzxS == "US-ASCII") {
                zzzf6 = new zzZFP(zzzhc, this.zzWMK, this.zzWMJ, this.zzWMi, this.zzWMh, this.zzWMG);
            } else {
                if (!strZzxS.startsWith("UTF-32")) {
                    InputStream zzzfb = this.zzWMK;
                    if (this.zzWMi < this.zzWMh) {
                        zzzfb = new zzZFB(zzzhc, zzzfb, this.zzWMJ, this.zzWMi, this.zzWMh);
                    }
                    if (strZzxS == "UTF-16") {
                        String str3 = this.zzWMe ? "UTF-16BE" : "UTF-16LE";
                        this.zzWMk = str3;
                        strZzxS = str3;
                    }
                    try {
                        return new InputStreamReader(zzzfb, strZzxS);
                    } catch (UnsupportedEncodingException e) {
                        throw new zzZFU("Unsupported encoding: " + e.getMessage());
                    }
                }
                if (strZzxS == "UTF-32") {
                    this.zzWMk = this.zzWMe ? "UTF-32BE" : "UTF-32LE";
                }
                zzzf6 = new zzZF6(zzzhc, this.zzWMK, this.zzWMJ, this.zzWMi, this.zzWMh, this.zzWMG, this.zzWMe);
            }
            if (this.zzWMp) {
                zzzf6.zzXNI();
            }
            return zzzf6;
        }
        this.zzWMp = 272 == i;
        if (strZzxS == null) {
        }
        this.zzWMk = strZzxS;
        if (strZzxS != "UTF-8") {
        }
        if (this.zzWMp) {
        }
        return zzzf6;
    }
}
