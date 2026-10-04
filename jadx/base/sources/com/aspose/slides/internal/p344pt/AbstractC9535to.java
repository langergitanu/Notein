package com.aspose.slides.internal.p344pt;

import androidx.core.graphics.OooO0OO;
import com.aspose.slides.C22213OooOoOO;
import com.aspose.slides.OooO;
import com.aspose.slides.OooO0o;
import com.aspose.slides.Oooo0;
import com.aspose.slides.internal.p102e8.C3590x1;
import com.aspose.slides.internal.p102e8.OooO00o;
import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p123f5.C3859m9;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3976c5;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p377r9.C9975bv;
import com.aspose.slides.internal.p472w8.C11893c5;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p488x0.C12352x1;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.C14112xw;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.words.ControlChar;
import com.aspose.words.WarningType;

/* JADX INFO: renamed from: com.aspose.slides.internal.pt.to */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9535to extends AbstractC9530rv {
    /* JADX INFO: renamed from: k4 */
    private static long m46697k4(long j, C3856h4 c3856h4, C12007ix c12007ix, int i, int i2, float[] fArr, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        int i8;
        long j2;
        int iOooO00o;
        int i9;
        long j3;
        int i10;
        byte bOooO00o;
        byte bOooO00o2;
        float f;
        long j4;
        if (iArr == null) {
            return 4278190080L;
        }
        long j5 = iArr[i3];
        long jOooO00o = j5 & 4294967295L;
        if (j == 204) {
            float f2 = i;
            if (c12007ix.m56550c5() > f2) {
                float f3 = m46699k4(i2, 0.0f, fArr)[0];
                int i11 = iArr[i3];
                float f4 = i4;
                j2 = 4294967295L;
                float fM67480k4 = C14116yg.m67480k4(f3 - f4);
                if (f3 > f4) {
                    int iOooO0O0 = C22213OooOoOO.OooO0O0(i5, i, i4, 1);
                    if (iOooO0O0 >= iArr.length || iOooO0O0 < 0) {
                        i8 = 1;
                    } else {
                        long j6 = iArr[iOooO0O0];
                        long j7 = j5 & 4294967295L;
                        i8 = 1;
                        float f5 = 1.0f - fM67480k4;
                        long j8 = j6 & 4294967295L;
                        j3 = j5;
                        bOooO00o = OooO0o.OooO00o(((byte) ((j8 >> 16) & 4294967295L)) & 255, fM67480k4, (((byte) ((j7 >> 16) & 4294967295L)) & 255) * f5, 13);
                        bOooO00o2 = OooO0o.OooO00o(((byte) ((j8 >> 8) & 4294967295L)) & 255, fM67480k4, (((byte) ((j7 >> 8) & 4294967295L)) & 255) * f5, 13);
                        f = (((byte) (j3 & 4294967295L)) & 255) * f5;
                        j4 = j6 & 4294967295L;
                        jOooO00o = (((long) (((bOooO00o2 & 255) << 8) & 65280)) | (j3 & 4278190080L) | ((long) (((bOooO00o & 255) << 16) & WarningType.MINOR_FORMATTING_LOSS_CATEGORY)) | ((long) (OooO0o.OooO00o(((byte) j4) & 255, fM67480k4, f, 13) & 255))) & 4294967295L;
                    }
                } else {
                    i8 = 1;
                    j3 = j5;
                    if (f3 < f4 && ((i5 * i) + i4) - 1 < iArr.length && i10 >= 0) {
                        long j9 = iArr[i10];
                        long j10 = j3 & 4294967295L;
                        float f6 = 1.0f - fM67480k4;
                        long j11 = j9 & 4294967295L;
                        bOooO00o = OooO0o.OooO00o(((byte) ((j11 >> 16) & 4294967295L)) & 255, fM67480k4, (((byte) ((j10 >> 16) & 4294967295L)) & 255) * f6, 13);
                        bOooO00o2 = OooO0o.OooO00o(((byte) ((j11 >> 8) & 4294967295L)) & 255, fM67480k4, (((byte) ((j10 >> 8) & 4294967295L)) & 255) * f6, 13);
                        f = (((byte) (j3 & 4294967295L)) & 255) * f6;
                        j4 = j9 & 4294967295L;
                        jOooO00o = (((long) (((bOooO00o2 & 255) << 8) & 65280)) | (j3 & 4278190080L) | ((long) (((bOooO00o & 255) << 16) & WarningType.MINOR_FORMATTING_LOSS_CATEGORY)) | ((long) (OooO0o.OooO00o(((byte) j4) & 255, fM67480k4, f, 13) & 255))) & 4294967295L;
                    }
                }
            } else {
                i8 = 1;
                j2 = 4294967295L;
                if (c12007ix.m56550c5() < f2) {
                    c3856h4.m15519um();
                }
            }
            if (c12007ix.m56575x1() > i6) {
                float f7 = m46699k4(0.0f, i7, fArr)[i8];
                int i12 = iArr[i3];
                float f8 = i5;
                float fM67480k42 = C14116yg.m67480k4(f7 - f8);
                if (f7 > f8) {
                    int iOooO00o2 = Oooo0.OooO00o(i5, i8, i, i4);
                    if (iOooO00o2 < iArr.length && iOooO00o2 >= 0) {
                        i9 = iArr[iOooO00o2];
                        long j12 = jOooO00o & j2;
                        float f9 = 1.0f - fM67480k42;
                        long j13 = i9 & j2;
                        return (((long) (((OooO0o.OooO00o(((byte) ((j13 >> 8) & j2)) & 255, fM67480k42, (((byte) ((j12 >> 8) & j2)) & 255) * f9, 13) & 255) << 8) & 65280)) | ((long) (((OooO0o.OooO00o(((byte) ((j13 >> 16) & j2)) & 255, fM67480k42, (((byte) ((j12 >> 16) & j2)) & 255) * f9, 13) & 255) << 16) & WarningType.MINOR_FORMATTING_LOSS_CATEGORY)) | (jOooO00o & 4278190080L) | ((long) (OooO0o.OooO00o(((byte) (r0 & j2)) & 255, fM67480k42, (((byte) (jOooO00o & j2)) & 255) * f9, 13) & 255))) & j2;
                    }
                } else if (f7 < f8 && (iOooO00o = OooO0OO.OooO00o(i5, 1, i, i4)) < iArr.length && iOooO00o >= 0) {
                    i9 = iArr[iOooO00o];
                    long j122 = jOooO00o & j2;
                    float f92 = 1.0f - fM67480k42;
                    long j132 = i9 & j2;
                    return (((long) (((OooO0o.OooO00o(((byte) ((j132 >> 8) & j2)) & 255, fM67480k42, (((byte) ((j122 >> 8) & j2)) & 255) * f92, 13) & 255) << 8) & 65280)) | ((long) (((OooO0o.OooO00o(((byte) ((j132 >> 16) & j2)) & 255, fM67480k42, (((byte) ((j122 >> 16) & j2)) & 255) * f92, 13) & 255) << 16) & WarningType.MINOR_FORMATTING_LOSS_CATEGORY)) | (jOooO00o & 4278190080L) | ((long) (OooO0o.OooO00o(((byte) (r0 & j2)) & 255, fM67480k42, (((byte) (jOooO00o & j2)) & 255) * f92, 13) & 255))) & j2;
                }
            }
        }
        return jOooO00o;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12007ix m46698k4(C12014ne c12014ne, C3856h4 c3856h4, AbstractC12008jd abstractC12008jd) {
        C12018u4 c12018u4 = new C12018u4(c12014ne.Clone());
        c12018u4.m56771x1(c3856h4.m15538xk());
        return c12018u4.m56749k4(abstractC12008jd);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12009k4 m46700k4(boolean z, C12352x1 c12352x1, C3856h4 c3856h4) {
        if (z) {
            return c12352x1.m57871c5();
        }
        C12009k4 c12009k4 = new C12009k4(c3856h4.m15539yd(), c3856h4.m15461b3());
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
        try {
            abstractC12008jdM56582k4.mo17476du(1);
            abstractC12008jdM56582k4.mo17560kk(7);
            abstractC12008jdM56582k4.mo17508k4(c3856h4.m15479ix(), new C12014ne(0, 0, c3856h4.m15539yd(), c3856h4.m15461b3()));
            abstractC12008jdM56582k4.dispose();
            return c12009k4;
        } catch (Throwable th) {
            if (abstractC12008jdM56582k4 != null) {
                abstractC12008jdM56582k4.dispose();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0338 A[PHI: r12 r36 r39 r62 r63
      0x0338: PHI (r12v23 char) = (r12v3 char), (r12v4 char), (r12v28 char) binds: [B:69:0x031d, B:72:0x0336, B:65:0x02e1] A[DONT_GENERATE, DONT_INLINE]
      0x0338: PHI (r36v4 int) = (r36v1 int), (r36v2 int), (r36v6 int) binds: [B:69:0x031d, B:72:0x0336, B:65:0x02e1] A[DONT_GENERATE, DONT_INLINE]
      0x0338: PHI (r39v9 int) = (r39v6 int), (r39v7 int), (r39v11 int) binds: [B:69:0x031d, B:72:0x0336, B:65:0x02e1] A[DONT_GENERATE, DONT_INLINE]
      0x0338: PHI (r62v5 int) = (r62v1 int), (r62v2 int), (r62v7 int) binds: [B:69:0x031d, B:72:0x0336, B:65:0x02e1] A[DONT_GENERATE, DONT_INLINE]
      0x0338: PHI (r63v11 int) = (r63v7 int), (r63v8 int), (r63v13 int) binds: [B:69:0x031d, B:72:0x0336, B:65:0x02e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x035d  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m46701k4(long j, C12009k4 c12009k4, C12014ne c12014ne, C12014ne c12014ne2, boolean z, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        AbstractC12024x1 c11999ar;
        AbstractC12008jd abstractC12008jdM56582k4;
        C3976c5 c3976c5;
        C12009k4 c12009k42;
        int[] iArr;
        boolean z2;
        C12009k4 c12009k43;
        C3983k4 c3983k4;
        int[] iArr2;
        float f;
        int iOooO00o;
        int iOooO00o2;
        float[] fArr;
        C12018u4 c12018u4;
        float f2;
        int i;
        int i2;
        C3983k4 c3983k42;
        C12009k4 c12009k44;
        Class cls;
        C14112xw c14112xw;
        long j2;
        float f3;
        int i3;
        float[] fArr2;
        int[] iArr3;
        AbstractC12024x1 abstractC12024x1;
        int i4;
        int i5;
        float f4;
        int i6;
        int i7;
        int i8;
        char c;
        int i9;
        int iOooO00o3;
        int iOooO00o4;
        float f5;
        float f6;
        int i10;
        int i11;
        C3983k4 c3983k43;
        C14112xw c14112xw2;
        long j3;
        float f7;
        C12018u4 c12018u42;
        C12009k4 c12009k45;
        float[] fArr3;
        int i12;
        int i13;
        long jM56506h4;
        int i14;
        AbstractC12024x1 abstractC12024x12;
        float[] fArr4;
        int[] iArr4;
        Class cls2;
        boolean zM49088x1 = C9975bv.m49088x1(j);
        AbstractC12024x1 abstractC12024x1M15472dy = c3856h4.m15472dy();
        if (abstractC12024x1M15472dy == null) {
            abstractC12024x1M15472dy = new C11999ar(c3856h4.m15540yj().Clone());
        }
        boolean zM27469x1 = C7019kk.m27469x1(abstractC12024x1M15472dy, C11999ar.class);
        int i15 = (int) j;
        if (i15 == 0) {
            c11999ar = new C11999ar(C12003du.m56460uz().Clone());
        } else {
            if (i15 == 170) {
                return;
            }
            if (i15 == 204) {
                C11893c5 c11893c5Mo17583x1 = abstractC12008jd.mo17583x1();
                C3859m9.m15552k4(c12014ne.Clone(), new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9())).CloneTo(c12014ne);
                C3976c5 c3976c52 = new C3976c5();
                try {
                    c3976c52.m15673x1(3);
                    abstractC12008jd.mo17476du(2);
                    abstractC12008jd.mo17560kk(7);
                    abstractC12008jd.mo17510k4(c12009k4, c12014ne2.Clone(), c12014ne.m56669jd(), c12014ne.m56664ck(), c12014ne.m56663c5(), c12014ne.m56683x1(), 2, c3976c52);
                    c3976c52.dispose();
                    abstractC12008jd.mo17496k4(c11893c5Mo17583x1);
                    return;
                } catch (Throwable th) {
                    c3976c52.dispose();
                    throw th;
                }
            }
            if (i15 == 240) {
                c11999ar = abstractC12024x1M15472dy;
            } else if (i15 != 255) {
                C12018u4 c12018u4Mo17480h4 = abstractC12008jd.mo17480h4();
                c12018u4Mo17480h4.m56771x1(abstractC12008jd.mo17577u4());
                if (c12009k4.mo15753jd() == 2498570 && c12014ne.m56669jd() == 0 && c12014ne.m56664ck() == 0 && c12014ne.m56663c5() == c12009k4.mo15760yj() && c12014ne.m56683x1() == c12009k4.mo15757m9()) {
                    c12009k42 = c12009k4;
                } else {
                    C12014ne c12014neClone = C3859m9.m15552k4(c12014ne.Clone(), new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9())).Clone();
                    C12009k4 c12009k46 = new C12009k4(c12014ne.m56663c5(), c12014ne.m56683x1(), 2498570);
                    abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k46);
                    try {
                        C3976c5 c3976c53 = new C3976c5();
                        try {
                            c3976c53.m15673x1(3);
                            c3976c5 = c3976c53;
                            try {
                                abstractC12008jdM56582k4.mo17511k4((AbstractC12002ck) c12009k4, new C12014ne(0, 0, c12014ne.m56663c5(), c12014ne.m56683x1()), c12014neClone.m56669jd(), c12014neClone.m56664ck(), c12014neClone.m56663c5(), c12014neClone.m56683x1(), 2, c3976c5);
                                c3976c5.dispose();
                                abstractC12008jdM56582k4.dispose();
                                c12009k42 = c12009k46;
                            } catch (Throwable th2) {
                                th = th2;
                                c3976c5.dispose();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            c3976c5 = c3976c53;
                        }
                    } finally {
                    }
                }
                C12007ix c12007ixClone = m46698k4(c12014ne2.Clone(), c3856h4, abstractC12008jd).Clone();
                C12007ix c12007ixClone2 = C12007ix.m56543k4(c12007ixClone.Clone(), new C12007ix(0.0f, 0.0f, c3856h4.m15479ix().mo15760yj(), c3856h4.m15479ix().mo15757m9())).Clone();
                C3983k4 c3983k4M56597k4 = c3856h4.m15479ix().m56597k4(new C12014ne(0, 0, c3856h4.m15479ix().mo15760yj(), c3856h4.m15479ix().mo15757m9()), 3, 2498570);
                c12014ne.m56663c5();
                c12014ne.m56683x1();
                int iMo15760yj = c12009k42.mo15760yj();
                int iMo15757m9 = c12009k42.mo15757m9();
                C3983k4 c3983k4M56597k42 = c12009k42.m56597k4(new C12014ne(0, 0, iMo15760yj, iMo15757m9), 1, 2498570);
                int i16 = iMo15760yj * iMo15757m9;
                int[] iArr5 = new int[i16];
                C3914k4.m15619k4(c3983k4M56597k42.m15721to(), iArr5, 0, i16);
                C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
                int iM15722x1 = c3983k4M56597k4.m15722x1() * c3983k4M56597k4.m15716k4();
                int[] iArr6 = iArr5;
                int[] iArr7 = new int[iM15722x1];
                int[] iArr8 = new int[0];
                C3914k4.m15619k4(c14112xwM15721to, iArr7, 0, iM15722x1);
                int[] iArr9 = (int[]) iArr7.clone();
                if (!zM49088x1 || zM27469x1) {
                    iArr = iArr7;
                    z2 = zM27469x1;
                    c12009k43 = c12009k42;
                    c3983k4 = c3983k4M56597k4;
                    iArr2 = iArr9;
                } else {
                    iArr = iArr7;
                    C12009k4 c12009k47 = new C12009k4(iMo15760yj, iMo15757m9, 2498570);
                    z2 = zM27469x1;
                    abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k47);
                    try {
                        c12009k43 = c12009k42;
                        abstractC12008jdM56582k4.mo17594x1(abstractC12024x1M15472dy, new C12014ne(0, 0, iMo15760yj, iMo15757m9));
                        abstractC12008jdM56582k4.dispose();
                        C3983k4 c3983k4M56597k43 = c12009k47.m56597k4(new C12014ne(0, 0, iMo15760yj, iMo15757m9), 1, 2498570);
                        int iM15716k4 = c3983k4M56597k43.m15716k4() * c3983k4M56597k43.m15722x1();
                        int[] iArr10 = new int[iM15716k4];
                        c3983k4 = c3983k4M56597k4;
                        iArr2 = iArr9;
                        C3914k4.m15619k4(c3983k4M56597k43.m15721to(), iArr10, 0, iM15716k4);
                        c12009k47.m56605k4(c3983k4M56597k43);
                        iArr8 = iArr10;
                    } finally {
                    }
                }
                float f8 = iMo15760yj;
                float f9 = iMo15757m9;
                C11913yj c11913yj = new C11913yj(c12007ixClone.m56550c5() / f8, 0.0f, 0.0f, c12007ixClone.m56575x1() / f9, c12007ixClone.m56552du().m56897x1(), c12007ixClone.m56552du().m56895kk());
                C11913yj c11913yjM55760h4 = c11913yj.m55760h4();
                c11913yjM55760h4.m55780m9();
                float[] fArrM55776k4 = c11913yj.m55776k4();
                float[] fArrM55776k42 = c11913yjM55760h4.m55776k4();
                int iMo15757m92 = c3856h4.m15479ix().mo15757m9();
                int[] iArr11 = iArr8;
                int iMo15760yj2 = c3856h4.m15479ix().mo15760yj();
                float fM56551ck = c12007ixClone2.m56551ck();
                float fM56557jd = c12007ixClone2.m56557jd();
                float fM56556h4 = c12007ixClone2.m56556h4();
                float fM56558k4 = c12007ixClone2.m56558k4();
                AbstractC12024x1 abstractC12024x13 = abstractC12024x1M15472dy;
                float fM56575x1 = c12007ixClone2.m56575x1();
                Class cls3 = C11999ar.class;
                float fM56550c5 = c12007ixClone2.m56550c5();
                C14112xw c14112xw3 = c14112xwM15721to;
                long jM56506h42 = ((long) c3856h4.m15540yj().m56506h4()) & 4294967295L;
                int i17 = 0;
                while (true) {
                    if (i17 >= C14116yg.m67481k4(fM56575x1, f9)) {
                        int[] iArr12 = iArr2;
                        C3914k4.m15622k4(iArr12, 0, c14112xw3, iArr12.length);
                        c3856h4.m15479ix().m56605k4(c3983k4);
                        c12009k43.m56605k4(c3983k4M56597k42);
                        return;
                    }
                    float f10 = fM56575x1;
                    if (fM56575x1 <= f9) {
                        f = fM56550c5;
                        if (i17 >= iMo15757m9) {
                            fArr = fArrM55776k42;
                            c12018u4 = c12018u4Mo17480h4;
                            f2 = f9;
                            i = iMo15757m92;
                            i2 = i17;
                            c3983k42 = c3983k4M56597k42;
                            c12009k44 = c12009k43;
                            cls = cls3;
                            c14112xw = c14112xw3;
                            j2 = jM56506h42;
                            f3 = f;
                            i3 = iMo15760yj2;
                            fArr2 = fArrM55776k4;
                            iArr3 = iArr2;
                            abstractC12024x1 = abstractC12024x13;
                            i4 = iM15722x1;
                            i5 = iMo15757m9;
                            i17 = i2 + 1;
                            cls3 = cls;
                            c12018u4Mo17480h4 = c12018u4;
                            iArr2 = iArr3;
                            iMo15760yj = iMo15760yj;
                            iMo15757m9 = i5;
                            fArrM55776k4 = fArr2;
                            iM15722x1 = i4;
                            fM56575x1 = f10;
                            f9 = f2;
                            iMo15757m92 = i;
                            c3983k4M56597k42 = c3983k42;
                            jM56506h42 = j2;
                            fArrM55776k42 = fArr;
                            abstractC12024x13 = abstractC12024x1;
                            c12009k43 = c12009k44;
                            fM56550c5 = f3;
                            c14112xw3 = c14112xw;
                            iMo15760yj2 = i3;
                        } else {
                            iOooO00o = OooO.OooO00o(m46699k4(0.0f, r10, fArrM55776k4)[1], 14);
                            iOooO00o2 = i17;
                        }
                    } else if (i17 >= iMo15757m92) {
                        fArr = fArrM55776k42;
                        i3 = iMo15760yj2;
                        c12018u4 = c12018u4Mo17480h4;
                        f2 = f9;
                        i = iMo15757m92;
                        i2 = i17;
                        c3983k42 = c3983k4M56597k42;
                        abstractC12024x1 = abstractC12024x13;
                        cls = cls3;
                        c14112xw = c14112xw3;
                        j2 = jM56506h42;
                        f3 = fM56550c5;
                        i4 = iM15722x1;
                        c12009k44 = c12009k43;
                        fArr2 = fArrM55776k4;
                        i5 = iMo15757m9;
                        iArr3 = iArr2;
                        i17 = i2 + 1;
                        cls3 = cls;
                        c12018u4Mo17480h4 = c12018u4;
                        iArr2 = iArr3;
                        iMo15760yj = iMo15760yj;
                        iMo15757m9 = i5;
                        fArrM55776k4 = fArr2;
                        iM15722x1 = i4;
                        fM56575x1 = f10;
                        f9 = f2;
                        iMo15757m92 = i;
                        c3983k4M56597k42 = c3983k42;
                        jM56506h42 = j2;
                        fArrM55776k42 = fArr;
                        abstractC12024x13 = abstractC12024x1;
                        c12009k43 = c12009k44;
                        fM56550c5 = f3;
                        c14112xw3 = c14112xw;
                        iMo15760yj2 = i3;
                    } else {
                        iOooO00o = OooO.OooO00o(r10 + fM56551ck, 14);
                        f = fM56550c5;
                        iOooO00o2 = OooO.OooO00o(m46699k4(0.0f, iOooO00o, fArrM55776k42)[1], 14);
                    }
                    int i18 = 0;
                    while (true) {
                        f2 = f9;
                        f4 = f;
                        if (i18 >= C14116yg.m67481k4(f4, f8)) {
                            break;
                        }
                        if (f4 <= f8) {
                            i6 = iMo15760yj2;
                            i7 = iOooO00o2;
                            i8 = i17;
                            c = ControlChar.COLUMN_BREAK_CHAR;
                            if (i18 >= iMo15760yj) {
                                i9 = i18;
                                fArr4 = fArrM55776k42;
                                c12018u42 = c12018u4Mo17480h4;
                                i10 = iMo15757m92;
                                c3983k43 = c3983k4M56597k42;
                                c12009k45 = c12009k43;
                                abstractC12024x12 = abstractC12024x13;
                                cls2 = cls3;
                                c14112xw2 = c14112xw3;
                                j3 = jM56506h42;
                                f7 = f4;
                                fArr3 = fArrM55776k4;
                                i14 = iM15722x1;
                                iArr4 = iArr2;
                                i13 = i7;
                                i11 = iMo15757m9;
                                i12 = iMo15760yj;
                            } else {
                                i9 = i18;
                                iOooO00o3 = OooO.OooO00o(m46699k4(r11, 0.0f, fArrM55776k4)[0], 14);
                                iOooO00o4 = i9;
                                f5 = iOooO00o3;
                                f6 = iOooO00o;
                                if (c12018u4Mo17480h4.m56754k4(f5, f6)) {
                                }
                            }
                        } else if (i18 >= iMo15760yj2) {
                            i6 = iMo15760yj2;
                            i7 = iOooO00o2;
                            i9 = i18;
                            i8 = i17;
                            c = ControlChar.COLUMN_BREAK_CHAR;
                            fArr4 = fArrM55776k42;
                            c12018u42 = c12018u4Mo17480h4;
                            i10 = iMo15757m92;
                            c3983k43 = c3983k4M56597k42;
                            c12009k45 = c12009k43;
                            abstractC12024x12 = abstractC12024x13;
                            cls2 = cls3;
                            c14112xw2 = c14112xw3;
                            j3 = jM56506h42;
                            f7 = f4;
                            fArr3 = fArrM55776k4;
                            i14 = iM15722x1;
                            iArr4 = iArr2;
                            i13 = i7;
                            i11 = iMo15757m9;
                            i12 = iMo15760yj;
                        } else {
                            i8 = i17;
                            i6 = iMo15760yj2;
                            iOooO00o3 = OooO.OooO00o(r11 + fM56557jd, 14);
                            i7 = iOooO00o2;
                            double d = m46699k4(iOooO00o3, 0.0f, fArrM55776k42)[0];
                            c = ControlChar.COLUMN_BREAK_CHAR;
                            iOooO00o4 = OooO.OooO00o(d, 14);
                            i9 = i18;
                            f5 = iOooO00o3;
                            f6 = iOooO00o;
                            if (c12018u4Mo17480h4.m56754k4(f5, f6)) {
                                fArr4 = fArrM55776k42;
                                c12018u42 = c12018u4Mo17480h4;
                                i10 = iMo15757m92;
                                c3983k43 = c3983k4M56597k42;
                                c12009k45 = c12009k43;
                                abstractC12024x12 = abstractC12024x13;
                                cls2 = cls3;
                                c14112xw2 = c14112xw3;
                                j3 = jM56506h42;
                                f7 = f4;
                                fArr3 = fArrM55776k4;
                                i14 = iM15722x1;
                                iArr4 = iArr2;
                                i13 = i7;
                                i11 = iMo15757m9;
                                i12 = iMo15760yj;
                            } else {
                                int iM67507x1 = C14116yg.m67507x1(iOooO00o4, iMo15760yj - 1);
                                int iM67507x12 = C14116yg.m67507x1(i7, iMo15757m9 - 1);
                                int iM27462to = C7019kk.m27462to(Float.valueOf(C14116yg.m67504x1(f5, fM56556h4 - 1.0f)), 13);
                                int iM27462to2 = C7019kk.m27462to(Float.valueOf(C14116yg.m67504x1(f6, fM56558k4 - 1.0f)), 13);
                                int i19 = (iM67507x12 * iMo15760yj) + iM67507x1;
                                i10 = iMo15757m92;
                                int i20 = iM15722x1;
                                i11 = iMo15757m9;
                                float[] fArr5 = fArrM55776k42;
                                c3983k43 = c3983k4M56597k42;
                                int[] iArr13 = iArr2;
                                c14112xw2 = c14112xw3;
                                j3 = jM56506h42;
                                f7 = f4;
                                int[] iArr14 = iArr6;
                                c12018u42 = c12018u4Mo17480h4;
                                c12009k45 = c12009k43;
                                fArr3 = fArrM55776k4;
                                long jM46697k4 = m46697k4(j, c3856h4, c12007ixClone2.Clone(), iMo15760yj, iM27462to, fArr5, i19, iM67507x1, iM67507x12, i11, iM27462to2, iArr14);
                                i12 = iMo15760yj;
                                iArr6 = iArr14;
                                i13 = iM67507x12;
                                AbstractC12024x1 abstractC12024x14 = abstractC12024x13;
                                Class cls4 = cls3;
                                if (zM49088x1) {
                                    jM56506h4 = ((long) (z2 ? ((C11999ar) C7019kk.m27452k4((Object) abstractC12024x14, cls4)).m56305h4().m56506h4() : iArr11[i19])) & 4294967295L;
                                } else {
                                    jM56506h4 = 4278190080L;
                                }
                                int iM15722x12 = (c3983k4.m15722x1() * iM27462to2) + iM27462to;
                                if (iM15722x12 >= i20 || iM15722x12 < 0) {
                                    i14 = i20;
                                    abstractC12024x12 = abstractC12024x14;
                                    fArr4 = fArr5;
                                    iArr4 = iArr13;
                                    cls2 = cls4;
                                } else {
                                    i14 = i20;
                                    long jM58328k4 = iArr[iM15722x12] & 4294967295L;
                                    byte b = (byte) (((r10 & 4294967295L) >> 24) & 255);
                                    int i21 = b & 255;
                                    if (i21 <= 0 || i21 >= 255) {
                                        j3 = j3;
                                    } else {
                                        jM58328k4 = C12530dy.m58328k4(jM58328k4, j3, b);
                                    }
                                    long j4 = jM58328k4;
                                    abstractC12024x12 = abstractC12024x14;
                                    cls2 = cls4;
                                    long jM14685k4 = C3590x1.m14685k4(jM46697k4, j4, jM56506h4, j);
                                    iArr4 = iArr13;
                                    int i22 = iArr4[iM15722x12];
                                    if (i22 != iArr[iM15722x12]) {
                                        long j5 = i22 & 4294967295L;
                                        long j6 = jM14685k4 & 4294967295L;
                                        byte bOooO00o = OooO00o.OooO00o((((byte) ((j5 >> 24) & 4294967295L)) & 255) + (((byte) ((j6 >> 24) & 4294967295L)) & 255), 2.0f, 13);
                                        fArr4 = fArr5;
                                        i12 = i12;
                                        iArr4[iM15722x12] = (int) ((((long) (OooO00o.OooO00o((((byte) (r8 & 4294967295L)) & 255) + (((byte) (jM14685k4 & 4294967295L)) & 255), 2.0f, 13) & 255)) | ((long) (((OooO00o.OooO00o((((byte) ((j5 >> 16) & 4294967295L)) & 255) + (((byte) ((j6 >> 16) & 4294967295L)) & 255), 2.0f, 13) & 255) << 16) & WarningType.MINOR_FORMATTING_LOSS_CATEGORY)) | (((long) ((bOooO00o & 255) << 24)) & 4278190080L) | ((long) (((OooO00o.OooO00o((((byte) ((j5 >> 8) & 4294967295L)) & 255) + (((byte) ((j6 >> 8) & 4294967295L)) & 255), 2.0f, 13) & 255) << 8) & 65280))) & 4294967295L);
                                    } else {
                                        fArr4 = fArr5;
                                        iArr4[iM15722x12] = (int) jM14685k4;
                                    }
                                }
                                iOooO00o = iM27462to2;
                            }
                        }
                        c12018u4Mo17480h4 = c12018u42;
                        iOooO00o2 = i13;
                        iArr2 = iArr4;
                        fArrM55776k4 = fArr3;
                        c12009k43 = c12009k45;
                        i18 = i9 + 1;
                        cls3 = cls2;
                        iMo15760yj = i12;
                        iMo15757m9 = i11;
                        iM15722x1 = i14;
                        f9 = f2;
                        i17 = i8;
                        iMo15757m92 = i10;
                        c3983k4M56597k42 = c3983k43;
                        jM56506h42 = j3;
                        fArrM55776k42 = fArr4;
                        abstractC12024x13 = abstractC12024x12;
                        iMo15760yj2 = i6;
                        f = f7;
                        c14112xw3 = c14112xw2;
                    }
                    fArr = fArrM55776k42;
                    i3 = iMo15760yj2;
                    c12018u4 = c12018u4Mo17480h4;
                    i = iMo15757m92;
                    i2 = i17;
                    c3983k42 = c3983k4M56597k42;
                    c12009k44 = c12009k43;
                    abstractC12024x1 = abstractC12024x13;
                    cls = cls3;
                    c14112xw = c14112xw3;
                    j2 = jM56506h42;
                    f3 = f4;
                    fArr2 = fArrM55776k4;
                    i4 = iM15722x1;
                    iArr3 = iArr2;
                    i5 = iMo15757m9;
                    i17 = i2 + 1;
                    cls3 = cls;
                    c12018u4Mo17480h4 = c12018u4;
                    iArr2 = iArr3;
                    iMo15760yj = iMo15760yj;
                    iMo15757m9 = i5;
                    fArrM55776k4 = fArr2;
                    iM15722x1 = i4;
                    fM56575x1 = f10;
                    f9 = f2;
                    iMo15757m92 = i;
                    c3983k4M56597k42 = c3983k42;
                    jM56506h42 = j2;
                    fArrM55776k42 = fArr;
                    abstractC12024x13 = abstractC12024x1;
                    c12009k43 = c12009k44;
                    fM56550c5 = f3;
                    c14112xw3 = c14112xw;
                    iMo15760yj2 = i3;
                }
            } else {
                c11999ar = new C11999ar(C12003du.m56385i5().Clone());
            }
        }
        abstractC12008jd.mo17594x1(c11999ar, c12014ne2.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public static float[] m46699k4(float f, float f2, float[] fArr) {
        return new float[]{(fArr[1] * f2) + (fArr[0] * f) + fArr[4], (fArr[3] * f2) + (fArr[2] * f) + fArr[5]};
    }
}
