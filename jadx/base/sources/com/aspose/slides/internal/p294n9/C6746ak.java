package com.aspose.slides.internal.p294n9;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.google.common.base.Ascii;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.ak */
/* JADX INFO: loaded from: classes4.dex */
public class C6746ak extends C6755du {

    /* JADX INFO: renamed from: x6 */
    private static int[] f18583x6 = {932, 932, 932, 0, 0, 949, 936, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ne */
    private static int[] f18582ne = {41379, 41430, 41431, 41378, 41382, 42482, 42401, 42403, 42405, 42407, 42409, 42467, 42469, 42471, 42435, 41404, 42402, 42404, 42406, 42408, 42410, 42411, 42413, 42415, 42417, 42419, 42421, 42423, 42425, 42427, 42429, 42431, 42433, 42436, 42438, 42440, 42442, 42443, 42444, 42445, 42446, 42447, 42450, 42453, 42456, 42459, 42462, 42463, 42464, 42465, 42466, 42468, 42470, 42472, 42473, 42474, 42475, 42476, 42477, 42479, 42483, 41387, 41388};

    /* JADX INFO: renamed from: com.aspose.slides.internal.n9.ak$k4 */
    public static class k4 extends C6753ck {

        /* JADX INFO: renamed from: dy */
        public int f18584dy;

        /* JADX INFO: renamed from: h4 */
        public int f18585h4;

        /* JADX INFO: renamed from: k4 */
        public byte[] f18586k4;

        /* JADX INFO: renamed from: m9 */
        public int f18587m9;

        public k4(AbstractC6778um abstractC6778um) {
            super(abstractC6778um);
        }

        @Override // com.aspose.slides.internal.p294n9.C6753ck, com.aspose.slides.internal.p294n9.AbstractC6760h4
        /* JADX INFO: renamed from: k4 */
        public void mo26629k4() {
            this.f18585h4 = 0;
            this.f18586k4 = new byte[4];
            this.f18587m9 = 11;
            this.f18584dy = 11;
            AbstractC6762jd abstractC6762jd = this.f18666kk;
            if (abstractC6762jd != null) {
                abstractC6762jd.mo26768kk();
            }
        }

        @Override // com.aspose.slides.internal.p294n9.C6753ck
        /* JADX INFO: renamed from: x1 */
        public boolean mo26630x1() {
            return (this.f18585h4 == 0 && this.f18587m9 == 11) ? false : true;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.n9.ak$x1 */
    public static class x1 extends C6780uz {

        /* JADX INFO: renamed from: h4 */
        public int f18588h4;

        /* JADX INFO: renamed from: m9 */
        public int f18589m9;

        public x1(AbstractC6778um abstractC6778um) {
            super(abstractC6778um);
        }

        @Override // com.aspose.slides.internal.p294n9.C6780uz
        /* JADX INFO: renamed from: m9 */
        public boolean mo26631m9() {
            return (this.f18747kk == 0 && this.f18588h4 == 11) ? false : true;
        }

        @Override // com.aspose.slides.internal.p294n9.C6780uz, com.aspose.slides.internal.p294n9.AbstractC6766ks
        /* JADX INFO: renamed from: to */
        public void mo26632to() {
            this.f18588h4 = 11;
            this.f18589m9 = 11;
            this.f18747kk = (char) 0;
            AbstractC6761ix abstractC6761ix = this.f18690x1;
            if (abstractC6761ix != null) {
                abstractC6761ix.mo26763to();
            }
        }
    }

    public C6746ak(int i) {
        super(i, f18583x6[i % 10]);
    }

    /* JADX INFO: renamed from: k4 */
    private byte m26611k4(byte[][] bArr, int[] iArr) {
        int i = iArr[0] - 1;
        iArr[0] = i;
        byte[] bArr2 = bArr[0];
        byte b = bArr2[0];
        if (i >= 0) {
            System.arraycopy(bArr2, 1, bArr2, 0, i);
        }
        bArr[0][iArr[0]] = 0;
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        r0.m26705k4(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0144 A[EDGE_INSN: B:124:0x0144->B:100:0x0144 BREAK  A[LOOP:0: B:9:0x002c->B:129:0x002c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012b  */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m26615kk(byte[] bArr, int i, int i2, char[] cArr, int i3, int i4, k4 k4Var) {
        int i5;
        int i6;
        int i7;
        byte bM26714x1;
        boolean z;
        char c;
        int i8;
        int i9;
        char c2;
        int i10;
        AbstractC6747ar.to toVar = new AbstractC6747ar.to(this, k4Var, cArr, i3, i4, bArr, i, i2);
        int i11 = 11;
        int i12 = -1;
        if (k4Var != null) {
            i5 = k4Var.f18587m9;
            if (k4Var.f18585h4 != 0) {
                i6 = k4Var.f18586k4[0] & 255;
            }
            while (true) {
                if (toVar.m26704k4() && i6 < 0) {
                    break;
                }
                if (i6 < 0) {
                    bM26714x1 = (byte) i6;
                    i7 = i12;
                } else {
                    i7 = i6;
                    bM26714x1 = toVar.m26714x1();
                }
                z = true;
                if ((bM26714x1 & 255) == 126) {
                    if (toVar.m26704k4()) {
                        int iM26714x1 = toVar.m26714x1() & 255;
                        if (iM26714x1 != 126 || i5 != i11) {
                            if (iM26714x1 == 123) {
                                i5 = 6;
                            } else if (iM26714x1 == 125) {
                                i5 = i11;
                            } else if (iM26714x1 != 10) {
                                toVar.m26703k4(i12);
                                bM26714x1 = 126;
                            }
                            i6 = i7;
                        } else if (!toVar.m26710k4((char) iM26714x1, 2)) {
                            break;
                        }
                        i6 = i7;
                        i12 = -1;
                    } else if (k4Var != null && !k4Var.m26738h4()) {
                        k4Var.m26740m9();
                        if (cArr != null) {
                            k4Var.f18585h4 = 1;
                            k4Var.f18586k4[0] = 126;
                        }
                    }
                }
                if (i5 != i11 || (i8 = bM26714x1 & 255) < 32) {
                    int i13 = bM26714x1 & 255;
                    c = this.f18650jd[i13];
                    if ((c != 0 || c == 0) && i13 != 0) {
                        if (!toVar.m26705k4(bM26714x1)) {
                            break;
                        }
                        i11 = 11;
                        i6 = i7;
                        i12 = -1;
                    } else {
                        if (!toVar.m26708k4(c)) {
                            break;
                        }
                        i11 = 11;
                        i6 = i7;
                        i12 = -1;
                    }
                } else if (toVar.m26704k4()) {
                    int iM26714x12 = toVar.m26714x1() & 255;
                    int i14 = (i8 << 8) | iM26714x12;
                    int i15 = i14 & 65535;
                    if (i8 != 32 || iM26714x12 == 0) {
                        i9 = 65535;
                        if ((i8 < 33 || i8 > 119 || iM26714x12 < 33 || iM26714x12 > 126) && (i8 < 161 || i8 > 247 || iM26714x12 < 161 || iM26714x12 > 254)) {
                            if (iM26714x12 != 32 || 33 > i8 || i8 > 125) {
                                if (!toVar.m26706k4((byte) ((i14 & 65535) >> 8), (byte) i15)) {
                                    break;
                                }
                                i11 = 11;
                                i6 = i7;
                                i12 = -1;
                            } else {
                                i15 = 8481;
                            }
                        }
                        int i16 = (i15 & 65535) | 32896;
                        i15 = i16 & 65535;
                        c2 = this.f18650jd[i16 & 65535];
                    } else {
                        c2 = (char) iM26714x12;
                        i9 = 65535;
                    }
                    if (c2 != 0 || (i10 = i15 & i9) == 0) {
                        if (!toVar.m26710k4(c2, 2)) {
                            break;
                        }
                        i11 = 11;
                        i6 = i7;
                        i12 = -1;
                    } else {
                        if (!toVar.m26706k4((byte) (i10 >> 8), (byte) i15)) {
                            break;
                        }
                        i11 = 11;
                        i6 = i7;
                        i12 = -1;
                    }
                } else if (k4Var != null && !k4Var.m26738h4()) {
                    k4Var.m26740m9();
                    if (cArr != null) {
                        k4Var.f18585h4 = 1;
                        k4Var.f18586k4[0] = bM26714x1;
                    }
                }
            }
            z = false;
            if (cArr != null && k4Var != null) {
                if (!z) {
                    k4Var.f18585h4 = 0;
                }
                if (k4Var.m26738h4() || k4Var.f18585h4 != 0) {
                    k4Var.f18587m9 = i5;
                } else {
                    k4Var.f18587m9 = 11;
                }
                k4Var.f18640du = toVar.m26712kk();
            }
            return toVar.m26713to();
        }
        i5 = 11;
        i6 = -1;
        while (true) {
            if (toVar.m26704k4()) {
                if (i6 < 0) {
                }
                z = true;
                if ((bM26714x1 & 255) == 126) {
                }
                if (i5 != i11) {
                    int i132 = bM26714x1 & 255;
                    c = this.f18650jd[i132];
                    if (c != 0) {
                        if (!toVar.m26705k4(bM26714x1)) {
                        }
                        i11 = 11;
                        i6 = i7;
                        i12 = -1;
                    } else {
                        if (!toVar.m26705k4(bM26714x1)) {
                        }
                        i11 = 11;
                        i6 = i7;
                        i12 = -1;
                    }
                }
            }
        }
        z = false;
        if (cArr != null) {
            if (!z) {
            }
            if (k4Var.m26738h4()) {
                k4Var.f18587m9 = i5;
                k4Var.f18640du = toVar.m26712kk();
            }
        }
        return toVar.m26713to();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    @Override // com.aspose.slides.internal.p294n9.C6755du, com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo26627x1(int i) {
        int i2;
        if (i < 0) {
            throw new ArgumentOutOfRangeException("byteCount", "Non-negative number required.");
        }
        int iMo26673ks = mo26673ks();
        if (iMo26673ks == 50225) {
            i2 = 3;
        } else {
            if (iMo26673ks != 52936) {
                switch (iMo26673ks) {
                }
            }
            i2 = 1;
        }
        long jMo26735x1 = (((long) i) * ((long) 1)) + ((long) i2);
        if (m26656fa().mo26735x1() > 1) {
            jMo26735x1 *= (long) m26656fa().mo26735x1();
        }
        if (jMo26735x1 <= 2147483647L) {
            return (int) jMo26735x1;
        }
        throw new ArgumentOutOfRangeException("byteCount", "Too many bytes. The resulting number of chars is larger than what can be returned as an int.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r13 > 0) goto L6;
     */
    /* JADX WARN: Path cross not found for [B:6:0x001a, B:92:?], limit reached: 85 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0037 -> B:6:0x001a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0046 -> B:6:0x001a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004a -> B:6:0x001a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x004e -> B:6:0x001a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0052 -> B:6:0x001a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x005e -> B:6:0x001a). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m26616kk(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4, x1 x1Var) {
        int i5;
        char cM26702x1;
        int i6;
        int i7;
        AbstractC6747ar.kk kkVar = new AbstractC6747ar.kk(this, x1Var, bArr, i3, i4, cArr, i, i2);
        int i8 = 11;
        if (x1Var != null) {
            cM26702x1 = x1Var.f18747kk;
            i5 = x1Var.f18588h4;
        } else {
            i5 = 11;
        }
        while (kkVar.m26691k4()) {
            cM26702x1 = kkVar.m26702x1();
            int i9 = this.f18648ck[cM26702x1];
            int i10 = 65535 & i9;
            if (i10 != 0 || cM26702x1 == 0) {
                byte b = (byte) (i10 >> 8);
                byte b2 = (byte) (i9 & 255);
                int i11 = b & 255;
                if ((i11 == 0 || (i11 >= 161 && i11 <= 247 && (i7 = b2 & 255) >= 161 && i7 <= 254)) && (i11 != 0 || (i6 = b2 & 255) <= 128 || i6 == 255)) {
                    if (i11 == 0) {
                        if (i5 != 11) {
                            if (!kkVar.m26697k4((byte) 126, (byte) 125, (b2 & 255) != 126 ? 1 : 2)) {
                                break;
                            }
                            i5 = 11;
                        }
                        if (((b2 & 255) == 126 && !kkVar.m26698k4((byte) 126, 1)) || !kkVar.m26692k4(b2)) {
                            break;
                        }
                    } else {
                        if (i5 != 6) {
                            if (!kkVar.m26697k4((byte) 126, (byte) 123, 2)) {
                                break;
                            }
                            i5 = 6;
                        }
                        if (!kkVar.m26693k4((byte) (b & Ascii.DEL), (byte) (b2 & Ascii.DEL))) {
                            break;
                        }
                    }
                }
            }
            kkVar.m26699k4(cM26702x1);
            while (kkVar.m26691k4()) {
            }
        }
        if (i5 == 11 || !(x1Var == null || x1Var.m26835h4())) {
            i8 = i5;
        } else if (!kkVar.m26693k4((byte) 126, (byte) 125)) {
            kkVar.m26702x1();
            i8 = i5;
        }
        if (x1Var != null && bArr != null) {
            x1Var.f18588h4 = i8;
            if (!kkVar.f18604k4.f18668du) {
                x1Var.f18747kk = (char) 0;
            }
            x1Var.f18745du = kkVar.m26700kk();
        }
        return kkVar.m26701to();
    }

    /* JADX INFO: renamed from: x1 */
    private int m26617x1(byte[] bArr, int i) {
        if ((bArr[0] & 255) != 27) {
            return -2;
        }
        if (i < 4) {
            return -1;
        }
        return ((bArr[1] & 255) == 36 && (bArr[2] & 255) == 41 && (bArr[3] & 255) == 67) ? 5 : -2;
    }

    @Override // com.aspose.slides.internal.p294n9.C6755du, com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26620k4(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("charCount", "Non-negative number required.");
        }
        long jMo26737x1 = ((long) i) + 1;
        int i2 = 1;
        if (m26654ck().mo26737x1() > 1) {
            jMo26737x1 *= (long) m26654ck().mo26737x1();
        }
        int iMo26673ks = mo26673ks();
        int i3 = 3;
        int i4 = 4;
        if (iMo26673ks != 50225) {
            if (iMo26673ks != 52936) {
                switch (iMo26673ks) {
                    case 50220:
                    case 50221:
                        i4 = 3;
                    case 50222:
                        i3 = 5;
                        i2 = i4;
                        break;
                    default:
                        i2 = 0;
                        i4 = 0;
                        i3 = 2;
                        break;
                }
            } else {
                i3 = 4;
                i2 = 2;
            }
            i4 = 0;
        }
        long j = (jMo26737x1 * ((long) i3)) + ((long) (i4 + i2));
        if (j <= 2147483647L) {
            return (int) j;
        }
        throw new ArgumentOutOfRangeException("charCount", "Too many characters. The resulting number of bytes is larger than what can be returned as an int.");
    }

    /* JADX INFO: renamed from: k4 */
    private int m26612k4(byte[] bArr, int i) {
        if ((bArr[0] & 255) != 27) {
            return -2;
        }
        if (i < 3) {
            return -1;
        }
        byte b = bArr[1];
        if ((b & 255) == 40) {
            byte b2 = bArr[2];
            if ((b2 & 255) == 66 || (b2 & 255) == 72 || (b2 & 255) == 74) {
                return 11;
            }
            if ((b2 & 255) == 73) {
                return 0;
            }
        } else {
            if ((b & 255) == 36) {
                byte b3 = bArr[2];
                if ((b3 & 255) != 64 && (b3 & 255) != 66) {
                    if (i < 4) {
                        return -1;
                    }
                    if ((b3 & 255) != 40 || (bArr[3] & 255) != 68) {
                    }
                }
                return 1;
            }
            if ((b & 255) == 38 && (bArr[2] & 255) == 64) {
                return -3;
            }
        }
        return -2;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0113 A[EDGE_INSN: B:113:0x0113->B:79:0x0113 BREAK  A[LOOP:0: B:9:0x0028->B:117:0x0028], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010c  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m26618x1(byte[] bArr, int i, int i2, char[] cArr, int i3, int i4, k4 k4Var) {
        int i5;
        int i6;
        byte bM26611k4;
        boolean z;
        char c;
        AbstractC6747ar.to toVar = new AbstractC6747ar.to(this, k4Var, cArr, i3, i4, bArr, i, i2);
        byte[] bArr2 = new byte[4];
        if (k4Var != null) {
            i5 = k4Var.f18587m9;
            i6 = k4Var.f18585h4;
            if (i6 >= 0) {
                System.arraycopy(k4Var.f18586k4, 0, bArr2, 0, i6);
            }
        } else {
            i5 = 11;
            i6 = 0;
        }
        while (true) {
            if (!toVar.m26704k4() && i6 <= 0) {
                break;
            }
            if (i6 > 0) {
                if (bArr2[0] == 27) {
                    if (!toVar.m26704k4()) {
                        if (k4Var != null && !k4Var.m26738h4()) {
                            break;
                        }
                    } else {
                        int i7 = i6 + 1;
                        bArr2[i6] = toVar.m26714x1();
                        int iM26617x1 = m26617x1(bArr2, i7);
                        if (iM26617x1 != -2) {
                            i6 = iM26617x1 != -1 ? 0 : i7;
                        } else {
                            i6 = i7;
                        }
                    }
                }
                byte[][] bArr3 = {bArr2};
                int[] iArr = {i6};
                bM26611k4 = m26611k4(bArr3, iArr);
                bArr2 = bArr3[0];
                i6 = iArr[0];
                if (bM26611k4 != 14) {
                    i5 = 5;
                } else if (bM26611k4 == 15) {
                    i5 = 11;
                } else {
                    int iM26714x1 = bM26611k4 & 255;
                    if (i5 == 5 && iM26714x1 != 32 && iM26714x1 != 9 && iM26714x1 != 10) {
                        if (i6 > 0) {
                            if ((bArr2[0] & 255) != 27) {
                                byte[][] bArr4 = {bArr2};
                                int[] iArr2 = {i6};
                                iM26714x1 = ((((bM26611k4 & 255) << 8) & 65535) | (m26611k4(bArr4, iArr2) & 255)) & 65535;
                                bArr2 = bArr4[0];
                                i6 = iArr2[0];
                            }
                        } else if (toVar.m26704k4()) {
                            iM26714x1 = ((((bM26611k4 & 255) << 8) & 65535) | (toVar.m26714x1() & 255)) & 65535;
                        } else if (k4Var == null || k4Var.m26738h4()) {
                            toVar.m26705k4(bM26611k4);
                        } else if (cArr != null) {
                            bArr2[0] = bM26611k4;
                            i6 = 1;
                        }
                        z = true;
                        int i8 = 65535 & iM26714x1;
                        c = this.f18650jd[i8];
                        if (c == 0 || i8 == 0) {
                            if (toVar.m26710k4(c, z ? 2 : 1)) {
                                break;
                            }
                        } else if (z) {
                            if (!toVar.m26706k4((byte) (i8 >> 8), (byte) iM26714x1)) {
                                break;
                            }
                        } else if (!toVar.m26705k4(bM26611k4)) {
                            break;
                        }
                    }
                    z = false;
                    int i82 = 65535 & iM26714x1;
                    c = this.f18650jd[i82];
                    if (c == 0) {
                    }
                    if (toVar.m26710k4(c, z ? 2 : 1)) {
                    }
                }
            } else {
                byte bM26714x1 = toVar.m26714x1();
                if (bM26714x1 == 27) {
                    if (i6 == 0) {
                        bArr2[0] = bM26714x1;
                        i6 = 1;
                    } else {
                        toVar.m26703k4(-1);
                    }
                }
                bM26611k4 = bM26714x1;
                if (bM26611k4 != 14) {
                }
            }
        }
        if (cArr != null && k4Var != null) {
            if (k4Var.m26738h4() && i6 == 0) {
                k4Var.f18587m9 = 11;
                k4Var.f18584dy = 11;
                k4Var.f18585h4 = 0;
            } else {
                k4Var.f18587m9 = i5;
                k4Var.f18585h4 = i6;
                k4Var.f18586k4 = bArr2;
            }
            k4Var.f18640du = toVar.m26712kk();
        }
        return toVar.m26713to();
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6778um, com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: kk */
    public AbstractC6766ks mo26626kk() {
        return new x1(this);
    }

    /* JADX INFO: renamed from: x1 */
    private int m26619x1(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4, x1 x1Var) {
        int i5;
        int i6;
        char cM26702x1;
        AbstractC6747ar.kk kkVar = new AbstractC6747ar.kk(this, x1Var, bArr, i3, i4, cArr, i, i2);
        if (x1Var != null) {
            char c = x1Var.f18747kk;
            i5 = x1Var.f18588h4;
            i6 = x1Var.f18589m9;
            if (c <= 0) {
                kkVar.m26699k4(c);
            }
            kkVar.m26699k4(cM26702x1);
        } else {
            i5 = 11;
            i6 = 11;
        }
        while (kkVar.m26691k4()) {
            cM26702x1 = kkVar.m26702x1();
            int i7 = this.f18648ck[cM26702x1];
            int i8 = 65535 & i7;
            byte b = (byte) (i8 >> 8);
            byte b2 = (byte) (i7 & 255);
            if ((b & 255) != 0) {
                if (i6 != 5) {
                    if (!kkVar.m26695k4((byte) 27, (byte) 36, (byte) 41, (byte) 67)) {
                        break;
                    }
                    i6 = 5;
                }
                if (i5 != 5) {
                    if (!kkVar.m26692k4((byte) 14)) {
                        break;
                    }
                    i5 = 5;
                }
                if (!kkVar.m26693k4(b, b2)) {
                    break;
                }
            } else if (i8 != 0 || cM26702x1 == 0) {
                if (i5 != 11) {
                    if (!kkVar.m26692k4((byte) 15)) {
                        break;
                    }
                    i5 = 11;
                }
                if (!kkVar.m26692k4(b2)) {
                    break;
                }
            } else {
                kkVar.m26699k4(cM26702x1);
            }
        }
        if (i5 != 11 && (x1Var == null || x1Var.m26835h4())) {
            if (kkVar.m26692k4((byte) 15)) {
                i5 = 11;
            } else {
                kkVar.m26702x1();
            }
        }
        if (bArr != null && x1Var != null) {
            if (!kkVar.f18604k4.f18668du) {
                x1Var.f18747kk = (char) 0;
            }
            x1Var.f18588h4 = i5;
            if (x1Var.m26835h4() && x1Var.f18747kk == 0) {
                x1Var.f18589m9 = 11;
            } else {
                x1Var.f18589m9 = i6;
            }
            x1Var.f18745du = kkVar.m26700kk();
        }
        return kkVar.m26701to();
    }

    @Override // com.aspose.slides.internal.p294n9.C6755du, com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26621k4(byte[] bArr, int i, int i2, C6753ck c6753ck) {
        return mo26622k4(bArr, i, i2, (char[]) null, 0, 0, c6753ck);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x008b A[SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m26613k4(byte[] bArr, int i, int i2, char[] cArr, int i3, int i4, k4 k4Var) {
        int i5;
        int i6;
        int i7;
        byte bM26611k4;
        boolean z;
        AbstractC6747ar.to toVar = new AbstractC6747ar.to(this, k4Var, cArr, i3, i4, bArr, i, i2);
        byte[] bArr2 = new byte[4];
        if (k4Var != null) {
            i5 = k4Var.f18587m9;
            i6 = k4Var.f18584dy;
            i7 = k4Var.f18585h4;
            if (i7 >= 0) {
                System.arraycopy(k4Var.f18586k4, 0, bArr2, 0, i7);
            }
        } else {
            i5 = 11;
            i6 = 11;
            i7 = 0;
        }
        while (true) {
            if (!toVar.m26704k4() && i7 <= 0) {
                break;
            }
            if (i7 > 0) {
                if (bArr2[0] == 27) {
                    if (!toVar.m26704k4()) {
                        if (k4Var != null && !k4Var.m26738h4()) {
                            break;
                        }
                    } else {
                        int i8 = i7 + 1;
                        bArr2[i7] = toVar.m26714x1();
                        int iM26612k4 = m26612k4(bArr2, i8);
                        if (iM26612k4 == -2) {
                            i7 = i8;
                        } else if (iM26612k4 != -1) {
                            i5 = iM26612k4;
                            i6 = i5;
                            i7 = 0;
                        } else {
                            i7 = i8;
                        }
                    }
                }
                byte[][] bArr3 = {bArr2};
                int[] iArr = {i7};
                bM26611k4 = m26611k4(bArr3, iArr);
                bArr2 = bArr3[0];
                i7 = iArr[0];
                if (bM26611k4 != 14) {
                    i6 = i5;
                    i5 = 0;
                } else if (bM26611k4 == 15) {
                    i5 = i6;
                } else {
                    int iM26714x1 = bM26611k4 & 255;
                    if (i5 == 1) {
                        if (i7 > 0) {
                            if ((bArr2[0] & 255) != 27) {
                                byte[][] bArr4 = {bArr2};
                                int[] iArr2 = {i7};
                                iM26714x1 = ((((bM26611k4 & 255) << 8) & 65535) | (m26611k4(bArr4, iArr2) & 255)) & 65535;
                                bArr2 = bArr4[0];
                                i7 = iArr2[0];
                            } else {
                                z = false;
                                if (z && (65280 & iM26714x1) == 10752) {
                                    iM26714x1 = ((iM26714x1 & 255) | 4096) & 65535;
                                }
                            }
                        } else if (toVar.m26704k4()) {
                            iM26714x1 = ((((bM26611k4 & 255) << 8) & 65535) | (toVar.m26714x1() & 255)) & 65535;
                        } else if (k4Var == null || k4Var.m26738h4()) {
                            toVar.m26705k4(bM26611k4);
                        } else if (cArr != null) {
                            bArr2[0] = bM26611k4;
                            i7 = 1;
                        }
                        z = true;
                        if (z) {
                            iM26714x1 = ((iM26714x1 & 255) | 4096) & 65535;
                        }
                    } else {
                        int i9 = bM26611k4 & 255;
                        if (i9 >= 161 && i9 <= 223) {
                            iM26714x1 = 65407 & (i9 | 4096);
                        } else if (i5 == 0) {
                            iM26714x1 = (i9 | 4096) & 65535;
                        }
                        z = false;
                    }
                    int i10 = 65535 & iM26714x1;
                    char c = this.f18650jd[i10];
                    if (c != 0 || i10 == 0) {
                        if (!toVar.m26710k4(c, z ? 2 : 1)) {
                            break;
                        }
                    } else if (z) {
                        if (!toVar.m26706k4((byte) (i10 >> 8), (byte) iM26714x1)) {
                            break;
                        }
                    } else if (!toVar.m26705k4(bM26611k4)) {
                        break;
                    }
                }
            } else {
                byte bM26714x1 = toVar.m26714x1();
                if (bM26714x1 == 27) {
                    if (i7 == 0) {
                        bArr2[0] = bM26714x1;
                        i7 = 1;
                    } else {
                        toVar.m26703k4(-1);
                    }
                }
                bM26611k4 = bM26714x1;
                if (bM26611k4 != 14) {
                }
            }
        }
        if (cArr != null && k4Var != null) {
            if (k4Var.m26738h4() && i7 == 0) {
                k4Var.f18587m9 = 11;
                k4Var.f18584dy = 11;
                k4Var.f18585h4 = 0;
            } else {
                k4Var.f18587m9 = i5;
                k4Var.f18584dy = i6;
                k4Var.f18585h4 = i7;
                k4Var.f18586k4 = bArr2;
            }
            k4Var.f18640du = toVar.m26712kk();
        }
        return toVar.m26713to();
    }

    @Override // com.aspose.slides.internal.p294n9.C6755du, com.aspose.slides.internal.p294n9.AbstractC6778um, com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: x1 */
    public AbstractC6760h4 mo26628x1() {
        return new k4(this);
    }

    @Override // com.aspose.slides.internal.p294n9.C6755du, com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26622k4(byte[] bArr, int i, int i2, char[] cArr, int i3, int i4, C6753ck c6753ck) {
        k4 k4Var = (k4) c6753ck;
        int iMo26673ks = mo26673ks();
        if (iMo26673ks == 50225) {
            return m26618x1(bArr, i, i2, cArr, i3, i4, k4Var);
        }
        if (iMo26673ks == 52936) {
            return m26615kk(bArr, i, i2, cArr, i3, i4, k4Var);
        }
        switch (iMo26673ks) {
            case 50220:
            case 50221:
            case 50222:
                return m26613k4(bArr, i, i2, cArr, i3, i4, k4Var);
            default:
                return 0;
        }
    }

    @Override // com.aspose.slides.internal.p294n9.C6755du, com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26623k4(char[] cArr, int i, int i2, C6780uz c6780uz) {
        return mo26624k4(cArr, i, i2, (byte[]) null, 0, 0, c6780uz);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        if ((r15 & 255) == 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        if (r12.mo26673ks() != 50222) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a0, code lost:
    
        if (r4 != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
    
        if (r0.m26692k4((byte) 15) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a9, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ab, code lost:
    
        if (r4 == 1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b3, code lost:
    
        if (r0.m26694k4((byte) 27, (byte) 36, (byte) 66) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b6, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bb, code lost:
    
        if (r0.m26693k4(r15, r13) != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00be, code lost:
    
        if (r14 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c0, code lost:
    
        if (r3 == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c6, code lost:
    
        if (r12.mo26673ks() != 50222) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c8, code lost:
    
        if (r4 != 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ce, code lost:
    
        if (r0.m26692k4((byte) 15) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r3 > 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d1, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d2, code lost:
    
        if (r4 == 11) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d8, code lost:
    
        if (r0.m26694k4((byte) 27, (byte) 40, (byte) 66) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00db, code lost:
    
        r4 = 11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e0, code lost:
    
        if (r0.m26692k4(r13) != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        r0.m26699k4(r3);
     */
    /* JADX WARN: Path cross not found for [B:6:0x0021, B:120:?], limit reached: 110 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0116 A[PHI: r4
      0x0116: PHI (r4v5 int) = (r4v4 int), (r4v6 int), (r4v6 int), (r4v6 int), (r4v4 int) binds: [B:71:0x00e5, B:82:0x0102, B:89:0x0113, B:85:0x010a, B:74:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005d -> B:6:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0063 -> B:6:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00c0 -> B:6:0x0021). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m26614k4(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4, x1 x1Var) {
        int i5;
        int i6;
        C6746ak c6746ak;
        char cM26702x1;
        AbstractC6747ar.kk kkVar = new AbstractC6747ar.kk(this, x1Var, bArr, i3, i4, cArr, i, i2);
        int i7 = 11;
        if (x1Var != null) {
            cM26702x1 = x1Var.f18747kk;
            i5 = x1Var.f18588h4;
            i6 = x1Var.f18589m9;
        } else {
            i5 = 11;
            i6 = 11;
        }
        loop0: while (true) {
            if (!kkVar.m26691k4()) {
                cM26702x1 = kkVar.m26702x1();
                c6746ak = this;
                int i8 = c6746ak.f18648ck[cM26702x1];
                while (true) {
                    int i9 = 65535 & i8;
                    byte b = (byte) (i9 >> 8);
                    byte b2 = (byte) (i8 & 255);
                    if (b != 16) {
                        break;
                    }
                    if (c6746ak.mo26673ks() == 50220) {
                        int i10 = b2 & 255;
                        if (i10 < 33) {
                            break loop0;
                        }
                        int[] iArr = f18582ne;
                        if (i10 >= iArr.length + 33) {
                            break loop0;
                        }
                        i8 = iArr[i10 - 33] & 32639;
                    } else {
                        if (i5 != 0) {
                            if (c6746ak.mo26673ks() != 50222) {
                                if (!kkVar.m26694k4((byte) 27, (byte) 40, (byte) 73)) {
                                    break;
                                }
                                i5 = 0;
                            } else {
                                if (!kkVar.m26692k4((byte) 14)) {
                                    break;
                                }
                                i6 = i5;
                                i5 = 0;
                            }
                        }
                        if (!kkVar.m26692k4((byte) (b2 & Ascii.DEL))) {
                            break;
                        }
                    }
                    if (!kkVar.m26691k4()) {
                        c6746ak = this;
                        break;
                    }
                }
            }
        }
        if (i5 == 11 || !(x1Var == null || x1Var.m26835h4())) {
            i7 = i5;
        } else {
            if (c6746ak.mo26673ks() == 50222 && i5 == 0) {
                if (kkVar.m26692k4((byte) 15)) {
                    i5 = i6;
                } else {
                    kkVar.m26702x1();
                }
            }
            if (i5 != 11 && (c6746ak.mo26673ks() != 50222 || i5 != 0)) {
                if (!kkVar.m26694k4((byte) 27, (byte) 40, (byte) 66)) {
                    kkVar.m26702x1();
                    i7 = i5;
                }
            }
        }
        if (bArr != null && x1Var != null) {
            x1Var.f18588h4 = i7;
            x1Var.f18589m9 = i6;
            if (!kkVar.f18604k4.f18668du) {
                x1Var.f18747kk = (char) 0;
            }
            x1Var.f18745du = kkVar.m26700kk();
        }
        return kkVar.m26701to();
    }

    @Override // com.aspose.slides.internal.p294n9.C6755du, com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26624k4(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4, C6780uz c6780uz) {
        x1 x1Var = (x1) c6780uz;
        int iMo26673ks = mo26673ks();
        if (iMo26673ks == 50225) {
            return m26619x1(cArr, i, i2, bArr, i3, i4, x1Var);
        }
        if (iMo26673ks == 52936) {
            return m26616kk(cArr, i, i2, bArr, i3, i4, x1Var);
        }
        switch (iMo26673ks) {
            case 50220:
            case 50221:
            case 50222:
                return m26614k4(cArr, i, i2, bArr, i3, i4, x1Var);
            default:
                return 0;
        }
    }

    @Override // com.aspose.slides.internal.p294n9.C6755du
    /* JADX INFO: renamed from: k4 */
    public boolean mo26625k4(int[] iArr) {
        byte b;
        int iMo26673ks = mo26673ks();
        if (iMo26673ks == 50225) {
            int i = iArr[0];
            if (i >= 128 && i <= 255) {
                return false;
            }
            if (i >= 256 && ((i & 255) < 161 || (i & 255) == 255 || (i & 65280) < 41216 || (i & 65280) == 65280)) {
                return false;
            }
            iArr[0] = i & 32639;
        } else if (iMo26673ks != 52936) {
            switch (iMo26673ks) {
                case 50220:
                case 50221:
                case 50222:
                    int i2 = iArr[0];
                    if (i2 >= 256) {
                        if (i2 >= 64064 && i2 <= 64587) {
                            if (i2 < 64064 || i2 > 64091) {
                                if (i2 >= 64092 && i2 <= 64587) {
                                    int i3 = ((byte) i2) & 255;
                                    if (i3 < 92) {
                                        iArr[0] = i2 - 3423;
                                    } else if (i3 < 128 || i3 > 155) {
                                        iArr[0] = i2 - 3356;
                                    } else {
                                        iArr[0] = i2 - 3357;
                                    }
                                }
                            } else if (i2 <= 64073) {
                                iArr[0] = i2 - 2897;
                            } else if (i2 >= 64074 && i2 <= 64083) {
                                iArr[0] = i2 - 29430;
                            } else if (i2 >= 64084 && i2 <= 64087) {
                                iArr[0] = i2 - 2907;
                            } else if (i2 == 64088) {
                                iArr[0] = 34698;
                            } else if (i2 == 64089) {
                                iArr[0] = 34690;
                            } else if (i2 == 64090) {
                                iArr[0] = 34692;
                            } else if (i2 == 64091) {
                                iArr[0] = 34714;
                            }
                        }
                        int i4 = iArr[0];
                        byte b2 = (byte) (i4 >> 8);
                        byte b3 = (byte) i4;
                        int i5 = b2 & 255;
                        byte b4 = (byte) (((((byte) (i5 - ((i5 > 159 ? -79 : 113) & 255))) & 255) << 1) + 1);
                        int i6 = b3 & 255;
                        if (i6 > 158) {
                            b = (byte) (i6 - 126);
                            b4 = (byte) (b4 + 1);
                        } else {
                            if (i6 > 126) {
                                b3 = (byte) (b3 - 1);
                            }
                            b = (byte) ((b3 & 255) - 31);
                        }
                        iArr[0] = (b & 255) | ((b4 & 255) << 8);
                        break;
                    } else {
                        if (i2 >= 161 && i2 <= 223) {
                            iArr[0] = i2 + 3968;
                        }
                        int i7 = iArr[0];
                        if (i7 >= 129 && (i7 <= 159 || (i7 >= 224 && i7 <= 252))) {
                            return false;
                        }
                    }
                default:
                    return true;
            }
        } else {
            int i8 = iArr[0];
            if (i8 >= 129 && i8 <= 254) {
                return false;
            }
        }
        return true;
    }
}
