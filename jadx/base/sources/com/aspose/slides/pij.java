package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.p559ms.System.C14112xw;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class pij {

    /* JADX INFO: renamed from: k4 */
    private ISoftEdgeEffectiveData f48076k4;

    public pij(ISoftEdgeEffectiveData iSoftEdgeEffectiveData) {
        this.f48076k4 = iSoftEdgeEffectiveData;
    }

    /* JADX INFO: renamed from: k4 */
    private void m69105k4(C12009k4 c12009k4, C12009k4 c12009k42, float f, int i) {
        if (c12009k4 == null) {
            throw new ArgumentNullException("bitmap cannot be null.");
        }
        if (c12009k42 == null) {
            throw new ArgumentNullException("alphaChannelBitmap cannot be null.");
        }
        if (c12009k4.mo15760yj() != c12009k42.mo15760yj() || c12009k4.mo15757m9() != c12009k42.mo15757m9()) {
            throw new ArgumentException("Width and Height values of the bitmap argument should be equal the Width and the Height values of the alphaChannelBitmap argument.");
        }
        int iMo15757m9 = c12009k42.mo15757m9() * c12009k42.mo15760yj();
        int[] iArr = new int[iMo15757m9];
        if (c12009k42.mo15760yj() != 0 && c12009k42.mo15757m9() != 0) {
            int iM56311k4 = AbstractC12002ck.m56311k4(c12009k42.mo15753jd()) >> 3;
            byte[] bArrM70057k4 = C14381rb.m70057k4(c12009k42);
            int i2 = i;
            for (int i3 = 0; i3 < iMo15757m9; i3++) {
                iArr[i3] = bArrM70057k4[i2] & 255;
                i2 += iM56311k4;
            }
            int[] iArr2 = new int[iMo15757m9];
            C1234i0.m7348k4(iArr, iArr2, c12009k42.mo15760yj(), c12009k42.mo15757m9(), r5 * f * (((float) this.f48076k4.getRadius()) >= 50.0f ? 0.32258067f : 0.3125f), 3);
            int i4 = i;
            for (int i5 = 0; i5 < iMo15757m9; i5++) {
                bArrM70057k4[i4] = (byte) iArr2[i5];
                i4 += iM56311k4;
            }
            iArr = iArr2;
        }
        if (c12009k4.mo15760yj() == 0 || c12009k4.mo15757m9() == 0) {
            return;
        }
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 3, c12009k4.mo15753jd());
        C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
        int iMo15757m92 = c12009k4.mo15757m9() * C14116yg.m67482k4(c3983k4M56597k4.m15715du());
        byte[] bArr = new byte[iMo15757m92];
        C3914k4.m15618k4(c14112xwM15721to, bArr, 0, iMo15757m92);
        float[] fArr = new float[256];
        for (int i6 = 0; i6 < 256; i6++) {
            fArr[i6] = i6 / 255.0f;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < c12009k4.mo15757m9() * c12009k4.mo15760yj(); i8++) {
            int i9 = i7 + 3;
            int i10 = bArr[i9] & 255;
            if (i10 != 0) {
                bArr[i9] = C22202OooO0oo.OooO00o(fArr[i10], iArr[i8], 13);
            }
            i7 += 4;
        }
        C3914k4.m15621k4(bArr, 0, c14112xwM15721to, iMo15757m92);
        c12009k4.m56605k4(c3983k4M56597k4);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: k4 */
    public final void m69106k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, C11896dy c11896dy, C0962es c0962es, azo azoVar) {
        float fMo15757m9;
        float fMo15760yj;
        C12009k4 c12009k4;
        float f;
        C12026yj c12026yjM3930x6;
        if (this.f48076k4.getRadius() == 0.0d) {
            return;
        }
        if ((c0962es == null || c0962es.m5681to() == 0) && (azoVar == null || !azoVar.m3903h4())) {
            return;
        }
        C11896dy c11896dy2 = (C11896dy) C7019kk.m27452k4(c11896dy.deepClone(), C11896dy.class);
        C12007ix c12007ixClone = c11896dy2.m55523c5().Clone();
        if (C7019kk.m27469x1(c0962es, cxj.class)) {
            AbstractC12002ck abstractC12002ckM4846bv = ((cxj) C7019kk.m27452k4((Object) c0962es, cxj.class)).m4846bv();
            float[] fArrM55776k4 = abstractC14897zn.m74608ar().mo17577u4().m55776k4();
            fMo15760yj = (((float) abstractC12002ckM4846bv.mo15760yj()) <= c12007ixClone.m56550c5() || fArrM55776k4[0] <= 2.0f) ? 1.0f : abstractC12002ckM4846bv.mo15760yj() / c12007ixClone.m56550c5();
            fMo15757m9 = (((float) abstractC12002ckM4846bv.mo15757m9()) <= c12007ixClone.m56575x1() || fArrM55776k4[3] <= 2.0f) ? 1.0f : abstractC12002ckM4846bv.mo15757m9() / c12007ixClone.m56575x1();
            if (kg7Var != null) {
                float fM63832ck = kg7Var.m63832ck() / 72.0f;
                fMo15760yj *= fM63832ck;
                fMo15757m9 *= fM63832ck;
            }
        } else {
            fMo15757m9 = 1.0f;
            fMo15760yj = 1.0f;
        }
        float fM3906k4 = (azoVar == null || !azoVar.m3903h4()) ? 0.0f : (float) azoVar.m3906k4();
        float f2 = 8 + fM3906k4;
        C12025x6 c12025x6 = new C12025x6(c12007ixClone.m56557jd() - f2, c12007ixClone.m56551ck() - f2);
        C11913yj c11913yj = new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, -c12025x6.m56897x1(), -c12025x6.m56895kk());
        c11896dy2.m55577x1(c11913yj);
        try {
            float f3 = f2 * 2.0f;
            C12009k4 c12009k42 = new C12009k4(C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1((c12007ixClone.m56550c5() + f3) * fMo15760yj)), 14), C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1((c12007ixClone.m56575x1() + f3) * fMo15757m9)), 14), 2498570);
            try {
                if (abstractC14897zn.m74608ar() != null) {
                    c12009k42.m56332k4(abstractC14897zn.m74608ar().mo17483jd(), abstractC14897zn.m74608ar().mo17474ck());
                }
                AbstractC12008jd abstractC12008jdM70048k4 = C14381rb.m70048k4(c12009k42, abstractC14897zn);
                try {
                    abstractC12008jdM70048k4.mo17492k4(fMo15760yj, fMo15757m9);
                    abstractC12008jdM70048k4.mo17517k4(C12003du.m56396k4(0).Clone());
                    C11913yj c11913yj2 = new C11913yj();
                    c11913yj2.m55769k4(c11913yj, 1);
                    if (c0962es != null && c0962es.m5681to() != 0) {
                        AbstractC12024x1 abstractC12024x1M73548kk = C14814xq.m73548kk(c0962es);
                        try {
                            C11913yj c11913yjM70045k4 = C14381rb.m70045k4(abstractC12024x1M73548kk);
                            c11913yjM70045k4.m55769k4(c11913yj2, 1);
                            C14381rb.m70054k4(abstractC12024x1M73548kk, c11913yjM70045k4);
                            abstractC12008jdM70048k4.mo17527k4(abstractC12024x1M73548kk, c11896dy2);
                            if (abstractC12024x1M73548kk != null) {
                                abstractC12024x1M73548kk.dispose();
                            }
                        } catch (Throwable th) {
                            if (abstractC12024x1M73548kk != null) {
                                abstractC12024x1M73548kk.dispose();
                            }
                            throw th;
                        }
                    }
                    if (azoVar != null && azoVar.m3903h4()) {
                        c12026yjM3930x6 = azoVar.m3930x6();
                        try {
                            C11913yj c11913yjM56940x6 = c12026yjM3930x6.m56940x6();
                            c11913yjM56940x6.m55769k4(c11913yj2, 1);
                            c12026yjM3930x6.m56922k4(c11913yjM56940x6);
                            abstractC12008jdM70048k4.mo17540k4(c12026yjM3930x6, c11896dy2);
                            c12026yjM3930x6.dispose();
                        } finally {
                        }
                    }
                    abstractC12008jdM70048k4.dispose();
                    C12009k4 c12009k43 = new C12009k4(c12009k42.mo15760yj(), c12009k42.mo15757m9(), c12009k42.mo15753jd());
                    try {
                        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k43);
                        try {
                            abstractC12008jdM56582k4.mo17586x1(1);
                            abstractC12008jdM56582k4.mo17560kk(1);
                            abstractC12008jdM56582k4.mo17476du(3);
                            abstractC12008jdM56582k4.mo17481h4(3);
                            abstractC12008jdM56582k4.mo17492k4(fMo15760yj, fMo15757m9);
                            float radius = (float) this.f48076k4.getRadius();
                            if (c0962es == null || c0962es.m5681to() == 0) {
                                f = fMo15760yj;
                                if (azoVar != null && azoVar.m3903h4()) {
                                    abstractC12008jdM56582k4.mo17517k4(C12003du.m56398k4(255, 0, 0, 0).Clone());
                                    float f4 = fM3906k4 - (radius * 1.75f);
                                    if (f4 < 0.0f) {
                                        f4 = 0.0f;
                                    }
                                    c12026yjM3930x6 = azoVar.m3930x6();
                                    try {
                                        c12026yjM3930x6.m56923k4(C12003du.m56398k4(255, 255, 0, 0).Clone());
                                        c12026yjM3930x6.m56926kk(f4);
                                        abstractC12008jdM56582k4.mo17540k4(c12026yjM3930x6, c11896dy2);
                                        c12026yjM3930x6.dispose();
                                    } finally {
                                    }
                                }
                            } else {
                                abstractC12008jdM56582k4.mo17517k4(C12003du.m56398k4(255, 0, 0, 0).Clone());
                                abstractC12008jdM56582k4.mo17527k4(new C11999ar(C12003du.m56398k4(255, 255, 0, 0).Clone()), c11896dy2);
                                f = fMo15760yj;
                                C12026yj c12026yj = new C12026yj(C12003du.m56398k4(255, 0, 0, 0).Clone(), C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1((radius >= 50.0f ? 1.8f : 1.75f) * radius)), 14));
                                try {
                                    abstractC12008jdM56582k4.mo17540k4(c12026yj, c11896dy2);
                                    c12026yj.dispose();
                                } catch (Throwable th2) {
                                    c12026yj.dispose();
                                    throw th2;
                                }
                            }
                            m69105k4(c12009k42, c12009k43, C14116yg.m67481k4(f, fMo15757m9), 2);
                            abstractC12008jdM56582k4.dispose();
                            c12009k43.dispose();
                            if (f > 1.0f) {
                                C12007ix c12007ix = new C12007ix(C7019kk.m27462to(Float.valueOf(c12025x6.m56897x1()), 13), C7019kk.m27462to(Float.valueOf(c12025x6.m56895kk()), 13), C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1(c12007ixClone.m56550c5() + f3)), 14), C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1(c12007ixClone.m56575x1() + f3)), 14));
                                abstractC14897zn.mo64339k4(c12009k42, c12007ix.m56557jd(), c12007ix.m56551ck(), c12007ix.m56550c5(), c12007ix.m56575x1());
                            } else {
                                abstractC14897zn.mo64340k4(c12009k42, C7019kk.m27462to(Float.valueOf(c12025x6.m56897x1()), 13), C7019kk.m27462to(Float.valueOf(c12025x6.m56895kk()), 13));
                            }
                            c11896dy2.dispose();
                            c12009k42.dispose();
                        } catch (Throwable th3) {
                            if (abstractC12008jdM56582k4 != null) {
                                abstractC12008jdM56582k4.dispose();
                            }
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        c12009k43.dispose();
                        throw th4;
                    }
                } catch (Throwable th5) {
                    if (abstractC12008jdM70048k4 != null) {
                        abstractC12008jdM70048k4.dispose();
                    }
                    throw th5;
                }
            } catch (Throwable th6) {
                th = th6;
                c12009k4 = c12009k42;
                c11896dy2.dispose();
                if (c12009k4 != null) {
                    c12009k4.dispose();
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            c12009k4 = null;
        }
    }
}
