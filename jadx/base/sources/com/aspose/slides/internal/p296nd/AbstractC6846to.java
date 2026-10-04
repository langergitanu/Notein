package com.aspose.slides.internal.p296nd;

import androidx.core.graphics.OooO0OO;
import com.aspose.slides.C22213OooOoOO;
import com.aspose.slides.OooO;
import com.aspose.slides.OooO0o;
import com.aspose.slides.Oooo0;
import com.aspose.slides.internal.p100e4.C3558bv;
import com.aspose.slides.internal.p102e8.OooO00o;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3976c5;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p143g4.C4206x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p441ui.C11315h4;
import com.aspose.slides.internal.p441ui.C11318m9;
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
import com.aspose.slides.internal.p498xe.C12523x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14112xw;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.words.WarningType;

/* JADX INFO: renamed from: com.aspose.slides.internal.nd.to */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6846to extends AbstractC6841rv {
    /* JADX INFO: renamed from: k4 */
    private static long m26881k4(long j, C11315h4 c11315h4, C12007ix c12007ix, int i, int i2, float[] fArr, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
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
                float f3 = m26883k4(i2, 0.0f, fArr)[0];
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
                    c11315h4.m54442qq();
                }
            }
            if (c12007ix.m56575x1() > i6) {
                float f7 = m26883k4(0.0f, i7, fArr)[i8];
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
    public static C12007ix m26882k4(C12014ne c12014ne, C11315h4 c11315h4, AbstractC12008jd abstractC12008jd) {
        C12018u4 c12018u4 = new C12018u4(c12014ne.Clone());
        c12018u4.m56771x1(c11315h4.m54391ak());
        return c12018u4.m56749k4(abstractC12008jd);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12009k4 m26884k4(boolean z, C12523x1 c12523x1, C11315h4 c11315h4) {
        if (z) {
            return c12523x1.m58274c5();
        }
        C12009k4 c12009k4 = new C12009k4(c11315h4.m54453v4(), c11315h4.m54438lr());
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
        try {
            abstractC12008jdM56582k4.mo17476du(1);
            abstractC12008jdM56582k4.mo17560kk(7);
            abstractC12008jdM56582k4.mo17508k4(c11315h4.m54409ix(), new C12014ne(0, 0, c11315h4.m54453v4(), c11315h4.m54438lr()));
            abstractC12008jdM56582k4.dispose();
            return c12009k4;
        } catch (Throwable th) {
            if (abstractC12008jdM56582k4 != null) {
                abstractC12008jdM56582k4.dispose();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x039c A[PHI: r6 r9 r45 r59
      0x039c: PHI (r6v21 com.aspose.slides.internal.wh.u4) = 
      (r6v7 com.aspose.slides.internal.wh.u4)
      (r6v8 com.aspose.slides.internal.wh.u4)
      (r6v27 com.aspose.slides.internal.wh.u4)
     binds: [B:83:0x0382, B:86:0x039a, B:79:0x034c] A[DONT_GENERATE, DONT_INLINE]
      0x039c: PHI (r9v13 float[]) = (r9v9 float[]), (r9v10 float[]), (r9v15 float[]) binds: [B:83:0x0382, B:86:0x039a, B:79:0x034c] A[DONT_GENERATE, DONT_INLINE]
      0x039c: PHI (r45v4 float) = (r45v1 float), (r45v2 float), (r45v6 float) binds: [B:83:0x0382, B:86:0x039a, B:79:0x034c] A[DONT_GENERATE, DONT_INLINE]
      0x039c: PHI (r59v5 float) = (r59v2 float), (r59v3 float), (r59v7 float) binds: [B:83:0x0382, B:86:0x039a, B:79:0x034c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03aa  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m26885k4(long j, C12009k4 c12009k4, C12014ne c12014ne, C12014ne c12014ne2, boolean z, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4) {
        C12009k4 c12009k42;
        boolean z2;
        int[] iArr;
        C12009k4 c12009k43;
        C12007ix c12007ix;
        int[] iArr2;
        AbstractC12024x1 abstractC12024x1;
        Class<C11999ar> cls;
        float[] fArr;
        int iOooO00o;
        int iOooO00o2;
        int i;
        float f;
        float f2;
        C12018u4 c12018u4;
        int i2;
        float f3;
        Class<C11999ar> cls2;
        float f4;
        float f5;
        C12018u4 c12018u42;
        float[] fArr2;
        int iOooO00o3;
        int iOooO00o4;
        C12018u4 c12018u43;
        float f6;
        float f7;
        int i3;
        int i4;
        long j2;
        long jM56506h4;
        C12018u4 c12018u44;
        Class<C11999ar> cls3;
        float f8;
        AbstractC12008jd abstractC12008jdM56582k4;
        C3976c5 c3976c5;
        boolean zM14470k4 = C3558bv.m14470k4(j);
        AbstractC12024x1 abstractC12024x1M54403dy = c11315h4.m54403dy();
        if (abstractC12024x1M54403dy == null) {
            abstractC12024x1M54403dy = new C11999ar(c11315h4.m54468yj().Clone());
        }
        Class<C11999ar> cls4 = C11999ar.class;
        boolean zM27469x1 = C7019kk.m27469x1(abstractC12024x1M54403dy, cls4);
        if (j == 170) {
            return;
        }
        if (j == 240) {
            abstractC12008jd.mo17594x1(abstractC12024x1M54403dy, c12014ne2.Clone());
            return;
        }
        if (j == 255) {
            abstractC12008jd.mo17594x1(new C11999ar(C12003du.m56385i5().Clone()), c12014ne2.Clone());
            return;
        }
        if (j == 0) {
            abstractC12008jd.mo17594x1(new C11999ar(C12003du.m56460uz().Clone()), c12014ne2.Clone());
            return;
        }
        if (j == 204) {
            C11893c5 c11893c5Mo17583x1 = abstractC12008jd.mo17583x1();
            C11318m9.m54482k4(c12014ne.Clone(), new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9())).CloneTo(c12014ne);
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
        C12018u4 c12018u4Mo17480h4 = abstractC12008jd.mo17480h4();
        c12018u4Mo17480h4.m56771x1(abstractC12008jd.mo17577u4());
        if (c12009k4.mo15753jd() != 2498570) {
            C12014ne c12014neClone = C11318m9.m54482k4(c12014ne.Clone(), new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9())).Clone();
            C12009k4 c12009k44 = new C12009k4(c12014ne.m56663c5(), c12014ne.m56683x1(), 2498570);
            abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k44);
            try {
                C3976c5 c3976c53 = new C3976c5();
                try {
                    c3976c53.m15673x1(3);
                    c3976c5 = c3976c53;
                    try {
                        abstractC12008jdM56582k4.mo17511k4((AbstractC12002ck) c12009k4, new C12014ne(0, 0, c12014ne.m56663c5(), c12014ne.m56683x1()), c12014neClone.m56669jd(), c12014neClone.m56664ck(), c12014neClone.m56663c5(), c12014neClone.m56683x1(), 2, c3976c5);
                        c3976c5.dispose();
                        abstractC12008jdM56582k4.dispose();
                        c12009k42 = c12009k44;
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
        } else {
            c12009k42 = c12009k4;
        }
        C12007ix c12007ixClone = m26882k4(c12014ne2.Clone(), c11315h4, abstractC12008jd).Clone();
        C12007ix c12007ixClone2 = C12007ix.m56543k4(c12007ixClone.Clone(), new C12007ix(0.0f, 0.0f, c11315h4.m54409ix().mo15760yj(), c11315h4.m54409ix().mo15757m9())).Clone();
        C3983k4 c3983k4M56597k4 = c11315h4.m54409ix().m56597k4(new C12014ne(0, 0, c11315h4.m54409ix().mo15760yj(), c11315h4.m54409ix().mo15757m9()), 3, 2498570);
        c12014ne.m56663c5();
        c12014ne.m56683x1();
        int iMo15760yj = c12009k42.mo15760yj();
        int iMo15757m9 = c12009k42.mo15757m9();
        C3983k4 c3983k4M56597k42 = c12009k42.m56597k4(new C12014ne(0, 0, iMo15760yj, iMo15757m9), 1, 2498570);
        int i5 = iMo15760yj * iMo15757m9;
        int[] iArr3 = new int[i5];
        C3914k4.m15619k4(c3983k4M56597k42.m15721to(), iArr3, 0, i5);
        C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
        int iM15722x1 = c3983k4M56597k4.m15722x1() * c3983k4M56597k4.m15716k4();
        int[] iArr4 = new int[iM15722x1];
        int[] iArr5 = new int[c3983k4M56597k4.m15716k4() * c3983k4M56597k4.m15722x1()];
        int[] iArr6 = new int[0];
        C3914k4.m15619k4(c14112xwM15721to, iArr4, 0, iM15722x1);
        int[] iArr7 = (int[]) C7019kk.m27458kk(AbstractC14092to.m67208k4((Object) iArr4).deepClone(), int[].class);
        if (!zM14470k4 || zM27469x1) {
            z2 = zM27469x1;
            iArr = iArr4;
            c12009k43 = c12009k42;
            c12007ix = c12007ixClone2;
            iArr2 = iArr6;
        } else {
            z2 = zM27469x1;
            C12009k4 c12009k45 = new C12009k4(iMo15760yj, iMo15757m9, 2498570);
            abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k45);
            iArr = iArr4;
            try {
                c12007ix = c12007ixClone2;
                abstractC12008jdM56582k4.mo17594x1(abstractC12024x1M54403dy, new C12014ne(0, 0, iMo15760yj, iMo15757m9));
                abstractC12008jdM56582k4.dispose();
                C3983k4 c3983k4M56597k43 = c12009k45.m56597k4(new C12014ne(0, 0, iMo15760yj, iMo15757m9), 1, 2498570);
                int iM15716k4 = c3983k4M56597k43.m15716k4() * c3983k4M56597k43.m15722x1();
                int[] iArr8 = new int[iM15716k4];
                c12009k43 = c12009k42;
                C3914k4.m15619k4(c3983k4M56597k43.m15721to(), iArr8, 0, iM15716k4);
                c12009k45.m56605k4(c3983k4M56597k43);
                iArr2 = iArr8;
            } finally {
            }
        }
        float f9 = iMo15760yj;
        float f10 = iMo15757m9;
        C11913yj c11913yj = new C11913yj(c12007ixClone.m56550c5() / f9, 0.0f, 0.0f, c12007ixClone.m56575x1() / f10, c12007ixClone.m56552du().m56897x1(), c12007ixClone.m56552du().m56895kk());
        C11913yj c11913yjM55760h4 = c11913yj.m55760h4();
        c11913yjM55760h4.m55780m9();
        float[] fArrM55776k4 = c11913yj.m55776k4();
        float[] fArrM55776k42 = c11913yjM55760h4.m55776k4();
        int iMo15757m92 = c11315h4.m54409ix().mo15757m9();
        int[] iArr9 = iArr2;
        int iMo15760yj2 = c11315h4.m54409ix().mo15760yj();
        float fM56551ck = c12007ix.m56551ck();
        float fM56557jd = c12007ix.m56557jd();
        float fM56556h4 = c12007ix.m56556h4();
        float fM56558k4 = c12007ix.m56558k4();
        float fM56575x1 = c12007ix.m56575x1();
        float fM56550c5 = c12007ix.m56550c5();
        int i6 = 0;
        while (true) {
            if (i6 >= C14116yg.m67481k4(fM56575x1, f10)) {
                C3914k4.m15622k4(iArr7, 0, c14112xwM15721to, iArr7.length);
                c11315h4.m54409ix().m56605k4(c3983k4M56597k4);
                c12009k43.m56605k4(c3983k4M56597k42);
                return;
            }
            float f11 = f10;
            int i7 = 14;
            if (fM56575x1 <= f10) {
                abstractC12024x1 = abstractC12024x1M54403dy;
                cls = cls4;
                fArr = fArrM55776k42;
                if (i6 < iMo15757m9) {
                    iOooO00o = OooO.OooO00o(m26883k4(0.0f, r0, fArrM55776k4)[1], 14);
                    iOooO00o2 = i6;
                }
                i = iMo15760yj;
                f = fM56550c5;
                f2 = f9;
                c12018u4 = c12018u4Mo17480h4;
                i2 = iMo15757m9;
                f3 = fM56575x1;
                cls2 = cls;
                i6++;
                f9 = f2;
                cls4 = cls2;
                iMo15760yj = i;
                fM56575x1 = f3;
                fArrM55776k42 = fArr;
                iMo15757m9 = i2;
                f10 = f11;
                abstractC12024x1M54403dy = abstractC12024x1;
                fM56550c5 = f;
                c12018u4Mo17480h4 = c12018u4;
            } else if (i6 >= iMo15757m92) {
                abstractC12024x1 = abstractC12024x1M54403dy;
                fArr = fArrM55776k42;
                i = iMo15760yj;
                f = fM56550c5;
                f2 = f9;
                c12018u4 = c12018u4Mo17480h4;
                i2 = iMo15757m9;
                f3 = fM56575x1;
                cls2 = cls4;
                i6++;
                f9 = f2;
                cls4 = cls2;
                iMo15760yj = i;
                fM56575x1 = f3;
                fArrM55776k42 = fArr;
                iMo15757m9 = i2;
                f10 = f11;
                abstractC12024x1M54403dy = abstractC12024x1;
                fM56550c5 = f;
                c12018u4Mo17480h4 = c12018u4;
            } else {
                abstractC12024x1 = abstractC12024x1M54403dy;
                cls = cls4;
                iOooO00o = OooO.OooO00o(r0 + fM56551ck, 14);
                fArr = fArrM55776k42;
                iOooO00o2 = OooO.OooO00o(m26883k4(0.0f, iOooO00o, fArrM55776k42)[1], 14);
            }
            int i8 = iOooO00o2;
            int i9 = iOooO00o;
            int i10 = 0;
            while (true) {
                if (i10 >= C14116yg.m67481k4(fM56550c5, f9)) {
                    break;
                }
                if (fM56550c5 <= f9) {
                    f4 = fM56550c5;
                    f5 = f9;
                    c12018u42 = c12018u4Mo17480h4;
                    int i11 = i7;
                    fArr2 = fArr;
                    if (i10 >= iMo15760yj) {
                        c12018u43 = c12018u42;
                        i3 = iMo15760yj;
                        c12018u44 = c12018u43;
                        fArr = fArr2;
                        i4 = iMo15757m9;
                        f8 = fM56575x1;
                        cls3 = cls;
                    } else {
                        iOooO00o3 = OooO.OooO00o(m26883k4(r4, 0.0f, fArrM55776k4)[0], i11);
                        iOooO00o4 = i10;
                        f6 = iOooO00o3;
                        f7 = i9;
                        c12018u43 = c12018u42;
                        if (c12018u43.m56754k4(f6, f7)) {
                        }
                    }
                } else if (i10 >= iMo15760yj2) {
                    f4 = fM56550c5;
                    f5 = f9;
                    c12018u43 = c12018u4Mo17480h4;
                    fArr2 = fArr;
                    i3 = iMo15760yj;
                    c12018u44 = c12018u43;
                    fArr = fArr2;
                    i4 = iMo15757m9;
                    f8 = fM56575x1;
                    cls3 = cls;
                } else {
                    f4 = fM56550c5;
                    f5 = f9;
                    iOooO00o3 = OooO.OooO00o(r4 + fM56557jd, i7);
                    fArr2 = fArr;
                    c12018u42 = c12018u4Mo17480h4;
                    iOooO00o4 = OooO.OooO00o(m26883k4(iOooO00o3, 0.0f, fArr2)[0], 14);
                    f6 = iOooO00o3;
                    f7 = i9;
                    c12018u43 = c12018u42;
                    if (c12018u43.m56754k4(f6, f7)) {
                        i3 = iMo15760yj;
                        c12018u44 = c12018u43;
                        fArr = fArr2;
                        i4 = iMo15757m9;
                        f8 = fM56575x1;
                        cls3 = cls;
                    } else {
                        int iM67507x1 = C14116yg.m67507x1(iOooO00o4, iMo15760yj - 1);
                        int iM67507x12 = C14116yg.m67507x1(i8, iMo15757m9 - 1);
                        int iM27462to = C7019kk.m27462to(Float.valueOf(C14116yg.m67504x1(f6, fM56556h4 - 1.0f)), 13);
                        int iM27462to2 = C7019kk.m27462to(Float.valueOf(C14116yg.m67504x1(f7, fM56558k4 - 1.0f)), 13);
                        int i12 = (iM67507x12 * iMo15760yj) + iM67507x1;
                        i3 = iMo15760yj;
                        fArr = fArr2;
                        i4 = iMo15757m9;
                        long jM26881k4 = m26881k4(j, c11315h4, c12007ix.Clone(), i3, iM27462to, fArr, i12, iM67507x1, iM67507x12, i4, iM27462to2, iArr3);
                        AbstractC12024x1 abstractC12024x12 = abstractC12024x1;
                        Class<C11999ar> cls5 = cls;
                        if (zM14470k4) {
                            j2 = 4278190080L;
                            jM56506h4 = ((long) (z2 ? ((C11999ar) C7019kk.m27452k4((Object) abstractC12024x12, (Class) cls5)).m56305h4().m56506h4() : iArr9[i12])) & 4294967295L;
                        } else {
                            j2 = 4278190080L;
                            jM56506h4 = 4278190080L;
                        }
                        int iM15722x12 = (c3983k4M56597k4.m15722x1() * iM27462to2) + iM27462to;
                        if (iM15722x12 >= iM15722x1 || iM15722x12 < 0) {
                            abstractC12024x1 = abstractC12024x12;
                            c12018u44 = c12018u43;
                            cls3 = cls5;
                            f8 = fM56575x1;
                        } else {
                            long jM16879k4 = C4206x1.m16879k4(jM26881k4, ((long) iArr[iM15722x12]) & 4294967295L, jM56506h4, j);
                            int i13 = iArr7[iM15722x12];
                            abstractC12024x1 = abstractC12024x12;
                            if (i13 != iArr[iM15722x12]) {
                                long j3 = i13 & 4294967295L;
                                long j4 = jM16879k4 & 4294967295L;
                                c12018u44 = c12018u43;
                                byte bOooO00o = OooO00o.OooO00o((((byte) ((j3 >> 24) & 4294967295L)) & 255) + (((byte) ((j4 >> 24) & 4294967295L)) & 255), 2.0f, 13);
                                f8 = fM56575x1;
                                byte bOooO00o2 = OooO00o.OooO00o((((byte) ((j3 >> 16) & 4294967295L)) & 255) + (((byte) ((j4 >> 16) & 4294967295L)) & 255), 2.0f, 13);
                                cls3 = cls5;
                                iArr7[iM15722x12] = (int) ((((long) (OooO00o.OooO00o((((byte) (r4 & 4294967295L)) & 255) + (((byte) (jM16879k4 & 4294967295L)) & 255), 2.0f, 13) & 255)) | ((long) (((OooO00o.OooO00o((((byte) ((j3 >> 8) & 4294967295L)) & 255) + (((byte) ((j4 >> 8) & 4294967295L)) & 255), 2.0f, 13) & 255) << 8) & 65280)) | (((long) ((bOooO00o & 255) << 24)) & j2) | ((long) (((bOooO00o2 & 255) << 16) & WarningType.MINOR_FORMATTING_LOSS_CATEGORY))) & 4294967295L);
                            } else {
                                c12018u44 = c12018u43;
                                cls3 = cls5;
                                f8 = fM56575x1;
                                iArr7[iM15722x12] = (int) jM16879k4;
                            }
                        }
                        i8 = iM67507x12;
                        i9 = iM27462to2;
                    }
                }
                i10++;
                f9 = f5;
                cls = cls3;
                iMo15760yj = i3;
                fM56575x1 = f8;
                iMo15757m9 = i4;
                fM56550c5 = f4;
                c12018u4Mo17480h4 = c12018u44;
                i7 = 14;
            }
            i = iMo15760yj;
            f = fM56550c5;
            f2 = f9;
            c12018u4 = c12018u4Mo17480h4;
            i2 = iMo15757m9;
            f3 = fM56575x1;
            cls2 = cls;
            i6++;
            f9 = f2;
            cls4 = cls2;
            iMo15760yj = i;
            fM56575x1 = f3;
            fArrM55776k42 = fArr;
            iMo15757m9 = i2;
            f10 = f11;
            abstractC12024x1M54403dy = abstractC12024x1;
            fM56550c5 = f;
            c12018u4Mo17480h4 = c12018u4;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static float[] m26883k4(float f, float f2, float[] fArr) {
        return new float[]{(fArr[1] * f2) + (fArr[0] * f) + fArr[4], (fArr[3] * f2) + (fArr[2] * f) + fArr[5]};
    }
}
