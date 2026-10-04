package com.aspose.slides.internal.p473w9;

import com.aspose.slides.exceptions.ApplicationException;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p505xn.C12567ne;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.words.WarningType;
import com.google.common.base.Ascii;

/* JADX INFO: renamed from: com.aspose.slides.internal.w9.k4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11914k4 {

    /* JADX INFO: renamed from: jd */
    private static final int[] f40123jd = m55806to();

    /* JADX INFO: renamed from: c5 */
    private int[] f40124c5;

    /* JADX INFO: renamed from: du */
    private final C11916x1 f40126du;

    /* JADX INFO: renamed from: dy */
    private final k4 f40127dy;

    /* JADX INFO: renamed from: h4 */
    private final k4 f40128h4;

    /* JADX INFO: renamed from: k4 */
    private int f40129k4;

    /* JADX INFO: renamed from: kk */
    private final int f40130kk;

    /* JADX INFO: renamed from: m9 */
    private final k4 f40131m9;

    /* JADX INFO: renamed from: to */
    private final double f40132to;

    /* JADX INFO: renamed from: x1 */
    private boolean f40133x1 = false;

    /* JADX INFO: renamed from: ck */
    private long f40125ck = ((((long) AbstractC12002ck.m56311k4(137224)) & 4294967295L) / 8) & 4294967295L;

    /* JADX INFO: renamed from: com.aspose.slides.internal.w9.k4$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: du */
        public byte[] f40134du;

        /* JADX INFO: renamed from: h4 */
        public String f40135h4;

        /* JADX INFO: renamed from: k4 */
        public long f40136k4;

        /* JADX INFO: renamed from: kk */
        public long f40137kk;

        /* JADX INFO: renamed from: to */
        public long f40138to;

        /* JADX INFO: renamed from: x1 */
        public long f40139x1;

        private k4() {
        }

        /* JADX INFO: renamed from: k4 */
        public final void m55813k4() {
            C3152yj c3152yj = new C3152yj(this.f40134du);
            try {
                AbstractC12002ck abstractC12002ckM56312k4 = AbstractC12002ck.m56312k4(c3152yj);
                try {
                    abstractC12002ckM56312k4.m56340k4(this.f40135h4, C3977ck.m15681jd());
                    abstractC12002ckM56312k4.dispose();
                } catch (Throwable th) {
                    if (abstractC12002ckM56312k4 != null) {
                        abstractC12002ckM56312k4.dispose();
                    }
                    throw th;
                }
            } finally {
                c3152yj.dispose();
            }
        }

        /* JADX INFO: renamed from: x1 */
        public final void m55814x1() {
            this.f40134du = null;
        }
    }

    static {
        m55806to();
    }

    public C11914k4(C11916x1 c11916x1, int i) {
        this.f40128h4 = new k4();
        this.f40131m9 = new k4();
        this.f40127dy = new k4();
        this.f40130kk = c11916x1.m55817k4();
        this.f40132to = c11916x1.m55824x1();
        this.f40126du = c11916x1;
        this.f40129k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    private byte m55792k4(int i, int i2) {
        k4 k4Var = this.f40127dy;
        long j = (k4Var.f40138to - (k4Var.f40137kk * ((long) i2))) + ((long) i);
        byte[] bArr = k4Var.f40134du;
        return j > ((long) (bArr.length + (-1))) ? bArr[bArr.length - 1] : bArr[(int) j];
    }

    /* JADX INFO: renamed from: kk */
    private void m55805kk() {
        byte b;
        for (int i = 0; i < (this.f40128h4.f40139x1 & 4294967295L); i++) {
            for (int i2 = 0; i2 < (this.f40128h4.f40136k4 & 4294967295L); i2++) {
                if (this.f40126du.m55822k4(i2, i)) {
                    byte[] bArrM55804k4 = m55804k4(this.f40128h4, i2, i);
                    byte[] bArrM55804k42 = m55804k4(this.f40131m9, i2, i);
                    int iM67482k4 = (C14116yg.m67482k4((bArrM55804k4[2] & 255) - (bArrM55804k42[2] & 255)) + (C14116yg.m67482k4((bArrM55804k4[1] & 255) - (bArrM55804k42[1] & 255)) + C14116yg.m67482k4((bArrM55804k4[0] & 255) - (bArrM55804k42[0] & 255)))) / 6;
                    if (m55793k4(bArrM55804k4) <= m55793k4(bArrM55804k42)) {
                        iM67482k4 += 128;
                    }
                    b = (byte) iM67482k4;
                } else {
                    b = -1;
                }
                m55795k4(i2, i, b);
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private static int[] m55806to() {
        int[] iArr = new int[256];
        for (int i = 0; i < 128; i++) {
            int i2 = 255 - (i * 2);
            iArr[i] = C12003du.m56397k4(255, i2, i2).m56506h4();
            iArr[i + 128] = C12003du.m56397k4(i2, i2, 255).m56506h4();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: x1 */
    private int m55807x1(int i, int i2) {
        return this.f40124c5[(int) (((((((long) i2) * (this.f40128h4.f40136k4 & 4294967295L)) & 4294967295L) + ((long) i)) * 3) + 2)];
    }

    /* JADX INFO: renamed from: k4 */
    private float m55793k4(byte[] bArr) {
        return ((((byte) Math.max(bArr[0] & 255, Math.max(bArr[1] & 255, bArr[2] & 255))) & 255) + (((byte) Math.min(bArr[0] & 255, Math.min(bArr[1] & 255, bArr[2] & 255))) & 255)) / 510.0f;
    }

    /* JADX INFO: renamed from: x1 */
    private int m55808x1(int i, int i2, int i3) {
        return this.f40124c5[(int) (((((((long) i2) * (this.f40128h4.f40136k4 & 4294967295L)) & 4294967295L) + ((long) i)) * 3) + ((long) i3))];
    }

    /* JADX INFO: renamed from: k4 */
    private void m55794k4() {
        this.f40127dy.m55814x1();
        this.f40128h4.m55814x1();
        this.f40131m9.m55814x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m55809x1() {
        this.f40127dy.m55813k4();
        this.f40128h4.m55813k4();
        this.f40131m9.m55813k4();
    }

    /* JADX INFO: renamed from: k4 */
    private void m55795k4(int i, int i2, byte b) {
        k4 k4Var = this.f40127dy;
        long j = (k4Var.f40138to - (k4Var.f40137kk * ((long) i2))) + ((long) i);
        byte[] bArr = k4Var.f40134du;
        if (j < bArr.length) {
            bArr[(int) j] = b;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m55810x1(C12009k4 c12009k4, C12009k4 c12009k42) {
        C12009k4[] c12009k4Arr = {c12009k4};
        m55803k4(c12009k4Arr, 137224);
        C12009k4 c12009k43 = c12009k4Arr[0];
        C12009k4[] c12009k4Arr2 = {c12009k42};
        m55803k4(c12009k4Arr2, 137224);
        c12009k43 = c12009k4Arr2[0];
        C3152yj c3152yj = new C3152yj();
        try {
            c12009k43.m56333k4(c3152yj, C3977ck.m15682kk());
            this.f40128h4.f40134du = c3152yj.toArray();
            c3152yj.close();
            c3152yj.dispose();
            c12009k43.dispose();
            c3152yj = new C3152yj();
            try {
                c12009k43.m56333k4(c3152yj, C3977ck.m15682kk());
                this.f40131m9.f40134du = c3152yj.toArray();
                c3152yj.close();
                c3152yj.dispose();
                c12009k43.dispose();
                m55799k4(this.f40128h4);
                m55799k4(this.f40131m9);
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m55796k4(int i, int i2, int i3) {
        this.f40124c5[(int) (((((((long) i2) * (this.f40128h4.f40136k4 & 4294967295L)) & 4294967295L) + ((long) i)) * 3) + 2)] = i3;
    }

    /* JADX INFO: renamed from: k4 */
    private void m55797k4(int i, int i2, int i3, int i4) {
        this.f40124c5[(int) (((((((long) i2) * (this.f40128h4.f40136k4 & 4294967295L)) & 4294967295L) + ((long) i)) * 3) + ((long) i3))] = i4;
    }

    /* JADX INFO: renamed from: k4 */
    private void m55798k4(long j, long j2) {
        k4 k4Var = this.f40127dy;
        k4Var.f40136k4 = j;
        k4Var.f40139x1 = j2;
        k4Var.f40137kk = j;
        int[] iArr = f40123jd;
        long length = (((((long) iArr.length) & 4294967295L) * 4) & 4294967295L) + 54;
        k4Var.f40138to = length & 4294967295L;
        if ((((j & 4294967295L) % 4) & 4294967295L) > 0) {
            k4Var.f40137kk = ((j & 4294967295L) + ((4 - (((j & 4294967295L) % 4) & 4294967295L)) & 4294967295L)) & 4294967295L;
        }
        long j3 = (length & 4294967295L) + (((j2 & 4294967295L) * (k4Var.f40137kk & 4294967295L)) & 4294967295L);
        long j4 = j3 & 4294967295L;
        long j5 = j3 & 4294967295L;
        k4Var.f40134du = new byte[(int) j5];
        byte[] bArrM66785x1 = C14069jd.m66785x1(19778);
        System.arraycopy(bArrM66785x1, 0, this.f40127dy.f40134du, 0, bArrM66785x1.length);
        byte[] bArrM66776k4 = C14069jd.m66776k4(j4);
        System.arraycopy(bArrM66776k4, 0, this.f40127dy.f40134du, 2, bArrM66776k4.length);
        byte[] bArrM66776k42 = C14069jd.m66776k4(this.f40127dy.f40138to & 4294967295L);
        System.arraycopy(bArrM66776k42, 0, this.f40127dy.f40134du, 10, bArrM66776k42.length);
        this.f40127dy.f40134du[14] = 40;
        byte[] bArrM66776k43 = C14069jd.m66776k4(j);
        System.arraycopy(bArrM66776k43, 0, this.f40127dy.f40134du, 18, bArrM66776k43.length);
        byte[] bArrM66776k44 = C14069jd.m66776k4(j2);
        System.arraycopy(bArrM66776k44, 0, this.f40127dy.f40134du, 22, bArrM66776k44.length);
        byte[] bArr = this.f40127dy.f40134du;
        bArr[26] = 1;
        bArr[28] = 8;
        byte[] bArrM66785x12 = C14069jd.m66785x1(3780);
        System.arraycopy(bArrM66785x12, 0, this.f40127dy.f40134du, 38, bArrM66785x12.length);
        byte[] bArrM66785x13 = C14069jd.m66785x1(3780);
        System.arraycopy(bArrM66785x13, 0, this.f40127dy.f40134du, 42, bArrM66785x13.length);
        byte[] bArrM66776k45 = C14069jd.m66776k4(((long) iArr.length) & 4294967295L);
        System.arraycopy(bArrM66776k45, 0, this.f40127dy.f40134du, 46, bArrM66776k45.length);
        byte[] bArrM66776k46 = C14069jd.m66776k4(((long) iArr.length) & 4294967295L);
        System.arraycopy(bArrM66776k46, 0, this.f40127dy.f40134du, 50, bArrM66776k46.length);
        int i = 0;
        while (true) {
            int[] iArr2 = f40123jd;
            if (i < iArr2.length) {
                byte[] bArrM66785x14 = C14069jd.m66785x1(iArr2[i]);
                System.arraycopy(bArrM66785x14, 0, this.f40127dy.f40134du, (i * 4) + 54, bArrM66785x14.length);
                i++;
            } else {
                k4 k4Var2 = this.f40127dy;
                k4Var2.f40138to = (j5 - (k4Var2.f40137kk & 4294967295L)) & 4294967295L;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m55799k4(k4 k4Var) {
        k4Var.f40136k4 = C14069jd.m66784x1(k4Var.f40134du, 18);
        k4Var.f40139x1 = C14069jd.m66784x1(k4Var.f40134du, 22);
        long j = k4Var.f40136k4 * this.f40125ck;
        k4Var.f40137kk = j;
        if (j % 4 > 0) {
            k4Var.f40137kk = (4 - (j % 4)) + j;
        }
        k4Var.f40138to = ((k4Var.f40139x1 - 1) * k4Var.f40137kk) + C14069jd.m66784x1(k4Var.f40134du, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02e4  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m55800k4(k4 k4Var, int i) {
        float f;
        int i2;
        char c;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        long j;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        if (this.f40124c5 == null) {
            this.f40124c5 = new int[((int) (k4Var.f40136k4 * k4Var.f40139x1)) * 3];
        }
        double d = this.f40132to;
        int i41 = (int) ((255.0d * d) / 3.0d);
        float f2 = (((float) d) * 4.0f) + 1.0f;
        int i42 = 0;
        int i43 = 0;
        while (true) {
            long j2 = i43;
            if (j2 >= k4Var.f40136k4) {
                return;
            }
            int i44 = i42;
            while (true) {
                long j3 = i44;
                if (j3 < k4Var.f40139x1) {
                    byte[] bArrM55804k4 = m55804k4(k4Var, i43, i44);
                    int i45 = bArrM55804k4[i42] & 255;
                    int i46 = i45 * 12;
                    int i47 = i42;
                    int i48 = bArrM55804k4[1] & 255;
                    int i49 = i48 * 12;
                    int i50 = bArrM55804k4[2] & 255;
                    int i51 = i50 * 12;
                    if (i43 > 0) {
                        c = 1;
                        byte[] bArrM55804k42 = m55804k4(k4Var, i43 - 1, i44);
                        f = f2;
                        i10 = bArrM55804k42[i47] & 255;
                        i2 = i41;
                        i6 = bArrM55804k42[1] & 255;
                        i8 = bArrM55804k42[2] & 255;
                        i3 = (i10 * 2) + i46;
                        i4 = (i6 * 2) + i49;
                        i5 = (i8 * 2) + i51;
                        int i52 = i45 > i10 ? i10 : i45;
                        if (i45 >= i10) {
                            i10 = i45;
                        }
                        int i53 = i48 > i6 ? i6 : i48;
                        if (i48 >= i6) {
                            i6 = i48;
                        }
                        int i54 = i50 > i8 ? i8 : i50;
                        if (i50 >= i8) {
                            i8 = i50;
                        }
                        i11 = i52;
                        i7 = i53;
                        i9 = i54;
                    } else {
                        f = f2;
                        i2 = i41;
                        c = 1;
                        i3 = (i45 * 2) + i46;
                        i4 = (i48 * 2) + i49;
                        i5 = (i50 * 2) + i51;
                        i6 = i48;
                        i7 = i6;
                        i8 = i50;
                        i9 = i8;
                        i10 = i45;
                        i11 = i10;
                    }
                    if (i44 > 0) {
                        byte[] bArrM55804k43 = m55804k4(k4Var, i43, i44 - 1);
                        i12 = i48;
                        j = j2;
                        int i55 = bArrM55804k43[i47] & 255;
                        int i56 = bArrM55804k43[c] & 255;
                        int i57 = bArrM55804k43[2] & 255;
                        int i58 = (i55 * 2) + i3;
                        i13 = (i56 * 2) + i4;
                        i14 = (i57 * 2) + i5;
                        int i59 = i11;
                        int i60 = i59 > i55 ? i55 : i59;
                        if (i10 < i55) {
                            i10 = i55;
                        }
                        int i61 = i7;
                        int i62 = i61 > i56 ? i56 : i61;
                        if (i6 < i56) {
                            i6 = i56;
                        }
                        int i63 = i9;
                        int i64 = i63 > i57 ? i57 : i63;
                        if (i8 < i57) {
                            i8 = i57;
                        }
                        i17 = i58;
                        i16 = i60;
                        i15 = i62;
                        i18 = i64;
                    } else {
                        i12 = i48;
                        j = j2;
                        int i65 = (i45 * 2) + i3;
                        i13 = (i12 * 2) + i4;
                        i14 = (i50 * 2) + i5;
                        i15 = i7;
                        i16 = i11;
                        i17 = i65;
                        i18 = i9;
                    }
                    if (j < k4Var.f40136k4 - 1) {
                        byte[] bArrM55804k44 = m55804k4(k4Var, i43 + 1, i44);
                        int i66 = bArrM55804k44[i47] & 255;
                        int i67 = bArrM55804k44[c] & 255;
                        i19 = i50;
                        int i68 = bArrM55804k44[2] & 255;
                        i20 = (i66 * 2) + i17;
                        i21 = (i67 * 2) + i13;
                        i22 = (i68 * 2) + i14;
                        if (i16 > i66) {
                            i16 = i66;
                        }
                        if (i10 < i66) {
                            i10 = i66;
                        }
                        if (i15 > i67) {
                            i15 = i67;
                        }
                        if (i6 < i67) {
                            i6 = i67;
                        }
                        if (i18 > i68) {
                            i18 = i68;
                        }
                        if (i8 < i68) {
                            i8 = i68;
                        }
                    } else {
                        i19 = i50;
                        i20 = (i45 * 2) + i17;
                        i21 = (i12 * 2) + i13;
                        i22 = (i19 * 2) + i14;
                    }
                    if (j3 < k4Var.f40139x1 - 1) {
                        byte[] bArrM55804k45 = m55804k4(k4Var, i43, i44 + 1);
                        int i69 = bArrM55804k45[i47] & 255;
                        int i70 = bArrM55804k45[c] & 255;
                        int i71 = bArrM55804k45[2] & 255;
                        i23 = (i69 * 2) + i20;
                        i24 = (i70 * 2) + i21;
                        i25 = (i71 * 2) + i22;
                        if (i16 > i69) {
                            i16 = i69;
                        }
                        if (i10 < i69) {
                            i10 = i69;
                        }
                        if (i15 > i70) {
                            i15 = i70;
                        }
                        if (i6 < i70) {
                            i6 = i70;
                        }
                        if (i18 > i71) {
                            i18 = i71;
                        }
                        if (i8 < i71) {
                            i8 = i71;
                        }
                    } else {
                        i23 = (i45 * 2) + i20;
                        i24 = (i12 * 2) + i21;
                        i25 = (i19 * 2) + i22;
                    }
                    if (i43 <= 0 || i44 <= 0) {
                        i26 = i23 + i45;
                        i27 = i24 + i12;
                        i28 = i25 + i19;
                    } else {
                        byte[] bArrM55804k46 = m55804k4(k4Var, i43 - 1, i44 - 1);
                        int i72 = bArrM55804k46[i47] & 255;
                        int i73 = i24;
                        int i74 = bArrM55804k46[c] & 255;
                        int i75 = bArrM55804k46[2] & 255;
                        i26 = i23 + i72;
                        i27 = i73 + i74;
                        i28 = i25 + i75;
                        if (i16 > i72) {
                            i16 = i72;
                        }
                        if (i10 < i72) {
                            i10 = i72;
                        }
                        if (i15 > i74) {
                            i15 = i74;
                        }
                        if (i6 < i74) {
                            i6 = i74;
                        }
                        if (i18 > i75) {
                            i18 = i75;
                        }
                        if (i8 < i75) {
                            i8 = i75;
                        }
                    }
                    if (j >= k4Var.f40136k4 - 1 || i44 <= 0) {
                        i29 = i26 + i45;
                        i30 = i27 + i12;
                        i31 = i28 + i19;
                    } else {
                        byte[] bArrM55804k47 = m55804k4(k4Var, i43 + 1, i44 - 1);
                        int i76 = bArrM55804k47[i47] & 255;
                        int i77 = bArrM55804k47[c] & 255;
                        int i78 = i26;
                        int i79 = bArrM55804k47[2] & 255;
                        i29 = i78 + i76;
                        i30 = i27 + i77;
                        i31 = i28 + i79;
                        if (i16 > i76) {
                            i16 = i76;
                        }
                        if (i10 < i76) {
                            i10 = i76;
                        }
                        if (i15 > i77) {
                            i15 = i77;
                        }
                        if (i6 < i77) {
                            i6 = i77;
                        }
                        if (i18 > i79) {
                            i18 = i79;
                        }
                        if (i8 < i79) {
                            i8 = i79;
                        }
                    }
                    if (i43 > 0) {
                        int i80 = i29;
                        if (j3 < k4Var.f40139x1 - 1) {
                            byte[] bArrM55804k48 = m55804k4(k4Var, i43 - 1, i44 + 1);
                            int i81 = bArrM55804k48[i47] & 255;
                            int i82 = bArrM55804k48[c] & 255;
                            int i83 = bArrM55804k48[2] & 255;
                            i33 = i80 + i81;
                            i34 = i30 + i82;
                            i35 = i31 + i83;
                            if (i16 > i81) {
                                i16 = i81;
                            }
                            if (i10 < i81) {
                                i10 = i81;
                            }
                            if (i15 > i82) {
                                i15 = i82;
                            }
                            if (i6 < i82) {
                                i6 = i82;
                            }
                            if (i18 > i83) {
                                i18 = i83;
                            }
                            if (i8 < i83) {
                                i8 = i83;
                            }
                            if (j < k4Var.f40136k4 - 1 || j3 >= k4Var.f40139x1 - 1) {
                                i36 = i33 + i45;
                                i37 = i34 + i12;
                                i38 = i35 + i19;
                            } else {
                                byte[] bArrM55804k49 = m55804k4(k4Var, i43 + 1, i44 + 1);
                                int i84 = bArrM55804k49[i47] & 255;
                                int i85 = bArrM55804k49[c] & 255;
                                int i86 = bArrM55804k49[2] & 255;
                                i36 = i33 + i84;
                                i37 = i34 + i85;
                                i38 = i35 + i86;
                                if (i16 > i84) {
                                    i16 = i84;
                                }
                                if (i10 < i84) {
                                    i10 = i84;
                                }
                                if (i15 > i85) {
                                    i15 = i85;
                                }
                                if (i6 < i85) {
                                    i6 = i85;
                                }
                                if (i18 > i86) {
                                    i18 = i86;
                                }
                                if (i8 < i86) {
                                    i8 = i86;
                                }
                            }
                            int i87 = i36 / 24;
                            int i88 = i37 / 24;
                            int i89 = i38 / 24;
                            i39 = ((int) (((i10 - i16) * f) / 2.0f)) + i2;
                            i40 = ((int) (((i6 - i15) * f) / 2.0f)) + i2;
                            int i90 = ((int) (((i8 - i18) * f) / 2.0f)) + i2;
                            if (i39 > 255) {
                                i39 = 255;
                            }
                            if (i40 > 255) {
                                i40 = 255;
                            }
                            int i91 = i90 <= 255 ? 255 : i90;
                            m55797k4(i43, i44, i, (i88 << 8) | i87 | (i89 << 16));
                            int iM55807x1 = m55807x1(i43, i44);
                            m55796k4(i43, i44, (C14116yg.m67483k4((65280 & iM55807x1) >> 8, i40) << 8) | C14116yg.m67483k4(iM55807x1 & 255, i39) | (C14116yg.m67483k4((iM55807x1 & WarningType.MINOR_FORMATTING_LOSS_CATEGORY) >> 16, i91) << 16));
                            i44++;
                            i42 = i47;
                            f2 = f;
                            i41 = i2;
                            j2 = j;
                        } else {
                            i32 = i80;
                        }
                    } else {
                        i32 = i29;
                    }
                    i33 = i32 + i45;
                    i34 = i30 + i12;
                    i35 = i31 + i19;
                    if (j < k4Var.f40136k4 - 1) {
                        i36 = i33 + i45;
                        i37 = i34 + i12;
                        i38 = i35 + i19;
                    }
                    int i872 = i36 / 24;
                    int i882 = i37 / 24;
                    int i892 = i38 / 24;
                    i39 = ((int) (((i10 - i16) * f) / 2.0f)) + i2;
                    i40 = ((int) (((i6 - i15) * f) / 2.0f)) + i2;
                    int i902 = ((int) (((i8 - i18) * f) / 2.0f)) + i2;
                    if (i39 > 255) {
                    }
                    if (i40 > 255) {
                    }
                    if (i902 <= 255) {
                    }
                    m55797k4(i43, i44, i, (i882 << 8) | i872 | (i892 << 16));
                    int iM55807x12 = m55807x1(i43, i44);
                    m55796k4(i43, i44, (C14116yg.m67483k4((65280 & iM55807x12) >> 8, i40) << 8) | C14116yg.m67483k4(iM55807x12 & 255, i39) | (C14116yg.m67483k4((iM55807x12 & WarningType.MINOR_FORMATTING_LOSS_CATEGORY) >> 16, i91) << 16));
                    i44++;
                    i42 = i47;
                    f2 = f;
                    i41 = i2;
                    j2 = j;
                }
            }
            i43++;
            i41 = i41;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m55811k4(String str, String str2, String str3) {
        this.f40128h4.f40135h4 = str2;
        this.f40131m9.f40135h4 = str;
        this.f40127dy.f40135h4 = str3;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m55801k4(int i, int i2, int i3, k4 k4Var) {
        k4 k4Var2 = k4Var;
        if (m55802k4(i3, k4Var2, i, i2, i, i2)) {
            return true;
        }
        int i4 = (int) k4Var2.f40136k4;
        int i5 = (int) k4Var2.f40139x1;
        int i6 = 1;
        while (true) {
            C11914k4 c11914k4 = this;
            if (i6 > c11914k4.f40130kk) {
                return false;
            }
            int i7 = i + i6;
            int i8 = i7 > i4 ? i4 - 1 : i7;
            int i9 = i2 - i6;
            if (i9 >= 0) {
                int i10 = i - i6;
                int i11 = i10 < 0 ? 0 : i10;
                while (i11 < i8) {
                    int i12 = i9;
                    if (c11914k4.m55802k4(i3, k4Var2, i, i2, i11, i9)) {
                        return true;
                    }
                    i11++;
                    c11914k4 = this;
                    k4Var2 = k4Var;
                    i9 = i12;
                }
            }
            int i13 = i9;
            int i14 = i2 + i6;
            if (i14 < i5) {
                int i15 = i - i6;
                int i16 = i15 < 0 ? 0 : i15;
                while (i16 < i8) {
                    int i17 = i14;
                    if (m55802k4(i3, k4Var, i, i2, i16, i14)) {
                        return true;
                    }
                    i16++;
                    i14 = i17;
                }
            }
            int i18 = i14;
            int i19 = i - i6;
            if (i19 >= 0) {
                int i20 = i18 - 1;
                if (i20 >= i5) {
                    i20 = i5 - 1;
                }
                int i21 = i20;
                int i22 = i19 < 0 ? 0 : i19;
                int i23 = i13 + 1;
                if (i23 < 0) {
                    i23 = 0;
                }
                while (i23 < i21) {
                    if (m55802k4(i3, k4Var, i, i2, i22, i23)) {
                        return true;
                    }
                    i23++;
                }
            }
            if (i7 < i4) {
                int i24 = i18 + 1;
                if (i24 >= i5) {
                    i24 = i5 - 1;
                }
                int i25 = i24;
                int i26 = i13 < 0 ? 0 : i13;
                while (i26 < i25) {
                    int i27 = i7;
                    if (m55802k4(i3, k4Var, i, i2, i27, i26)) {
                        return true;
                    }
                    i26++;
                    i7 = i27;
                }
            }
            i6++;
            k4Var2 = k4Var;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m55802k4(int i, k4 k4Var, int i2, int i3, int i4, int i5) {
        byte[] bArrM55804k4 = m55804k4(k4Var, i4, i5);
        int iM55808x1 = m55808x1(i2, i3, i);
        int iM55807x1 = m55807x1(i2, i3);
        int i6 = iM55808x1 & 255;
        int i7 = (iM55808x1 & 65280) >> 8;
        int i8 = (iM55808x1 & WarningType.MINOR_FORMATTING_LOSS_CATEGORY) >> 16;
        int i9 = iM55807x1 & 255;
        int i10 = (65280 & iM55807x1) >> 8;
        int i11 = (iM55807x1 & WarningType.MINOR_FORMATTING_LOSS_CATEGORY) >> 16;
        byte b = bArrM55804k4[0];
        if ((b & 255) >= i6 - i9 && (b & 255) <= i6 + i9) {
            byte b2 = bArrM55804k4[1];
            if ((b2 & 255) >= i7 - i10 && (b2 & 255) <= i7 + i10) {
                byte b3 = bArrM55804k4[2];
                if ((b3 & 255) >= i8 - i11 && (b3 & 255) <= i8 + i11) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m55812k4(C12009k4 c12009k4, C12009k4 c12009k42) {
        if (c12009k4.mo15760yj() != c12009k42.mo15760yj() || c12009k4.mo15757m9() != c12009k42.mo15757m9()) {
            throw new ApplicationException(C14113y2.m67402k4("Wrong image size ({0}x{1} / {2}x{3})", Integer.valueOf(c12009k4.mo15760yj()), Integer.valueOf(c12009k4.mo15757m9()), Integer.valueOf(c12009k42.mo15760yj()), Integer.valueOf(c12009k42.mo15757m9())));
        }
        if (c12009k4.mo15760yj() < 1 || c12009k4.mo15757m9() < 1) {
            throw new ApplicationException(C14113y2.m67402k4("Wrong image size ({0}x{1} / {2}x{3})", Integer.valueOf(c12009k4.mo15760yj()), Integer.valueOf(c12009k4.mo15757m9()), Integer.valueOf(c12009k42.mo15760yj()), Integer.valueOf(c12009k42.mo15757m9())));
        }
        m55810x1(c12009k4, c12009k42);
        k4 k4Var = this.f40128h4;
        m55798k4(k4Var.f40136k4, k4Var.f40139x1);
        m55800k4(this.f40128h4, 0);
        m55800k4(this.f40131m9, 1);
        boolean z = true;
        for (int i = 0; i < (this.f40128h4.f40139x1 & 4294967295L); i++) {
            for (int i2 = 0; i2 < (this.f40128h4.f40136k4 & 4294967295L); i2++) {
                if (!this.f40126du.m55822k4(i2, i)) {
                    if (this.f40129k4 != 0) {
                        m55795k4(i2, i, (byte) -1);
                    }
                } else if (!m55801k4(i2, i, 0, this.f40131m9) || !m55801k4(i2, i, 1, this.f40128h4)) {
                    if (this.f40129k4 == 0) {
                        return false;
                    }
                    m55795k4(i2, i, Ascii.DEL);
                    if (!this.f40133x1) {
                        for (int iM67483k4 = C14116yg.m67483k4(0, i2 - 1); iM67483k4 <= C14116yg.m67492kk(i2 + 1, ((this.f40128h4.f40136k4 & 4294967295L) - 1) & 4294967295L); iM67483k4++) {
                            for (int iM67483k42 = C14116yg.m67483k4(0, i - 1); iM67483k42 <= C14116yg.m67492kk(i + 1, ((this.f40128h4.f40139x1 & 4294967295L) - 1) & 4294967295L); iM67483k42++) {
                                if ((iM67483k4 != i2 || iM67483k42 != i) && iM67483k4 > 0 && iM67483k42 > 0 && (m55792k4(iM67483k4, iM67483k42) & 255) == 0) {
                                    m55795k4(iM67483k4, iM67483k42, (byte) 63);
                                }
                            }
                        }
                    }
                    z = false;
                }
            }
        }
        int i3 = this.f40129k4;
        if (i3 == 1 || (i3 == 2 && !z)) {
            if (this.f40133x1) {
                m55805kk();
            }
            m55809x1();
        }
        m55794k4();
        return z;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m55803k4(C12009k4[] c12009k4Arr, int i) {
        C12009k4 c12009k4 = c12009k4Arr[0];
        if (c12009k4 == null || c12009k4.mo15753jd() == i) {
            return false;
        }
        C12009k4 c12009k42 = new C12009k4(c12009k4Arr[0].mo15760yj(), c12009k4Arr[0].mo15757m9(), i);
        c12009k42.m56332k4(C12567ne.m58657k4(c12009k4Arr[0]), C12567ne.m58660x1(c12009k4Arr[0]));
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k42);
        try {
            abstractC12008jdM56582k4.mo17503k4((AbstractC12002ck) c12009k4Arr[0], 0, 0);
            abstractC12008jdM56582k4.dispose();
            c12009k4Arr[0].dispose();
            c12009k4Arr[0] = c12009k42;
            return true;
        } catch (Throwable th) {
            if (abstractC12008jdM56582k4 != null) {
                abstractC12008jdM56582k4.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m55804k4(k4 k4Var, int i, int i2) {
        long j = (((long) i) * this.f40125ck) + (k4Var.f40138to - (k4Var.f40137kk * ((long) i2)));
        byte[] bArr = k4Var.f40134du;
        return new byte[]{bArr[(int) (2 + j)], bArr[(int) (1 + j)], bArr[(int) j]};
    }
}
