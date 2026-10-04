package com.aspose.slides.internal.p294n9;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14069jd;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.du */
/* JADX INFO: loaded from: classes4.dex */
public class C6755du extends AbstractC6785x1 {

    /* JADX INFO: renamed from: ix */
    private static AtomicReference<Object> f18647ix = new AtomicReference<>();

    /* JADX INFO: renamed from: ck */
    protected int[] f18648ck;

    /* JADX INFO: renamed from: fa */
    protected char f18649fa;

    /* JADX INFO: renamed from: jd */
    protected char[] f18650jd;

    /* JADX INFO: renamed from: ne */
    private int f18651ne;

    /* JADX INFO: renamed from: x6 */
    private int f18652x6;

    /* JADX INFO: renamed from: com.aspose.slides.internal.n9.du$k4 */
    public static class k4 extends C6753ck {

        /* JADX INFO: renamed from: k4 */
        public byte f18653k4;

        public k4(C6755du c6755du) {
            super(c6755du);
            this.f18653k4 = (byte) 0;
        }

        @Override // com.aspose.slides.internal.p294n9.C6753ck, com.aspose.slides.internal.p294n9.AbstractC6760h4
        /* JADX INFO: renamed from: k4 */
        public void mo26629k4() {
            this.f18653k4 = (byte) 0;
            AbstractC6762jd abstractC6762jd = this.f18666kk;
            if (abstractC6762jd != null) {
                abstractC6762jd.mo26768kk();
            }
        }

        @Override // com.aspose.slides.internal.p294n9.C6753ck
        /* JADX INFO: renamed from: x1 */
        public boolean mo26630x1() {
            return (this.f18653k4 & 255) != 0;
        }
    }

    public C6755du(int i) {
        this(i, i);
    }

