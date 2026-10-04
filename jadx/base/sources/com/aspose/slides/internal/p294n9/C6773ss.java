package com.aspose.slides.internal.p294n9;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.ss */
/* JADX INFO: loaded from: classes4.dex */
public class C6773ss extends AbstractC6747ar {

    /* JADX INFO: renamed from: du */
    public boolean f18712du;

    /* JADX INFO: renamed from: kk */
    public boolean f18713kk;

    /* JADX INFO: renamed from: to */
    public boolean f18714to;

    /* JADX INFO: renamed from: k4 */
    public static final C6773ss f18709k4 = new C6773ss(true, true);

    /* JADX INFO: renamed from: x1 */
    public static final C6773ss f18711x1 = new C6773ss(false, true);

    /* JADX INFO: renamed from: h4 */
    private static final byte[] f18708h4 = {-2, -1};

    /* JADX INFO: renamed from: m9 */
    private static final byte[] f18710m9 = {-1, -2};

    /* JADX INFO: renamed from: com.aspose.slides.internal.n9.ss$k4 */
    public static final class k4 extends C6753ck {

        /* JADX INFO: renamed from: h4 */
        public char f18715h4;

        /* JADX INFO: renamed from: k4 */
        public int f18716k4;

        public k4(C6773ss c6773ss) {
            super(c6773ss);
            this.f18716k4 = -1;
            this.f18715h4 = (char) 0;
        }

        @Override // com.aspose.slides.internal.p294n9.C6753ck, com.aspose.slides.internal.p294n9.AbstractC6760h4
        /* JADX INFO: renamed from: k4 */
        public void mo26629k4() {
            this.f18716k4 = -1;
            this.f18715h4 = (char) 0;
            AbstractC6762jd abstractC6762jd = this.f18666kk;
            if (abstractC6762jd != null) {
                abstractC6762jd.mo26768kk();
            }
        }

        @Override // com.aspose.slides.internal.p294n9.C6753ck
        /* JADX INFO: renamed from: x1 */
        public boolean mo26630x1() {
            return (this.f18716k4 == -1 && this.f18715h4 == 0) ? false : true;
        }
    }

