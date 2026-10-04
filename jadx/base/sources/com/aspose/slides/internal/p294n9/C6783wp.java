package com.aspose.slides.internal.p294n9;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.WarningType;
import com.google.common.primitives.SignedBytes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.wp */
/* JADX INFO: loaded from: classes4.dex */
public class C6783wp extends AbstractC6747ar {

    /* JADX INFO: renamed from: du */
    private boolean f18756du;

    /* JADX INFO: renamed from: to */
    public boolean f18757to;

    /* JADX INFO: renamed from: k4 */
    public static final kk f18753k4 = new kk(true);

    /* JADX INFO: renamed from: x1 */
    public static final C6783wp f18755x1 = new C6783wp(false);

    /* JADX INFO: renamed from: kk */
    public static final byte[] f18754kk = {-17, -69, -65};

    /* JADX INFO: renamed from: com.aspose.slides.internal.n9.wp$k4 */
    public static final class k4 extends C6753ck {

        /* JADX INFO: renamed from: k4 */
        public int f18758k4;

        public k4(C6783wp c6783wp) {
            super(c6783wp);
        }

        @Override // com.aspose.slides.internal.p294n9.C6753ck, com.aspose.slides.internal.p294n9.AbstractC6760h4
        /* JADX INFO: renamed from: k4 */
        public void mo26629k4() {
            this.f18758k4 = 0;
            AbstractC6762jd abstractC6762jd = this.f18666kk;
            if (abstractC6762jd != null) {
                abstractC6762jd.mo26768kk();
            }
        }

