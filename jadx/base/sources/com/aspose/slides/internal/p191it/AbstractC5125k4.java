package com.aspose.slides.internal.p191it;

import androidx.core.graphics.OooO0OO;
import com.aspose.slides.C22213OooOoOO;
import com.aspose.slides.OooO;
import com.aspose.slides.OooO0o;
import com.aspose.slides.Oooo0;
import com.aspose.slides.internal.p037b9.AbstractC1670k4;
import com.aspose.slides.internal.p040bg.OooO00o;
import com.aspose.slides.internal.p100e4.C3558bv;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3976c5;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p143g4.AbstractC4205to;
import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p143g4.C4206x1;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p314oc.C7019kk;
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
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14112xw;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.words.WarningType;

/* JADX INFO: renamed from: com.aspose.slides.internal.it.k4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5125k4 extends AbstractC4205to {

    /* JADX INFO: renamed from: k4 */
    protected C11893c5 f14075k4 = null;

    /* JADX INFO: renamed from: k4 */
    private static long m21980k4(long j, C4201h4 c4201h4, C12007ix c12007ix, int i, int i2, float[] fArr, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
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
                float f3 = m21982k4(i2, 0.0f, fArr)[0];
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
                    c4201h4.m16779yd();
                }
            }
            if (c12007ix.m56575x1() > i6) {
                float f7 = m21982k4(0.0f, i7, fArr)[i8];
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

    /* JADX INFO: renamed from: du */
    public abstract void mo9056du(C5061vw c5061vw, C4201h4 c4201h4);

    /* JADX INFO: renamed from: k4 */
    public abstract AbstractC1670k4 mo15407k4();

    @Override // com.aspose.slides.internal.p143g4.AbstractC4205to
    /* JADX INFO: renamed from: kk */
    public void mo16656kk(C5061vw c5061vw, C4201h4 c4201h4) {
        mo15407k4().mo9072x1(c5061vw, c4201h4);
    }

    @Override // com.aspose.slides.internal.p143g4.AbstractC4205to
    /* JADX INFO: renamed from: to */
    public final void mo16876to(C5061vw c5061vw, C4201h4 c4201h4) {
        mo15407k4().mo9070kk(c5061vw, c4201h4);
    }

    @Override // com.aspose.slides.internal.p143g4.AbstractC4205to
    /* JADX INFO: renamed from: x1 */
    public void mo16658x1(C5061vw c5061vw, C4201h4 c4201h4) {
        mo15407k4().mo9066k4(c5061vw, c4201h4);
    }

    @Deprecated
    /* JADX INFO: renamed from: k4 */
    public static C12025x6 m21981k4(C12025x6 c12025x6, C11913yj c11913yj) {
        float[] fArrM55776k4 = c11913yj.m55776k4();
        return new C12025x6(OooO00o.OooO00o(c12025x6, fArrM55776k4[1], c12025x6.m56897x1() * fArrM55776k4[0]) + fArrM55776k4[4], OooO00o.OooO00o(c12025x6, fArrM55776k4[3], c12025x6.m56897x1() * fArrM55776k4[2]) + fArrM55776k4[5]);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0403 A[PHI: r13 r26 r53
      0x0403: PHI (r13v15 com.aspose.slides.internal.wh.u4) = 
      (r13v10 com.aspose.slides.internal.wh.u4)
      (r13v11 com.aspose.slides.internal.wh.u4)
      (r13v25 com.aspose.slides.internal.wh.u4)
     binds: [B:104:0x03e9, B:107:0x0401, B:100:0x03b4] A[DONT_GENERATE, DONT_INLINE]
      0x0403: PHI (r26v5 com.aspose.slides.internal.wh.x1) = 
      (r26v1 com.aspose.slides.internal.wh.x1)
      (r26v2 com.aspose.slides.internal.wh.x1)
      (r26v7 com.aspose.slides.internal.wh.x1)
     binds: [B:104:0x03e9, B:107:0x0401, B:100:0x03b4] A[DONT_GENERATE, DONT_INLINE]
      0x0403: PHI (r53v3 java.lang.Class<com.aspose.slides.internal.wh.ar>) = 
      (r53v1 java.lang.Class<com.aspose.slides.internal.wh.ar>)
      (r53v2 java.lang.Class<com.aspose.slides.internal.wh.ar>)
      (r53v5 java.lang.Class<com.aspose.slides.internal.wh.ar>)
     binds: [B:104:0x03e9, B:107:0x0401, B:100:0x03b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0427  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m21983k4(long j, C12009k4 c12009k4, C12014ne c12014ne, C12014ne c12014ne2, C12003du c12003du, C11913yj c11913yj, C4201h4 c4201h4) {
        C12009k4 c12009k42;
        C3983k4 c3983k4M56597k4;
        int[] iArr;
        int[] iArr2;
        C12009k4 c12009k43;
        C12007ix c12007ix;
        C3983k4 c3983k4;
        C14112xw c14112xw;
        int i;
        C12018u4 c12018u4;
        int iOooO00o;
        int iOooO00o2;
        float[] fArr;
        float f;
        float[] fArr2;
        int i2;
        int i3;
        Class<C11999ar> cls;
        int[] iArr3;
        int i4;
        int[] iArr4;
        float f2;
        AbstractC12024x1 abstractC12024x1;
        Class<C11999ar> cls2;
        int iOooO00o3;
        int iOooO00o4;
        C12018u4 c12018u42;
        float f3;
        float f4;
        C3983k4 c3983k42;
        int i5;
        int i6;
        C14112xw c14112xw2;
        float f5;
        int i7;
        int i8;
        int[] iArr5;
        float[] fArr3;
        int[] iArr6;
        int i9;
        float f6;
        int[] iArr7;
        AbstractC12024x1 abstractC12024x12;
        long j2;
        long jM56506h4;
        Class<C11999ar> cls3;
        int i10;
        float[] fArr4;
        AbstractC12008jd abstractC12008jdM56582k4;
        C3976c5 c3976c5;
        boolean zM14470k4 = C3558bv.m14470k4(j);
        AbstractC12024x1 abstractC12024x1M16679c5 = c4201h4.m16679c5();
        if (abstractC12024x1M16679c5 == null) {
            abstractC12024x1M16679c5 = new C11999ar(c4201h4.m16739ne().Clone());
        }
        AbstractC12024x1 abstractC12024x13 = abstractC12024x1M16679c5;
        Class<C11999ar> cls4 = C11999ar.class;
        boolean zM27469x1 = C7019kk.m27469x1(abstractC12024x13, cls4);
        C12018u4 c12018u43 = new C12018u4(c12014ne.Clone());
        c12018u43.m56771x1(c11913yj);
        C12014ne c12014neClone = C12014ne.m56661x1(C12007ix.m56544k4(mo15407k4().mo9065k4(c12018u43, c4201h4)).Clone()).Clone();
        if (C12014ne.m56660to(c12014neClone, C12014ne.f40546k4)) {
            c12014neClone.CloneTo(c12014ne);
        }
        if (j == 170) {
            return;
        }
        if (j == 240) {
            mo15407k4().mo9069k4(abstractC12024x13, c12014ne2.Clone(), c4201h4);
            return;
        }
        if (j == 255) {
            mo15407k4().mo9069k4(new C11999ar(C12003du.m56385i5().Clone()), c12014ne2.Clone(), c4201h4);
            return;
        }
        if (j == 0) {
            mo15407k4().mo9069k4(new C11999ar(C12003du.m56460uz().Clone()), c12014ne2.Clone(), c4201h4);
            return;
        }
        if (j == 204) {
            C11893c5 c11893c5Mo9063k4 = mo15407k4().mo9063k4(c4201h4);
            C11318m9.m54482k4(c12014ne.Clone(), new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9())).CloneTo(c12014ne);
            c3976c5 = new C3976c5();
            try {
                if (c11913yj.m55776k4()[0] == -1.0f) {
                    if (c11913yj.m55776k4()[3] == -1.0f) {
                        c12009k4.m56342to(2);
                    } else {
                        c12009k4.m56342to(4);
                    }
                } else if (c11913yj.m55776k4()[3] == -1.0f) {
                    c12009k4.m56342to(6);
                } else {
                    c3976c5.m15673x1(3);
                }
                mo15407k4().mo9068k4(c12009k4, c12014ne2.Clone(), c12014ne.Clone(), c3976c5, c4201h4);
                c3976c5.dispose();
                mo15407k4().mo9067k4(c11893c5Mo9063k4, c4201h4);
                return;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c4201h4.m16694g8() != null) {
            C12018u4 c12018u4Mo9071x1 = mo15407k4().mo9071x1(c4201h4);
            if (c12009k4 == null || c12009k4.mo15753jd() == 2498570) {
                c12009k42 = c12009k4;
            } else {
                C12014ne c12014neClone2 = C11318m9.m54482k4(c12014ne.Clone(), new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9())).Clone();
                C12009k4 c12009k44 = new C12009k4(c12014ne.m56663c5(), c12014ne.m56683x1(), 2498570);
                abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k44);
                try {
                    c3976c5 = new C3976c5();
                    try {
                        c3976c5.m15673x1(3);
                        abstractC12008jdM56582k4.mo17511k4((AbstractC12002ck) c12009k4, new C12014ne(0, 0, c12014ne.m56663c5(), c12014ne.m56683x1()), c12014neClone2.m56669jd(), c12014neClone2.m56664ck(), c12014neClone2.m56663c5(), c12014neClone2.m56683x1(), 2, c3976c5);
                        abstractC12008jdM56582k4.dispose();
                        c12009k42 = c12009k44;
                    } finally {
                        c3976c5.dispose();
                    }
                } finally {
                }
            }
            C12007ix c12007ixClone = mo15407k4().mo9064k4(c12014ne2.Clone(), c4201h4).Clone();
            C12007ix c12007ixClone2 = C12007ix.m56543k4(c12007ixClone.Clone(), new C12007ix(0.0f, 0.0f, c4201h4.m16694g8().mo15760yj(), c4201h4.m16694g8().mo15757m9())).Clone();
            C3983k4 c3983k4M56597k42 = c4201h4.m16694g8().m56597k4(new C12014ne(0, 0, c4201h4.m16694g8().mo15760yj(), c4201h4.m16694g8().mo15757m9()), 3, 2498570);
            int iM56663c5 = c12014ne.m56663c5();
            int iM56683x1 = c12014ne.m56683x1();
            if (c12009k42 != null) {
                iM56663c5 = c12009k42.mo15760yj();
                iM56683x1 = c12009k42.mo15757m9();
                c3983k4M56597k4 = c12009k42.m56597k4(new C12014ne(0, 0, iM56663c5, iM56683x1), 1, 2498570);
                int i11 = iM56663c5 * iM56683x1;
                iArr = new int[i11];
                C3914k4.m15619k4(c3983k4M56597k4.m15721to(), iArr, 0, i11);
            } else {
                c3983k4M56597k4 = null;
                iArr = null;
            }
            int i12 = iM56683x1;
            C14112xw c14112xwM15721to = c3983k4M56597k42.m15721to();
            int iM15722x1 = c3983k4M56597k42.m15722x1() * c3983k4M56597k42.m15716k4();
            int[] iArr8 = new int[iM15722x1];
            int[] iArr9 = new int[c3983k4M56597k42.m15716k4() * c3983k4M56597k42.m15722x1()];
            C3914k4.m15619k4(c14112xwM15721to, iArr8, 0, iM15722x1);
            int[] iArr10 = new int[0];
            int[] iArr11 = (int[]) C7019kk.m27458kk(AbstractC14092to.m67208k4((Object) iArr8).deepClone(), int[].class);
            if (!zM14470k4 || zM27469x1) {
                iArr2 = iArr11;
                c12009k43 = c12009k42;
                c12007ix = c12007ixClone;
                c3983k4 = c3983k4M56597k42;
                c14112xw = c14112xwM15721to;
            } else {
                iArr2 = iArr11;
                C12009k4 c12009k45 = new C12009k4(iM56663c5, i12, 2498570);
                c12009k43 = c12009k42;
                abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k45);
                try {
                    c12007ix = c12007ixClone;
                    abstractC12008jdM56582k4.mo17594x1(abstractC12024x13, new C12014ne(0, 0, iM56663c5, i12));
                    abstractC12008jdM56582k4.dispose();
                    C3983k4 c3983k4M56597k43 = c12009k45.m56597k4(new C12014ne(0, 0, iM56663c5, i12), 1, 2498570);
                    int iM15716k4 = c3983k4M56597k43.m15716k4() * c3983k4M56597k43.m15722x1();
                    int[] iArr12 = new int[iM15716k4];
                    c3983k4 = c3983k4M56597k42;
                    c14112xw = c14112xwM15721to;
                    C3914k4.m15619k4(c3983k4M56597k43.m15721to(), iArr12, 0, iM15716k4);
                    c12009k45.m56605k4(c3983k4M56597k43);
                    iArr10 = iArr12;
                } finally {
                }
            }
            float f7 = iM56663c5;
            float f8 = i12;
            C11913yj c11913yj2 = new C11913yj(c12007ix.m56550c5() / f7, 0.0f, 0.0f, c12007ix.m56575x1() / f8, c12007ix.m56552du().m56897x1(), c12007ix.m56552du().m56895kk());
            C11913yj c11913yjM55760h4 = c11913yj2.m55760h4();
            c11913yjM55760h4.m55780m9();
            float[] fArrM55776k4 = c11913yj2.m55776k4();
            float[] fArrM55776k42 = c11913yjM55760h4.m55776k4();
            int i13 = 0;
            while (true) {
                int[] iArr13 = iArr;
                if (i13 >= C14116yg.m67481k4(c12007ixClone2.m56575x1(), f8)) {
                    break;
                }
                boolean z = zM14470k4;
                if (c12007ixClone2.m56575x1() <= f8) {
                    i = iM15722x1;
                    c12018u4 = c12018u4Mo9071x1;
                    if (i13 < i12) {
                        iOooO00o = OooO.OooO00o(m21982k4(0.0f, r11, fArrM55776k4)[1], 14);
                        iOooO00o2 = i13;
                    }
                    fArr = fArrM55776k42;
                    f = f8;
                    fArr2 = fArrM55776k4;
                    i2 = iM56663c5;
                    i3 = i13;
                    cls = cls4;
                    iArr3 = iArr13;
                    i4 = i;
                    iArr4 = iArr2;
                    f2 = f7;
                    i13 = i3 + 1;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    c3983k4M56597k4 = c3983k4M56597k4;
                    f7 = f2;
                    c12018u4Mo9071x1 = c12018u4;
                    f8 = f;
                    fArrM55776k4 = fArr2;
                    iM56663c5 = i2;
                    fArrM55776k42 = fArr;
                    cls4 = cls;
                    iM15722x1 = i4;
                    c14112xw = c14112xw;
                    zM14470k4 = z;
                    abstractC12024x13 = abstractC12024x13;
                    iArr8 = iArr8;
                } else if (i13 >= c4201h4.m16694g8().mo15757m9()) {
                    fArr = fArrM55776k42;
                    f2 = f7;
                    f = f8;
                    fArr2 = fArrM55776k4;
                    i2 = iM56663c5;
                    i3 = i13;
                    i4 = iM15722x1;
                    c12018u4 = c12018u4Mo9071x1;
                    cls = cls4;
                    iArr3 = iArr13;
                    iArr4 = iArr2;
                    i13 = i3 + 1;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    c3983k4M56597k4 = c3983k4M56597k4;
                    f7 = f2;
                    c12018u4Mo9071x1 = c12018u4;
                    f8 = f;
                    fArrM55776k4 = fArr2;
                    iM56663c5 = i2;
                    fArrM55776k42 = fArr;
                    cls4 = cls;
                    iM15722x1 = i4;
                    c14112xw = c14112xw;
                    zM14470k4 = z;
                    abstractC12024x13 = abstractC12024x13;
                    iArr8 = iArr8;
                } else {
                    i = iM15722x1;
                    iOooO00o = OooO.OooO00o(c12007ixClone2.m56551ck() + r11, 14);
                    c12018u4 = c12018u4Mo9071x1;
                    iOooO00o2 = OooO.OooO00o(m21982k4(0.0f, iOooO00o, fArrM55776k42)[1], 14);
                }
                int i14 = iOooO00o2;
                int i15 = iOooO00o;
                int i16 = 0;
                while (true) {
                    if (i16 >= C14116yg.m67481k4(c12007ixClone2.m56550c5(), f7)) {
                        break;
                    }
                    if (c12007ixClone2.m56550c5() <= f7) {
                        abstractC12024x1 = abstractC12024x13;
                        cls2 = cls4;
                        if (i16 >= iM56663c5) {
                            c12018u42 = c12018u4;
                            iArr7 = iArr2;
                            fArr4 = fArrM55776k42;
                            f5 = f8;
                            fArr3 = fArrM55776k4;
                            i10 = iM56663c5;
                            i7 = i13;
                            i8 = i16;
                            c12018u4 = c12018u42;
                            iArr5 = iArr13;
                            c14112xw2 = c14112xw;
                            i9 = i;
                            f6 = f7;
                            iArr6 = iArr8;
                            c3983k42 = c3983k4M56597k4;
                            i5 = i14;
                            abstractC12024x12 = abstractC12024x1;
                            i6 = i15;
                            cls3 = cls2;
                        } else {
                            iOooO00o3 = OooO.OooO00o(m21982k4(r12, 0.0f, fArrM55776k4)[0], 14);
                            iOooO00o4 = i16;
                            f3 = iOooO00o3;
                            f4 = i15;
                            c12018u42 = c12018u4;
                            if (c12018u42.m56754k4(f3, f4)) {
                            }
                        }
                    } else if (i16 >= c4201h4.m16694g8().mo15760yj()) {
                        abstractC12024x1 = abstractC12024x13;
                        cls2 = cls4;
                        c12018u42 = c12018u4;
                        iArr7 = iArr2;
                        fArr4 = fArrM55776k42;
                        f5 = f8;
                        fArr3 = fArrM55776k4;
                        i10 = iM56663c5;
                        i7 = i13;
                        i8 = i16;
                        c12018u4 = c12018u42;
                        iArr5 = iArr13;
                        c14112xw2 = c14112xw;
                        i9 = i;
                        f6 = f7;
                        iArr6 = iArr8;
                        c3983k42 = c3983k4M56597k4;
                        i5 = i14;
                        abstractC12024x12 = abstractC12024x1;
                        i6 = i15;
                        cls3 = cls2;
                    } else {
                        abstractC12024x1 = abstractC12024x13;
                        iOooO00o3 = OooO.OooO00o(c12007ixClone2.m56557jd() + r12, 14);
                        cls2 = cls4;
                        iOooO00o4 = OooO.OooO00o(m21982k4(iOooO00o3, 0.0f, fArrM55776k42)[0], 14);
                        f3 = iOooO00o3;
                        f4 = i15;
                        c12018u42 = c12018u4;
                        if (c12018u42.m56754k4(f3, f4)) {
                            iArr7 = iArr2;
                            fArr4 = fArrM55776k42;
                            f5 = f8;
                            fArr3 = fArrM55776k4;
                            i10 = iM56663c5;
                            i7 = i13;
                            i8 = i16;
                            c12018u4 = c12018u42;
                            iArr5 = iArr13;
                            c14112xw2 = c14112xw;
                            i9 = i;
                            f6 = f7;
                            iArr6 = iArr8;
                            c3983k42 = c3983k4M56597k4;
                            i5 = i14;
                            abstractC12024x12 = abstractC12024x1;
                            i6 = i15;
                            cls3 = cls2;
                        } else {
                            int iM67507x1 = C14116yg.m67507x1(iOooO00o4, iM56663c5 - 1);
                            int iM67507x12 = C14116yg.m67507x1(i14, i12 - 1);
                            int iM27462to = C7019kk.m27462to(Float.valueOf(C14116yg.m67504x1(f3, c12007ixClone2.m56556h4() - 1.0f)), 13);
                            int iM27462to2 = C7019kk.m27462to(Float.valueOf(C14116yg.m67504x1(f4, c12007ixClone2.m56558k4() - 1.0f)), 13);
                            int i17 = (iM67507x12 * iM56663c5) + iM67507x1;
                            C14112xw c14112xw3 = c14112xw;
                            c3983k42 = c3983k4M56597k4;
                            i5 = iM67507x12;
                            i6 = iM27462to2;
                            c14112xw2 = c14112xw3;
                            f5 = f8;
                            i7 = i13;
                            i8 = i16;
                            iArr5 = iArr13;
                            fArr3 = fArrM55776k4;
                            float[] fArr5 = fArrM55776k42;
                            iArr6 = iArr8;
                            c12018u4 = c12018u42;
                            i9 = i;
                            f6 = f7;
                            iArr7 = iArr2;
                            long jM21980k4 = m21980k4(j, c4201h4, c12007ixClone2.Clone(), iM56663c5, iM27462to, fArr5, i17, iM67507x1, i5, i12, i6, iArr5);
                            Class<C11999ar> cls5 = cls2;
                            abstractC12024x12 = abstractC12024x1;
                            if (z) {
                                j2 = 4294967295L;
                                jM56506h4 = ((long) (zM27469x1 ? ((C11999ar) C7019kk.m27452k4((Object) abstractC12024x12, (Class) cls5)).m56305h4().m56506h4() : iArr10[i17])) & 4294967295L;
                            } else {
                                j2 = 4294967295L;
                                jM56506h4 = 4278190080L;
                            }
                            int iM15722x12 = (c3983k4.m15722x1() * i6) + iM27462to;
                            if (iM15722x12 >= i9 || iM15722x12 < 0) {
                                cls3 = cls5;
                                i10 = iM56663c5;
                                fArr4 = fArr5;
                            } else {
                                long jM16879k4 = C4206x1.m16879k4(jM21980k4, ((long) iArr6[iM15722x12]) & j2, jM56506h4, j);
                                int i18 = iArr7[iM15722x12];
                                if (i18 != iArr6[iM15722x12]) {
                                    cls3 = cls5;
                                    long j3 = i18 & j2;
                                    fArr4 = fArr5;
                                    long j4 = jM16879k4 & j2;
                                    byte bOooO00o = com.aspose.slides.internal.p102e8.OooO00o.OooO00o((((byte) ((j3 >> 24) & j2)) & 255) + (((byte) ((j4 >> 24) & j2)) & 255), 2.0f, 13);
                                    byte bOooO00o2 = com.aspose.slides.internal.p102e8.OooO00o.OooO00o((((byte) ((j3 >> 16) & j2)) & 255) + (((byte) ((j4 >> 16) & j2)) & 255), 2.0f, 13);
                                    byte bOooO00o3 = com.aspose.slides.internal.p102e8.OooO00o.OooO00o((((byte) ((j3 >> 8) & j2)) & 255) + (((byte) ((j4 >> 8) & j2)) & 255), 2.0f, 13);
                                    i10 = iM56663c5;
                                    iArr7[iM15722x12] = (int) ((((long) (((bOooO00o2 & 255) << 16) & WarningType.MINOR_FORMATTING_LOSS_CATEGORY)) | (((long) ((bOooO00o & 255) << 24)) & 4278190080L) | ((long) (((bOooO00o3 & 255) << 8) & 65280)) | ((long) (com.aspose.slides.internal.p102e8.OooO00o.OooO00o((((byte) (r0 & j2)) & 255) + (((byte) (jM16879k4 & j2)) & 255), 2.0f, 13) & 255))) & j2);
                                } else {
                                    cls3 = cls5;
                                    i10 = iM56663c5;
                                    fArr4 = fArr5;
                                    iArr7[iM15722x12] = (int) jM16879k4;
                                }
                            }
                        }
                    }
                    i16 = i8 + 1;
                    iArr2 = iArr7;
                    f7 = f6;
                    f8 = f5;
                    fArrM55776k4 = fArr3;
                    i13 = i7;
                    iM56663c5 = i10;
                    fArrM55776k42 = fArr4;
                    cls4 = cls3;
                    i15 = i6;
                    i = i9;
                    i14 = i5;
                    c3983k4M56597k4 = c3983k42;
                    c14112xw = c14112xw2;
                    abstractC12024x13 = abstractC12024x12;
                    iArr8 = iArr6;
                    iArr13 = iArr5;
                }
                fArr = fArrM55776k42;
                f = f8;
                fArr2 = fArrM55776k4;
                i2 = iM56663c5;
                i3 = i13;
                cls = cls4;
                iArr3 = iArr13;
                i4 = i;
                iArr4 = iArr2;
                f2 = f7;
                i13 = i3 + 1;
                iArr = iArr3;
                iArr2 = iArr4;
                c3983k4M56597k4 = c3983k4M56597k4;
                f7 = f2;
                c12018u4Mo9071x1 = c12018u4;
                f8 = f;
                fArrM55776k4 = fArr2;
                iM56663c5 = i2;
                fArrM55776k42 = fArr;
                cls4 = cls;
                iM15722x1 = i4;
                c14112xw = c14112xw;
                zM14470k4 = z;
                abstractC12024x13 = abstractC12024x13;
                iArr8 = iArr8;
            }
            int[] iArr14 = iArr2;
            C14112xw c14112xw4 = c14112xw;
            C3983k4 c3983k43 = c3983k4M56597k4;
            C3914k4.m15622k4(iArr14, 0, c14112xw4, iArr14.length);
            c4201h4.m16694g8().m56605k4(c3983k4);
            if (c12009k43 != null) {
                c12009k43.m56605k4(c3983k43);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static float[] m21982k4(float f, float f2, float[] fArr) {
        return new float[]{(fArr[1] * f2) + (fArr[0] * f) + fArr[4], (fArr[3] * f2) + (fArr[2] * f) + fArr[5]};
    }
}