    public C6773ss() {
        this(false, true);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: dy */
    public byte[] mo26655dy() {
        return C14067j2.m66727k4(this) != C7019kk.m27443k4((Class<?>) C6773ss.class) ? mo26674m9() : this.f18712du ? this.f18714to ? f18708h4 : f18710m9 : new byte[0];
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    public boolean equals(Object obj) {
        C6773ss c6773ss = (C6773ss) C7019kk.m27452k4(obj, C6773ss.class);
        return c6773ss != null && mo26673ks() == c6773ss.mo26673ks() && this.f18712du == c6773ss.f18712du && this.f18714to == c6773ss.f18714to && m26654ck().equals(c6773ss.m26654ck()) && m26656fa().equals(c6773ss.m26656fa());
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    public int hashCode() {
        return m26656fa().hashCode() + m26654ck().hashCode() + mo26673ks() + (this.f18712du ? 4 : 0) + (this.f18714to ? 8 : 0);
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
        long j = jMo26737x1 << 1;
        if (j <= 2147483647L) {
            return (int) j;
        }
        throw new ArgumentOutOfRangeException("charCount", "Too many characters. The resulting number of bytes is larger than what can be returned as an int.");
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: kk */
    public AbstractC6766ks mo26626kk() {
        return new C6780uz(this);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: m9 */
    public byte[] mo26674m9() {
        if (!this.f18712du) {
            return new byte[0];
        }
        byte[] bArr = {-1, -2};
        if (!this.f18714to) {
            return bArr;
        }
        // fill-array-data instruction
        bArr[0] = -2;
        bArr[1] = -1;
        return bArr;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: x1 */
    public int mo26627x1(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("byteCount", "Non-negative number required.");
        }
        long jMo26735x1 = ((long) (i >> 1)) + ((long) (i & 1)) + 1;
        if (m26656fa().mo26735x1() > 1) {
            jMo26735x1 *= (long) m26656fa().mo26735x1();
        }
        if (jMo26735x1 <= 2147483647L) {
            return (int) jMo26735x1;
        }
        throw new ArgumentOutOfRangeException("byteCount", "Too many bytes. The resulting number of chars is larger than what can be returned as an int.");
    }

    public C6773ss(boolean z, boolean z2) {
        this(z, z2, false);
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

    public C6773ss(boolean z, boolean z2, boolean z3) {
        super(z ? 1201 : 1200);
        this.f18713kk = z3;
        this.f18714to = z;
        this.f18712du = z2;
        if (z3) {
            mo26666k4();
        }
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
        int i3;
        int i4;
        char c;
        int i5;
        int i6;
        k4 k4Var = (k4) c6753ck;
        int i7 = i + i2;
        int iMo26770x1 = i2 >> 1;
        AbstractC6762jd abstractC6762jdMo26734k4 = null;
        if (k4Var != null) {
            i4 = k4Var.f18716k4;
            c = k4Var.f18715h4;
            if (c > 0) {
                iMo26770x1++;
            }
            if (i4 >= 0 && (i2 & 1) == 1) {
                iMo26770x1++;
            }
            i3 = i;
        } else {
            i3 = i;
            i4 = -1;
            c = 0;
        }
        while (true) {
            if (i3 >= i7) {
                break;
            }
            if (i4 < 0) {
                int i8 = i3 + 1;
                int i9 = bArr[i3] & 255;
                i3 = i8;
                if (i8 >= i7) {
                    i4 = i9;
                    break;
                }
                i4 = i9;
            }
            boolean z = this.f18714to;
            if (z) {
                i5 = i3 + 1;
                i6 = (i4 << 8) | (bArr[i3] & 255);
            } else {
                i5 = i3 + 1;
                i6 = i4 | ((bArr[i3] & 255) << 8);
            }
            char c2 = (char) i6;
            i3 = i5;
            if (c2 < 55296 || c2 > 57343) {
                if (c > 0) {
                    int i10 = iMo26770x1 - 1;
                    byte[] bArr2 = new byte[2];
                    if (z) {
                        bArr2[0] = (byte) (c >> '\b');
                        bArr2[1] = (byte) c;
                    } else {
                        bArr2[0] = (byte) c;
                        bArr2[1] = (byte) (c >> '\b');
                    }
                    if (abstractC6762jdMo26734k4 == null) {
                        abstractC6762jdMo26734k4 = k4Var == null ? this.f18592rv.mo26734k4() : k4Var.m26753to();
                        abstractC6762jdMo26734k4.m26765k4(i, 0);
                    }
                    c = 0;
                    iMo26770x1 = abstractC6762jdMo26734k4.mo26770x1(bArr2, i3) + i10;
                }
            } else if (c2 <= 56319) {
                if (c > 0) {
                    int i11 = iMo26770x1 - 1;
                    byte[] bArr3 = new byte[2];
                    if (z) {
                        bArr3[0] = (byte) (c >> '\b');
                        bArr3[1] = (byte) c;
                    } else {
                        bArr3[0] = (byte) c;
                        bArr3[1] = (byte) (c >> '\b');
                    }
                    if (abstractC6762jdMo26734k4 == null) {
                        abstractC6762jdMo26734k4 = k4Var == null ? this.f18592rv.mo26734k4() : k4Var.m26753to();
                        abstractC6762jdMo26734k4.m26765k4(i, 0);
                    }
                    iMo26770x1 = abstractC6762jdMo26734k4.mo26770x1(bArr3, i3) + i11;
                }
                c = c2;
            } else if (c == 0) {
                int i12 = iMo26770x1 - 1;
                byte[] bArr4 = new byte[2];
                if (z) {
                    bArr4[0] = (byte) (c2 >> '\b');
                    bArr4[1] = (byte) c2;
                } else {
                    bArr4[0] = (byte) c2;
                    bArr4[1] = (byte) (c2 >> '\b');
                }
                if (abstractC6762jdMo26734k4 == null) {
                    abstractC6762jdMo26734k4 = k4Var == null ? this.f18592rv.mo26734k4() : k4Var.m26753to();
                    abstractC6762jdMo26734k4.m26765k4(i, 0);
                }
                iMo26770x1 = i12 + abstractC6762jdMo26734k4.mo26770x1(bArr4, i3);
            } else {
                c = 0;
            }
            i4 = -1;
        }
        if (k4Var == null || k4Var.m26738h4()) {
            if (c > 0) {
                int i13 = iMo26770x1 - 1;
                byte[] bArr5 = this.f18714to ? new byte[]{(byte) (c >> '\b'), (byte) c} : new byte[]{(byte) c, (byte) (c >> '\b')};
                if (abstractC6762jdMo26734k4 == null) {
                    abstractC6762jdMo26734k4 = k4Var == null ? this.f18592rv.mo26734k4() : k4Var.m26753to();
                    abstractC6762jdMo26734k4.m26765k4(i, 0);
                }
                iMo26770x1 = i13 + abstractC6762jdMo26734k4.mo26770x1(bArr5, i3);
                c = 0;
            }
            if (i4 >= 0) {
                if (abstractC6762jdMo26734k4 == null) {
                    abstractC6762jdMo26734k4 = k4Var == null ? this.f18592rv.mo26734k4() : k4Var.m26753to();
                    abstractC6762jdMo26734k4.m26765k4(i, 0);
                }
                iMo26770x1 += abstractC6762jdMo26734k4.mo26770x1(new byte[]{(byte) i4}, i3);
            }
        }
        return c > 0 ? iMo26770x1 - 1 : iMo26770x1;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ab A[PHI: r7 r10 r14
      0x01ab: PHI (r7v3 int) = (r7v2 int), (r7v7 int) binds: [B:90:0x0156, B:113:0x01a9] A[DONT_GENERATE, DONT_INLINE]
      0x01ab: PHI (r10v4 char) = (r10v3 char), (r10v5 char) binds: [B:90:0x0156, B:113:0x01a9] A[DONT_GENERATE, DONT_INLINE]
      0x01ab: PHI (r14v3 com.aspose.slides.internal.n9.jd) = (r14v2 com.aspose.slides.internal.n9.jd), (r14v6 com.aspose.slides.internal.n9.jd) binds: [B:90:0x0156, B:113:0x01a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a A[PHI: r7 r10 r14 r15
      0x009a: PHI (r7v19 int) = (r7v12 int), (r7v13 int), (r7v1 int), (r7v21 int), (r7v23 int) binds: [B:77:0x0132, B:81:0x013a, B:59:0x00ed, B:54:0x00e4, B:35:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009a: PHI (r10v14 char) = (r10v2 char), (r10v9 char), (r10v2 char), (r10v2 char), (r10v2 char) binds: [B:77:0x0132, B:81:0x013a, B:59:0x00ed, B:54:0x00e4, B:35:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009a: PHI (r14v16 com.aspose.slides.internal.n9.jd) = 
      (r14v9 com.aspose.slides.internal.n9.jd)
      (r14v11 com.aspose.slides.internal.n9.jd)
      (r14v1 com.aspose.slides.internal.n9.jd)
      (r14v17 com.aspose.slides.internal.n9.jd)
      (r14v20 com.aspose.slides.internal.n9.jd)
     binds: [B:77:0x0132, B:81:0x013a, B:59:0x00ed, B:54:0x00e4, B:35:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009a: PHI (r15v20 int) = (r15v16 int), (r15v17 int), (r15v21 int), (r15v22 int), (r15v23 int) binds: [B:77:0x0132, B:81:0x013a, B:59:0x00ed, B:54:0x00e4, B:35:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d A[PHI: r7 r10 r14 r15
      0x009d: PHI (r7v17 int) = (r7v12 int), (r7v13 int), (r7v1 int), (r7v21 int), (r7v23 int) binds: [B:77:0x0132, B:81:0x013a, B:59:0x00ed, B:54:0x00e4, B:35:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r10v12 char) = (r10v2 char), (r10v9 char), (r10v2 char), (r10v2 char), (r10v2 char) binds: [B:77:0x0132, B:81:0x013a, B:59:0x00ed, B:54:0x00e4, B:35:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r14v14 com.aspose.slides.internal.n9.jd) = 
      (r14v9 com.aspose.slides.internal.n9.jd)
      (r14v11 com.aspose.slides.internal.n9.jd)
      (r14v1 com.aspose.slides.internal.n9.jd)
      (r14v17 com.aspose.slides.internal.n9.jd)
      (r14v20 com.aspose.slides.internal.n9.jd)
     binds: [B:77:0x0132, B:81:0x013a, B:59:0x00ed, B:54:0x00e4, B:35:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r15v18 int) = (r15v16 int), (r15v17 int), (r15v21 int), (r15v22 int), (r15v23 int) binds: [B:77:0x0132, B:81:0x013a, B:59:0x00ed, B:54:0x00e4, B:35:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0152 A[PHI: r7 r10 r15
      0x0152: PHI (r7v9 int) = (r7v3 int), (r7v5 int), (r7v7 int), (r7v7 int), (r7v2 int) binds: [B:114:0x01ab, B:127:0x01da, B:111:0x01a4, B:112:0x01a6, B:87:0x014f] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r10v7 char) = (r10v4 char), (r10v4 char), (r10v3 char), (r10v3 char), (r10v3 char) binds: [B:114:0x01ab, B:127:0x01da, B:111:0x01a4, B:112:0x01a6, B:87:0x014f] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r15v7 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v4 int), (r15v2 int) binds: [B:114:0x01ab, B:127:0x01da, B:111:0x01a4, B:112:0x01a6, B:87:0x014f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0158  */
    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo26622k4(byte[] bArr, int i, int i2, char[] cArr, int i3, int i4, C6753ck c6753ck) {
        int i5;
        char c;
        char c2;
        char c3;
        int i6;
        int i7;
        byte[] bArr2;
        int i8;
        int i9;
        boolean z;
        char c4 = 1;
        k4 k4Var = (k4) c6753ck;
        if (k4Var != null) {
            i5 = k4Var.f18716k4;
            c = k4Var.f18715h4;
        } else {
            i5 = -1;
            c = 0;
        }
        int[] iArr = new int[1];
        int i10 = i + i2;
        int i11 = i3 + i4;
        AbstractC6762jd abstractC6762jdMo26734k4 = null;
        int i12 = i;
        int i13 = i3;
        while (i12 < i10) {
            if (i5 >= 0) {
                c3 = 0;
                boolean z2 = this.f18714to;
                if (z2) {
                    i8 = i12 + 1;
                    i9 = (i5 << 8) | (bArr[i12] & 255);
                } else {
                    i8 = i12 + 1;
                    i9 = i5 | ((bArr[i12] & 255) << 8);
                }
                char c5 = (char) i9;
                i12 = i8;
                c2 = c4;
                if (c5 < 55296 || c5 > 57343) {
                    if (c > 0) {
                        byte[] bArr3 = new byte[2];
                        if (z2) {
                            bArr3[0] = (byte) (c >> '\b');
                            bArr3[c2] = (byte) c;
                        } else {
                            bArr3[0] = (byte) c;
                            bArr3[c2] = (byte) (c >> '\b');
                        }
                        if (abstractC6762jdMo26734k4 == null) {
                            abstractC6762jdMo26734k4 = k4Var == null ? this.f18592rv.mo26734k4() : k4Var.m26753to();
                            abstractC6762jdMo26734k4.m26765k4(i, i11);
                        }
                        iArr[0] = i13;
                        boolean zM26767k4 = abstractC6762jdMo26734k4.m26767k4(bArr3, i12, cArr, iArr);
                        i13 = iArr[0];
                        if (!zM26767k4) {
                            i12 -= 2;
                            abstractC6762jdMo26734k4.m26769to();
                            z = i13 == i3 ? c2 : 0;
                        }
                        c = 0;
                        if (i13 >= i11) {
                            i12 -= 2;
                            if (i13 == i3) {
                            }
                        } else {
                            cArr[i13] = c5;
                            i13++;
                            c4 = c2;
                            i5 = -1;
                        }
                    } else if (i13 >= i11) {
                    }
                    m26668k4(k4Var, z);
                    i5 = -1;
                } else if (c5 <= 56319) {
                    if (c > 0) {
                        byte[] bArr4 = new byte[2];
                        if (z2) {
                            bArr4[0] = (byte) (c >> '\b');
                            bArr4[c2] = (byte) c;
                        } else {
                            bArr4[0] = (byte) c;
                            bArr4[c2] = (byte) (c >> '\b');
                        }
                        if (abstractC6762jdMo26734k4 == null) {
                            abstractC6762jdMo26734k4 = k4Var == null ? this.f18592rv.mo26734k4() : k4Var.m26753to();
                            abstractC6762jdMo26734k4.m26765k4(i, i11);
                        }
                        iArr[0] = i13;
                        boolean zM26767k42 = abstractC6762jdMo26734k4.m26767k4(bArr4, i12, cArr, iArr);
                        i13 = iArr[0];
                        if (!zM26767k42) {
                            i12 -= 2;
                            abstractC6762jdMo26734k4.m26769to();
                            if (i13 == i3) {
                            }
                            m26668k4(k4Var, z);
                            i5 = -1;
                        }
                    }
                    c = c5;
                    c4 = c2;
                    i5 = -1;
                } else {
                    if (c == 0) {
                        byte[] bArr5 = new byte[2];
                        if (z2) {
                            bArr5[0] = (byte) (c5 >> '\b');
                            bArr5[c2] = (byte) c5;
                        } else {
                            bArr5[0] = (byte) c5;
                            bArr5[c2] = (byte) (c5 >> '\b');
                        }
                        if (abstractC6762jdMo26734k4 == null) {
                            AbstractC6762jd abstractC6762jdMo26734k42 = k4Var == null ? this.f18592rv.mo26734k4() : k4Var.m26753to();
                            abstractC6762jdMo26734k42.m26765k4(i, i11);
                            abstractC6762jdMo26734k4 = abstractC6762jdMo26734k42;
                        }
                        iArr[0] = i13;
                        boolean zM26767k43 = abstractC6762jdMo26734k4.m26767k4(bArr5, i12, cArr, iArr);
                        i13 = iArr[0];
                        if (!zM26767k43) {
                            i12 -= 2;
                            abstractC6762jdMo26734k4.m26769to();
                            if (i13 == i3) {
                            }
                        }
                        c4 = c2;
                        i5 = -1;
                    } else if (i13 >= i11 - 1) {
                        i12 -= 2;
                        if (i13 == i3) {
                        }
                    } else {
                        cArr[i13] = c;
                        i13++;
                        c = 0;
                        if (i13 >= i11) {
                        }
                    }
                    m26668k4(k4Var, z);
                    i5 = -1;
                }
                if (k4Var != null || k4Var.m26738h4()) {
                    if (c > 0) {
                        if (this.f18714to) {
                            bArr2 = new byte[2];
                            bArr2[c3] = (byte) (c >> '\b');
                            bArr2[c2] = (byte) c;
                        } else {
                            bArr2 = new byte[2];
                            bArr2[c3] = (byte) c;
                            bArr2[c2] = (byte) (c >> '\b');
                        }
                        if (abstractC6762jdMo26734k4 == null) {
                            abstractC6762jdMo26734k4 = k4Var == null ? this.f18592rv.mo26734k4() : k4Var.m26753to();
                            abstractC6762jdMo26734k4.m26765k4(i, i11);
                        }
                        iArr[c3] = i13;
                        boolean zM26767k44 = abstractC6762jdMo26734k4.m26767k4(bArr2, i12, cArr, iArr);
                        i13 = iArr[c3];
                        if (zM26767k44) {
                            c = c3;
                            if (i5 < 0) {
                            }
                        } else {
                            int i14 = i12 - 2;
                            if (i5 >= 0) {
                                i14 = i12 - 3;
                            }
                            abstractC6762jdMo26734k4.m26769to();
                            m26668k4(k4Var, i13 == i3 ? c2 : c3);
                            i12 = i14 + 2;
                            if (i5 >= 0) {
                                i12 = i14 + 3;
                            }
                            i6 = i13;
                            i7 = i5;
                        }
                    } else if (i5 < 0) {
                        i6 = i13;
                        i7 = i5;
                    } else {
                        if (abstractC6762jdMo26734k4 == null) {
                            abstractC6762jdMo26734k4 = k4Var == null ? this.f18592rv.mo26734k4() : k4Var.m26753to();
                            abstractC6762jdMo26734k4.m26765k4(i, i11);
                        }
                        iArr[c3] = i13;
                        int i15 = c2;
                        byte[] bArr6 = new byte[i15];
                        bArr6[c3] = (byte) i5;
                        boolean zM26767k45 = abstractC6762jdMo26734k4.m26767k4(bArr6, i12, cArr, iArr);
                        i13 = iArr[c3];
                        if (zM26767k45) {
                            i6 = i13;
                            i7 = -1;
                        } else {
                            abstractC6762jdMo26734k4.m26769to();
                            boolean z3 = i15;
                            if (i13 != i3) {
                                z3 = c3;
                            }
                            m26668k4(k4Var, z3);
                            i6 = i13;
                            i7 = i5;
                        }
                    }
                }
                if (k4Var != null) {
                    k4Var.f18640du = i12 - i;
                    k4Var.f18715h4 = c;
                    k4Var.f18716k4 = i7;
                }
                return i6 - i3;
            }
            int i16 = i12 + 1;
            int i17 = bArr[i12] & 255;
            i12 = i16;
            i5 = i17;
        }
        c2 = c4;
        c3 = 0;
        if (k4Var != null) {
            if (c > 0) {
            }
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
        int i3;
        char c;
        boolean z;
        int i4 = i2 << 1;
        if (i4 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Too many characters. The resulting number of bytes is larger than what can be returned as an int.");
        }
        int i5 = i2 + i;
        int[] iArr = new int[1];
        AbstractC6761ix abstractC6761ixMo26736k4 = null;
        if (c6780uz != null) {
            c = c6780uz.f18747kk;
            if (c > 0) {
                i4 += 2;
            }
            if (c6780uz.m26813kk()) {
                abstractC6761ixMo26736k4 = c6780uz.m26814x1();
                if (abstractC6761ixMo26736k4.mo26762kk() > 0) {
                    throw new ArgumentException(C6770qm.m26824k4("Must complete Convert() operation or call Encoder.Reset() before calling GetBytes() or GetByteCount(). Encoder '{0}' fallback '{1}'.", mo26653c5(), C14067j2.m66727k4(c6780uz.m26811k4())));
                }
                abstractC6761ixMo26736k4.m26758k4(i, i5, c6780uz, false);
            }
            i3 = i;
            z = false;
        } else {
            i3 = i;
            c = 0;
            z = false;
        }
        while (true) {
            char cM26755h4 = abstractC6761ixMo26736k4 == null ? (char) 0 : abstractC6761ixMo26736k4.m26755h4();
            if (cM26755h4 != 0 || i3 < i5) {
                if (cM26755h4 == 0) {
                    cM26755h4 = cArr[i3];
                    i3++;
                } else {
                    i4 += 2;
                }
                if (cM26755h4 < 55296 || cM26755h4 > 57343) {
                    if (c > 0) {
                        int i6 = i3 - 1;
                        if (abstractC6761ixMo26736k4 == null) {
                            abstractC6761ixMo26736k4 = c6780uz == null ? this.f18591ks.mo26736k4() : c6780uz.m26814x1();
                            abstractC6761ixMo26736k4.m26758k4(i, i5, c6780uz, false);
                        }
                        iArr[0] = i6;
                        abstractC6761ixMo26736k4.m26761k4(c, cArr, iArr);
                        i3 = iArr[0];
                        i4 -= 2;
                    }
                } else if (cM26755h4 <= 56319) {
                    if (c > 0) {
                        int i7 = i3 - 1;
                        i4 -= 2;
                        if (abstractC6761ixMo26736k4 == null) {
                            abstractC6761ixMo26736k4 = c6780uz == null ? this.f18591ks.mo26736k4() : c6780uz.m26814x1();
                            abstractC6761ixMo26736k4.m26758k4(i, i5, c6780uz, false);
                        }
                        iArr[0] = i7;
                        abstractC6761ixMo26736k4.m26761k4(c, cArr, iArr);
                        i3 = iArr[0];
                    } else {
                        c = cM26755h4;
                    }
                } else if (c == 0) {
                    i4 -= 2;
                    if (abstractC6761ixMo26736k4 == null) {
                        abstractC6761ixMo26736k4 = c6780uz == null ? this.f18591ks.mo26736k4() : c6780uz.m26814x1();
                        abstractC6761ixMo26736k4.m26758k4(i, i5, c6780uz, false);
                    }
                    iArr[0] = i3;
                    abstractC6761ixMo26736k4.m26761k4(cM26755h4, cArr, iArr);
                    i3 = iArr[0];
                }
            } else {
                if (c <= 0) {
                    return i4;
                }
                i4 -= 2;
                if (c6780uz != null && !c6780uz.m26835h4()) {
                    return i4;
                }
                if (z) {
                    throw new ArgumentException(C6770qm.m26823k4("Recursive fallback not allowed for character \\\\u{0:X4}.", Character.valueOf(c)), "chars");
                }
                if (abstractC6761ixMo26736k4 == null) {
                    abstractC6761ixMo26736k4 = c6780uz == null ? this.f18591ks.mo26736k4() : c6780uz.m26814x1();
                    abstractC6761ixMo26736k4.m26758k4(i, i5, c6780uz, false);
                }
                iArr[0] = i3;
                abstractC6761ixMo26736k4.m26761k4(c, cArr, iArr);
                i3 = iArr[0];
                z = true;
            }
            c = 0;
        }
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

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017f, code lost:
    
        r23.f18747kk = r11;
        r23.f18745du = r12 - r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0185, code lost:
    
        return r13 - r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017d, code lost:
    
        if (r23 == null) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0125 A[SYNTHETIC] */
    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo26624k4(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4, C6780uz c6780uz) {
        int i5;
        int i6;
        char c;
        boolean z;
        char c2;
        int i7;
        boolean z2;
        int i8 = i3 + i4;
        int i9 = i + i2;
        boolean z3 = true;
        int[] iArr = new int[1];
        char c3 = 0;
        AbstractC6761ix abstractC6761ixM26814x1 = null;
        if (c6780uz != null) {
            c = c6780uz.f18747kk;
            if (c6780uz.m26813kk()) {
                abstractC6761ixM26814x1 = c6780uz.m26814x1();
                if (abstractC6761ixM26814x1.mo26762kk() > 0 && c6780uz.f18749to) {
                    throw new ArgumentException(C6770qm.m26824k4("Must complete Convert() operation or call Encoder.Reset() before calling GetBytes() or GetByteCount(). Encoder '{0}' fallback '{1}'.", mo26653c5(), C14067j2.m66727k4(c6780uz.m26811k4())));
                }
                abstractC6761ixM26814x1.m26758k4(i, i9, c6780uz, false);
            }
            i5 = i;
            i6 = i3;
            z = false;
        } else {
            i5 = i;
            i6 = i3;
            c = 0;
            z = false;
        }
        while (true) {
            char cM26755h4 = abstractC6761ixM26814x1 == null ? c3 : abstractC6761ixM26814x1.m26755h4();
            if (cM26755h4 != 0 || i5 < i9) {
                if (cM26755h4 == 0) {
                    cM26755h4 = cArr[i5];
                    i5++;
                }
                c2 = c3;
                if (cM26755h4 < 55296 || cM26755h4 > 57343) {
                    if (c > 0) {
                        int i10 = i5 - 1;
                        if (abstractC6761ixM26814x1 == null) {
                            AbstractC6761ix abstractC6761ixMo26736k4 = c6780uz == null ? this.f18591ks.mo26736k4() : c6780uz.m26814x1();
                            abstractC6761ixMo26736k4.m26758k4(i, i9, c6780uz, true);
                            abstractC6761ixM26814x1 = abstractC6761ixMo26736k4;
                        }
                        iArr[c2] = i10;
                        abstractC6761ixM26814x1.m26761k4(c, cArr, iArr);
                        i5 = iArr[c2];
                        c3 = c2;
                        c = c3;
                    } else {
                        i7 = i6 + 1;
                        if (i7 < i8) {
                            if (abstractC6761ixM26814x1 == null || !abstractC6761ixM26814x1.f18669h4) {
                                i5--;
                            } else {
                                abstractC6761ixM26814x1.mo26764x1();
                            }
                            m26670k4(c6780uz, i6 == i3 ? 1 : c2);
                        } else {
                            if (this.f18714to) {
                                bArr[i6] = (byte) (cM26755h4 >> '\b');
                                i6 += 2;
                                bArr[i7] = (byte) cM26755h4;
                            } else {
                                bArr[i6] = (byte) cM26755h4;
                                i6 += 2;
                                bArr[i7] = (byte) (cM26755h4 >> '\b');
                            }
                            c3 = c2;
                        }
                    }
                    z3 = true;
                } else if (cM26755h4 <= 56319) {
                    if (c > 0) {
                        int i11 = i5 - 1;
                        if (abstractC6761ixM26814x1 == null) {
                            AbstractC6761ix abstractC6761ixMo26736k42 = c6780uz == null ? this.f18591ks.mo26736k4() : c6780uz.m26814x1();
                            abstractC6761ixMo26736k42.m26758k4(i, i9, c6780uz, z3);
                            abstractC6761ixM26814x1 = abstractC6761ixMo26736k42;
                        }
                        iArr[c2] = i11;
                        abstractC6761ixM26814x1.m26761k4(c, cArr, iArr);
                        i5 = iArr[c2];
                        c3 = c2;
                        c = c3;
                    } else {
                        c3 = c2;
                        c = cM26755h4;
                    }
                } else if (c == 0) {
                    if (abstractC6761ixM26814x1 == null) {
                        AbstractC6761ix abstractC6761ixMo26736k43 = c6780uz == null ? this.f18591ks.mo26736k4() : c6780uz.m26814x1();
                        abstractC6761ixMo26736k43.m26758k4(i, i9, c6780uz, z3);
                        abstractC6761ixM26814x1 = abstractC6761ixMo26736k43;
                    }
                    iArr[c2] = i5;
                    abstractC6761ixM26814x1.m26761k4(cM26755h4, cArr, iArr);
                    i5 = iArr[c2];
                    c3 = c2;
                } else if (i6 + 3 >= i8) {
                    if (abstractC6761ixM26814x1 == null || !abstractC6761ixM26814x1.f18669h4) {
                        i5 -= 2;
                    } else {
                        abstractC6761ixM26814x1.mo26764x1();
                        abstractC6761ixM26814x1.mo26764x1();
                    }
                    m26670k4(c6780uz, i6 == i3 ? z3 : c2);
                    c = c2;
                } else {
                    if (this.f18714to) {
                        int i12 = i6 + 1;
                        bArr[i6] = (byte) (c >> '\b');
                        i6 += 2;
                        bArr[i12] = (byte) c;
                    } else {
                        int i13 = i6 + 1;
                        bArr[i6] = (byte) c;
                        i6 += 2;
                        bArr[i13] = (byte) (c >> '\b');
                    }
                    c = c2;
                    i7 = i6 + 1;
                    if (i7 < i8) {
                    }
                }
            } else {
                c2 = c3;
            }
            if (c <= 0 || !(c6780uz == null || c6780uz.m26835h4())) {
                break;
            }
            if (z) {
                throw new ArgumentException(C6770qm.m26823k4("Recursive fallback not allowed for character \\\\u{0:X4}.", Character.valueOf(c)), "chars");
            }
            if (abstractC6761ixM26814x1 == null) {
                AbstractC6761ix abstractC6761ixMo26736k44 = c6780uz == null ? this.f18591ks.mo26736k4() : c6780uz.m26814x1();
                z2 = true;
                abstractC6761ixMo26736k44.m26758k4(i, i9, c6780uz, true);
                abstractC6761ixM26814x1 = abstractC6761ixMo26736k44;
            } else {
                z2 = true;
            }
            iArr[c2] = i5;
            abstractC6761ixM26814x1.m26761k4(c, cArr, iArr);
            i5 = iArr[c2];
            c = c2;
            z3 = z2;
            z = z3;
            c3 = c;
        }
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public void mo26666k4() {
        AbstractC6751c5 c6758fa;
        if (this.f18713kk) {
            this.f18591ks = AbstractC6769ne.m26821to();
            c6758fa = AbstractC6751c5.m26733to();
        } else {
            this.f18591ks = new C6782wl("�");
            c6758fa = new C6758fa("�");
        }
        this.f18592rv = c6758fa;
    }
}
