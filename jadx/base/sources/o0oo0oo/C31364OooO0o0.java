package o0oo0oo;

import OooO0Oo.C20398OooO0O0;
import android.util.Log;
import androidx.appcompat.widget.C21532OooOOo;
import java.io.IOException;
import java.util.HashMap;
import o0oo0oo.C31362OooO0Oo;

/* JADX INFO: renamed from: o0oo0oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31364OooO0o0 extends C31400Oooo0o0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C31362OooO0Oo[] f111984OooO0o;

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0222, code lost:
    
        throw new java.io.IOException("Invalid character code ".concat(java.lang.String.format("0x%X", java.lang.Long.valueOf(r26))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0238, code lost:
    
        throw new java.io.IOException("Invalid character code ".concat(java.lang.String.format("0x%X", java.lang.Long.valueOf(r14))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0285, code lost:
    
        throw new java.io.IOException("Invalid character codes, ".concat(java.lang.String.format("startCode: 0x%X, numChars: %d", java.lang.Long.valueOf(r2), java.lang.Long.valueOf(r5))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0371, code lost:
    
        throw new java.io.IOException("Range invalid");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0159, code lost:
    
        throw new java.io.IOException("Invalid character code ".concat(java.lang.String.format("0x%X", java.lang.Long.valueOf(r30))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016f, code lost:
    
        throw new java.io.IOException("Invalid character code ".concat(java.lang.String.format("0x%X", java.lang.Long.valueOf(r28))));
     */
    @Override // o0oo0oo.C31400Oooo0o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO00o(C31401Oooo0oO c31401Oooo0oO, AbstractC31397Oooo0O0 abstractC31397Oooo0O0) throws IOException {
        int i;
        int i2;
        int i3;
        C31362OooO0Oo.OooO00o[] oooO00oArr;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        long j2;
        abstractC31397Oooo0O0.ooOO();
        int iOoOO = abstractC31397Oooo0O0.ooOO();
        this.f111984OooO0o = new C31362OooO0Oo[iOoOO];
        for (int i8 = 0; i8 < iOoOO; i8++) {
            C31362OooO0Oo c31362OooO0Oo = new C31362OooO0Oo();
            c31362OooO0Oo.f111974OooO00o = abstractC31397Oooo0O0.ooOO();
            c31362OooO0Oo.f111975OooO0O0 = abstractC31397Oooo0O0.ooOO();
            c31362OooO0Oo.f111976OooO0OO = abstractC31397Oooo0O0.Oooo0OO();
            this.f111984OooO0o[i8] = c31362OooO0Oo;
        }
        int iOooo0OO = c31401Oooo0oO.Oooo0OO();
        int i9 = 0;
        while (true) {
            int i10 = 1;
            if (i9 >= iOoOO) {
                this.f112121OooO0Oo = true;
                return;
            }
            C31362OooO0Oo c31362OooO0Oo2 = this.f111984OooO0o[i9];
            c31362OooO0Oo2.getClass();
            abstractC31397Oooo0O0.seek(this.f112119OooO0O0 + c31362OooO0Oo2.f111976OooO0OO);
            int iOoOO2 = abstractC31397Oooo0O0.ooOO();
            if (iOoOO2 < 8) {
                abstractC31397Oooo0O0.ooOO();
                abstractC31397Oooo0O0.ooOO();
            } else {
                abstractC31397Oooo0O0.ooOO();
                abstractC31397Oooo0O0.Oooo0OO();
                abstractC31397Oooo0O0.Oooo0OO();
            }
            if (iOoOO2 != 0) {
                char c = 2;
                if (iOoOO2 == 2) {
                    i = iOoOO;
                    i2 = i9;
                    int[] iArr = new int[256];
                    int iMax = 0;
                    for (int i11 = 0; i11 < 256; i11++) {
                        int iOoOO3 = abstractC31397Oooo0O0.ooOO();
                        iArr[i11] = iOoOO3;
                        iMax = Math.max(iMax, iOoOO3 / 8);
                    }
                    C31362OooO0Oo.OooO00o[] oooO00oArr2 = new C31362OooO0Oo.OooO00o[iMax + 1];
                    for (int i12 = 0; i12 <= iMax; i12++) {
                        oooO00oArr2[i12] = new C31362OooO0Oo.OooO00o(abstractC31397Oooo0O0.ooOO(), abstractC31397Oooo0O0.ooOO(), abstractC31397Oooo0O0.Oooo000(), (abstractC31397Oooo0O0.ooOO() - (((r2 - i12) - 1) * 8)) - 2);
                    }
                    long jOooO00o = abstractC31397Oooo0O0.OooO00o();
                    c31362OooO0Oo2.f111977OooO0Oo = C31362OooO0Oo.OooO0Oo(iOooo0OO);
                    c31362OooO0Oo2.f111978OooO0o = new HashMap(iOooo0OO);
                    if (iOooo0OO == 0) {
                        Log.w("PdfBox-Android", "subtable has no glyphs");
                    } else {
                        int i13 = 0;
                        while (i13 <= iMax) {
                            C31362OooO0Oo.OooO00o oooO00o = oooO00oArr2[i13];
                            int i14 = oooO00o.f111980OooO00o;
                            abstractC31397Oooo0O0.seek(((long) oooO00o.f111983OooO0Oo) + jOooO00o);
                            int i15 = 0;
                            while (i15 < oooO00o.f111981OooO0O0) {
                                int i16 = i14 + i15 + (i13 << 8);
                                int iOoOO4 = abstractC31397Oooo0O0.ooOO();
                                if (iOoOO4 > 0 && (iOoOO4 = (iOoOO4 + oooO00o.f111982OooO0OO) % 65536) < 0) {
                                    iOoOO4 += 65536;
                                }
                                if (iOoOO4 >= iOooo0OO) {
                                    i3 = i13;
                                    oooO00oArr = oooO00oArr2;
                                    StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("glyphId ", iOoOO4, " for charcode ", " ignored, numGlyphs is ", i16);
                                    sbOooO0O0.append(iOooo0OO);
                                    Log.w("PdfBox-Android", sbOooO0O0.toString());
                                } else {
                                    i3 = i13;
                                    oooO00oArr = oooO00oArr2;
                                    c31362OooO0Oo2.f111977OooO0Oo[iOoOO4] = i16;
                                    c31362OooO0Oo2.f111978OooO0o.put(Integer.valueOf(i16), Integer.valueOf(iOoOO4));
                                }
                                i15++;
                                i13 = i3;
                                oooO00oArr2 = oooO00oArr;
                            }
                            i13++;
                        }
                    }
                } else if (iOoOO2 != 4) {
                    if (iOoOO2 != 6) {
                        char c2 = '\n';
                        if (iOoOO2 == 8) {
                            i7 = iOoOO;
                            i2 = i9;
                            int[] iArrOooo0 = abstractC31397Oooo0O0.Oooo0(8192);
                            long jOooo0OO = abstractC31397Oooo0O0.Oooo0OO();
                            if (jOooo0OO > 65536) {
                                throw new IOException("CMap ( Subtype8 ) is invalid");
                            }
                            c31362OooO0Oo2.f111977OooO0Oo = C31362OooO0Oo.OooO0Oo(iOooo0OO);
                            c31362OooO0Oo2.f111978OooO0o = new HashMap(iOooo0OO);
                            if (iOooo0OO == 0) {
                                Log.w("PdfBox-Android", "subtable has no glyphs");
                            } else {
                                long j3 = 0;
                                while (j3 < jOooo0OO) {
                                    long jOooo0OO2 = abstractC31397Oooo0O0.Oooo0OO();
                                    long jOooo0OO3 = abstractC31397Oooo0O0.Oooo0OO();
                                    long jOooo0OO4 = abstractC31397Oooo0O0.Oooo0OO();
                                    if (jOooo0OO2 <= jOooo0OO3 && 0 <= jOooo0OO2) {
                                        char c3 = c2;
                                        long j4 = j3;
                                        long j5 = jOooo0OO2;
                                        while (j5 <= jOooo0OO3) {
                                            if (j5 > 2147483647L) {
                                                throw new IOException(androidx.concurrent.futures.OooO00o.OooO0O0(j5, "[Sub Format 8] Invalid character code "));
                                            }
                                            int i17 = (int) j5;
                                            int i18 = i17 / 8;
                                            if (i18 >= iArrOooo0.length) {
                                                throw new IOException(androidx.concurrent.futures.OooO00o.OooO0O0(j5, "[Sub Format 8] Invalid character code "));
                                            }
                                            if ((iArrOooo0[i18] & (i10 << (i17 % 8))) != 0) {
                                                long j6 = ((((j5 >> c3) + 55232) << c3) + ((1023 & j5) + 56320)) - 56613888;
                                                if (j6 > 2147483647L) {
                                                    throw new IOException(androidx.concurrent.futures.OooO00o.OooO0O0(j6, "[Sub Format 8] Invalid character code "));
                                                }
                                                i17 = (int) j6;
                                            }
                                            long j7 = (j5 - jOooo0OO2) + jOooo0OO4;
                                            int i19 = i10;
                                            C31362OooO0Oo c31362OooO0Oo3 = c31362OooO0Oo2;
                                            if (j7 <= iOooo0OO && j7 <= 2147483647L) {
                                                int i20 = (int) j7;
                                                c31362OooO0Oo3.f111977OooO0Oo[i20] = i17;
                                                c31362OooO0Oo3.f111978OooO0o.put(Integer.valueOf(i17), Integer.valueOf(i20));
                                                j5++;
                                                c31362OooO0Oo2 = c31362OooO0Oo3;
                                                i10 = i19;
                                            }
                                        }
                                        j3 = j4 + 1;
                                        c2 = c3;
                                        i10 = i10;
                                    }
                                }
                            }
                        } else if (iOoOO2 != 10) {
                            switch (iOoOO2) {
                                case 12:
                                    i7 = iOoOO;
                                    i2 = i9;
                                    long jOooo0OO5 = abstractC31397Oooo0O0.Oooo0OO();
                                    c31362OooO0Oo2.f111977OooO0Oo = C31362OooO0Oo.OooO0Oo(iOooo0OO);
                                    c31362OooO0Oo2.f111978OooO0o = new HashMap(iOooo0OO);
                                    if (iOooo0OO == 0) {
                                        Log.w("PdfBox-Android", "subtable has no glyphs");
                                    } else {
                                        long j8 = 0;
                                        int iMax2 = 0;
                                        while (j8 < jOooo0OO5) {
                                            long jOooo0OO6 = abstractC31397Oooo0O0.Oooo0OO();
                                            long jOooo0OO7 = abstractC31397Oooo0O0.Oooo0OO();
                                            long jOooo0OO8 = abstractC31397Oooo0O0.Oooo0OO();
                                            if (jOooo0OO6 >= 0 && jOooo0OO6 <= 1114111 && (jOooo0OO6 < 55296 || jOooo0OO6 > 57343)) {
                                                if ((jOooo0OO7 <= 0 || jOooo0OO7 >= jOooo0OO6) && jOooo0OO7 <= 1114111 && (jOooo0OO7 < 55296 || jOooo0OO7 > 57343)) {
                                                    long j9 = 0;
                                                    while (true) {
                                                        j = jOooo0OO5;
                                                        if (j9 <= jOooo0OO7 - jOooo0OO6) {
                                                            long j10 = jOooo0OO8 + j9;
                                                            j2 = j8;
                                                            if (j10 >= iOooo0OO) {
                                                                Log.w("PdfBox-Android", "Format 12 cmap contains an invalid glyph index");
                                                            } else {
                                                                long j11 = jOooo0OO6 + j9;
                                                                if (j11 > 1114111) {
                                                                    Log.w("PdfBox-Android", "Format 12 cmap contains character beyond UCS-4");
                                                                }
                                                                int i21 = (int) j10;
                                                                iMax2 = Math.max(iMax2, i21);
                                                                c31362OooO0Oo2.f111978OooO0o.put(Integer.valueOf((int) j11), Integer.valueOf(i21));
                                                                j9++;
                                                                jOooo0OO5 = j;
                                                                j8 = j2;
                                                            }
                                                        } else {
                                                            j2 = j8;
                                                        }
                                                    }
                                                    j8 = j2 + 1;
                                                    jOooo0OO5 = j;
                                                }
                                            }
                                            break;
                                        }
                                        c31362OooO0Oo2.OooO0OO(iMax2);
                                    }
                                    break;
                                case 13:
                                    long jOooo0OO9 = abstractC31397Oooo0O0.Oooo0OO();
                                    c31362OooO0Oo2.f111977OooO0Oo = C31362OooO0Oo.OooO0Oo(iOooo0OO);
                                    c31362OooO0Oo2.f111978OooO0o = new HashMap(iOooo0OO);
                                    if (iOooo0OO == 0) {
                                        Log.w("PdfBox-Android", "subtable has no glyphs");
                                        i = iOoOO;
                                        i2 = i9;
                                    } else {
                                        long j12 = 0;
                                        while (j12 < jOooo0OO9) {
                                            long jOooo0OO10 = abstractC31397Oooo0O0.Oooo0OO();
                                            long jOooo0OO11 = abstractC31397Oooo0O0.Oooo0OO();
                                            long jOooo0OO12 = abstractC31397Oooo0O0.Oooo0OO();
                                            i7 = iOoOO;
                                            if (jOooo0OO12 > iOooo0OO) {
                                                Log.w("PdfBox-Android", "Format 13 cmap contains an invalid glyph index");
                                                i2 = i9;
                                            } else if (jOooo0OO10 >= 0 && jOooo0OO10 <= 1114111 && (jOooo0OO10 < 55296 || jOooo0OO10 > 57343)) {
                                                if ((jOooo0OO11 <= 0 || jOooo0OO11 >= jOooo0OO10) && jOooo0OO11 <= 1114111 && (jOooo0OO11 < 55296 || jOooo0OO11 > 57343)) {
                                                    long j13 = 0;
                                                    while (j13 <= jOooo0OO11 - jOooo0OO10) {
                                                        long j14 = j13;
                                                        long j15 = jOooo0OO10 + j14;
                                                        if (j15 > 2147483647L) {
                                                            throw new IOException("Character Code greater than Integer.MAX_VALUE");
                                                        }
                                                        if (j15 > 1114111) {
                                                            Log.w("PdfBox-Android", "Format 13 cmap contains character beyond UCS-4");
                                                        }
                                                        int i22 = i9;
                                                        int i23 = (int) jOooo0OO12;
                                                        int i24 = (int) j15;
                                                        c31362OooO0Oo2.f111977OooO0Oo[i23] = i24;
                                                        c31362OooO0Oo2.f111978OooO0o.put(Integer.valueOf(i24), Integer.valueOf(i23));
                                                        j13 = j14 + 1;
                                                        i9 = i22;
                                                    }
                                                    j12++;
                                                    iOoOO = i7;
                                                }
                                            }
                                            break;
                                        }
                                        i2 = i9;
                                        i = iOoOO;
                                    }
                                    break;
                                case 14:
                                    Log.w("PdfBox-Android", "Format 14 cmap table is not supported and will be ignored");
                                    i = iOoOO;
                                    i2 = i9;
                                    break;
                                default:
                                    throw new IOException(C21532OooOOo.OooO0OO(iOoOO2, "Unknown cmap format:"));
                            }
                        } else {
                            i7 = iOoOO;
                            i2 = i9;
                            long jOooo0OO13 = abstractC31397Oooo0O0.Oooo0OO();
                            long jOooo0OO14 = abstractC31397Oooo0O0.Oooo0OO();
                            if (jOooo0OO14 > 2147483647L) {
                                throw new IOException("Invalid number of Characters");
                            }
                            if (jOooo0OO13 >= 0 && jOooo0OO13 <= 1114111) {
                                long j16 = jOooo0OO13 + jOooo0OO14;
                                if (j16 > 1114111 || (j16 >= 55296 && j16 <= 57343)) {
                                }
                            }
                        }
                    } else {
                        i7 = iOoOO;
                        i2 = i9;
                        int iOoOO5 = abstractC31397Oooo0O0.ooOO();
                        int iOoOO6 = abstractC31397Oooo0O0.ooOO();
                        if (iOoOO6 != 0) {
                            c31362OooO0Oo2.f111978OooO0o = new HashMap(iOooo0OO);
                            int[] iArrO00Oo0 = abstractC31397Oooo0O0.o00Oo0(iOoOO6);
                            int iMax3 = 0;
                            for (int i25 = 0; i25 < iOoOO6; i25++) {
                                iMax3 = Math.max(iMax3, iArrO00Oo0[i25]);
                                c31362OooO0Oo2.f111978OooO0o.put(Integer.valueOf(iOoOO5 + i25), Integer.valueOf(iArrO00Oo0[i25]));
                            }
                            c31362OooO0Oo2.OooO0OO(iMax3);
                        }
                    }
                    i = i7;
                } else {
                    int i26 = iOoOO;
                    i2 = i9;
                    int iOoOO7 = abstractC31397Oooo0O0.ooOO() / 2;
                    abstractC31397Oooo0O0.ooOO();
                    abstractC31397Oooo0O0.ooOO();
                    abstractC31397Oooo0O0.ooOO();
                    int[] iArrO00Oo02 = abstractC31397Oooo0O0.o00Oo0(iOoOO7);
                    abstractC31397Oooo0O0.ooOO();
                    int[] iArrO00Oo03 = abstractC31397Oooo0O0.o00Oo0(iOoOO7);
                    int[] iArrO00Oo04 = abstractC31397Oooo0O0.o00Oo0(iOoOO7);
                    long jOooO00o2 = abstractC31397Oooo0O0.OooO00o();
                    int[] iArrO00Oo05 = abstractC31397Oooo0O0.o00Oo0(iOoOO7);
                    c31362OooO0Oo2.f111978OooO0o = new HashMap(iOooo0OO);
                    int i27 = 0;
                    int iMax4 = 0;
                    while (i27 < iOoOO7) {
                        char c4 = c;
                        int i28 = iArrO00Oo03[i27];
                        int i29 = iOoOO7;
                        int i30 = iArrO00Oo02[i27];
                        int i31 = iArrO00Oo04[i27];
                        int[] iArr2 = iArrO00Oo02;
                        int i32 = iArrO00Oo05[i27];
                        int[] iArr3 = iArrO00Oo03;
                        int[] iArr4 = iArrO00Oo04;
                        int i33 = i26;
                        long j17 = ((long) (i27 * 2)) + jOooO00o2 + ((long) i32);
                        if (i28 != 65535 && i30 != 65535) {
                            int i34 = i28;
                            while (i34 <= i30) {
                                if (i32 == 0) {
                                    i4 = i30;
                                    int i35 = (i34 + i31) & 65535;
                                    iMax4 = Math.max(i35, iMax4);
                                    i5 = i32;
                                    i6 = i34;
                                    c31362OooO0Oo2.f111978OooO0o.put(Integer.valueOf(i34), Integer.valueOf(i35));
                                } else {
                                    i4 = i30;
                                    i5 = i32;
                                    i6 = i34;
                                    abstractC31397Oooo0O0.seek(((long) ((i6 - i28) * 2)) + j17);
                                    int iOoOO8 = abstractC31397Oooo0O0.ooOO();
                                    if (iOoOO8 != 0) {
                                        int i36 = (iOoOO8 + i31) & 65535;
                                        int iMax5 = Math.max(i36, iMax4);
                                        c31362OooO0Oo2.f111978OooO0o.put(Integer.valueOf(i6), Integer.valueOf(i36));
                                        iMax4 = iMax5;
                                    }
                                }
                                i34 = i6 + 1;
                                i30 = i4;
                                i32 = i5;
                            }
                        }
                        i27++;
                        c = c4;
                        iOoOO7 = i29;
                        iArrO00Oo02 = iArr2;
                        iArrO00Oo03 = iArr3;
                        i26 = i33;
                        iArrO00Oo04 = iArr4;
                    }
                    i = i26;
                    if (c31362OooO0Oo2.f111978OooO0o.isEmpty()) {
                        Log.w("PdfBox-Android", "cmap format 4 subtable is empty");
                    } else {
                        c31362OooO0Oo2.OooO0OO(iMax4);
                    }
                }
            } else {
                i = iOoOO;
                i2 = i9;
                byte[] bArrOooOOo0 = abstractC31397Oooo0O0.OooOOo0(256);
                c31362OooO0Oo2.f111977OooO0Oo = C31362OooO0Oo.OooO0Oo(256);
                c31362OooO0Oo2.f111978OooO0o = new HashMap(bArrOooOOo0.length);
                for (int i37 = 0; i37 < bArrOooOOo0.length; i37++) {
                    int i38 = bArrOooOOo0[i37] & 255;
                    c31362OooO0Oo2.f111977OooO0Oo[i38] = i37;
                    c31362OooO0Oo2.f111978OooO0o.put(Integer.valueOf(i37), Integer.valueOf(i38));
                }
            }
            i9 = i2 + 1;
            iOoOO = i;
        }
        throw new IOException("CMap contains an invalid glyph index");
    }

    public final C31362OooO0Oo OooO0O0(int i, int i2) {
        for (C31362OooO0Oo c31362OooO0Oo : this.f111984OooO0o) {
            if (c31362OooO0Oo.f111974OooO00o == i && c31362OooO0Oo.f111975OooO0O0 == i2) {
                return c31362OooO0Oo;
            }
        }
        return null;
    }
}
