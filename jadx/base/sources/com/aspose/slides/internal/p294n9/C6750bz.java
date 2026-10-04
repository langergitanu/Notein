package com.aspose.slides.internal.p294n9;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14069jd;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.bz */
/* JADX INFO: loaded from: classes4.dex */
public class C6750bz extends AbstractC6785x1 {

    /* JADX INFO: renamed from: ne */
    private static AtomicReference<Object> f18631ne = new AtomicReference<>();

    /* JADX INFO: renamed from: ck */
    private byte[] f18632ck;

    /* JADX INFO: renamed from: fa */
    private byte f18633fa;

    /* JADX INFO: renamed from: jd */
    private char[] f18634jd;

    /* JADX INFO: renamed from: x6 */
    private char f18635x6;

    public C6750bz(int i) {
        this(i, i);
    }

    /* JADX INFO: renamed from: b3 */
    private static Object m26730b3() {
        if (f18631ne.get() == null) {
            f18631ne.set(new Object());
        }
        return f18631ne.get();
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6785x1
    /* JADX INFO: renamed from: du */
    public void mo26731du() {
        int i;
        synchronized (m26730b3()) {
            try {
                if (this.f18780kk == null) {
                    int i2 = this.f18777c5 - 512;
                    byte[] bArr = new byte[i2];
                    synchronized (AbstractC6785x1.f18775h4) {
                        i = 0;
                        AbstractC6785x1.f18774du.seek(this.f18778dy + 512, 0);
                        AbstractC6785x1.f18774du.read(bArr, 0, i2);
                    }
                    char[] cArr = new char[256];
                    System.arraycopy(this.f18634jd, 0, cArr, 0, 256);
                    int i3 = 0;
                    while (true) {
                        int iM66769k4 = C14069jd.m66769k4(bArr, i3) & 65535;
                        if (iM66769k4 == 0) {
                            break;
                        }
                        cArr[iM66769k4] = C14069jd.m66781m9(bArr, i3 + 2);
                        i3 += 4;
                    }
                    this.f18782to = cArr;
                    int i4 = i3 + 2;
                    int iM66769k42 = C14069jd.m66769k4(bArr, i4) & 65535;
                    int i5 = i3 + 4;
                    int i6 = i5;
                    int i7 = 0;
                    while (iM66769k42 < 65536) {
                        int i8 = i6 + 1;
                        int i9 = bArr[i6] & 255;
                        if (i9 == 1) {
                            iM66769k42 = C14069jd.m66769k4(bArr, i8) & 65535;
                            i6 += 3;
                        } else {
                            if (i9 >= 32 || i9 <= 0 || i9 == 30) {
                                if (i9 > 0) {
                                    i7++;
                                }
                                iM66769k42++;
                            } else {
                                iM66769k42 += i9;
                            }
                            i6 = i8;
                        }
                    }
                    char[] cArr2 = new char[i7 * 2];
                    int iM66769k43 = C14069jd.m66769k4(bArr, i4) & 65535;
                    while (iM66769k43 < 65536) {
                        byte b = bArr[i5];
                        int i10 = i5 + 1;
                        int i11 = b & 255;
                        if (i11 == 1) {
                            iM66769k43 = C14069jd.m66769k4(bArr, i10) & 65535;
                            i5 += 3;
                        } else {
                            if (i11 >= 32 || i11 <= 0 || i11 == 30) {
                                if (i11 == 30) {
                                    b = bArr[i10];
                                    i10 = i5 + 2;
                                }
                                int i12 = b & 255;
                                if (i12 > 0) {
                                    int i13 = i + 1;
                                    cArr2[i] = (char) iM66769k43;
                                    i += 2;
                                    cArr2[i13] = this.f18634jd[i12];
                                }
                                iM66769k43++;
                            } else {
                                iM66769k43 += i11;
                            }
                            i5 = i10;
                        }
                    }
                    this.f18780kk = cArr2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
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
        if (jMo26737x1 <= 2147483647L) {
            return (int) jMo26737x1;
        }
        throw new ArgumentOutOfRangeException("charCount", "Too many characters. The resulting number of bytes is larger than what can be returned as an int.");
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6785x1
    /* JADX INFO: renamed from: to */
    public void mo26723to() {
        int i;
        if (C14069jd.m66782to(this.f18781m9, 42) != 1) {
            throw new NotSupportedException(C6770qm.m26823k4("No data is available for encoding {0}. For information on defining a custom encoding, see the documentation for the Encoding.RegisterProvider method.", Integer.valueOf(mo26673ks())));
        }
        this.f18633fa = (byte) C14069jd.m66769k4(this.f18781m9, 46);
        this.f18635x6 = C14069jd.m66781m9(this.f18781m9, 44);
        char[] cArr = new char[256];
        byte[] bArr = new byte[65536];
        byte[] bArr2 = new byte[512];
        synchronized (AbstractC6785x1.f18775h4) {
            AbstractC6785x1.f18774du.seek(this.f18778dy, 0);
            AbstractC6785x1.f18774du.read(bArr2, 0, 512);
        }
        for (i = 0; i < 256; i++) {
            char cM66781m9 = C14069jd.m66781m9(bArr2, i * 2);
            if (cM66781m9 != 0 || i == 0) {
                cArr[i] = cM66781m9;
                if (cM66781m9 != 65533) {
                    bArr[cM66781m9] = (byte) i;
                }
            } else {
                cArr[i] = 65533;
            }
        }
        this.f18634jd = cArr;
        this.f18632ck = bArr;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: x1 */
    public int mo26627x1(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("byteCount", "Non-negative number required.");
        }
        long jMo26735x1 = i;
        if (m26656fa().mo26735x1() > 1) {
            jMo26735x1 *= (long) m26656fa().mo26735x1();
        }
        if (jMo26735x1 <= 2147483647L) {
            return (int) jMo26735x1;
        }
        throw new ArgumentOutOfRangeException("byteCount", "Too many bytes. The resulting number of chars is larger than what can be returned as an int.");
    }

    public C6750bz(int i, int i2) {
        super(i, i2);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26621k4(byte[] bArr, int i, int i2, C6753ck c6753ck) {
        C6758fa c6758fa;
        AbstractC6751c5 abstractC6751c5M26752kk;
        if (c6753ck == null) {
            c6758fa = (C6758fa) C7019kk.m27452k4((Object) m26656fa(), C6758fa.class);
            abstractC6751c5M26752kk = m26656fa();
        } else {
            c6758fa = (C6758fa) C7019kk.m27452k4((Object) c6753ck.m26752kk(), C6758fa.class);
            abstractC6751c5M26752kk = c6753ck.m26752kk();
        }
        if (C7019kk.m27469x1(abstractC6751c5M26752kk, C6754dq.class) || (c6758fa != null && c6758fa.mo26735x1() == 1)) {
            return i2;
        }
        int i3 = i + i2;
        AbstractC6762jd abstractC6762jdMo26734k4 = null;
        int iMo26770x1 = i2;
        while (i < i3) {
            int i4 = i + 1;
            if (this.f18634jd[bArr[i] & 255] == 65533) {
                if (abstractC6762jdMo26734k4 == null) {
                    abstractC6762jdMo26734k4 = c6753ck == null ? m26656fa().mo26734k4() : c6753ck.m26753to();
                    abstractC6762jdMo26734k4.m26765k4(i3 - i2, 0);
                }
                iMo26770x1 = (iMo26770x1 - 1) + abstractC6762jdMo26734k4.mo26770x1(new byte[]{bArr[i]}, i4);
            }
            i = i4;
        }
        return iMo26770x1;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083 A[PHI: r11
      0x0083: PHI (r11v15 int) = (r11v9 int), (r11v17 int) binds: [B:28:0x008a, B:24:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo26622k4(byte[] bArr, int i, int i2, char[] cArr, int i3, int i4, C6753ck c6753ck) {
        C6758fa c6758fa;
        AbstractC6751c5 abstractC6751c5M26752kk;
        char c;
        int i5 = i + i2;
        if (c6753ck == null) {
            c6758fa = (C6758fa) C7019kk.m27452k4((Object) m26656fa(), C6758fa.class);
            abstractC6751c5M26752kk = m26656fa();
        } else {
            c6758fa = (C6758fa) C7019kk.m27452k4((Object) c6753ck.m26752kk(), C6758fa.class);
            abstractC6751c5M26752kk = c6753ck.m26752kk();
        }
        boolean zM27469x1 = C7019kk.m27469x1(abstractC6751c5M26752kk, C6754dq.class);
        if (zM27469x1 || (c6758fa != null && c6758fa.mo26735x1() == 1)) {
            char cCharAt = c6758fa == null ? '?' : c6758fa.m26747du().charAt(0);
            if (i4 < i2) {
                m26727x1(c6753ck, i4 < 1);
                i5 = i + i4;
            }
            int i6 = i;
            int i7 = i3;
            while (i6 < i5) {
                if (zM27469x1) {
                    if (this.f18782to == null) {
                        mo26731du();
                    }
                    c = this.f18782to[bArr[i6] & 255];
                } else {
                    c = this.f18634jd[bArr[i6] & 255];
                }
                i6++;
                if (c == 65533) {
                    cArr[i7] = cCharAt;
                } else {
                    cArr[i7] = c;
                }
                i7++;
            }
            if (c6753ck != null) {
                c6753ck.f18640du = i6 - i;
            }
            return i7 - i3;
        }
        int i8 = i3 + i4;
        AbstractC6762jd abstractC6762jdMo26734k4 = null;
        int i9 = i;
        int i10 = i3;
        while (i9 < i5) {
            char c2 = this.f18634jd[bArr[i9] & 255];
            int i11 = i9 + 1;
            if (c2 == 65533) {
                if (abstractC6762jdMo26734k4 == null) {
                    abstractC6762jdMo26734k4 = c6753ck == null ? m26656fa().mo26734k4() : c6753ck.m26753to();
                }
                int[] iArr = {i10};
                boolean zM26767k4 = abstractC6762jdMo26734k4.m26767k4(new byte[]{bArr[i9]}, i11, cArr, iArr);
                i10 = iArr[0];
                if (zM26767k4) {
                    i9 = i11;
                } else {
                    abstractC6762jdMo26734k4.m26769to();
                    if (i9 == i) {
                        z = true;
                    }
                    m26727x1(c6753ck, z);
                }
            } else if (i3 >= i8) {
                if (i9 == i) {
                }
                m26727x1(c6753ck, z);
            } else {
                cArr[i10] = c2;
                i10++;
                i9 = i11;
            }
            if (c6753ck != null) {
                c6753ck.f18640du = i9 - i;
            }
            return i10 - i3;
        }
        if (c6753ck != null) {
        }
        return i10 - i3;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26623k4(char[] cArr, int i, int i2, C6780uz c6780uz) {
        C6782wl c6782wl;
        char c;
        AbstractC6761ix abstractC6761ixMo26736k4;
        if (c6780uz != null) {
            c = c6780uz.f18747kk;
            c6782wl = (C6782wl) C7019kk.m27452k4((Object) c6780uz.m26811k4(), C6782wl.class);
        } else {
            c6782wl = (C6782wl) C7019kk.m27452k4((Object) m26654ck(), C6782wl.class);
            c = 0;
        }
        if (c6782wl != null && c6782wl.mo26737x1() == 1) {
            return c > 0 ? i2 + 1 : i2;
        }
        int i3 = i + i2;
        if (c > 0) {
            abstractC6761ixMo26736k4 = c6780uz.m26814x1();
            abstractC6761ixMo26736k4.m26758k4(i, i3, c6780uz, false);
            int[] iArr = {i};
            abstractC6761ixMo26736k4.m26761k4(c, cArr, iArr);
            i = iArr[0];
        } else {
            abstractC6761ixMo26736k4 = null;
        }
        int i4 = 0;
        while (true) {
            char cM26755h4 = abstractC6761ixMo26736k4 == null ? (char) 0 : abstractC6761ixMo26736k4.m26755h4();
            if (cM26755h4 == 0 && i >= i3) {
                return i4;
            }
            if (cM26755h4 == 0) {
                cM26755h4 = cArr[i];
                i++;
            }
            if ((this.f18632ck[cM26755h4] & 255) != 0 || cM26755h4 == 0) {
                i4++;
            } else {
                if (abstractC6761ixMo26736k4 == null) {
                    abstractC6761ixMo26736k4 = c6780uz == null ? m26654ck().mo26736k4() : c6780uz.m26814x1();
                    abstractC6761ixMo26736k4.m26758k4(i3 - i2, i3, c6780uz, false);
                }
                int[] iArr2 = {i};
                abstractC6761ixMo26736k4.m26761k4(cM26755h4, cArr, iArr2);
                i = iArr2[0];
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00eb, code lost:
    
        r6 = false;
     */
    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo26624k4(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4, C6780uz c6780uz) {
        C6782wl c6782wl;
        char c;
        AbstractC6761ix abstractC6761ixMo26736k4;
        int i5;
        int i6;
        int i7;
        if (c6780uz != null) {
            c = c6780uz.f18747kk;
            c6782wl = (C6782wl) C7019kk.m27452k4((Object) c6780uz.m26811k4(), C6782wl.class);
        } else {
            c6782wl = (C6782wl) C7019kk.m27452k4((Object) m26654ck(), C6782wl.class);
            c = 0;
        }
        int i8 = i + i2;
        if (c6782wl != null && c6782wl.mo26737x1() == 1) {
            byte b = this.f18632ck[c6782wl.m26843du().charAt(0)];
            if ((b & 255) != 0) {
                if (c > 0) {
                    if (i4 == 0) {
                        m26728x1(c6780uz, true);
                    }
                    i6 = i3 + 1;
                    bArr[i3] = b;
                    i7 = i4 - 1;
                } else {
                    i6 = i3;
                    i7 = i4;
                }
                if (i7 < i2) {
                    m26728x1(c6780uz, i7 < 1);
                    i8 = i + i7;
                }
                int i9 = i;
                while (i9 < i8) {
                    char c2 = cArr[i9];
                    i9++;
                    byte b2 = this.f18632ck[c2];
                    if ((b2 & 255) != 0 || c2 == 0) {
                        bArr[i6] = b2;
                    } else {
                        bArr[i6] = b;
                    }
                    i6++;
                }
                if (c6780uz != null) {
                    c6780uz.f18747kk = (char) 0;
                    c6780uz.f18745du = i9 - i;
                }
                return i6 - i3;
            }
        }
        int i10 = i3 + i4;
        if (c > 0) {
            abstractC6761ixMo26736k4 = c6780uz.m26814x1();
            abstractC6761ixMo26736k4.m26758k4(i, i8, c6780uz, true);
            int[] iArr = {i};
            abstractC6761ixMo26736k4.m26761k4(c, cArr, iArr);
            i5 = iArr[0];
            if (abstractC6761ixMo26736k4.mo26762kk() > i10 - i3) {
                m26728x1(c6780uz, true);
            }
        } else {
            abstractC6761ixMo26736k4 = null;
            i5 = i;
        }
        int i11 = i3;
        while (true) {
            char cM26755h4 = abstractC6761ixMo26736k4 == null ? (char) 0 : abstractC6761ixMo26736k4.m26755h4();
            if (cM26755h4 == 0 && i5 >= i8) {
                break;
            }
            if (cM26755h4 == 0) {
                cM26755h4 = cArr[i5];
                i5++;
            }
            byte b3 = this.f18632ck[cM26755h4];
            if ((b3 & 255) == 0 && cM26755h4 != 0) {
                if (abstractC6761ixMo26736k4 == null) {
                    abstractC6761ixMo26736k4 = c6780uz == null ? m26654ck().mo26736k4() : c6780uz.m26814x1();
                    abstractC6761ixMo26736k4.m26758k4(i8 - i2, i8, c6780uz, true);
                }
                int[] iArr2 = {i5};
                abstractC6761ixMo26736k4.m26761k4(cM26755h4, cArr, iArr2);
                i5 = iArr2[0];
                if (abstractC6761ixMo26736k4.mo26762kk() > i10 - i11) {
                    i5--;
                    abstractC6761ixMo26736k4.m26754du();
                    if (i5 != i) {
                    }
                }
            } else if (i11 >= i10) {
                if (abstractC6761ixMo26736k4 == null || !abstractC6761ixMo26736k4.f18669h4) {
                    i5--;
                }
                if (i5 != i) {
                }
            } else {
                bArr[i11] = b3;
                i11++;
            }
        }
        m26728x1(c6780uz, z);
        if (c6780uz != null) {
            if (abstractC6761ixMo26736k4 != null && !abstractC6761ixMo26736k4.f18668du) {
                c6780uz.f18747kk = (char) 0;
            }
            c6780uz.f18745du = i5 - i;
        }
        return i11 - i3;
    }
}
