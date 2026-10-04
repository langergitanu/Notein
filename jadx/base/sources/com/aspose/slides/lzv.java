package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p077d8.C3108y2;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.internal.p505xn.C12556ck;
import com.aspose.slides.p559ms.System.C14112xw;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes3.dex */
class lzv {

    /* JADX INFO: renamed from: k4 */
    protected IReflectionEffectiveData f46124k4;

    public lzv(IReflectionEffectiveData iReflectionEffectiveData) {
        if (iReflectionEffectiveData == null) {
            throw new ArgumentNullException("reflectionEffectiveData is null.");
        }
        this.f46124k4 = iReflectionEffectiveData;
    }

    /* JADX INFO: renamed from: k4 */
    public static float m64647k4(float f, float f2) {
        float f3 = (f2 / 10.0f) * (0.8f / (f / 8.0f));
        return f3 / (1.0f + f3);
    }

    /* JADX INFO: renamed from: x1 */
    private static void m64650x1(C12009k4 c12009k4, float f, IReflectionEffectiveData iReflectionEffectiveData, boolean z, float f2) {
        char c;
        int i;
        int i2;
        int[] iArr;
        float f3;
        int i3;
        char c2;
        float startReflectionOpacity = (iReflectionEffectiveData.getStartReflectionOpacity() / 100.0f) * (1.0f - m64647k4(f, (float) iReflectionEffectiveData.getDistance()));
        float endReflectionOpacity = iReflectionEffectiveData.getEndReflectionOpacity() / 100.0f;
        float startPosAlpha = iReflectionEffectiveData.getStartPosAlpha() / 100.0f;
        float endPosAlpha = iReflectionEffectiveData.getEndPosAlpha() / 100.0f;
        float[] fArr = new float[256];
        byte b = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            fArr[i4] = i4 / 255.0f;
        }
        int[] iArr2 = new int[c12009k4.mo15757m9()];
        float[] fArr2 = new float[c12009k4.mo15757m9()];
        int i5 = 0;
        while (true) {
            int iMo15757m9 = c12009k4.mo15757m9();
            c = ControlChar.PARAGRAPH_BREAK_CHAR;
            i = 255;
            if (i5 >= iMo15757m9) {
                break;
            }
            float fMo15757m9 = i5 / c12009k4.mo15757m9();
            fArr2[i5] = fMo15757m9;
            int iM27462to = C7019kk.m27462to(Float.valueOf(((((fMo15757m9 - startPosAlpha) * (endReflectionOpacity - startReflectionOpacity)) / (endPosAlpha - startPosAlpha)) + startReflectionOpacity) * 255.0f), 13);
            if (iM27462to <= 255) {
                i = iM27462to < 0 ? 0 : iM27462to;
            }
            iArr2[i5] = i;
            i5++;
        }
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 3, c12009k4.mo15753jd());
        C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
        int iMo15757m92 = c12009k4.mo15757m9() * C14116yg.m67482k4(c3983k4M56597k4.m15715du());
        byte[] bArr = new byte[iMo15757m92];
        C3914k4.m15618k4(c14112xwM15721to, bArr, 0, iMo15757m92);
        int iMo15760yj = c12009k4.mo15760yj();
        int iMo15757m93 = c12009k4.mo15757m9();
        int i6 = 0;
        while (i6 < iMo15760yj) {
            byte b2 = b;
            for (int i7 = b; i7 < iMo15757m93; i7++) {
                int i8 = (((i7 * iMo15760yj) + i6) << 2) + 3;
                float f4 = fArr2[i7];
                int i9 = bArr[i8] & i;
                if (f4 < startPosAlpha || f4 > endPosAlpha) {
                    i2 = iMo15760yj;
                    iArr = iArr2;
                    f3 = startPosAlpha;
                    i3 = i;
                    c2 = ControlChar.PARAGRAPH_BREAK_CHAR;
                    if (f4 > endPosAlpha && i9 > 0) {
                        bArr[i8] = b2;
                    }
                } else {
                    if (i9 > 0) {
                        float f5 = fArr[i9];
                        if (z) {
                            if (iArr2[i7] == 0 || f5 == 0.0f) {
                                i2 = iMo15760yj;
                                iArr = iArr2;
                                f3 = startPosAlpha;
                                i3 = 255;
                                bArr[i8] = b2;
                            } else {
                                i2 = iMo15760yj;
                                iArr = iArr2;
                                f3 = startPosAlpha;
                                int iOooO00o = com.aspose.slides.Collections.Generic.OooO00o.OooO00o(C14116yg.m67469du((r14 * f5) / 255.0f, 1.0f / f2), 255.0d, 14);
                                i3 = 255;
                                if (iOooO00o > 255) {
                                    iOooO00o = 255;
                                }
                                bArr[i8] = (byte) iOooO00o;
                            }
                        } else {
                            i2 = iMo15760yj;
                            iArr = iArr2;
                            f3 = startPosAlpha;
                            i3 = i;
                            float f6 = iArr[i7];
                            c2 = ControlChar.PARAGRAPH_BREAK_CHAR;
                            bArr[i8] = C22202OooO0oo.OooO00o(f6, f5, 13);
                        }
                    } else {
                        i2 = iMo15760yj;
                        iArr = iArr2;
                        f3 = startPosAlpha;
                        i3 = i;
                    }
                    c2 = ControlChar.PARAGRAPH_BREAK_CHAR;
                }
                i = i3;
                c = c2;
                iMo15760yj = i2;
                startPosAlpha = f3;
                iArr2 = iArr;
            }
            i6++;
            b = b2;
            startPosAlpha = startPosAlpha;
            iArr2 = iArr2;
        }
        C3914k4.m15621k4(bArr, b == true ? 1 : 0, c14112xwM15721to, iMo15757m92);
        c12009k4.m56605k4(c3983k4M56597k4);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x0010, B:6:0x0016, B:10:0x0025, B:9:0x0022), top: B:16:0x0010 }] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C11913yj m64651k4(C11896dy c11896dy, azo azoVar) {
        C12007ix c12007ixClone = c11896dy.m55523c5().Clone();
        C11896dy c11896dy2 = (C11896dy) c11896dy.deepClone();
        if (azoVar != null) {
            try {
                if (azoVar.m3903h4()) {
                    C12556ck.m58562k4(c11896dy2, azoVar.m3930x6());
                } else {
                    c11896dy2.m55526dy();
                }
            } finally {
            }
        }
        c11896dy2.m55523c5().CloneTo(c12007ixClone);
        c11896dy2.dispose();
        float scaleHorizontal = ((float) this.f46124k4.getScaleHorizontal()) / 100.0f;
        float scaleVertical = ((float) this.f46124k4.getScaleVertical()) / 100.0f;
        C11913yj c11913yj = new C11913yj(C14116yg.m67482k4(C14116yg.m67505x1(scaleHorizontal)), 0.0f, 0.0f, C14116yg.m67505x1(scaleVertical), 0.0f, (c12007ixClone.m56575x1() + c12007ixClone.m56551ck()) * 2.0f);
        C11913yj c11913yj2 = new C11913yj();
        c11913yj2.m55777kk(c12007ixClone.m56557jd(), c12007ixClone.m56551ck());
        c11913yj2.m55763k4(C14116yg.m67480k4(scaleHorizontal), C14116yg.m67480k4(scaleVertical));
        c11913yj2.m55777kk(-c12007ixClone.m56557jd(), -c12007ixClone.m56551ck());
        C11913yj c11913yj3 = new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, (float) this.f46124k4.getDistance());
        new C11913yj();
        C11913yj c11913yj4 = new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
        c11913yj4.m55769k4(c11913yj, 1);
        c11913yj4.m55769k4(c11913yj3, 1);
        c11913yj4.m55769k4(c11913yj2, 1);
        return c11913yj4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C11913yj m64652k4(AbstractC14897zn abstractC14897zn) {
        C11913yj c11913yj = new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
        if (this.f46124k4.getRotateShadowWithShape() || abstractC14897zn == null) {
            return c11913yj;
        }
        C4317dy c4317dyM74623ks = abstractC14897zn.m74623ks();
        C4317dy c4317dyM74626rv = abstractC14897zn.m74626rv();
        abstractC14897zn.m74615k4(c4317dyM74623ks, false);
        C11913yj c11913yjM13229x1 = C3108y2.m13229x1(C3108y2.m13223k4(c4317dyM74626rv));
        C11913yj c11913yjM13229x12 = C3108y2.m13229x1(c4317dyM74623ks);
        c11913yjM13229x12.m55769k4(c11913yjM13229x1, 1);
        return c11913yjM13229x12;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12007ix m64653k4(C11896dy c11896dy, AbstractC14897zn abstractC14897zn) {
        if (c11896dy == null) {
            throw new ArgumentNullException("shapePath is null");
        }
        C11896dy c11896dy2 = (C11896dy) C7019kk.m27452k4(c11896dy.deepClone(), C11896dy.class);
        c11896dy2.m55577x1(m64652k4(abstractC14897zn));
        c11896dy2.m55577x1(m64651k4(c11896dy2, (azo) null));
        return c11896dy2.m55523c5().Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64654k4(C11896dy c11896dy, C12007ix c12007ix, C11913yj c11913yj, azo azoVar, C0962es c0962es, AbstractC14897zn abstractC14897zn) {
        float fM3906k4 = (azoVar == null || !azoVar.m3903h4()) ? 0.0f : (float) azoVar.m3906k4();
        double blurRadius = this.f46124k4.getBlurRadius();
        float f = fM3906k4 + 2.0f;
        C12025x6 c12025x6 = new C12025x6(c12007ix.m56557jd() - (C7019kk.m27462to(Double.valueOf(blurRadius), 14) + f), c12007ix.m56551ck() - (C7019kk.m27462to(Double.valueOf(blurRadius), 14) + f));
        C11913yj c11913yj2 = new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, -c12025x6.m56897x1(), -c12025x6.m56895kk());
        c11896dy.m55577x1(c11913yj2);
        double d = (((double) f) + blurRadius) * 2.0d;
        C12009k4 c12009k4 = new C12009k4(C22201OooO0oO.OooO00o(c12007ix.m56550c5(), d, 14), C22201OooO0oO.OooO00o(c12007ix.m56575x1(), d, 14));
        try {
            if (abstractC14897zn.m74608ar() != null) {
                c12009k4.m56332k4(abstractC14897zn.m74608ar().mo17483jd(), abstractC14897zn.m74608ar().mo17474ck());
            }
            AbstractC12008jd abstractC12008jdM70048k4 = C14381rb.m70048k4(c12009k4, abstractC14897zn);
            try {
                C11913yj c11913yj3 = new C11913yj();
                c11913yj3.m55769k4(c11913yj, 1);
                c11913yj3.m55769k4(c11913yj2, 1);
                m64655k4(abstractC12008jdM70048k4, c11896dy, c0962es, azoVar, c11913yj3);
                m64648k4(c12009k4, c12007ix.m56575x1(), this.f46124k4);
                if (blurRadius > 4.0d) {
                    C1234i0.m7346k4(c12009k4, blurRadius * ((double) 0.33333334f), 4);
                }
                m64656k4(abstractC14897zn, c12009k4, c12025x6.Clone());
                c12009k4.dispose();
            } finally {
                if (abstractC12008jdM70048k4 != null) {
                    abstractC12008jdM70048k4.dispose();
                }
            }
        } catch (Throwable th) {
            c12009k4.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64655k4(AbstractC12008jd abstractC12008jd, C11896dy c11896dy, C0962es c0962es, azo azoVar, C11913yj c11913yj) {
        if (c0962es != null && c0962es.m5681to() != 0) {
            AbstractC12024x1 abstractC12024x1M73548kk = C14814xq.m73548kk(c0962es);
            try {
                C11913yj c11913yjM70045k4 = C14381rb.m70045k4(abstractC12024x1M73548kk);
                c11913yjM70045k4.m55769k4(c11913yj, 1);
                C14381rb.m70054k4(abstractC12024x1M73548kk, c11913yjM70045k4);
                abstractC12008jd.mo17527k4(abstractC12024x1M73548kk, c11896dy);
            } finally {
                if (abstractC12024x1M73548kk != null) {
                    abstractC12024x1M73548kk.dispose();
                }
            }
        }
        if (azoVar == null || !azoVar.m3903h4()) {
            return;
        }
        C12026yj c12026yjM3930x6 = azoVar.m3930x6();
        try {
            C11913yj c11913yjM56940x6 = c12026yjM3930x6.m56940x6();
            c11913yjM56940x6.m55769k4(c11913yj, 1);
            c12026yjM3930x6.m56922k4(c11913yjM56940x6);
            abstractC12008jd.mo17540k4(c12026yjM3930x6, c11896dy);
            c12026yjM3930x6.dispose();
        } catch (Throwable th) {
            if (c12026yjM3930x6 != null) {
                c12026yjM3930x6.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64648k4(C12009k4 c12009k4, float f, IReflectionEffectiveData iReflectionEffectiveData) {
        m64650x1(c12009k4, f, iReflectionEffectiveData, false, 1.0f);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64649k4(C12009k4 c12009k4, float f, IReflectionEffectiveData iReflectionEffectiveData, boolean z, float f2) {
        m64650x1(c12009k4, f, iReflectionEffectiveData, z, f2);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo64370k4(AbstractC14897zn abstractC14897zn, C11896dy c11896dy, C0962es c0962es, azo azoVar, IShapeFrame iShapeFrame) {
        if (c11896dy == null) {
            throw new ArgumentNullException("path is null.");
        }
        if (c11896dy.m55525du() == 0) {
            return;
        }
        if ((c0962es == null || c0962es.m5681to() == 0) && (azoVar == null || !azoVar.m3903h4())) {
            return;
        }
        C11896dy c11896dy2 = (C11896dy) c11896dy.deepClone();
        try {
            C11913yj c11913yjM64652k4 = m64652k4(abstractC14897zn);
            c11896dy2.m55577x1(c11913yjM64652k4);
            C11913yj c11913yjM64651k4 = m64651k4(c11896dy2, azoVar);
            c11896dy2.m55577x1(c11913yjM64651k4);
            c11913yjM64651k4.m55769k4(c11913yjM64652k4, 0);
            m64654k4(c11896dy2, c11896dy2.m55523c5().Clone(), c11913yjM64651k4, azoVar, c0962es, abstractC14897zn);
            c11896dy2.dispose();
        } finally {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64656k4(AbstractC14897zn abstractC14897zn, C12009k4 c12009k4, C12025x6 c12025x6) {
        if (this.f46124k4.getRotateShadowWithShape()) {
            abstractC14897zn.mo64340k4(c12009k4, C7019kk.m27462to(Double.valueOf(C14116yg.m67490kk(c12025x6.m56897x1())), 14), C7019kk.m27462to(Double.valueOf(C14116yg.m67490kk(c12025x6.m56895kk())), 14));
            return;
        }
        C4317dy c4317dyM74623ks = abstractC14897zn.m74623ks();
        abstractC14897zn.m74626rv();
        abstractC14897zn.mo64340k4(c12009k4, C7019kk.m27462to(Double.valueOf(C14116yg.m67490kk(c12025x6.m56897x1())), 14), C7019kk.m27462to(Double.valueOf(C14116yg.m67490kk(c12025x6.m56895kk())), 14));
        abstractC14897zn.m74615k4(c4317dyM74623ks, false);
    }
}
