package com.aspose.words.internal;

import com.huawei.hms.network.embedded.C18177fb;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZOZ implements Comparable<zzZOZ> {
    public static final zzZOZ zzZXP = new zzZOZ();
    private byte zzZXE;
    private byte zzZXF;
    private byte zzZXG;
    private byte zzZXH;
    private byte zzZXI;
    private byte zzZXJ;
    private byte zzZXK;
    private byte zzZXL;
    private short zzZXM;
    private short zzZXN;
    private int zzZXO;

    public zzZOZ(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("b");
        }
        if (bArr.length != 16) {
            throw new IllegalArgumentException("Guid array ctor: b length should be 16.");
        }
        this.zzZXO = (bArr[3] << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[0] & 255);
        this.zzZXN = (short) ((bArr[5] << 8) | (bArr[4] & 255));
        this.zzZXM = (short) ((bArr[7] << 8) | (bArr[6] & 255));
        this.zzZXL = bArr[8];
        this.zzZXK = bArr[9];
        this.zzZXJ = bArr[10];
        this.zzZXI = bArr[11];
        this.zzZXH = bArr[12];
        this.zzZXG = bArr[13];
        this.zzZXF = bArr[14];
        this.zzZXE = bArr[15];
    }

    private static int zzB(long j, long j2) {
        return j < j2 ? -1 : 1;
    }

    private static char zzQH(int i) {
        int i2 = i & 15;
        return (char) (i2 > 9 ? i2 + 87 : i2 + 48);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzU, reason: merged with bridge method [inline-methods] */
    public int compareTo(zzZOZ zzzoz) {
        if (zzzoz == null) {
            return 1;
        }
        int i = zzzoz.zzZXO;
        int i2 = this.zzZXO;
        if (i != i2) {
            return zzB(i2, i);
        }
        short s = zzzoz.zzZXN;
        short s2 = this.zzZXN;
        if (s != s2) {
            return zzB(s2, s);
        }
        short s3 = zzzoz.zzZXM;
        short s4 = this.zzZXM;
        if (s3 != s4) {
            return zzB(s4, s3);
        }
        byte b = zzzoz.zzZXL;
        byte b2 = this.zzZXL;
        if (b != b2) {
            return zzB(b2, b);
        }
        byte b3 = zzzoz.zzZXK;
        byte b4 = this.zzZXK;
        if (b3 != b4) {
            return zzB(b4, b3);
        }
        byte b5 = zzzoz.zzZXJ;
        byte b6 = this.zzZXJ;
        if (b5 != b6) {
            return zzB(b6, b5);
        }
        byte b7 = zzzoz.zzZXI;
        byte b8 = this.zzZXI;
        if (b7 != b8) {
            return zzB(b8, b7);
        }
        byte b9 = zzzoz.zzZXH;
        byte b10 = this.zzZXH;
        if (b9 != b10) {
            return zzB(b10, b9);
        }
        byte b11 = zzzoz.zzZXG;
        byte b12 = this.zzZXG;
        if (b11 != b12) {
            return zzB(b12, b11);
        }
        byte b13 = zzzoz.zzZXF;
        byte b14 = this.zzZXF;
        if (b13 != b14) {
            return zzB(b14, b13);
        }
        byte b15 = zzzoz.zzZXE;
        byte b16 = this.zzZXE;
        if (b15 != b16) {
            return zzB(b16, b15);
        }
        return 0;
    }

    public static UUID zzV(zzZOZ zzzoz) {
        if (zzzoz == null) {
            return null;
        }
        return zzzoz.zziE();
    }

    public static zzZOZ zzZ(UUID uuid) {
        return new zzZOZ(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    public static zzZOZ zziD() {
        return zzZ(UUID.randomUUID());
    }

    private UUID zziE() {
        return new UUID((((long) this.zzZXO) << 32) | ((((long) this.zzZXN) & C18177fb.f54859s) << 16) | (((long) this.zzZXM) & C18177fb.f54859s), ((((long) this.zzZXL) & 255) << 56) | ((((long) this.zzZXK) & 255) << 48) | ((((long) this.zzZXJ) & 255) << 40) | ((((long) this.zzZXI) & 255) << 32) | ((((long) this.zzZXH) & 255) << 24) | ((((long) this.zzZXG) & 255) << 16) | ((((long) this.zzZXF) & 255) << 8) | (((long) this.zzZXE) & 255));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzZOZ) && zzZ(this, (zzZOZ) obj);
    }

    public final int hashCode() {
        return (this.zzZXO ^ (((this.zzZXN & 65535) << 16) | (65535 & this.zzZXM))) ^ (((this.zzZXJ & 255) << 24) | (this.zzZXE & 255));
    }

    public final byte[] toByteArray() {
        int i = this.zzZXO;
        short s = this.zzZXN;
        short s2 = this.zzZXM;
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24), (byte) s, (byte) (s >> 8), (byte) s2, (byte) (s2 >> 8), this.zzZXL, this.zzZXK, this.zzZXJ, this.zzZXI, this.zzZXH, this.zzZXG, this.zzZXF, this.zzZXE};
    }

    public final String toString() {
        return toString("D");
    }

    public final String toString(String str) {
        int i;
        char[] cArr;
        boolean z;
        if (str == null || str.length() == 0) {
            str = "D";
        }
        int i2 = 1;
        if (str.length() != 1) {
            throw new NumberFormatException("Format_InvalidGuidFormatSpecification");
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == 'D' || cCharAt == 'd') {
            i = 36;
            cArr = new char[36];
            z = true;
            i2 = 0;
        } else if (cCharAt == 'N' || cCharAt == 'n') {
            i = 32;
            cArr = new char[32];
            z = false;
            i2 = 0;
        } else {
            i = 38;
            if (cCharAt == 'B' || cCharAt == 'b') {
                cArr = new char[38];
                cArr[0] = '{';
                cArr[37] = '}';
            } else {
                if (cCharAt != 'P' && cCharAt != 'p') {
                    throw new NumberFormatException("Format_InvalidGuidFormatSpecification");
                }
                cArr = new char[38];
                cArr[0] = '(';
                cArr[37] = ')';
            }
            z = true;
        }
        int i3 = this.zzZXO;
        int iZzZ = zzZ(cArr, i2, i3 >> 24, i3 >> 16);
        int i4 = this.zzZXO;
        int iZzZ2 = zzZ(cArr, iZzZ, i4 >> 8, i4);
        if (z) {
            cArr[iZzZ2] = '-';
            iZzZ2++;
        }
        short s = this.zzZXN;
        int iZzZ3 = zzZ(cArr, iZzZ2, s >> 8, s);
        if (z) {
            cArr[iZzZ3] = '-';
            iZzZ3++;
        }
        short s2 = this.zzZXM;
        int iZzZ4 = zzZ(cArr, iZzZ3, s2 >> 8, s2);
        if (z) {
            cArr[iZzZ4] = '-';
            iZzZ4++;
        }
        int iZzZ5 = zzZ(cArr, iZzZ4, this.zzZXL, this.zzZXK);
        if (z) {
            cArr[iZzZ5] = '-';
            iZzZ5++;
        }
        zzZ(cArr, zzZ(cArr, zzZ(cArr, iZzZ5, this.zzZXJ, this.zzZXI), this.zzZXH, this.zzZXG), this.zzZXF, this.zzZXE);
        return new String(cArr, 0, i);
    }

    private static int zzZ(String str, int[] iArr, int i) {
        int i2 = iArr[0];
        int iZzY = (int) zzZOH.zzY(str, iArr);
        if (iArr[0] - i2 == i) {
            return iZzY;
        }
        throw new NumberFormatException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Wrong Guid Format: Invalid Char: ", str));
    }

    public static boolean zzZ(zzZOZ zzzoz, zzZOZ zzzoz2) {
        if (zzzoz == zzzoz2) {
            return true;
        }
        return zzzoz != null && zzzoz2 != null && zzzoz.zzZXO == zzzoz2.zzZXO && zzzoz.zzZXN == zzzoz2.zzZXN && zzzoz.zzZXM == zzzoz2.zzZXM && zzzoz.zzZXL == zzzoz2.zzZXL && zzzoz.zzZXK == zzzoz2.zzZXK && zzzoz.zzZXJ == zzzoz2.zzZXJ && zzzoz.zzZXI == zzzoz2.zzZXI && zzzoz.zzZXH == zzzoz2.zzZXH && zzzoz.zzZXG == zzzoz2.zzZXG && zzzoz.zzZXF == zzzoz2.zzZXF && zzzoz.zzZXE == zzzoz2.zzZXE;
    }

    public zzZOZ() {
        this.zzZXO = 0;
        this.zzZXN = (short) 0;
        this.zzZXM = (short) 0;
        this.zzZXL = (byte) 0;
        this.zzZXK = (byte) 0;
        this.zzZXJ = (byte) 0;
        this.zzZXI = (byte) 0;
        this.zzZXH = (byte) 0;
        this.zzZXG = (byte) 0;
        this.zzZXF = (byte) 0;
        this.zzZXE = (byte) 0;
    }

    private static int zzZ(char[] cArr, int i, int i2, int i3) {
        cArr[i] = zzQH(i2 >> 4);
        cArr[i + 1] = zzQH(i2);
        int i4 = i + 3;
        cArr[i + 2] = zzQH(i3 >> 4);
        int i5 = i + 4;
        cArr[i4] = zzQH(i3);
        return i5;
    }

    private zzZOZ(long j, long j2) {
        this.zzZXO = (int) (j >> 32);
        this.zzZXN = (short) (j >> 16);
        this.zzZXM = (short) j;
        this.zzZXL = (byte) (j2 >> 56);
        this.zzZXK = (byte) (j2 >> 48);
        this.zzZXJ = (byte) (j2 >> 40);
        this.zzZXI = (byte) (j2 >> 32);
        this.zzZXH = (byte) (j2 >> 24);
        this.zzZXG = (byte) (j2 >> 16);
        this.zzZXF = (byte) (j2 >> 8);
        this.zzZXE = (byte) j2;
    }

    public zzZOZ(String str) {
        int i;
        if (str != null) {
            int[] iArr = {0};
            try {
                if (str.indexOf(45, 0) >= 0) {
                    String strTrim = str.trim();
                    if (strTrim.charAt(0) == '{') {
                        if (strTrim.length() != 38 || strTrim.charAt(37) != '}') {
                            throw new NumberFormatException("Wrong Guid format sting length: ".concat(str));
                        }
                    } else if (strTrim.charAt(0) == '(') {
                        if (strTrim.length() != 38 || strTrim.charAt(37) != ')') {
                            throw new IllegalStateException("Wrong Guid format sting length: ".concat(str));
                        }
                    } else {
                        if (strTrim.length() == 36) {
                            i = 0;
                            if (strTrim.charAt(i + 8) != '-' && strTrim.charAt(i + 13) == '-' && strTrim.charAt(i + 18) == '-' && strTrim.charAt(i + 23) == '-') {
                                iArr[0] = i;
                                this.zzZXO = zzZ(strTrim, iArr, 8);
                                iArr[0] = iArr[0] + 1;
                                this.zzZXN = (short) zzZ(strTrim, iArr, 4);
                                iArr[0] = iArr[0] + 1;
                                this.zzZXM = (short) zzZ(strTrim, iArr, 4);
                                iArr[0] = iArr[0] + 1;
                                int iZzZ = zzZ(strTrim, iArr, 4);
                                int i2 = iArr[0] + 1;
                                iArr[0] = i2;
                                long jZzY = zzZOH.zzY(strTrim, iArr);
                                if (iArr[0] - i2 == 12) {
                                    this.zzZXL = (byte) (iZzZ >> 8);
                                    this.zzZXK = (byte) iZzZ;
                                    int i3 = (int) (jZzY >> 32);
                                    this.zzZXJ = (byte) (i3 >> 8);
                                    this.zzZXI = (byte) i3;
                                    int i4 = (int) jZzY;
                                    this.zzZXH = (byte) (i4 >> 24);
                                    this.zzZXG = (byte) (i4 >> 16);
                                    this.zzZXF = (byte) (i4 >> 8);
                                    this.zzZXE = (byte) i4;
                                    return;
                                }
                                throw new NumberFormatException("Wrong Guid format sting length: ".concat(str));
                            }
                            throw new NumberFormatException("Wrong format: missed or misplaced dashes: ".concat(str));
                        }
                        throw new NumberFormatException("Wrong Guid format sting length: ".concat(str));
                    }
                    i = 1;
                    if (strTrim.charAt(i + 8) != '-') {
                    }
                    throw new NumberFormatException("Wrong format: missed or misplaced dashes: ".concat(str));
                }
                throw new NumberFormatException("Unsupported Guid Format: ".concat(str));
            } catch (IndexOutOfBoundsException unused) {
                throw new IllegalStateException("Format_GuidUnrecognized");
            }
        }
        throw new NullPointerException("g");
    }
}