        @Override // com.aspose.slides.internal.p294n9.C6753ck
        /* JADX INFO: renamed from: x1 */
        public boolean mo26630x1() {
            return this.f18758k4 != 0;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.n9.wp$kk */
    public static final class kk extends C6783wp {
        public kk(boolean z) {
            super(z);
        }

        @Override // com.aspose.slides.internal.p294n9.C6783wp, com.aspose.slides.internal.p294n9.AbstractC6747ar
        /* JADX INFO: renamed from: dy */
        public byte[] mo26655dy() {
            return this.f18757to ? C6783wp.f18754kk : new byte[0];
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.n9.wp$x1 */
    public static final class x1 extends C6780uz {

        /* JADX INFO: renamed from: h4 */
        public int f18759h4;

        public x1(C6783wp c6783wp) {
            super(c6783wp);
        }

        @Override // com.aspose.slides.internal.p294n9.C6780uz
        /* JADX INFO: renamed from: m9 */
        public boolean mo26631m9() {
            return this.f18759h4 != 0;
        }

        @Override // com.aspose.slides.internal.p294n9.C6780uz, com.aspose.slides.internal.p294n9.AbstractC6766ks
        /* JADX INFO: renamed from: to */
        public void mo26632to() {
            this.f18759h4 = 0;
            AbstractC6761ix abstractC6761ix = this.f18690x1;
            if (abstractC6761ix != null) {
                abstractC6761ix.mo26763to();
            }
        }
    }

    public C6783wp() {
        this(false);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: dy */
    public byte[] mo26655dy() {
        return C14067j2.m66727k4(this) != C7019kk.m27443k4((Class<?>) C6783wp.class) ? mo26674m9() : this.f18757to ? f18754kk : new byte[0];
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    public boolean equals(Object obj) {
        C6783wp c6783wp = (C6783wp) C7019kk.m27452k4(obj, C6783wp.class);
        return c6783wp != null && this.f18757to == c6783wp.f18757to && m26654ck().equals(c6783wp.m26654ck()) && m26656fa().equals(c6783wp.m26656fa());
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    public int hashCode() {
        return m26656fa().hashCode() + m26654ck().hashCode() + 65001 + (this.f18757to ? 1 : 0);
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
        long j = jMo26737x1 * 3;
        if (j <= 2147483647L) {
            return (int) j;
        }
        throw new ArgumentOutOfRangeException("charCount", "Too many characters. The resulting number of bytes is larger than what can be returned as an int.");
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: kk */
    public AbstractC6766ks mo26626kk() {
        return new x1(this);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: m9 */
    public byte[] mo26674m9() {
        return this.f18757to ? new byte[]{-17, -69, -65} : new byte[0];
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: x1 */
    public int mo26627x1(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("byteCount", "Non-negative number required.");
        }
        long jMo26735x1 = ((long) i) + 1;
        if (m26656fa().mo26735x1() > 1) {
            jMo26735x1 *= (long) m26656fa().mo26735x1();
        }
        if (jMo26735x1 <= 2147483647L) {
            return (int) jMo26735x1;
        }
        throw new ArgumentOutOfRangeException("byteCount", "Too many bytes. The resulting number of chars is larger than what can be returned as an int.");
    }

    public C6783wp(boolean z) {
        this(z, false);
    }

    /* JADX INFO: renamed from: k4 */
    private int m26844k4(int i, int i2, AbstractC6762jd abstractC6762jd) {
        return abstractC6762jd.mo26770x1(m26847k4(new int[]{i}, i2), i);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: x1 */
    public AbstractC6760h4 mo26628x1() {
        return new k4(this);
    }

    public C6783wp(boolean z, boolean z2) {
        super(65001);
        this.f18757to = z;
        this.f18756du = z2;
        if (z2) {
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

    /* JADX WARN: Path cross not found for [B:96:0x009a, B:102:0x006c], limit reached: 111 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:5:0x000f -> B:6:0x0010). Please report as a decompilation issue!!! */
    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo26621k4(byte[] bArr, int i, int i2, C6753ck c6753ck) {
        int i3;
        int iM26844k4;
        int i4;
        int i5;
        AbstractC6762jd abstractC6762jdMo26734k4;
        int i6 = i + i2;
        AbstractC6762jd abstractC6762jdMo26734k42 = null;
        if (c6753ck != null) {
            i3 = ((k4) c6753ck).f18758k4;
            i2 -= i3 >> 30;
        } else {
            i3 = 0;
        }
        while (i < i6) {
            if (i3 == 0) {
                int i7 = bArr[i];
                int i8 = i7 & 255;
                i++;
                if (i8 > 127) {
                    int i9 = i2 - 1;
                    if ((i7 & 64) == 0) {
                        if (abstractC6762jdMo26734k42 == null) {
                            AbstractC6762jd abstractC6762jdMo26734k43 = c6753ck == null ? this.f18592rv.mo26734k4() : c6753ck.m26753to();
                            abstractC6762jdMo26734k43.m26765k4(i, 0);
                            abstractC6762jdMo26734k42 = abstractC6762jdMo26734k43;
                        }
                        iM26844k4 = m26844k4(i, i8, abstractC6762jdMo26734k42);
                    } else if ((i7 & 32) == 0) {
                        int i10 = i7 & 31;
                        if (i10 <= 1) {
                            i5 = i10 | 192;
                            if (abstractC6762jdMo26734k42 == null) {
                                abstractC6762jdMo26734k42 = c6753ck == null ? this.f18592rv.mo26734k4() : c6753ck.m26753to();
                                abstractC6762jdMo26734k42.m26765k4(i, 0);
                            }
                            iM26844k4 = m26844k4(i, i5, abstractC6762jdMo26734k42);
                        } else {
                            i3 = i10 | 8388608;
                            i2 = i9;
                        }
                    } else {
                        int i11 = i7 & 16;
                        int i12 = i7 & 15;
                        if (i11 == 0) {
                            i4 = 1210220544;
                        } else if (i12 > 4) {
                            i5 = i12 | 240;
                            if (abstractC6762jdMo26734k42 == null) {
                                abstractC6762jdMo26734k42 = c6753ck == null ? this.f18592rv.mo26734k4() : c6753ck.m26753to();
                                abstractC6762jdMo26734k42.m26765k4(i, 0);
                            }
                            iM26844k4 = m26844k4(i, i5, abstractC6762jdMo26734k42);
                        } else {
                            i4 = 1347226624;
                        }
                        i3 = i12 | i4;
                        i2 -= 2;
                    }
                    i2 = iM26844k4 + i9;
                }
                i3 = 0;
            } else {
                int i13 = bArr[i];
                int i14 = i + 1;
                if ((i13 & 192) != 128) {
                    int i15 = i2 + (i3 >> 30);
                    if (abstractC6762jdMo26734k42 == null) {
                        abstractC6762jdMo26734k42 = c6753ck == null ? this.f18592rv.mo26734k4() : c6753ck.m26753to();
                        abstractC6762jdMo26734k42.m26765k4(i, 0);
                    }
                    i2 = i15 + m26844k4(i, i3, abstractC6762jdMo26734k42);
                } else {
                    i3 = (i13 & 63) | (i3 << 6);
                    if ((536870912 & i3) != 0) {
                        if ((270467072 & i3) == 268435456) {
                            i2--;
                        }
                        i = i14;
                    } else if ((i3 & WarningType.HINT) != 0) {
                        if ((i3 & 8388608) == 0 && !m26845k4(i3 & 496, 16, 256)) {
                            if (abstractC6762jdMo26734k42 == null) {
                                abstractC6762jdMo26734k4 = c6753ck == null ? this.f18592rv.mo26734k4() : c6753ck.m26753to();
                                abstractC6762jdMo26734k4.m26765k4(i14, 0);
                                abstractC6762jdMo26734k42 = abstractC6762jdMo26734k4;
                            }
                            i2 += m26844k4(i14, i3, abstractC6762jdMo26734k42);
                            i3 = 0;
                        }
                        i = i14;
                    } else {
                        int i16 = i3 & 992;
                        if (i16 == 0 || i16 == 864) {
                            if (abstractC6762jdMo26734k42 == null) {
                                abstractC6762jdMo26734k4 = c6753ck == null ? this.f18592rv.mo26734k4() : c6753ck.m26753to();
                                abstractC6762jdMo26734k4.m26765k4(i14, 0);
                                abstractC6762jdMo26734k42 = abstractC6762jdMo26734k4;
                            }
                            i2 += m26844k4(i14, i3, abstractC6762jdMo26734k42);
                            i3 = 0;
                        }
                        i = i14;
                    }
                }
                i3 = 0;
            }
            while (i < i6) {
            }
        }
        if (i3 == 0) {
            return i2;
        }
        int i17 = i2 + (i3 >> 30);
        if (c6753ck != null && !c6753ck.m26738h4()) {
            return i17;
        }
        if (abstractC6762jdMo26734k42 == null) {
            abstractC6762jdMo26734k42 = c6753ck == null ? this.f18592rv.mo26734k4() : c6753ck.m26753to();
            abstractC6762jdMo26734k42.m26765k4(i, 0);
        }
        return i17 + m26844k4(i, i3, abstractC6762jdMo26734k42);
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

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0137, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01de A[SYNTHETIC] */
    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo26622k4(byte[] bArr, int i, int i2, char[] cArr, int i3, int i4, C6753ck c6753ck) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        AbstractC6762jd abstractC6762jd;
        int i10;
        AbstractC6762jd abstractC6762jdMo26734k4;
        AbstractC6762jd abstractC6762jdMo26734k42;
        boolean z;
        int i11;
        int i12;
        int i13;
        int i14 = i + i2;
        int i15 = i3 + i4;
        int i16 = 1;
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        AbstractC6762jd abstractC6762jdMo26734k43 = null;
        if (c6753ck != null) {
            i7 = ((k4) c6753ck).f18758k4;
            i5 = i;
            i6 = i3;
        } else {
            i5 = i;
            i6 = i3;
            i7 = 0;
        }
        while (true) {
            if (i5 >= i14) {
                i8 = 0;
                break;
            }
            i8 = 0;
            if (i7 == 0) {
                byte b = bArr[i5];
                abstractC6762jd = abstractC6762jdMo26734k43;
                i11 = b & 255;
                i5++;
                if (i11 <= 127) {
                    i10 = 56320;
                    if (i6 < i15) {
                        int i17 = i11 & 2097151;
                        if (i17 > 127) {
                            if (i17 > 2047) {
                                if (i17 >= i10 && i17 <= 57343) {
                                    i5--;
                                    i6--;
                                } else if (i17 > 65535) {
                                    i5--;
                                }
                                i5--;
                            }
                            i5--;
                        }
                        i5--;
                        m26668k4(c6753ck, i6 == i3);
                        i7 = 0;
                        abstractC6762jdMo26734k43 = abstractC6762jd;
                    } else {
                        cArr[i6] = (char) i11;
                        i6++;
                        i7 = 0;
                        abstractC6762jdMo26734k43 = abstractC6762jd;
                        i16 = 1;
                    }
                } else if ((b & SignedBytes.MAX_POWER_OF_TWO) == 0) {
                    if (abstractC6762jd == null) {
                        abstractC6762jdMo26734k42 = c6753ck == null ? this.f18592rv.mo26734k4() : c6753ck.m26753to();
                        abstractC6762jdMo26734k42.m26765k4(i5, i15);
                    } else {
                        abstractC6762jdMo26734k42 = abstractC6762jd;
                    }
                    iArr[0] = i5;
                    iArr2[0] = i6;
                    boolean zM26846k4 = m26846k4(iArr, i11, abstractC6762jdMo26734k42, cArr, iArr2);
                    i5 = iArr[0];
                    i6 = iArr2[0];
                    if (!zM26846k4) {
                        abstractC6762jdMo26734k42.m26769to();
                        if (i6 == i3) {
                        }
                        m26668k4(c6753ck, z);
                        abstractC6762jdMo26734k43 = abstractC6762jdMo26734k42;
                        i7 = 0;
                    }
                    abstractC6762jdMo26734k43 = abstractC6762jdMo26734k42;
                    i7 = 0;
                } else if ((b & 32) != 0) {
                    if ((b & 16) != 0) {
                        i12 = b & 15;
                        if (i12 > 4) {
                            int i18 = i12 | 240;
                            if (abstractC6762jd == null) {
                                abstractC6762jdMo26734k42 = c6753ck == null ? this.f18592rv.mo26734k4() : c6753ck.m26753to();
                                abstractC6762jdMo26734k42.m26765k4(i5, i15);
                            } else {
                                abstractC6762jdMo26734k42 = abstractC6762jd;
                            }
                            iArr[0] = i5;
                            iArr2[0] = i6;
                            boolean zM26846k42 = m26846k4(iArr, i18, abstractC6762jdMo26734k42, cArr, iArr2);
                            i5 = iArr[0];
                            i6 = iArr2[0];
                            if (!zM26846k42) {
                                abstractC6762jdMo26734k42.m26769to();
                                if (i6 == i3) {
                                }
                                m26668k4(c6753ck, z);
                                abstractC6762jdMo26734k43 = abstractC6762jdMo26734k42;
                                i7 = 0;
                            }
                            abstractC6762jdMo26734k43 = abstractC6762jdMo26734k42;
                            i7 = 0;
                        } else {
                            i13 = 1347226624;
                        }
                    } else {
                        i12 = b & 15;
                        i13 = 1210220544;
                    }
                    i7 = i13 | i12;
                    abstractC6762jdMo26734k43 = abstractC6762jd;
                } else {
                    int i19 = b & 31;
                    if (i19 <= i16) {
                        int i20 = i19 | 192;
                        if (abstractC6762jd == null) {
                            abstractC6762jdMo26734k42 = c6753ck == null ? this.f18592rv.mo26734k4() : c6753ck.m26753to();
                            abstractC6762jdMo26734k42.m26765k4(i5, i15);
                        } else {
                            abstractC6762jdMo26734k42 = abstractC6762jd;
                        }
                        iArr[0] = i5;
                        iArr2[0] = i6;
                        boolean zM26846k43 = m26846k4(iArr, i20, abstractC6762jdMo26734k42, cArr, iArr2);
                        i5 = iArr[0];
                        i6 = iArr2[0];
                        if (!zM26846k43) {
                            abstractC6762jdMo26734k42.m26769to();
                            if (i6 == i3) {
                            }
                            m26668k4(c6753ck, z);
                            abstractC6762jdMo26734k43 = abstractC6762jdMo26734k42;
                            i7 = 0;
                        }
                        abstractC6762jdMo26734k43 = abstractC6762jdMo26734k42;
                        i7 = 0;
                    } else {
                        i7 = i19 | 8388608;
                        abstractC6762jdMo26734k43 = abstractC6762jd;
                    }
                }
            } else {
                abstractC6762jd = abstractC6762jdMo26734k43;
                byte b2 = bArr[i5];
                int i21 = i5 + 1;
                i10 = 56320;
                if ((b2 & 192) != 128) {
                    if (abstractC6762jd == null) {
                        abstractC6762jdMo26734k4 = c6753ck == null ? this.f18592rv.mo26734k4() : c6753ck.m26753to();
                        abstractC6762jdMo26734k4.m26765k4(i5, i15);
                    } else {
                        abstractC6762jdMo26734k4 = abstractC6762jd;
                    }
                    iArr[0] = i5;
                    iArr2[0] = i6;
                    int i22 = i7;
                    abstractC6762jdMo26734k42 = abstractC6762jdMo26734k4;
                    boolean zM26846k44 = m26846k4(iArr, i22, abstractC6762jdMo26734k42, cArr, iArr2);
                    i5 = iArr[0];
                    i6 = iArr2[0];
                    if (!zM26846k44) {
                        abstractC6762jdMo26734k42.m26769to();
                        if (i6 == i3) {
                        }
                        m26668k4(c6753ck, z);
                        abstractC6762jdMo26734k43 = abstractC6762jdMo26734k42;
                        i7 = 0;
                    }
                    abstractC6762jdMo26734k43 = abstractC6762jdMo26734k42;
                    i16 = 1;
                    i7 = 0;
                } else {
                    i11 = (b2 & 63) | (i7 << 6);
                    if ((536870912 & i11) != 0) {
                        if ((270467072 & i11) > 268435456 && i6 < i15) {
                            cArr[i6] = (char) (((i11 >> 10) & 2047) - 10304);
                            i6++;
                            i11 = (i11 & 1023) + 56320;
                        }
                        i5 = i21;
                        if (i6 < i15) {
                        }
                    } else if ((i11 & WarningType.HINT) == 0) {
                        int i23 = i11 & 992;
                        if (i23 == 0 || i23 == 864) {
                            if (abstractC6762jd == null) {
                                abstractC6762jdMo26734k42 = c6753ck == null ? this.f18592rv.mo26734k4() : c6753ck.m26753to();
                                abstractC6762jdMo26734k42.m26765k4(i21, i15);
                            } else {
                                abstractC6762jdMo26734k42 = abstractC6762jd;
                            }
                            iArr[0] = i21;
                            iArr2[0] = i6;
                            boolean zM26846k45 = m26846k4(iArr, i11, abstractC6762jdMo26734k42, cArr, iArr2);
                            i5 = iArr[0];
                            i6 = iArr2[0];
                            if (!zM26846k45) {
                                abstractC6762jdMo26734k42.m26769to();
                                if (i6 == i3) {
                                }
                                m26668k4(c6753ck, z);
                                abstractC6762jdMo26734k43 = abstractC6762jdMo26734k42;
                                i7 = 0;
                            }
                            abstractC6762jdMo26734k43 = abstractC6762jdMo26734k42;
                            i16 = 1;
                            i7 = 0;
                        } else {
                            i7 = i11;
                            i5 = i21;
                            abstractC6762jdMo26734k43 = abstractC6762jd;
                            i16 = 1;
                        }
                    } else if ((i11 & 8388608) == 0 && !m26845k4(i11 & 496, 16, 256)) {
                        if (abstractC6762jd == null) {
                            abstractC6762jdMo26734k42 = c6753ck == null ? this.f18592rv.mo26734k4() : c6753ck.m26753to();
                            abstractC6762jdMo26734k42.m26765k4(i21, i15);
                        } else {
                            abstractC6762jdMo26734k42 = abstractC6762jd;
                        }
                        iArr[0] = i21;
                        iArr2[0] = i6;
                        boolean zM26846k46 = m26846k4(iArr, i11, abstractC6762jdMo26734k42, cArr, iArr2);
                        i5 = iArr[0];
                        i6 = iArr2[0];
                        if (!zM26846k46) {
                            abstractC6762jdMo26734k42.m26769to();
                            if (i6 == i3) {
                            }
                            m26668k4(c6753ck, z);
                            abstractC6762jdMo26734k43 = abstractC6762jdMo26734k42;
                            i7 = 0;
                        }
                        abstractC6762jdMo26734k43 = abstractC6762jdMo26734k42;
                        i16 = 1;
                        i7 = 0;
                    } else {
                        i7 = i11;
                        i5 = i21;
                        abstractC6762jdMo26734k43 = abstractC6762jd;
                        i16 = 1;
                    }
                }
            }
        }
        if (i7 == 0 || !(c6753ck == null || c6753ck.m26738h4())) {
            i9 = i7;
        } else {
            if (abstractC6762jdMo26734k43 == null) {
                abstractC6762jdMo26734k43 = c6753ck == null ? this.f18592rv.mo26734k4() : c6753ck.m26753to();
                abstractC6762jdMo26734k43.m26765k4(i5, i15);
            }
            iArr[i8] = i5;
            iArr2[i8] = i6;
            int i24 = i7;
            AbstractC6762jd abstractC6762jd2 = abstractC6762jdMo26734k43;
            boolean zM26846k47 = m26846k4(iArr, i24, abstractC6762jd2, cArr, iArr2);
            i5 = iArr[i8];
            i6 = iArr2[i8];
            if (!zM26846k47) {
                abstractC6762jd2.m26769to();
                m26668k4(c6753ck, i6 == i3 ? true : i8);
            }
            i9 = i8;
        }
        if (c6753ck != null) {
            ((k4) c6753ck).f18758k4 = i9;
            c6753ck.f18640du = i5 - i;
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

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        r4 = 65533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        if (r4 > 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        if (r13 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        if (r13.m26835h4() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
    
        if (m26845k4(r10[r11], 56320, 57343) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ab, code lost:
    
        if (m26845k4(r4, 55296, 57343) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ad, code lost:
    
        if (r1 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00af, code lost:
    
        if (r13 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b1, code lost:
    
        r1 = r9.f18591ks.mo26736k4();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b8, code lost:
    
        r1 = r13.m26814x1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bc, code lost:
    
        r1.m26758k4(r11, r0, r13, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bf, code lost:
    
        r11 = new int[]{r11};
        r1.m26761k4((char) r4, r10, r11);
        r11 = r11[0];
        r12 = r12 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cf, code lost:
    
        if (r4 <= 127) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d3, code lost:
    
        if (r4 <= 2047) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d5, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d7, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Path cross not found for [B:37:0x007f, B:14:0x0046], limit reached: 69 */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4 A[LOOP:0: B:12:0x0038->B:48:0x00a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a7 A[EDGE_INSN: B:64:0x00a7->B:49:0x00a7 BREAK  A[LOOP:0: B:12:0x0038->B:48:0x00a4], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0037 -> B:12:0x0038). Please report as a decompilation issue!!! */
    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo26623k4(char[] cArr, int i, int i2, C6780uz c6780uz) {
        int iM26755h4;
        int i3 = i + i2;
        AbstractC6761ix abstractC6761ixM26814x1 = null;
        if (c6780uz != null) {
            x1 x1Var = (x1) c6780uz;
            int i4 = x1Var.f18759h4;
            iM26755h4 = i4;
            if (x1Var.m26813kk()) {
                abstractC6761ixM26814x1 = x1Var.m26814x1();
                if (abstractC6761ixM26814x1.mo26762kk() > 0) {
                    throw new ArgumentException(C6770qm.m26824k4("Must complete Convert() operation or call Encoder.Reset() before calling GetBytes() or GetByteCount(). Encoder '{0}' fallback '{1}'.", mo26653c5(), C14067j2.m66727k4(x1Var.m26811k4())));
                }
                abstractC6761ixM26814x1.m26758k4(i, i3, x1Var, false);
                iM26755h4 = i4;
            }
        } else {
            iM26755h4 = 0;
        }
        while (true) {
            if (i < i3) {
                if (iM26755h4 > 0) {
                    break;
                }
                if (abstractC6761ixM26814x1 == null || (iM26755h4 = abstractC6761ixM26814x1.m26755h4()) <= 0) {
                    char c = cArr[i];
                    i++;
                    iM26755h4 = c;
                } else {
                    i2++;
                    iM26755h4 = iM26755h4;
                }
                if (!m26845k4(iM26755h4 == true ? 1 : 0, 55296, 56319)) {
                    break;
                }
                i2--;
            } else if (iM26755h4 == 0) {
                iM26755h4 = abstractC6761ixM26814x1 != null ? abstractC6761ixM26814x1.m26755h4() : 0;
                if (iM26755h4 <= 0) {
                    break;
                }
                i2++;
                iM26755h4 = iM26755h4;
                if (!m26845k4(iM26755h4 == true ? 1 : 0, 55296, 56319)) {
                }
            } else if (abstractC6761ixM26814x1 != null && abstractC6761ixM26814x1.f18669h4) {
                char cM26755h4 = abstractC6761ixM26814x1.m26755h4();
                int i5 = i2 + 1;
                if (m26845k4(cM26755h4, 56320, 57343)) {
                    i2 += 2;
                    break;
                }
                if (cM26755h4 <= 0) {
                    return i2;
                }
                i2 = i5;
                iM26755h4 = cM26755h4;
                if (!m26845k4(iM26755h4 == true ? 1 : 0, 55296, 56319)) {
                }
            } else {
                break;
            }
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

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0095, code lost:
    
        r9 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3 A[PHI: r11 r12
      0x00c3: PHI (r11v8 int) = (r11v2 int), (r11v3 int), (r11v5 int), (r11v11 int), (r11v12 int), (r11v12 int) binds: [B:41:0x00a0, B:42:0x00a2, B:49:0x00bf, B:29:0x007d, B:34:0x008c, B:36:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r12v9 int A[IMMUTABLE_TYPE]) = (r12v2 int), (r12v4 int), (r12v6 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:41:0x00a0, B:42:0x00a2, B:49:0x00bf, B:29:0x007d, B:34:0x008c, B:36:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo26624k4(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4, C6780uz c6780uz) {
        int i5;
        int i6;
        x1 x1Var;
        int iM26755h4;
        char cM26755h4;
        int i7;
        int i8;
        int i9;
        boolean z;
        int i10;
        int i11;
        int i12 = i + i2;
        int i13 = i3 + i4;
        AbstractC6761ix abstractC6761ixM26814x1 = null;
        if (c6780uz != null) {
            x1Var = (x1) c6780uz;
            iM26755h4 = x1Var.f18759h4;
            if (x1Var.m26813kk()) {
                abstractC6761ixM26814x1 = x1Var.m26814x1();
                if (abstractC6761ixM26814x1.mo26762kk() > 0 && x1Var.f18749to) {
                    throw new ArgumentException(C6770qm.m26824k4("Must complete Convert() operation or call Encoder.Reset() before calling GetBytes() or GetByteCount(). Encoder '{0}' fallback '{1}'.", mo26653c5(), C14067j2.m66727k4(x1Var.m26811k4())));
                }
                abstractC6761ixM26814x1.m26758k4(i, i12, x1Var, true);
            }
            i5 = i;
            i6 = i3;
        } else {
            i5 = i;
            i6 = i3;
            x1Var = null;
            iM26755h4 = 0;
        }
        while (true) {
            if (i5 >= i12) {
                if (iM26755h4 == 0) {
                    iM26755h4 = abstractC6761ixM26814x1 != null ? abstractC6761ixM26814x1.m26755h4() : 0;
                    if (iM26755h4 > 0) {
                        if (m26845k4(iM26755h4, 55296, 56319)) {
                        }
                    }
                    if (m26845k4(iM26755h4, 55296, 57343)) {
                        if (abstractC6761ixM26814x1 == null) {
                            AbstractC6761ix abstractC6761ixMo26736k4 = c6780uz == null ? this.f18591ks.mo26736k4() : c6780uz.m26814x1();
                            abstractC6761ixMo26736k4.m26758k4(i5, i12, c6780uz, true);
                            abstractC6761ixM26814x1 = abstractC6761ixMo26736k4;
                        }
                        int[] iArr = {i5};
                        abstractC6761ixM26814x1.m26761k4((char) iM26755h4, cArr, iArr);
                        i5 = iArr[0];
                        iM26755h4 = 0;
                    } else {
                        if (iM26755h4 > 127) {
                            if (iM26755h4 > 2047) {
                                i11 = (iM26755h4 > 65535 ? 2 : 1) + 1;
                            } else {
                                i11 = 1;
                            }
                            i7 = i11 + 1;
                        } else {
                            i7 = 1;
                        }
                        if (i6 > i13 - i7) {
                            if (abstractC6761ixM26814x1 == null || !abstractC6761ixM26814x1.f18669h4) {
                                i5 = iM26755h4 > 65535 ? i5 - 2 : i5 - 1;
                            } else {
                                abstractC6761ixM26814x1.mo26764x1();
                                if (iM26755h4 > 65535) {
                                    abstractC6761ixM26814x1.mo26764x1();
                                }
                            }
                            m26670k4(x1Var, i6 == i3);
                            i8 = 0;
                        } else {
                            if (iM26755h4 <= 127) {
                                bArr[i6] = (byte) iM26755h4;
                                z = true;
                            } else {
                                if (iM26755h4 <= 2047) {
                                    i10 = ((byte) ((iM26755h4 >> 6) | (-64))) & 255;
                                    z = true;
                                } else {
                                    if (iM26755h4 <= 65535) {
                                        i9 = ((byte) ((iM26755h4 >> 12) | (-32))) & 255;
                                    } else {
                                        bArr[i6] = (byte) ((iM26755h4 >> 18) | (-16));
                                        i6++;
                                        i9 = ((iM26755h4 >> 12) & 63) | (-128);
                                    }
                                    bArr[i6] = (byte) i9;
                                    z = true;
                                    i6++;
                                    i10 = ((iM26755h4 >> 6) & 63) | (-128);
                                }
                                bArr[i6] = (byte) i10;
                                i6++;
                                bArr[i6] = (byte) ((iM26755h4 & 63) | (-128));
                            }
                            i6++;
                            iM26755h4 = 0;
                        }
                    }
                } else if (abstractC6761ixM26814x1 != null && abstractC6761ixM26814x1.f18669h4) {
                    cM26755h4 = abstractC6761ixM26814x1.m26755h4();
                    if (m26845k4(cM26755h4, 56320, 57343)) {
                        iM26755h4 = (cM26755h4 + (iM26755h4 << 10)) - 56613888;
                        if (m26845k4(iM26755h4, 55296, 57343)) {
                        }
                    } else {
                        if (cM26755h4 <= 0) {
                            i8 = cM26755h4;
                            break;
                        }
                        iM26755h4 = cM26755h4;
                        if (m26845k4(iM26755h4, 55296, 56319)) {
                            if (m26845k4(iM26755h4, 55296, 57343)) {
                            }
                        }
                    }
                }
                if (iM26755h4 <= 0 || (x1Var != null && !x1Var.m26835h4())) {
                    break;
                }
                if (m26845k4(iM26755h4, 55296, 57343)) {
                }
            } else if (iM26755h4 > 0) {
                char c = cArr[i5];
                if (m26845k4(c, 56320, 57343)) {
                    iM26755h4 = (c + (iM26755h4 << 10)) - 56613888;
                    i5++;
                }
                if (m26845k4(iM26755h4, 55296, 57343)) {
                }
            } else {
                if (abstractC6761ixM26814x1 == null || (cM26755h4 = abstractC6761ixM26814x1.m26755h4()) <= 0) {
                    cM26755h4 = cArr[i5];
                    i5++;
                }
                iM26755h4 = cM26755h4;
                if (m26845k4(iM26755h4, 55296, 56319)) {
                }
            }
        }
        if (x1Var != null) {
            x1Var.f18759h4 = i8;
            x1Var.f18745du = i5 - i;
        }
        return i6 - i3;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public void mo26666k4() {
        AbstractC6751c5 c6758fa;
        if (this.f18756du) {
            this.f18591ks = AbstractC6769ne.m26821to();
            c6758fa = AbstractC6751c5.m26733to();
        } else {
            this.f18591ks = new C6782wl("�");
            c6758fa = new C6758fa("�");
        }
        this.f18592rv = c6758fa;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m26845k4(int i, int i2, int i3) {
        return (((long) (i - i2)) & 4294967295L) <= (((long) (i3 - i2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m26846k4(int[] iArr, int i, AbstractC6762jd abstractC6762jd, char[] cArr, int[] iArr2) {
        int[] iArr3 = (int[]) C7019kk.m27458kk(AbstractC14092to.m67208k4((Object) iArr).deepClone(), int[].class);
        if (abstractC6762jd.m26767k4(m26847k4(iArr3, i), iArr[0], cArr, iArr2)) {
            return true;
        }
        iArr[0] = iArr3[0];
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m26847k4(int[] iArr, int i) {
        if (i < 256 && i >= 0) {
            iArr[0] = iArr[0] - 1;
            return new byte[]{(byte) i};
        }
        if ((402653184 & i) == 0) {
            iArr[0] = iArr[0] - 1;
            return new byte[]{(byte) ((i & 31) | 192)};
        }
        if ((268435456 & i) == 0) {
            if ((i & 8388608) != 0) {
                iArr[0] = iArr[0] - 2;
                return new byte[]{(byte) (((i >> 6) & 15) | 224), (byte) ((i & 63) | 128)};
            }
            iArr[0] = iArr[0] - 1;
            return new byte[]{(byte) ((i & 15) | 224)};
        }
        if ((i & 8388608) != 0) {
            iArr[0] = iArr[0] - 3;
            return new byte[]{(byte) (((i >> 12) & 7) | 240), (byte) (((i >> 6) & 63) | 128), (byte) ((i & 63) | 128)};
        }
        if ((131072 & i) != 0) {
            iArr[0] = iArr[0] - 2;
            return new byte[]{(byte) (((i >> 6) & 7) | 240), (byte) ((i & 63) | 128)};
        }
        iArr[0] = iArr[0] - 1;
        return new byte[]{(byte) ((i & 7) | 240)};
    }
}