    /* JADX INFO: renamed from: b3 */
    private static Object m26741b3() {
        if (f18647ix.get() == null) {
            f18647ix.set(new Object());
        }
        return f18647ix.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    @Override // com.aspose.slides.internal.p294n9.AbstractC6785x1
    /* JADX INFO: renamed from: du */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo26731du() {
        int i;
        int i2;
        synchronized (m26741b3()) {
            try {
                if (this.f18780kk == null) {
                    byte[] bArr = new byte[this.f18777c5];
                    synchronized (AbstractC6785x1.f18775h4) {
                        i = 0;
                        AbstractC6785x1.f18774du.seek(this.f18778dy, 0);
                        AbstractC6785x1.f18774du.read(bArr, 0, this.f18777c5);
                    }
                    int iM66781m9 = 0;
                    int i3 = 0;
                    while (iM66781m9 < 65536) {
                        char cM66781m9 = C14069jd.m66781m9(bArr, i3);
                        int i4 = i3 + 2;
                        if (cM66781m9 == 1) {
                            iM66781m9 = C14069jd.m66781m9(bArr, i4);
                            i3 += 4;
                        } else {
                            iM66781m9 = (cM66781m9 >= ' ' || cM66781m9 <= 0) ? iM66781m9 + 1 : iM66781m9 + cM66781m9;
                            i3 = i4;
                        }
                    }
                    int iM66781m92 = C14069jd.m66781m9(bArr, i3);
                    int i5 = i3 + 2;
                    int i6 = 0;
                    int i7 = i5;
                    while (iM66781m92 < 65536) {
                        char cM66781m92 = C14069jd.m66781m9(bArr, i7);
                        int i8 = i7 + 2;
                        if (cM66781m92 == 1) {
                            iM66781m92 = C14069jd.m66781m9(bArr, i8);
                            i7 += 4;
                        } else {
                            if (cM66781m92 >= ' ' || cM66781m92 <= 0) {
                                if (cM66781m92 != 65533) {
                                    int[] iArr = {iM66781m92};
                                    if (mo26625k4(iArr) && this.f18650jd[iArr[0]] != cM66781m92) {
                                        i6++;
                                    }
                                }
                                iM66781m92++;
                            } else {
                                iM66781m92 += cM66781m92;
                            }
                            i7 = i8;
                        }
                    }
                    int i9 = i6 * 2;
                    char[] cArr = new char[i9];
                    int iM66781m93 = C14069jd.m66781m9(bArr, i3);
                    boolean z = false;
                    int i10 = 0;
                    while (iM66781m93 < 65536) {
                        char cM66781m93 = C14069jd.m66781m9(bArr, i5);
                        int i11 = i5 + 2;
                        if (cM66781m93 == 1) {
                            iM66781m93 = C14069jd.m66781m9(bArr, i11);
                            i5 += 4;
                            i2 = i;
                        } else {
                            if (cM66781m93 < ' ' && cM66781m93 > 0) {
                                iM66781m93 += cM66781m93;
                                i2 = i;
                            } else if (cM66781m93 != 65533) {
                                int[] iArr2 = {iM66781m93};
                                if (mo26625k4(iArr2)) {
                                    i2 = i;
                                    char[] cArr2 = this.f18650jd;
                                    int i12 = iArr2[i2];
                                    if (cArr2[i12] != cM66781m93) {
                                        if (i12 != iM66781m93) {
                                            z = true;
                                        }
                                        int i13 = i10 + 1;
                                        cArr[i10] = (char) i12;
                                        i10 += 2;
                                        cArr[i13] = cM66781m93;
                                    }
                                } else {
                                    i2 = i;
                                }
                                iM66781m93++;
                            }
                            i5 = i11;
                        }
                        i = i2;
                    }
                    int i14 = i;
                    if (z) {
                        int i15 = i14;
                        while (i15 < i9 - 2) {
                            char c = cArr[i15];
                            int i16 = i15 + 2;
                            int i17 = i15;
                            for (int i18 = i16; i18 < i9; i18 += 2) {
                                char c2 = cArr[i18];
                                if (c > c2) {
                                    i17 = i18;
                                    c = c2;
                                }
                            }
                            if (i17 != i15) {
                                char c3 = cArr[i17];
                                cArr[i17] = cArr[i15];
                                cArr[i15] = c3;
                                int i19 = i17 + 1;
                                char c4 = cArr[i19];
                                int i20 = i15 + 1;
                                cArr[i19] = cArr[i20];
                                cArr[i20] = c4;
                            }
                            i15 = i16;
                        }
                    }
                    this.f18782to = cArr;
                    int i21 = i5 + 2;
                    int iM66781m94 = C14069jd.m66781m9(bArr, i21);
                    int i22 = i21;
                    int i23 = i14;
                    while (iM66781m94 < 65536) {
                        char cM66781m94 = C14069jd.m66781m9(bArr, i22);
                        int i24 = i22 + 2;
                        if (cM66781m94 == 1) {
                            iM66781m94 = C14069jd.m66781m9(bArr, i24);
                            i22 += 4;
                        } else {
                            if (cM66781m94 >= ' ' || cM66781m94 <= 0) {
                                if (cM66781m94 > 0) {
                                    i23++;
                                }
                                iM66781m94++;
                            } else {
                                iM66781m94 += cM66781m94;
                            }
                            i22 = i24;
                        }
                    }
                    char[] cArr3 = new char[i23 * 2];
                    int iM66781m95 = C14069jd.m66781m9(bArr, i21);
                    int i25 = i14;
                    while (iM66781m95 < 65536) {
                        int iM66781m96 = C14069jd.m66781m9(bArr, i21);
                        int i26 = i21 + 2;
                        if (iM66781m96 == 1) {
                            iM66781m95 = C14069jd.m66781m9(bArr, i26);
                            i21 += 4;
                        } else {
                            if (iM66781m96 >= 32 || iM66781m96 <= 0) {
                                if (iM66781m96 > 0) {
                                    int[] iArr3 = {iM66781m96};
                                    if (mo26625k4(iArr3)) {
                                        int i27 = i25 + 1;
                                        cArr3[i25] = (char) iM66781m95;
                                        i25 += 2;
                                        cArr3[i27] = this.f18650jd[iArr3[i14]];
                                    }
                                }
                                iM66781m95++;
                            } else {
                                iM66781m95 += iM66781m96;
                            }
                            i21 = i26;
                        }
                    }
                    this.f18780kk = cArr3;
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
        long j = jMo26737x1 * 2;
        if (j <= 2147483647L) {
            return (int) j;
        }
        throw new ArgumentOutOfRangeException("charCount", "Too many characters. The resulting number of bytes is larger than what can be returned as an int.");
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6785x1
    /* JADX INFO: renamed from: to */
    public void mo26723to() {
        if (C14069jd.m66782to(this.f18781m9, 42) != 2) {
            throw new NotSupportedException(C6770qm.m26823k4("No data is available for encoding {0}. For information on defining a custom encoding, see the documentation for the Encoding.RegisterProvider method.", Integer.valueOf(mo26673ks())));
        }
        this.f18652x6 = C14069jd.m66769k4(this.f18781m9, 46);
        this.f18649fa = C14069jd.m66781m9(this.f18781m9, 44);
        if (C7019kk.m27469x1(m26656fa(), C6754dq.class)) {
            ((C6754dq) m26656fa()).f18645kk = this.f18649fa;
        }
        this.f18651ne = 1;
        if ((this.f18652x6 & 65535) > 255) {
            this.f18651ne = 1 + 1;
        }
        this.f18650jd = new char[65536];
        this.f18648ck = new int[65536];
        byte[] bArr = new byte[this.f18777c5];
        synchronized (AbstractC6785x1.f18775h4) {
            AbstractC6785x1.f18774du.seek(this.f18778dy, 0);
            AbstractC6785x1.f18774du.read(bArr, 0, this.f18777c5);
        }
        int[] iArr = {0};
        int iM66781m9 = 0;
        int i = 0;
        while (iM66781m9 < 65536) {
            char cM66781m9 = C14069jd.m66781m9(bArr, i);
            int i2 = i + 2;
            if (cM66781m9 == 1) {
                iM66781m9 = C14069jd.m66781m9(bArr, i2);
                i += 4;
            } else {
                if (cM66781m9 >= ' ' || cM66781m9 <= 0) {
                    if (cM66781m9 == 65535) {
                        iArr[0] = iM66781m9;
                        cM66781m9 = (char) iM66781m9;
                    } else {
                        if (cM66781m9 == 65534 || cM66781m9 != 65533) {
                            iArr[0] = iM66781m9;
                        }
                        iM66781m9++;
                    }
                    if (mo26625k4(iArr)) {
                        if (cM66781m9 != 65534) {
                            this.f18648ck[cM66781m9] = iArr[0] & 65535;
                        }
                        this.f18650jd[iArr[0]] = cM66781m9;
                    }
                    iM66781m9++;
                } else {
                    iM66781m9 += cM66781m9;
                }
                i = i2;
            }
        }
        mo26742k4(this.f18650jd);
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

    public C6755du(int i, int i2) {
        super(i, i2);
        this.f18649fa = (char) 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d A[PHI: r0
      0x005d: PHI (r0v1 int) = (r0v0 int), (r0v0 int), (r0v8 int), (r0v8 int) binds: [B:3:0x000c, B:5:0x0012, B:13:0x003d, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo26621k4(byte[] bArr, int i, int i2, C6753ck c6753ck) {
        int iMo26770x1;
        int i3 = i;
        k4 k4Var = (k4) c6753ck;
        int i4 = i3 + i2;
        AbstractC6762jd abstractC6762jdMo26734k4 = null;
        if (k4Var != null) {
            byte b = k4Var.f18653k4;
            if ((b & 255) <= 0) {
                iMo26770x1 = i2;
            } else {
                if (i2 == 0) {
                    if (!k4Var.m26738h4()) {
                        return 0;
                    }
                    AbstractC6762jd abstractC6762jdM26753to = k4Var.m26753to();
                    abstractC6762jdM26753to.m26765k4(i3, 0);
                    return abstractC6762jdM26753to.mo26770x1(new byte[]{k4Var.f18653k4}, i3);
                }
                int i5 = ((b & 255) << 8) | (bArr[i3] & 255);
                i3++;
                if (this.f18650jd[i5] == 0 && i5 != 0) {
                    AbstractC6762jd abstractC6762jdM26753to2 = k4Var.m26753to();
                    abstractC6762jdM26753to2.m26765k4(i4 - i2, 0);
                    iMo26770x1 = abstractC6762jdM26753to2.mo26770x1(new byte[]{(byte) (i5 >> 8), (byte) i5}, i3) + (i2 - 1);
                    abstractC6762jdMo26734k4 = abstractC6762jdM26753to2;
                }
            }
        }
        while (i3 < i4) {
            int i6 = bArr[i3] & 255;
            int i7 = i3 + 1;
            char[] cArr = this.f18650jd;
            char c = cArr[i6];
            if (c == 65534) {
                int i8 = iMo26770x1 - 1;
                if (i7 < i4) {
                    i6 = (bArr[i7] & 255) | (i6 << 8);
                    i3 += 2;
                    c = cArr[i6];
                    iMo26770x1 = i8;
                } else {
                    if (k4Var != null && !k4Var.m26738h4()) {
                        return i8;
                    }
                    c = 0;
                    i3 = i7;
                }
            } else {
                i3 = i7;
            }
            if (c == 0 && i6 != 0) {
                if (abstractC6762jdMo26734k4 == null) {
                    abstractC6762jdMo26734k4 = k4Var == null ? m26656fa().mo26734k4() : k4Var.m26753to();
                    abstractC6762jdMo26734k4.m26765k4(i4 - i2, 0);
                }
                iMo26770x1 = abstractC6762jdMo26734k4.mo26770x1(i6 < 256 ? new byte[]{(byte) i6} : new byte[]{(byte) (i6 >> 8), (byte) i6}, i3) + (iMo26770x1 - 1);
            }
        }
        return iMo26770x1;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6778um, com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: x1 */
    public AbstractC6760h4 mo26628x1() {
        return new k4(this);
    }

    public C6755du(int i, int i2, AbstractC6769ne abstractC6769ne, AbstractC6751c5 abstractC6751c5) {
        super(i, i2, abstractC6769ne, abstractC6751c5);
        this.f18649fa = (char) 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0114 A[SYNTHETIC] */
    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo26622k4(byte[] bArr, int i, int i2, char[] cArr, int i3, int i4, C6753ck c6753ck) {
        int length;
        int i5;
        char c;
        int i6;
        byte[] bArr2;
        int i7 = 2;
        k4 k4Var = (k4) c6753ck;
        int i8 = i + i2;
        int i9 = i3 + i4;
        char c2 = 1;
        char c3 = 0;
        AbstractC6762jd abstractC6762jdMo26734k4 = null;
        if (k4Var != null) {
            int i10 = k4Var.f18653k4;
            if ((i10 & 255) <= 0) {
                length = i;
                i5 = i3;
            } else {
                if (i2 == 0) {
                    if (!k4Var.m26738h4()) {
                        return 0;
                    }
                    AbstractC6762jd abstractC6762jdM26753to = k4Var.m26753to();
                    abstractC6762jdM26753to.m26765k4(i, i9);
                    int[] iArr = {i3};
                    boolean zM26767k4 = abstractC6762jdM26753to.m26767k4(new byte[]{k4Var.f18653k4}, i, cArr, iArr);
                    int i11 = iArr[0];
                    if (!zM26767k4) {
                        m26727x1((C6753ck) k4Var, true);
                    }
                    k4Var.f18653k4 = (byte) 0;
                    return i11 - i3;
                }
                int i12 = ((i10 & 255) << 8) | (bArr[i] & 255);
                length = i + 1;
                char c4 = this.f18650jd[i12];
                if (c4 != 0 || i12 == 0) {
                    if (i3 >= i9) {
                        m26727x1((C6753ck) k4Var, true);
                    }
                    i5 = i3 + 1;
                    cArr[i3] = c4;
                } else {
                    abstractC6762jdMo26734k4 = k4Var.m26753to();
                    abstractC6762jdMo26734k4.m26765k4(i8 - i2, i9);
                    byte[] bArr3 = {(byte) (i12 >> 8), (byte) i12};
                    int[] iArr2 = {i3};
                    boolean zM26767k42 = abstractC6762jdMo26734k4.m26767k4(bArr3, length, cArr, iArr2);
                    i5 = iArr2[0];
                    if (!zM26767k42) {
                        m26727x1((C6753ck) k4Var, true);
                    }
                }
            }
        }
        while (true) {
            if (length >= i8) {
                c = c3;
                break;
            }
            int i13 = bArr[length] & 255;
            int i14 = length + 1;
            char[] cArr2 = this.f18650jd;
            c = c3;
            char c5 = cArr2[i13];
            int i15 = i7;
            if (c5 == 65534) {
                if (i14 >= i8) {
                    if (k4Var != null && !k4Var.m26738h4()) {
                        k4Var.f18653k4 = (byte) i13;
                        length = i14;
                        break;
                    }
                    c5 = c;
                    length = i14;
                    if (c5 != 0) {
                    }
                } else {
                    i13 = (i13 << 8) | (bArr[i14] & 255);
                    length += 2;
                    c5 = cArr2[i13];
                    if (c5 != 0) {
                        i6 = i15;
                        if (i5 < i9) {
                        }
                    }
                }
            } else {
                length = i14;
                if (c5 != 0 || i13 == 0) {
                    i6 = i15;
                    if (i5 < i9) {
                        length = i13 >= 256 ? length - 2 : length - 1;
                        m26727x1(k4Var, length != i ? c : 1);
                    } else {
                        cArr[i5] = c5;
                        i5++;
                    }
                } else {
                    if (abstractC6762jdMo26734k4 == null) {
                        abstractC6762jdMo26734k4 = k4Var == null ? m26656fa().mo26734k4() : k4Var.m26753to();
                        abstractC6762jdMo26734k4.m26765k4(i8 - i2, i9);
                    }
                    if (i13 < 256) {
                        bArr2 = new byte[1];
                        bArr2[c] = (byte) i13;
                        i6 = i15;
                    } else {
                        i6 = i15;
                        bArr2 = new byte[i6];
                        bArr2[c] = (byte) (i13 >> 8);
                        bArr2[1] = (byte) i13;
                    }
                    int[] iArr3 = {i5};
                    boolean zM26767k43 = abstractC6762jdMo26734k4.m26767k4(bArr2, length, cArr, iArr3);
                    int i16 = iArr3[c];
                    if (zM26767k43) {
                        i5 = i16;
                    } else {
                        length -= bArr2.length;
                        abstractC6762jdMo26734k4.m26769to();
                        m26727x1(k4Var, length != i ? c : 1);
                        c2 = c;
                        i5 = i16;
                    }
                }
                c3 = c;
                i7 = i6;
            }
        }
        c2 = c;
        if (k4Var != null) {
            if (c2 == 0) {
                k4Var.f18653k4 = c;
            }
            k4Var.f18640du = length - i;
        }
        return i5 - i3;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26623k4(char[] cArr, int i, int i2, C6780uz c6780uz) {
        char c;
        AbstractC6761ix abstractC6761ixMo26736k4;
        if (c6780uz != null) {
            c = c6780uz.f18747kk;
            if (c6780uz.m26813kk() && c6780uz.m26814x1().mo26762kk() > 0) {
                throw new ArgumentException(C6770qm.m26824k4("Must complete Convert() operation or call Encoder.Reset() before calling GetBytes() or GetByteCount(). Encoder '{0}' fallback '{1}'.", mo26653c5(), C14067j2.m66727k4(c6780uz.m26811k4())));
            }
        } else {
            c = 0;
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
            int i5 = this.f18648ck[cM26755h4] & 65535;
            if (i5 != 0 || cM26755h4 == 0) {
                i4 = i5 >= 256 ? i4 + 2 : i4 + 1;
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

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0097, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b7  */
    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo26624k4(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4, C6780uz c6780uz) {
        AbstractC6761ix abstractC6761ixMo26736k4;
        int i5;
        char cM26755h4;
        int i6;
        int i7 = i + i2;
        int i8 = i3 + i4;
        boolean z = true;
        if (c6780uz != null) {
            char c = c6780uz.f18747kk;
            abstractC6761ixMo26736k4 = c6780uz.m26814x1();
            abstractC6761ixMo26736k4.m26758k4(i, i7, c6780uz, true);
            if (!c6780uz.f18749to || abstractC6761ixMo26736k4.mo26762kk() <= 0) {
                if (c > 0) {
                    int[] iArr = {i};
                    abstractC6761ixMo26736k4.m26761k4(c, cArr, iArr);
                    i5 = iArr[0];
                }
                int i9 = i3;
                while (true) {
                    cM26755h4 = abstractC6761ixMo26736k4 != null ? (char) 0 : abstractC6761ixMo26736k4.m26755h4();
                    if (cM26755h4 != 0 && i5 >= i7) {
                        break;
                    }
                    if (cM26755h4 == 0) {
                        cM26755h4 = cArr[i5];
                        i5++;
                    }
                    int i10 = this.f18648ck[cM26755h4];
                    i6 = 65535 & i10;
                    if (i6 != 0 && cM26755h4 != 0) {
                        if (abstractC6761ixMo26736k4 == null) {
                            abstractC6761ixMo26736k4 = m26654ck().mo26736k4();
                            abstractC6761ixMo26736k4.m26758k4(i7 - i2, i7, c6780uz, true);
                        }
                        int[] iArr2 = {i5};
                        abstractC6761ixMo26736k4.m26761k4(cM26755h4, cArr, iArr2);
                        i5 = iArr2[0];
                    } else if (i6 < 256) {
                        int i11 = i9 + 1;
                        if (i11 >= i8) {
                            if (abstractC6761ixMo26736k4 == null || !abstractC6761ixMo26736k4.f18669h4) {
                                i5--;
                            } else {
                                abstractC6761ixMo26736k4.mo26764x1();
                            }
                            if (i5 != i) {
                            }
                        } else {
                            bArr[i9] = (byte) (i6 >> 8);
                            i9 = i11;
                            bArr[i9] = (byte) (i10 & 255);
                            i9++;
                        }
                    } else {
                        if (i9 >= i8) {
                            if (abstractC6761ixMo26736k4 == null || !abstractC6761ixMo26736k4.f18669h4) {
                                i5--;
                            } else {
                                abstractC6761ixMo26736k4.mo26764x1();
                            }
                            if (i5 != i) {
                            }
                        }
                        bArr[i9] = (byte) (i10 & 255);
                        i9++;
                    }
                }
                m26728x1(c6780uz, z);
                if (c6780uz != null) {
                    if (abstractC6761ixMo26736k4 != null && !abstractC6761ixMo26736k4.f18668du) {
                        c6780uz.f18747kk = (char) 0;
                    }
                    c6780uz.f18745du = i5 - i;
                }
                return i9 - i3;
            }
            throw new ArgumentException(C6770qm.m26824k4("Must complete Convert() operation or call Encoder.Reset() before calling GetBytes() or GetByteCount(). Encoder '{0}' fallback '{1}'.", mo26653c5(), C14067j2.m66727k4(c6780uz.m26811k4())));
        }
        abstractC6761ixMo26736k4 = null;
        i5 = i;
        int i92 = i3;
        while (true) {
            if (abstractC6761ixMo26736k4 != null) {
            }
            if (cM26755h4 != 0) {
                if (cM26755h4 == 0) {
                }
                int i102 = this.f18648ck[cM26755h4];
                i6 = 65535 & i102;
                if (i6 != 0) {
                }
                if (i6 < 256) {
                }
            }
        }
        m26728x1(c6780uz, z);
        if (c6780uz != null) {
        }
        return i92 - i3;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo26742k4(char[] cArr) {
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo26625k4(int[] iArr) {
        return true;
    }
}
