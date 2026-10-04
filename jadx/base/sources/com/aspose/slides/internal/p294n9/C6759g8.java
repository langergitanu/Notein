package com.aspose.slides.internal.p294n9;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.g8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6759g8 extends AbstractC6747ar {

    /* JADX INFO: renamed from: du */
    private boolean f18661du;

    /* JADX INFO: renamed from: h4 */
    private boolean f18662h4;

    /* JADX INFO: renamed from: m9 */
    private boolean f18663m9;

    /* JADX INFO: renamed from: k4 */
    public static final C6759g8 f18657k4 = new C6759g8(false, true);

    /* JADX INFO: renamed from: x1 */
    public static final C6759g8 f18660x1 = new C6759g8(true, true);

    /* JADX INFO: renamed from: kk */
    private static final byte[] f18658kk = {0, 0, -2, -1};

    /* JADX INFO: renamed from: to */
    private static final byte[] f18659to = {-1, -2, 0, 0};

    /* JADX INFO: renamed from: com.aspose.slides.internal.n9.g8$k4 */
    public static final class k4 extends C6753ck {

        /* JADX INFO: renamed from: h4 */
        public int f18664h4;

        /* JADX INFO: renamed from: k4 */
        public int f18665k4;

        public k4(C6759g8 c6759g8) {
            super(c6759g8);
            this.f18665k4 = 0;
            this.f18664h4 = 0;
        }

        @Override // com.aspose.slides.internal.p294n9.C6753ck, com.aspose.slides.internal.p294n9.AbstractC6760h4
        /* JADX INFO: renamed from: k4 */
        public void mo26629k4() {
            this.f18665k4 = 0;
            this.f18664h4 = 0;
            AbstractC6762jd abstractC6762jd = this.f18666kk;
            if (abstractC6762jd != null) {
                abstractC6762jd.mo26768kk();
            }
        }

        @Override // com.aspose.slides.internal.p294n9.C6753ck
        /* JADX INFO: renamed from: x1 */
        public boolean mo26630x1() {
            return this.f18664h4 != 0;
        }
    }

    public C6759g8() {
        this(false, true, false);
    }

    /* JADX INFO: renamed from: k4 */
    private char m26748k4(long j) {
        return (char) (((((((j & 4294967295L) - 65536) & 4294967295L) / 1024) & 4294967295L) + 55296) & 4294967295L);
    }

    /* JADX INFO: renamed from: x1 */
    private char m26750x1(long j) {
        return (char) (((((((j & 4294967295L) - 65536) & 4294967295L) % 1024) & 4294967295L) + 56320) & 4294967295L);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: dy */
    public byte[] mo26655dy() {
        return C14067j2.m66727k4(this) != C7019kk.m27443k4((Class<?>) C6759g8.class) ? mo26674m9() : this.f18661du ? this.f18663m9 ? f18658kk : f18659to : new byte[0];
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    public boolean equals(Object obj) {
        C6759g8 c6759g8 = (C6759g8) C7019kk.m27452k4(obj, C6759g8.class);
        return c6759g8 != null && this.f18661du == c6759g8.f18661du && this.f18663m9 == c6759g8.f18663m9 && m26654ck().equals(c6759g8.m26654ck()) && m26656fa().equals(c6759g8.m26656fa());
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    public int hashCode() {
        return mo26673ks() + m26656fa().hashCode() + m26654ck().hashCode() + (this.f18661du ? 4 : 0) + (this.f18663m9 ? 8 : 0);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: kk */
    public AbstractC6766ks mo26626kk() {
        return new C6780uz(this);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: m9 */
    public byte[] mo26674m9() {
        if (!this.f18661du) {
            return new byte[0];
        }
        byte[] bArr = {-1, -2, 0, 0};
        if (!this.f18663m9) {
            return bArr;
        }
        // fill-array-data instruction
        bArr[0] = 0;
        bArr[1] = 0;
        bArr[2] = -2;
        bArr[3] = -1;
        return bArr;
    }

    public C6759g8(boolean z, boolean z2) {
        this(z, z2, false);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26620k4(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("charCount", "Non-negative number required.");
        }
        long jMo26737x1 = ((long) i) + 1;
        if (m26654ck().mo26737x1() > 1) {
            jMo26737x1 *= (long) m26654ck().mo26737x1();
        }
        long j = jMo26737x1 * 4;
        if (j <= 2147483647L) {
            return (int) j;
        }
        throw new ArgumentOutOfRangeException("charCount", "Too many characters. The resulting number of bytes is larger than what can be returned as an int.");
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: x1 */
    public int mo26627x1(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("byteCount", "Non-negative number required.");
        }
        int iMo26735x1 = (i / 2) + 2;
        if (m26656fa().mo26735x1() > 2) {
            iMo26735x1 = (m26656fa().mo26735x1() * iMo26735x1) / 2;
        }
        if (iMo26735x1 <= Integer.MAX_VALUE) {
            return iMo26735x1;
        }
        throw new ArgumentOutOfRangeException("byteCount", "Too many bytes. The resulting number of chars is larger than what can be returned as an int.");
    }

    public C6759g8(boolean z, boolean z2, boolean z3) {
        super(z ? 12001 : 12000);
        this.f18663m9 = z;
        this.f18661du = z2;
        this.f18662h4 = z3;
        if (z3) {
            mo26666k4();
        }
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26658k4(String str) {
        if (str != null) {
            return mo26623k4(C14113y2.m67365dy(str), 0, str.length(), (C6780uz) null);
        }
        throw new ArgumentNullException("s");
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: x1 */
    public AbstractC6760h4 mo26628x1() {
        return new k4(this);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26659k4(String str, int i, int i2, byte[] bArr, int i3) {
        if (str == null || bArr == null) {
            throw new ArgumentNullException(str != null ? "bytes" : "s", "Array cannot be null.");
        }
        if (i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException(i < 0 ? "charIndex" : "charCount", "Non-negative number required.");
        }
        if (str.length() - i < i2) {
            throw new ArgumentOutOfRangeException("s", "Index and count must refer to a location within the string.");
        }
        if (i3 < 0 || i3 > bArr.length) {
            throw new ArgumentOutOfRangeException("byteIndex", "Index was out of range. Must be non-negative and less than the size of the collection.");
        }
        return mo26624k4(C14113y2.m67365dy(str), i, i2, bArr, i3, bArr.length - i3, (C6780uz) null);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: x1 */
    public String mo26682x1(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new ArgumentNullException("bytes", "Array cannot be null.");
        }
        if (i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException(i < 0 ? FirebaseAnalytics.Param.INDEX : C18293o1.f55803f, "Non-negative number required.");
        }
        if (bArr.length - i >= i2) {
            return i2 == 0 ? C14113y2.f47374k4 : m26676to(bArr, i, i2);
        }
        throw new ArgumentOutOfRangeException("bytes", "Index and count must refer to a location within the buffer.");
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26660k4(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new ArgumentNullException("bytes", "Array cannot be null.");
        }
        String str = C18293o1.f55803f;
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Non-negative number required.");
        }
        if (i < 0 || i2 < 0) {
            if (i < 0) {
                str = FirebaseAnalytics.Param.INDEX;
            }
            throw new ArgumentOutOfRangeException(str, "Non-negative number required.");
        }
        if (bArr.length - i < i2) {
            throw new ArgumentOutOfRangeException("bytes", "Index and count must refer to a location within the buffer.");
        }
        if (i2 == 0) {
            return 0;
        }
        return mo26621k4(bArr, i, i2, (C6753ck) null);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26621k4(byte[] bArr, int i, int i2, C6753ck c6753ck) {
        AbstractC6762jd abstractC6762jdMo26734k4;
        int i3;
        long j;
        int i4;
        byte[] bArr2;
        int i5 = i;
        k4 k4Var = (k4) c6753ck;
        int i6 = i5 + i2;
        long j2 = 4294967295L;
        int i7 = 0;
        if (k4Var != null) {
            i3 = k4Var.f18664h4;
            j = ((long) k4Var.f18665k4) & 4294967295L;
            abstractC6762jdMo26734k4 = k4Var.m26753to();
        } else {
            abstractC6762jdMo26734k4 = this.f18592rv.mo26734k4();
            i3 = 0;
            j = 0;
        }
        abstractC6762jdMo26734k4.m26765k4(i5, 0);
        int iMo26770x1 = 0;
        while (i5 < i6 && iMo26770x1 >= 0) {
            long j3 = j2;
            boolean z = this.f18663m9;
            if (z) {
                i4 = i7;
                long j4 = ((((j & j3) << 8) & j3) + ((long) (bArr[i5] & 255))) & j3;
                i5++;
                j = j4;
            } else {
                i4 = i7;
                j = ((((j & j3) >> 8) & j3) + (((long) ((bArr[i5] & 255) << 24)) & j3)) & j3;
                i5++;
            }
            i3++;
            if (i3 < 4) {
                j2 = j3;
                i7 = i4;
            } else {
                long j5 = j & j3;
                if (j5 > 1114111 || (j5 >= 55296 && j5 <= 57343)) {
                    if (z) {
                        bArr2 = new byte[4];
                        bArr2[i4] = (byte) ((j5 >> 24) & j3);
                        bArr2[1] = (byte) ((j5 >> 16) & j3);
                        bArr2[2] = (byte) ((j5 >> 8) & j3);
                        bArr2[3] = (byte) j;
                    } else {
                        bArr2 = new byte[4];
                        bArr2[i4] = (byte) j;
                        bArr2[1] = (byte) ((j5 >> 8) & j3);
                        bArr2[2] = (byte) ((j5 >> 16) & j3);
                        bArr2[3] = (byte) ((j5 >> 24) & j3);
                    }
                    iMo26770x1 += abstractC6762jdMo26734k4.mo26770x1(bArr2, i5);
                } else {
                    if (j5 >= 65536) {
                        iMo26770x1++;
                    }
                    iMo26770x1++;
                }
                j2 = j3;
                i7 = i4;
                i3 = i7;
                j = 0;
            }
        }
        long j6 = j2;
        if (i3 > 0 && (k4Var == null || k4Var.m26738h4())) {
            byte[] bArr3 = new byte[i3];
            if (this.f18663m9) {
                while (i3 > 0) {
                    i3--;
                    bArr3[i3] = (byte) j;
                    j = ((j & j6) >> 8) & j6;
                }
            } else {
                while (i3 > 0) {
                    i3--;
                    bArr3[i3] = (byte) ((r3 >> 24) & j6);
                    j = ((j & j6) << 8) & j6;
                }
            }
            iMo26770x1 += abstractC6762jdMo26734k4.mo26770x1(bArr3, i5);
        }
        if (iMo26770x1 >= 0) {
            return iMo26770x1;
        }
        throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Too many characters. The resulting number of bytes is larger than what can be returned as an int.");
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26661k4(byte[] bArr, int i, int i2, char[] cArr, int i3) {
        if (bArr == null || cArr == null) {
            throw new ArgumentNullException(bArr != null ? "chars" : "bytes", "Array cannot be null.");
        }
        if (i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException(i < 0 ? "byteIndex" : "byteCount", "Non-negative number required.");
        }
        if (bArr.length - i < i2) {
            throw new ArgumentOutOfRangeException("bytes", "Index and count must refer to a location within the buffer.");
        }
        if (i3 < 0 || i3 > cArr.length) {
            throw new ArgumentOutOfRangeException("charIndex", "Index was out of range. Must be non-negative and less than the size of the collection.");
        }
        if (i2 == 0) {
            return 0;
        }
        return mo26622k4(bArr, i, i2, cArr, i3, cArr.length - i3, (C6753ck) null);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26662k4(byte[] bArr, int i, int i2, char[] cArr, int i3, int i4) {
        if (bArr == null || cArr == null) {
            throw new ArgumentNullException(bArr == null ? "bytes" : "chars", "Array cannot be null.");
        }
        if (i4 < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException(i4 < 0 ? "charCount" : "byteCount", "Non-negative number required.");
        }
        return mo26622k4(bArr, i, i2, cArr, i3, i4, (C6753ck) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6 A[PHI: r7 r11
      0x00a6: PHI (r7v13 int) = (r7v10 int), (r7v14 int), (r7v15 int) binds: [B:46:0x0133, B:35:0x00c7, B:28:0x00a4] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r11v12 int) = (r11v9 int), (r11v1 int), (r11v1 int) binds: [B:46:0x0133, B:35:0x00c7, B:28:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9 A[PHI: r7 r11
      0x00a9: PHI (r7v11 int) = (r7v10 int), (r7v14 int), (r7v15 int) binds: [B:46:0x0133, B:35:0x00c7, B:28:0x00a4] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r11v10 int) = (r11v9 int), (r11v1 int), (r11v1 int) binds: [B:46:0x0133, B:35:0x00c7, B:28:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0186 A[PHI: r9 r11
      0x0186: PHI (r9v5 long) = (r9v4 long), (r9v10 long), (r9v4 long) binds: [B:49:0x013b, B:67:0x0183, B:52:0x0143] A[DONT_GENERATE, DONT_INLINE]
      0x0186: PHI (r11v3 int) = (r11v2 int), (r11v6 int), (r11v2 int) binds: [B:49:0x013b, B:67:0x0183, B:52:0x0143] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0191  */
    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo26622k4(byte[] bArr, int i, int i2, char[] cArr, int i3, int i4, C6753ck c6753ck) {
        long j;
        AbstractC6762jd abstractC6762jdMo26734k4;
        long jM26750x1;
        int i5;
        long j2;
        int i6;
        int i7;
        int i8;
        int i9;
        byte[] bArr2;
        k4 k4Var = (k4) c6753ck;
        int i10 = i3 + i4;
        int i11 = i + i2;
        int[] iArr = new int[1];
        if (k4Var != null) {
            i5 = k4Var.f18664h4;
            j = 4294967295L;
            jM26750x1 = ((long) k4Var.f18665k4) & 4294967295L;
            abstractC6762jdMo26734k4 = c6753ck.m26753to();
        } else {
            j = 4294967295L;
            abstractC6762jdMo26734k4 = this.f18592rv.mo26734k4();
            jM26750x1 = 0;
            i5 = 0;
        }
        abstractC6762jdMo26734k4.m26765k4(i, i10);
        int i12 = i3;
        int i13 = i;
        while (i13 < i11) {
            boolean z = this.f18663m9;
            if (z) {
                i8 = i11;
                jM26750x1 = ((((jM26750x1 & j) << 8) & j) + ((long) (bArr[i13] & 255))) & j;
                i13++;
            } else {
                i8 = i11;
                jM26750x1 = ((((jM26750x1 & j) >> 8) & j) + (((long) ((bArr[i13] & 255) << 24)) & j)) & j;
                i13++;
            }
            i5++;
            if (i5 >= 4) {
                long j3 = jM26750x1 & j;
                if (j3 > 1114111 || (j3 >= 55296 && j3 <= 57343)) {
                    if (z) {
                        i9 = i10;
                        bArr2 = new byte[]{(byte) ((j3 >> 24) & j), (byte) ((j3 >> 16) & j), (byte) ((j3 >> 8) & j), (byte) jM26750x1};
                    } else {
                        i9 = i10;
                        bArr2 = new byte[]{(byte) jM26750x1, (byte) ((j3 >> 8) & j), (byte) ((j3 >> 16) & j), (byte) ((j3 >> 24) & j)};
                    }
                    iArr[0] = i12;
                    boolean zM26767k4 = abstractC6762jdMo26734k4.m26767k4(bArr2, i13, cArr, iArr);
                    i12 = iArr[0];
                    if (zM26767k4) {
                        i5 = 0;
                        i10 = i9;
                        i11 = i8;
                        jM26750x1 = 0;
                    } else {
                        i13 -= 4;
                        abstractC6762jdMo26734k4.m26769to();
                        boolean z2 = i12 == i3;
                        m26668k4(k4Var, z2);
                        i5 = 0;
                        jM26750x1 = 0;
                    }
                } else if (j3 < 65536) {
                    if (i12 >= i10) {
                        i13 -= 4;
                        if (i12 == i3) {
                        }
                        m26668k4(k4Var, z2);
                        i5 = 0;
                        jM26750x1 = 0;
                    }
                    cArr[i12] = (char) jM26750x1;
                    i5 = 0;
                    i12++;
                    i11 = i8;
                    jM26750x1 = 0;
                } else if (i12 >= i10 - 1) {
                    i13 -= 4;
                    if (i12 == i3) {
                    }
                    m26668k4(k4Var, z2);
                    i5 = 0;
                    jM26750x1 = 0;
                } else {
                    cArr[i12] = m26748k4(jM26750x1);
                    jM26750x1 = m26750x1(jM26750x1);
                    i12++;
                    cArr[i12] = (char) jM26750x1;
                    i5 = 0;
                    i12++;
                    i11 = i8;
                    jM26750x1 = 0;
                }
                if (i5 > 0 || !(k4Var == null || k4Var.m26738h4())) {
                    j2 = jM26750x1;
                    i6 = i12;
                    i7 = i5;
                } else {
                    byte[] bArr3 = new byte[i5];
                    if (this.f18663m9) {
                        int i14 = i5;
                        while (i14 > 0) {
                            i14--;
                            bArr3[i14] = (byte) jM26750x1;
                            jM26750x1 = ((jM26750x1 & j) >> 8) & j;
                        }
                    } else {
                        int i15 = i5;
                        while (i15 > 0) {
                            i15--;
                            bArr3[i15] = (byte) ((r9 >> 24) & j);
                            jM26750x1 = ((jM26750x1 & j) << 8) & j;
                        }
                    }
                    iArr[0] = i12;
                    boolean zM26767k42 = abstractC6762jdMo26734k4.m26767k4(bArr3, i13, cArr, iArr);
                    i12 = iArr[0];
                    if (zM26767k42) {
                        i6 = i12;
                        j2 = 0;
                        i7 = 0;
                    } else {
                        abstractC6762jdMo26734k4.m26769to();
                        m26668k4(k4Var, i12 == i3);
                        j2 = jM26750x1;
                        i6 = i12;
                        i7 = i5;
                    }
                }
                if (k4Var != null) {
                    k4Var.f18665k4 = (int) j2;
                    k4Var.f18664h4 = i7;
                    k4Var.f18640du = i13 - i;
                }
                return i6 - i3;
            }
            i11 = i8;
        }
        if (i5 > 0) {
            j2 = jM26750x1;
            i6 = i12;
            i7 = i5;
        }
        if (k4Var != null) {
        }
        return i6 - i3;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26663k4(char[] cArr, int i, int i2) {
        if (cArr == null) {
            throw new ArgumentNullException("chars", "Array cannot be null.");
        }
        String str = C18293o1.f55803f;
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Non-negative number required.");
        }
        if (i < 0 || i2 < 0) {
            if (i < 0) {
                str = FirebaseAnalytics.Param.INDEX;
            }
            throw new ArgumentOutOfRangeException(str, "Non-negative number required.");
        }
        if (cArr.length - i < i2) {
            throw new ArgumentOutOfRangeException("chars", "Index and count must refer to a location within the buffer.");
        }
        if (i2 == 0) {
            return 0;
        }
        return mo26623k4(cArr, i, i2, (C6780uz) null);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26623k4(char[] cArr, int i, int i2, C6780uz c6780uz) {
        AbstractC6761ix abstractC6761ixMo26736k4;
        char c;
        int i3 = i2 + i;
        int[] iArr = new int[1];
        if (c6780uz != null) {
            c = c6780uz.f18747kk;
            abstractC6761ixMo26736k4 = c6780uz.m26814x1();
            if (abstractC6761ixMo26736k4.mo26762kk() > 0) {
                throw new ArgumentException(C6770qm.m26824k4("Must complete Convert() operation or call Encoder.Reset() before calling GetBytes() or GetByteCount(). Encoder '{0}' fallback '{1}'.", mo26653c5(), C14067j2.m66727k4(c6780uz.m26811k4())));
            }
        } else {
            abstractC6761ixMo26736k4 = this.f18591ks.mo26736k4();
            c = 0;
        }
        abstractC6761ixMo26736k4.m26758k4(i, i3, c6780uz, false);
        int i4 = 0;
        while (true) {
            char cM26755h4 = abstractC6761ixMo26736k4.m26755h4();
            if (cM26755h4 == 0 && i >= i3) {
                if ((c6780uz != null && !c6780uz.m26835h4()) || c <= 0) {
                    break;
                }
                iArr[0] = i;
                abstractC6761ixMo26736k4.m26761k4(c, cArr, iArr);
                i = iArr[0];
            } else {
                if (cM26755h4 == 0) {
                    cM26755h4 = cArr[i];
                    i++;
                }
                if (c != 0) {
                    if (C14117yj.m67512c5(cM26755h4)) {
                        i4 += 4;
                    } else {
                        iArr[0] = i - 1;
                        abstractC6761ixMo26736k4.m26761k4(c, cArr, iArr);
                        i = iArr[0];
                    }
                } else if (C14117yj.m67514du(cM26755h4)) {
                    c = cM26755h4;
                } else if (C14117yj.m67512c5(cM26755h4)) {
                    iArr[0] = i;
                    abstractC6761ixMo26736k4.m26761k4(cM26755h4, cArr, iArr);
                    i = iArr[0];
                } else {
                    i4 += 4;
                }
            }
            c = 0;
        }
        if (i4 >= 0) {
            return i4;
        }
        throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Too many characters. The resulting number of bytes is larger than what can be returned as an int.");
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26664k4(char[] cArr, int i, int i2, byte[] bArr, int i3) {
        if (cArr == null || bArr == null) {
            throw new ArgumentNullException(cArr != null ? "bytes" : "chars", "Array cannot be null.");
        }
        if (i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException(i < 0 ? "charIndex" : "charCount", "Non-negative number required.");
        }
        if (cArr.length - i < i2) {
            throw new ArgumentOutOfRangeException("chars", "Index and count must refer to a location within the buffer.");
        }
        if (i3 < 0 || i3 > bArr.length) {
            throw new ArgumentOutOfRangeException("byteIndex", "Index was out of range. Must be non-negative and less than the size of the collection.");
        }
        if (i2 == 0) {
            return 0;
        }
        return mo26624k4(cArr, i, i2, bArr, i3, bArr.length - i3, (C6780uz) null);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26665k4(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4) {
        if (bArr == null || cArr == null) {
            throw new ArgumentNullException(bArr == null ? "bytes" : "chars", "Array cannot be null.");
        }
        if (i2 < 0 || i4 < 0) {
            throw new ArgumentOutOfRangeException(i2 < 0 ? "charCount" : "byteCount", "Non-negative number required.");
        }
        return mo26624k4(cArr, i, i2, bArr, i3, i4, (C6780uz) null);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26624k4(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4, C6780uz c6780uz) {
        AbstractC6761ix abstractC6761ixMo26736k4;
        char c;
        int[] iArr;
        char c2;
        int[] iArr2;
        C6759g8 c6759g8 = this;
        char[] cArr2 = cArr;
        int i5 = i + i2;
        int i6 = i3 + i4;
        boolean z = true;
        int[] iArr3 = new int[1];
        if (c6780uz != null) {
            c = c6780uz.f18747kk;
            abstractC6761ixMo26736k4 = c6780uz.m26814x1();
            if (c6780uz.f18749to && abstractC6761ixMo26736k4.mo26762kk() > 0) {
                throw new ArgumentException(C6770qm.m26824k4("Must complete Convert() operation or call Encoder.Reset() before calling GetBytes() or GetByteCount(). Encoder '{0}' fallback '{1}'.", c6759g8.mo26653c5(), C14067j2.m66727k4(c6780uz.m26811k4())));
            }
        } else {
            abstractC6761ixMo26736k4 = c6759g8.f18591ks.mo26736k4();
            c = 0;
        }
        abstractC6761ixMo26736k4.m26758k4(i, i5, c6780uz, true);
        int i7 = i;
        int i8 = i3;
        while (true) {
            char cM26755h4 = abstractC6761ixMo26736k4.m26755h4();
            if (cM26755h4 != 0 || i7 < i5) {
                if (cM26755h4 == 0) {
                    cM26755h4 = cArr2[i7];
                    i7++;
                }
                if (c == 0) {
                    iArr = iArr3;
                    c2 = 0;
                    if (C14117yj.m67514du(cM26755h4)) {
                        iArr3 = iArr;
                        c = cM26755h4;
                        z = true;
                    } else {
                        if (C14117yj.m67512c5(cM26755h4)) {
                            iArr[0] = i7;
                            abstractC6761ixMo26736k4.m26761k4(cM26755h4, cArr2, iArr);
                            i7 = iArr[0];
                        } else if (i8 + 3 >= i6) {
                            if (abstractC6761ixMo26736k4.f18669h4) {
                                abstractC6761ixMo26736k4.mo26764x1();
                            } else {
                                i7--;
                            }
                            c6759g8.m26670k4(c6780uz, i8 == i3);
                        } else {
                            if (c6759g8.f18663m9) {
                                bArr[i8] = 0;
                                bArr[i8 + 1] = 0;
                                int i9 = i8 + 3;
                                bArr[i8 + 2] = (byte) (((((long) cM26755h4) & 4294967295L) >> 8) & 4294967295L);
                                i8 += 4;
                                bArr[i9] = (byte) cM26755h4;
                            } else {
                                bArr[i8] = (byte) cM26755h4;
                                bArr[i8 + 1] = (byte) (((((long) cM26755h4) & 4294967295L) >> 8) & 4294967295L);
                                int i10 = i8 + 3;
                                bArr[i8 + 2] = 0;
                                i8 += 4;
                                bArr[i10] = 0;
                            }
                            c6759g8 = this;
                            cArr2 = cArr;
                        }
                        iArr3 = iArr;
                        z = true;
                    }
                } else if (C14117yj.m67512c5(cM26755h4)) {
                    c2 = 0;
                    long jM26749k4 = c6759g8.m26749k4(c, cM26755h4);
                    if (i8 + 3 >= i6) {
                        if (abstractC6761ixMo26736k4.f18669h4) {
                            abstractC6761ixMo26736k4.mo26764x1();
                            abstractC6761ixMo26736k4.mo26764x1();
                        } else {
                            i7 -= 2;
                        }
                        c6759g8.m26670k4(c6780uz, i8 == i3 ? z : false);
                        c = 0;
                        iArr = iArr3;
                    } else {
                        if (c6759g8.f18663m9) {
                            bArr[i8] = 0;
                            long j = jM26749k4 & 4294967295L;
                            iArr2 = iArr3;
                            bArr[i8 + 1] = (byte) ((j >> 16) & 4294967295L);
                            int i11 = i8 + 3;
                            bArr[i8 + 2] = (byte) ((j >> 8) & 4294967295L);
                            i8 += 4;
                            bArr[i11] = (byte) jM26749k4;
                        } else {
                            iArr2 = iArr3;
                            bArr[i8] = (byte) jM26749k4;
                            long j2 = jM26749k4 & 4294967295L;
                            bArr[i8 + 1] = (byte) ((j2 >> 8) & 4294967295L);
                            int i12 = i8 + 3;
                            bArr[i8 + 2] = (byte) ((j2 >> 16) & 4294967295L);
                            i8 += 4;
                            bArr[i12] = 0;
                        }
                        c = 0;
                        iArr3 = iArr2;
                        z = true;
                    }
                } else {
                    int[] iArr4 = iArr3;
                    c2 = 0;
                    iArr4[0] = i7 - 1;
                    iArr = iArr4;
                    abstractC6761ixMo26736k4.m26761k4(c, cArr2, iArr);
                    i7 = iArr[0];
                }
                c = c2;
                iArr3 = iArr;
                z = true;
            } else {
                iArr = iArr3;
                c2 = 0;
            }
            if ((c6780uz != null && !c6780uz.m26835h4()) || c <= 0) {
                break;
            }
            iArr[c2] = i7;
            abstractC6761ixMo26736k4.m26761k4(c, cArr2, iArr);
            i7 = iArr[c2];
            c = c2;
            iArr3 = iArr;
            z = true;
        }
        if (c6780uz != null) {
            c6780uz.f18747kk = c;
            c6780uz.f18745du = i7 - i;
        }
        return i8 - i3;
    }

    /* JADX INFO: renamed from: k4 */
    private long m26749k4(char c, char c2) {
        return ((((((((((long) c) & 4294967295L) - 55296) & 4294967295L) * 1024) & 4294967295L) + (((((long) c2) & 4294967295L) - 56320) & 4294967295L)) & 4294967295L) + 65536) & 4294967295L;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public void mo26666k4() {
        AbstractC6751c5 c6758fa;
        if (this.f18662h4) {
            this.f18591ks = AbstractC6769ne.m26821to();
            c6758fa = AbstractC6751c5.m26733to();
        } else {
            this.f18591ks = new C6782wl("�");
            c6758fa = new C6758fa("�");
        }
        this.f18592rv = c6758fa;
    }
}
