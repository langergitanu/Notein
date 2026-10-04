package com.aspose.slides;

import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3099wl;
import com.aspose.slides.internal.p077d8.C3108y2;
import com.aspose.slides.internal.p129fe.C3989up;
import com.aspose.slides.internal.p151gj.AbstractC4326to;
import com.aspose.slides.internal.p151gj.C4314c5;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p151gj.C4318fa;
import com.aspose.slides.internal.p151gj.C4319h4;
import com.aspose.slides.internal.p151gj.C4324m9;
import com.aspose.slides.internal.p151gj.C4327up;
import com.aspose.slides.internal.p151gj.C4328x1;
import com.aspose.slides.internal.p151gj.C4330yj;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p323op.C7131h4;
import com.aspose.slides.internal.p323op.C7134m9;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11902kk;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p472w8.C11909up;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12010kk;
import com.aspose.slides.internal.p475wh.C12012lr;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p505xn.C12556ck;
import com.aspose.slides.internal.p505xn.C12567ne;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.xq */
/* JADX INFO: loaded from: classes3.dex */
class C14814xq {

    /* JADX INFO: renamed from: k4 */
    private static final float f50179k4 = im9.m7679k4() * 72.0f;

    /* JADX WARN: Removed duplicated region for block: B:100:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0466  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC4326to m73536k4(C14478sy c14478sy, float f) {
        C12025x6 c12025x6;
        C4324m9 c4324m9;
        float fM70899wl = c14478sy.m70899wl();
        C11902kk c11902kkM5665k4 = C0962es.m5665k4(c14478sy.m70887k4(true));
        if (c14478sy.m70883ck() == 1) {
            C12007ix c12007ixClone = c14478sy.m71131xk().Clone();
            if (C14116yg.m67480k4(c14478sy.m71130wy()) > 0.1d || c14478sy.m71125ak() || c14478sy.m71128dq()) {
                double d = (((double) fM70899wl) / 180.0d) * 3.141592653589793d;
                double dM67470dy = C14116yg.m67470dy(d);
                double dM67495m9 = C14116yg.m67495m9(d);
                if (c14478sy.m71125ak()) {
                    dM67470dy = -dM67470dy;
                }
                if (c14478sy.m71128dq()) {
                    dM67495m9 = -dM67495m9;
                }
                float fM67498to = (float) ((C14116yg.m67498to(dM67495m9, dM67470dy) * 180.0d) / 3.141592653589793d);
                if (c14478sy.m70885ix() != null) {
                    C11896dy c11896dy = (C11896dy) c14478sy.m70885ix().deepClone();
                    c11896dy.m55526dy();
                    m73542k4(c11896dy, c14478sy.m71131xk().Clone(), -c14478sy.m71130wy(), c14478sy.m71126b3().m56897x1(), c14478sy.m71126b3().m56895kk()).CloneTo(c12007ixClone);
                    m73542k4(null, c12007ixClone.Clone(), -fM67498to, c14478sy.m71126b3().m56897x1(), c14478sy.m71126b3().m56895kk()).CloneTo(c12007ixClone);
                    c11896dy.dispose();
                } else {
                    m73542k4(null, c14478sy.m71131xk().Clone(), -c14478sy.m71130wy(), c14478sy.m71126b3().m56897x1(), c14478sy.m71126b3().m56895kk()).CloneTo(c12007ixClone);
                    m73542k4(null, c12007ixClone.Clone(), -fM67498to, c14478sy.m71126b3().m56897x1(), c14478sy.m71126b3().m56895kk()).CloneTo(c12007ixClone);
                }
                m73542k4(null, new C12007ix(c12007ixClone.m56557jd(), c14478sy.m71126b3().m56895kk(), c12007ixClone.m56550c5(), 0.0f), c14478sy.m71130wy() + fM67498to, c14478sy.m71126b3().m56897x1(), c14478sy.m71126b3().m56895kk()).CloneTo(c12007ixClone);
                if (c12007ixClone.m56550c5() < 1.0f) {
                    c12007ixClone.m56576x1(1.0f);
                }
                if (c12007ixClone.m56575x1() < 1.0f) {
                    c12007ixClone.m56560k4(1.0f);
                }
                fM70899wl = fM67498to + c14478sy.m71130wy();
            }
            float f2 = f / 72.0f;
            if (f2 > 1.0f) {
                c12007ixClone.m56576x1(c12007ixClone.m56550c5() + f2);
                c12007ixClone.m56560k4(c12007ixClone.m56575x1() + f2);
            }
            if (c11902kkM5665k4 != null) {
                C12007ix c12007ixClone2 = C0962es.m5667k4(c14478sy.m70893ne().m4217k4(c12007ixClone.Clone()).Clone()).Clone();
                if (fM70899wl == 180.0f) {
                    c12007ixClone2.m56560k4(c12007ixClone2.m56550c5() + 45.0f);
                }
                c4324m9 = new C4324m9(c12007ixClone2.Clone(), C5656k4.m23095k4(c11902kkM5665k4.m55668k4()[0].Clone()), C5656k4.m23095k4(c11902kkM5665k4.m55668k4()[c11902kkM5665k4.m55668k4().length - 1].Clone()));
            } else {
                c4324m9 = new C4324m9(C0962es.m5667k4(c14478sy.m70893ne().m4217k4(c12007ixClone.Clone()).Clone()).Clone(), C5656k4.m23095k4(c14478sy.m70902yj().getValues().get_Item(0).Clone()), C5656k4.m23095k4(c14478sy.m70902yj().getValues().get_Item(0).Clone()));
            }
            c4324m9.m17395k4(fM70899wl);
            if (c11902kkM5665k4 != null) {
                C4319h4[] c4319h4Arr = new C4319h4[c11902kkM5665k4.m55668k4().length];
                for (int i = 0; i < c11902kkM5665k4.m55668k4().length; i++) {
                    c4319h4Arr[i] = new C4319h4(C5656k4.m23095k4(c11902kkM5665k4.m55668k4()[i].Clone()), c11902kkM5665k4.m55669x1()[i]);
                }
                c4324m9.m17405k4(c4319h4Arr);
            }
            return c4324m9;
        }
        C12007ix c12007ixClone3 = m73550x1(c14478sy).Clone();
        C12025x6[] c12025x6Arr = {new C12025x6(c12007ixClone3.m56571to(), c12007ixClone3.m56554dy()), new C12025x6(c12007ixClone3.m56556h4(), c12007ixClone3.m56554dy()), new C12025x6(c12007ixClone3.m56556h4(), c12007ixClone3.m56558k4()), new C12025x6(c12007ixClone3.m56571to(), c12007ixClone3.m56558k4())};
        float fM71130wy = c14478sy.m71130wy();
        C11896dy c11896dyM70885ix = c14478sy.m70885ix();
        C12007ix c12007ixClone4 = c14478sy.m70893ne().m4217k4(c12007ixClone3.Clone()).Clone();
        ohe oheVarClone = c14478sy.m70901x6().Clone();
        oju ojuVarClone = oju.m68619k4(oheVarClone.f47808k4, oju.m68618k4(oheVarClone.f47809x1, 2)).Clone();
        ohe oheVarClone2 = c14478sy.m70893ne().m4218k4().Clone();
        float f3 = ojuVarClone.f47836k4;
        float f4 = oheVarClone2.f47808k4.f47836k4;
        float fM67481k4 = C14116yg.m67481k4(f3 - f4, (f4 + oheVarClone2.f47809x1.f47836k4) - f3) * 2.0f;
        float f5 = ojuVarClone.f47837x1;
        float f6 = oheVarClone2.f47808k4.f47837x1;
        float fM67481k42 = C14116yg.m67481k4(fM67481k4, C14116yg.m67481k4(f5 - f6, (f6 + oheVarClone2.f47809x1.f47837x1) - f5) * 2.0f);
        ojuVarClone.f47836k4 = (c12007ixClone3.m56550c5() * ojuVarClone.f47836k4) + c12007ixClone3.m56557jd();
        ojuVarClone.f47837x1 = (c12007ixClone3.m56575x1() * ojuVarClone.f47837x1) + c12007ixClone3.m56551ck();
        byte bM70884fa = c14478sy.m70884fa();
        if (bM70884fa == 1) {
            c11896dyM70885ix = new C11896dy();
            c11896dyM70885ix.m55578x1(c12007ixClone4.Clone());
        } else if (bM70884fa == 2) {
            float fM67481k43 = C14116yg.m67481k4(c12007ixClone4.m56550c5(), c12007ixClone4.m56575x1());
            c11896dyM70885ix = new C11896dy();
            float fM67496rv = fM67481k43 * (((float) C14116yg.m67496rv((c12007ixClone4.m56575x1() * c12007ixClone4.m56575x1()) + (c12007ixClone4.m56550c5() * c12007ixClone4.m56550c5()))) / fM67481k43) * fM67481k42;
            float f7 = fM67496rv / 2.0f;
            c11896dyM70885ix.m55534k4(ojuVarClone.f47836k4 - f7, ojuVarClone.f47837x1 - f7, fM67496rv, fM67496rv);
            if (c11902kkM5665k4 != null) {
                float f8 = 1.0f / fM67481k42;
                float[] fArrM55669x1 = c11902kkM5665k4.m55669x1();
                for (int i2 = 1; i2 < fArrM55669x1.length; i2++) {
                    fArrM55669x1[i2] = 1.0f - ((1.0f - fArrM55669x1[i2]) * f8);
                }
                c11902kkM5665k4.m55666k4(fArrM55669x1);
            }
        } else if (bM70884fa == 3) {
            fM71130wy = 0.0f;
        }
        C4314c5 c4314c5 = (c11896dyM70885ix == null || c11896dyM70885ix.m55525du() <= 0 || c11896dyM70885ix.m55523c5().m56575x1() <= 0.0f) ? new C4314c5(C10971um.m53090k4(c12025x6Arr, true), new C12025x6()) : new C4314c5(C10971um.m53090k4(c11896dyM70885ix.m55565kk(), true), new C12025x6());
        int iM70883ck = c14478sy.m70883ck();
        if (iM70883ck == 2) {
            c12025x6 = new C12025x6(c12007ixClone3.m56571to(), c12007ixClone3.m56554dy());
        } else if (iM70883ck == 3) {
            c12025x6 = new C12025x6(c12007ixClone3.m56556h4(), c12007ixClone3.m56554dy());
        } else if (iM70883ck == 4) {
            c12025x6 = new C12025x6(c12007ixClone3.m56571to(), c12007ixClone3.m56558k4());
        } else {
            if (iM70883ck != 5) {
                c4314c5.m17304k4(new C12025x6(ojuVarClone.f47836k4, ojuVarClone.f47837x1));
                oju ojuVar = oheVarClone.f47809x1;
                c4314c5.m17307x1(new C12025x6(ojuVar.f47836k4, ojuVar.f47837x1));
                if (c12007ixClone3.m56575x1() > 0.999f && c12007ixClone3.m56550c5() > 0.999f) {
                    c4314c5.m17303k4(c12007ixClone3.Clone());
                }
                if (c11902kkM5665k4 != null) {
                    C4319h4[] c4319h4Arr2 = new C4319h4[c11902kkM5665k4.m55668k4().length];
                    for (int i3 = 0; i3 < c11902kkM5665k4.m55668k4().length; i3++) {
                        c4319h4Arr2[i3] = new C4319h4(C5656k4.m23095k4(c11902kkM5665k4.m55668k4()[i3].Clone()), c11902kkM5665k4.m55669x1()[i3]);
                    }
                    c4314c5.m17405k4(c4319h4Arr2);
                }
                if (C14116yg.m67480k4(fM71130wy) > 0.1d) {
                    float fM56897x1 = c14478sy.m71126b3().m56897x1();
                    float fM56895kk = c14478sy.m71126b3().m56895kk();
                    c4314c5.m17385fa().m17349x1(fM56897x1, fM56895kk, 0);
                    c4314c5.m17385fa().m17337k4(fM71130wy, 0);
                    c4314c5.m17385fa().m17349x1(-fM56897x1, -fM56895kk, 0);
                }
                if (c14478sy.m71125ak() && !c14478sy.m71128dq()) {
                    return c4314c5;
                }
                c4314c5.m17385fa().m17341k4(C3108y2.m13228x1(!c14478sy.m71125ak() ? -1.0f : 1.0f, !c14478sy.m71128dq() ? -1.0f : 1.0f, c14478sy.m71126b3().m56897x1(), c14478sy.m71126b3().m56895kk()), 0);
                return c4314c5;
            }
            c12025x6 = new C12025x6(c12007ixClone3.m56556h4(), c12007ixClone3.m56558k4());
        }
        c4314c5.m17304k4(c12025x6);
        if (c12007ixClone3.m56575x1() > 0.999f) {
            c4314c5.m17303k4(c12007ixClone3.Clone());
        }
        if (c11902kkM5665k4 != null) {
        }
        if (C14116yg.m67480k4(fM71130wy) > 0.1d) {
        }
        if (c14478sy.m71125ak()) {
        }
        c4314c5.m17385fa().m17341k4(C3108y2.m13228x1(!c14478sy.m71125ak() ? -1.0f : 1.0f, !c14478sy.m71128dq() ? -1.0f : 1.0f, c14478sy.m71126b3().m56897x1(), c14478sy.m71126b3().m56895kk()), 0);
        return c4314c5;
    }

    /* JADX INFO: renamed from: kk */
    public static AbstractC12024x1 m73548kk(C0962es c0962es) {
        return m73546k4(c0962es, (AbstractC14897zn) null);
    }

    /* JADX INFO: renamed from: x1 */
    public static C4318fa m73549x1(C0962es c0962es) {
        return new C4318fa(C5656k4.m23095k4(c0962es.m5676k4().Clone()));
    }

    /* JADX INFO: renamed from: k4 */
    public static C4327up m73537k4(b2l b2lVar) {
        C12009k4 c12009k4 = (C12009k4) b2lVar.m3942ck();
        try {
            C4327up c4327up = new C4327up(C3099wl.m13188k4((AbstractC12002ck) c12009k4));
            c4327up.m17387k4(new C4317dy());
            if (C14116yg.m67480k4(b2lVar.m71130wy()) > 0.1d) {
                c4327up.m17385fa().m17349x1(b2lVar.m71126b3().m56897x1(), b2lVar.m71126b3().m56895kk(), 0);
                c4327up.m17385fa().m17337k4(b2lVar.m71130wy(), 0);
                c4327up.m17385fa().m17349x1(-b2lVar.m71126b3().m56897x1(), -b2lVar.m71126b3().m56895kk(), 0);
            }
            if (!b2lVar.m71125ak() && !b2lVar.m71128dq()) {
                return c4327up;
            }
            c4327up.m17385fa().m17341k4(C3108y2.m13228x1(b2lVar.m71125ak() ? -1.0f : 1.0f, b2lVar.m71128dq() ? -1.0f : 1.0f, b2lVar.m71126b3().m56897x1(), b2lVar.m71126b3().m56895kk()), 0);
            return c4327up;
        } finally {
            if (c12009k4 != null) {
                c12009k4.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static C12007ix m73550x1(C14478sy c14478sy) {
        return c14478sy.m71130wy() != 0.0f ? m73542k4(c14478sy.m70885ix(), c14478sy.m71131xk().Clone(), -c14478sy.m71130wy(), c14478sy.m71126b3().m56897x1(), c14478sy.m71126b3().m56895kk()) : c14478sy.m70885ix() != null ? C12007ix.m56549x1(c14478sy.m70885ix().m55523c5().Clone(), c14478sy.m71131xk().Clone()) : c14478sy.m71131xk();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: k4 */
    private static C4327up m73538k4(cxj cxjVar, float f) {
        C12007ix c12007ixClone = (cxjVar.m71130wy() == 0.0f ? cxjVar.m71131xk() : m73542k4(cxjVar.m4847ck(), cxjVar.m71131xk().Clone(), -cxjVar.m71130wy(), cxjVar.m71126b3().m56897x1(), cxjVar.m71126b3().m56895kk())).Clone();
        C7131h4 c7131h4M4845ar = cxjVar.m4845ar();
        AbstractC12002ck abstractC12002ckM4846bv = cxjVar.m4846bv();
        C4327up c4327up = new C4327up(c7131h4M4845ar.m27679to() ? c7131h4M4845ar.m27674du() : C3099wl.m13188k4(abstractC12002ckM4846bv));
        float fM56557jd = c12007ixClone.m56557jd();
        float fM56551ck = c12007ixClone.m56551ck();
        float fM58657k4 = C12567ne.m58657k4(abstractC12002ckM4846bv);
        float fM58660x1 = C12567ne.m58660x1(abstractC12002ckM4846bv);
        if ((c7131h4M4845ar.m27679to() && C3099wl.m13195m9(c7131h4M4845ar.m27674du())) || C7019kk.m27469x1(abstractC12002ckM4846bv, C3989up.class)) {
            fM58657k4 = 96.0f;
            fM58660x1 = 96.0f;
        }
        float fMo15760yj = abstractC12002ckM4846bv.mo15760yj();
        float f2 = f50179k4;
        float f3 = ((fMo15760yj * f2) / fM58657k4) * cxjVar.m4856u4().f47836k4;
        float fMo15757m9 = ((abstractC12002ckM4846bv.mo15757m9() * f2) / fM58660x1) * cxjVar.m4856u4().f47837x1;
        switch (cxjVar.m4853ne()) {
            case 1:
                fM56557jd = ((c12007ixClone.m56550c5() - f3) / 2.0f) + c12007ixClone.m56571to();
                break;
            case 2:
                fM56557jd = c12007ixClone.m56556h4() - f3;
                break;
            case 3:
                fM56551ck = ((c12007ixClone.m56575x1() - fMo15757m9) / 2.0f) + c12007ixClone.m56554dy();
                break;
            case 4:
                fM56557jd = c12007ixClone.m56571to() + ((c12007ixClone.m56550c5() - f3) / 2.0f);
                fM56551ck = ((c12007ixClone.m56575x1() - fMo15757m9) / 2.0f) + c12007ixClone.m56554dy();
                break;
            case 5:
                fM56557jd = c12007ixClone.m56556h4() - f3;
                fM56551ck = ((c12007ixClone.m56575x1() - fMo15757m9) / 2.0f) + c12007ixClone.m56554dy();
                break;
            case 6:
                fM56551ck = c12007ixClone.m56558k4() - fMo15757m9;
                break;
            case 7:
                fM56557jd = c12007ixClone.m56571to() + ((c12007ixClone.m56550c5() - f3) / 2.0f);
                fM56551ck = c12007ixClone.m56558k4() - fMo15757m9;
                break;
            case 8:
                fM56557jd = c12007ixClone.m56556h4() - f3;
                fM56551ck = c12007ixClone.m56558k4() - fMo15757m9;
                break;
        }
        c4327up.m17386k4(cxjVar.m4855rv());
        if (C14116yg.m67480k4(cxjVar.m71130wy()) > 0.1d) {
            c4327up.m17385fa().m17349x1(cxjVar.m71126b3().m56897x1(), cxjVar.m71126b3().m56895kk(), 0);
            c4327up.m17385fa().m17337k4(cxjVar.m71130wy(), 0);
            c4327up.m17385fa().m17349x1(-cxjVar.m71126b3().m56897x1(), -cxjVar.m71126b3().m56895kk(), 0);
        }
        if (cxjVar.m71125ak() || cxjVar.m71128dq()) {
            c4327up.m17385fa().m17341k4(C3108y2.m13228x1(cxjVar.m71125ak() ? -1.0f : 1.0f, cxjVar.m71128dq() ? -1.0f : 1.0f, cxjVar.m71126b3().m56897x1(), cxjVar.m71126b3().m56895kk()), 0);
        }
        c4327up.m17385fa().m17349x1(fM56557jd + cxjVar.m4849ix().f47836k4, fM56551ck + cxjVar.m4849ix().f47837x1, 0);
        c4327up.m17385fa().m17335k4((f2 / fM58657k4) * cxjVar.m4856u4().f47836k4, (f2 / fM58660x1) * cxjVar.m4856u4().f47837x1);
        return c4327up;
    }

    /* JADX INFO: renamed from: x1 */
    private static C12012lr m73551x1(cxj cxjVar, AbstractC14897zn abstractC14897zn, C12007ix[] c12007ixArr) {
        int i;
        C12025x6 c12025x6Clone = cxjVar.m71126b3().Clone();
        C12007ix c12007ixClone = (cxjVar.m71130wy() == 0.0f ? cxjVar.m71131xk() : m73542k4(cxjVar.m4847ck(), cxjVar.m71131xk().Clone(), -cxjVar.m71130wy(), c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk())).Clone();
        AbstractC12002ck abstractC12002ckM4846bv = cxjVar.m4846bv();
        C7131h4 c7131h4M4845ar = cxjVar.m4845ar();
        if ((c7131h4M4845ar != null && c7131h4M4845ar.m27679to() && C3099wl.m13195m9(c7131h4M4845ar.m27674du())) || C7019kk.m27469x1(abstractC12002ckM4846bv, C3989up.class)) {
            byte[] bArrM27674du = cxjVar.m4845ar().m27674du();
            new C12015qq();
            abstractC12002ckM4846bv = C3099wl.m13181k4(bArrM27674du, (C7019kk.m27469x1(abstractC14897zn, omq.class) ? new C12015qq(c12007ixClone.m56550c5() * 4.0f, c12007ixClone.m56575x1() * 4.0f) : new C12015qq(c12007ixClone.m56550c5() * 4.0f, c12007ixClone.m56575x1() * 4.0f)).Clone());
            c12007ixArr[0] = new C12007ix(0.0f, 0.0f, abstractC12002ckM4846bv.mo15760yj(), abstractC12002ckM4846bv.mo15757m9());
        }
        C12023wl c12023wlClone = abstractC12002ckM4846bv.m56329fa().Clone();
        float fM56550c5 = c12007ixClone.m56550c5() / c12007ixArr[0].m56550c5();
        float fM56575x1 = c12007ixClone.m56575x1() / c12007ixArr[0].m56575x1();
        float f = 10;
        if (fM56550c5 >= f || fM56575x1 >= f) {
            c12007ixClone.m56566kk((fM56550c5 / 2.0f) + c12007ixClone.m56557jd());
            c12007ixClone.m56572to((fM56575x1 / 2.0f) + c12007ixClone.m56551ck());
            i = 0;
        } else {
            i = 4;
        }
        C12012lr c12012lrM58559k4 = C12556ck.m58559k4(abstractC12002ckM4846bv, i, c12023wlClone.Clone(), C7019kk.m27469x1(abstractC14897zn, C14250os.class));
        if (C14116yg.m67480k4(cxjVar.m71130wy()) > 0.1d) {
            float fM56897x1 = c12025x6Clone.m56897x1();
            float fM56895kk = c12025x6Clone.m56895kk();
            c12012lrM58559k4.m56626to(fM56897x1, fM56895kk, 0);
            c12012lrM58559k4.m56628x1(cxjVar.m71130wy(), 0);
            c12012lrM58559k4.m56626to(-fM56897x1, -fM56895kk, 0);
        }
        if (cxjVar.m71125ak() || cxjVar.m71128dq()) {
            c12012lrM58559k4.m56629x1(C3108y2.m13225k4(cxjVar.m71125ak() ? -1.0f : 1.0f, cxjVar.m71128dq() ? -1.0f : 1.0f, c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk()), 0);
        }
        c12012lrM58559k4.m56626to(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), 0);
        c12012lrM58559k4.m56622kk(fM56550c5, fM56575x1, 0);
        c12012lrM58559k4.m56626to(-c12007ixArr[0].m56557jd(), -c12007ixArr[0].m56551ck(), 0);
        return c12012lrM58559k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static C4327up m73539k4(cxj cxjVar, float f, C12007ix[] c12007ixArr) {
        C4327up c4327up;
        C12007ix c12007ixClone = (cxjVar.m71130wy() == 0.0f ? cxjVar.m71131xk() : m73542k4(cxjVar.m4847ck(), cxjVar.m71131xk().Clone(), -cxjVar.m71130wy(), cxjVar.m71126b3().m56897x1(), cxjVar.m71126b3().m56895kk())).Clone();
        AbstractC12002ck abstractC12002ckM4846bv = cxjVar.m4846bv();
        C7131h4 c7131h4M4845ar = cxjVar.m4845ar();
        if ((c7131h4M4845ar != null && c7131h4M4845ar.m27679to() && C3099wl.m13195m9(c7131h4M4845ar.m27674du())) || C7019kk.m27469x1(abstractC12002ckM4846bv, C3989up.class)) {
            float f2 = f / 72.0f;
            C12015qq c12015qq = new C12015qq(cxjVar.m71131xk().m56550c5() * f2, cxjVar.m71131xk().m56575x1() * f2);
            byte[] bArrM13190k4 = C3099wl.m13190k4(c7131h4M4845ar.m27674du(), c12015qq.Clone(), cxjVar.m4848fa());
            c12007ixArr[0] = new C12007ix(0.0f, 0.0f, c12015qq.m56699x1(), c12015qq.m56697kk());
            c4327up = new C4327up(bArrM13190k4, 4);
        } else if (c7131h4M4845ar != null) {
            byte[] bArrM27674du = c7131h4M4845ar.m27679to() ? c7131h4M4845ar.m27674du() : C3099wl.m13188k4(abstractC12002ckM4846bv);
            if (!c7131h4M4845ar.m27680x1() || cxjVar.m5674h4() == null || cxjVar.m5674h4().f3913h4 == null) {
                c4327up = new C4327up(bArrM27674du, 4);
            } else {
                C7134m9 c7134m9M27683k4 = C7134m9.m27683k4(bArrM27674du);
                if (!cxjVar.m5674h4().f3913h4.m63846ks().m56972k4(c7134m9M27683k4)) {
                    cxjVar.m5674h4().f3913h4.m63846ks().m56971k4(c7134m9M27683k4, c7131h4M4845ar);
                }
                c4327up = new C4330yj((AbstractC12002ck) C7019kk.m27452k4(c7131h4M4845ar.m27678kk().deepClone(), AbstractC12002ck.class), bArrM27674du, 4);
            }
        } else {
            c4327up = null;
        }
        if (C14116yg.m67480k4(cxjVar.m71130wy()) > 0.1d) {
            float fM56897x1 = cxjVar.m71126b3().m56897x1();
            float fM56895kk = cxjVar.m71126b3().m56895kk();
            c4327up.m17385fa().m17349x1(fM56897x1, fM56895kk, 0);
            c4327up.m17385fa().m17337k4(cxjVar.m71130wy(), 0);
            c4327up.m17385fa().m17349x1(-fM56897x1, -fM56895kk, 0);
        }
        if (c4327up.m17385fa() == null) {
            c4327up.m17387k4(new C4317dy());
        }
        if (cxjVar.m71125ak() || cxjVar.m71128dq()) {
            c4327up.m17385fa().m17341k4(C3108y2.m13228x1(cxjVar.m71125ak() ? -1.0f : 1.0f, cxjVar.m71128dq() ? -1.0f : 1.0f, cxjVar.m71126b3().m56897x1(), cxjVar.m71126b3().m56895kk()), 0);
        }
        c4327up.m17385fa().m17349x1(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), 0);
        c4327up.m17385fa().m17336k4(c12007ixClone.m56550c5() / c12007ixArr[0].m56550c5(), c12007ixClone.m56575x1() / c12007ixArr[0].m56575x1(), 0);
        c4327up.m17385fa().m17349x1(-c12007ixArr[0].m56557jd(), -c12007ixArr[0].m56551ck(), 0);
        return c4327up;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4328x1 m73540k4(C0962es c0962es) {
        return m73541k4(c0962es, 96.0f);
    }

    /* JADX INFO: renamed from: k4 */
    public static C4328x1 m73541k4(C0962es c0962es, float f) {
        if (C7019kk.m27469x1(c0962es, tf7.class)) {
            ((tf7) C7019kk.m27452k4((Object) c0962es, tf7.class)).m71127c6();
        }
        byte bM5681to = c0962es.m5681to();
        if (bM5681to == 1) {
            return m73549x1(c0962es);
        }
        if (bM5681to == 2) {
            return m73536k4((C14478sy) c0962es, f);
        }
        if (bM5681to == 3) {
            try {
                return m73537k4((b2l) c0962es);
            } catch (RuntimeException e) {
                C3085sv.m13082k4(e);
                return m73549x1(c0962es);
            }
        }
        if (bM5681to != 4) {
            return new C4318fa(C5656k4.m23095k4(C12003du.m56458up().Clone()));
        }
        cxj cxjVar = (cxj) c0962es;
        try {
            if (cxjVar.m4858up() != 1) {
                return m73538k4(cxjVar, f);
            }
            C12007ix c12007ixClone = cxjVar.m4851ks().Clone();
            C12007ix[] c12007ixArr = {c12007ixClone};
            C4327up c4327upM73539k4 = m73539k4(cxjVar, f, c12007ixArr);
            c12007ixArr[0].CloneTo(c12007ixClone);
            cxjVar.m4863x1(c12007ixClone.Clone());
            return c4327upM73539k4;
        } catch (RuntimeException e2) {
            C3085sv.m13082k4(e2);
            return m73549x1(c0962es);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C12007ix m73542k4(C11896dy c11896dy, C12007ix c12007ix, float f, float f2, float f3) {
        C12025x6[] c12025x6Arr;
        C11913yj c11913yj = new C11913yj();
        c11913yj.m55766k4(f, new C12025x6(f2, f3));
        if (c11896dy == null || c11896dy.m55525du() <= 2) {
            c12025x6Arr = new C12025x6[]{new C12025x6(c12007ix.m56571to(), c12007ix.m56554dy()), new C12025x6(c12007ix.m56556h4(), c12007ix.m56554dy()), new C12025x6(c12007ix.m56556h4(), c12007ix.m56558k4()), new C12025x6(c12007ix.m56571to(), c12007ix.m56558k4())};
        } else {
            int iM55525du = c11896dy.m55525du();
            c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, iM55525du);
            C12025x6[] c12025x6ArrM55565kk = c11896dy.m55565kk();
            for (int i = 0; i < iM55525du; i++) {
                c12025x6ArrM55565kk[i].CloneTo(c12025x6Arr[i]);
            }
        }
        c11913yj.m55775k4(c12025x6Arr);
        float fM56897x1 = c12025x6Arr[0].m56897x1();
        float fM56895kk = c12025x6Arr[0].m56895kk();
        float fM56897x12 = fM56897x1;
        float fM56895kk2 = fM56895kk;
        for (int i2 = 1; i2 < c12025x6Arr.length; i2++) {
            if (fM56897x1 > c12025x6Arr[i2].m56897x1()) {
                fM56897x1 = c12025x6Arr[i2].m56897x1();
            }
            if (fM56897x12 < c12025x6Arr[i2].m56897x1()) {
                fM56897x12 = c12025x6Arr[i2].m56897x1();
            }
            if (fM56895kk2 > c12025x6Arr[i2].m56895kk()) {
                fM56895kk2 = c12025x6Arr[i2].m56895kk();
            }
            if (fM56895kk < c12025x6Arr[i2].m56895kk()) {
                fM56895kk = c12025x6Arr[i2].m56895kk();
            }
        }
        return new C12007ix(fM56897x1, fM56895kk2, fM56897x12 - fM56897x1, fM56895kk - fM56895kk2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: k4 */
    private static C12012lr m73543k4(float f, cxj cxjVar) {
        AbstractC12002ck abstractC12002ckM4846bv = cxjVar.m4846bv();
        C12012lr c12012lrM58558k4 = C12556ck.m58558k4(abstractC12002ckM4846bv);
        float fM56557jd = cxjVar.m71131xk().m56557jd();
        float fM56551ck = cxjVar.m71131xk().m56551ck();
        float fM58657k4 = C12567ne.m58657k4(abstractC12002ckM4846bv);
        float fM58660x1 = C12567ne.m58660x1(abstractC12002ckM4846bv);
        C7131h4 c7131h4M4845ar = cxjVar.m4845ar();
        if ((c7131h4M4845ar != null && c7131h4M4845ar.m27679to() && C3099wl.m13195m9(c7131h4M4845ar.m27674du())) || C7019kk.m27469x1(abstractC12002ckM4846bv, C3989up.class)) {
            fM58657k4 = 96.0f;
            fM58660x1 = 96.0f;
        }
        float fMo15760yj = ((c12012lrM58558k4.m56619h4().mo15760yj() * f) / fM58657k4) * cxjVar.m4856u4().f47836k4;
        float fMo15757m9 = ((c12012lrM58558k4.m56619h4().mo15757m9() * f) / fM58660x1) * cxjVar.m4856u4().f47837x1;
        C12007ix c12007ixClone = (cxjVar.m71130wy() == 0.0f ? cxjVar.m71131xk() : m73542k4(cxjVar.m4847ck(), cxjVar.m71131xk().Clone(), -cxjVar.m71130wy(), cxjVar.m71126b3().m56897x1(), cxjVar.m71126b3().m56895kk())).Clone();
        switch (cxjVar.m4853ne()) {
            case 1:
                fM56557jd = c12007ixClone.m56571to() + ((c12007ixClone.m56550c5() - fMo15760yj) / 2.0f);
                break;
            case 2:
                fM56557jd = c12007ixClone.m56556h4() - fMo15760yj;
                break;
            case 3:
                fM56551ck = ((c12007ixClone.m56575x1() - fMo15757m9) / 2.0f) + c12007ixClone.m56554dy();
                break;
            case 4:
                fM56557jd = c12007ixClone.m56571to() + ((c12007ixClone.m56550c5() - fMo15760yj) / 2.0f);
                fM56551ck = ((c12007ixClone.m56575x1() - fMo15757m9) / 2.0f) + c12007ixClone.m56554dy();
                break;
            case 5:
                fM56557jd = c12007ixClone.m56556h4() - fMo15760yj;
                fM56551ck = ((c12007ixClone.m56575x1() - fMo15757m9) / 2.0f) + c12007ixClone.m56554dy();
                break;
            case 6:
                fM56551ck = c12007ixClone.m56558k4() - fMo15757m9;
                break;
            case 7:
                fM56557jd = c12007ixClone.m56571to() + ((c12007ixClone.m56550c5() - fMo15760yj) / 2.0f);
                fM56551ck = c12007ixClone.m56558k4() - fMo15757m9;
                break;
            case 8:
                fM56557jd = c12007ixClone.m56556h4() - fMo15760yj;
                fM56551ck = c12007ixClone.m56558k4() - fMo15757m9;
                break;
        }
        c12012lrM58558k4.m56620k4(cxjVar.m4855rv());
        if (C14116yg.m67480k4(cxjVar.m71130wy()) > 0.1d) {
            c12012lrM58558k4.m56626to(cxjVar.m71126b3().m56897x1(), cxjVar.m71126b3().m56895kk(), 0);
            c12012lrM58558k4.m56628x1(cxjVar.m71130wy(), 0);
            c12012lrM58558k4.m56626to(-cxjVar.m71126b3().m56897x1(), -cxjVar.m71126b3().m56895kk(), 0);
        }
        if (cxjVar.m71125ak() || cxjVar.m71128dq()) {
            c12012lrM58558k4.m56629x1(C3108y2.m13225k4(cxjVar.m71125ak() ? -1.0f : 1.0f, cxjVar.m71128dq() ? -1.0f : 1.0f, cxjVar.m71126b3().m56897x1(), cxjVar.m71126b3().m56895kk()), 0);
        }
        c12012lrM58558k4.m56626to(fM56557jd + cxjVar.m4864x6().f47836k4, fM56551ck + cxjVar.m4864x6().f47837x1, 0);
        c12012lrM58558k4.m56621kk((f / fM58657k4) * cxjVar.m4856u4().f47836k4, (f / fM58660x1) * cxjVar.m4856u4().f47837x1);
        return c12012lrM58558k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static C12012lr m73544k4(b2l b2lVar, float f, C12009k4 c12009k4) {
        C12012lr c12012lr = new C12012lr(c12009k4);
        if (C14116yg.m67480k4(b2lVar.m71130wy()) > 0.1d) {
            c12012lr.m56626to(b2lVar.m71126b3().m56897x1(), b2lVar.m71126b3().m56895kk(), 0);
            c12012lr.m56628x1(b2lVar.m71130wy(), 0);
            c12012lr.m56626to(-b2lVar.m71126b3().m56897x1(), -b2lVar.m71126b3().m56895kk(), 0);
        }
        if (b2lVar.m71125ak() || b2lVar.m71128dq()) {
            c12012lr.m56629x1(C3108y2.m13225k4(b2lVar.m71125ak() ? -1.0f : 1.0f, b2lVar.m71128dq() ? -1.0f : 1.0f, b2lVar.m71126b3().m56897x1(), b2lVar.m71126b3().m56895kk()), 0);
        }
        float f2 = f / f50179k4;
        c12012lr.m56621kk(f2, f2);
        c12009k4.dispose();
        return c12012lr;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12012lr m73545k4(cxj cxjVar, AbstractC14897zn abstractC14897zn, C12007ix[] c12007ixArr) {
        return cxjVar.m4858up() == 1 ? m73551x1(cxjVar, abstractC14897zn, c12007ixArr) : m73543k4(f50179k4, cxjVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC12024x1 m73546k4(C0962es c0962es, AbstractC14897zn abstractC14897zn) {
        if (C7019kk.m27469x1(c0962es, tf7.class)) {
            ((tf7) C7019kk.m27452k4((Object) c0962es, tf7.class)).m71127c6();
        }
        byte bM5681to = c0962es.m5681to();
        if (bM5681to == 1) {
            return new C11999ar(c0962es.m5676k4().Clone());
        }
        if (bM5681to == 2) {
            return m73547k4((C14478sy) c0962es);
        }
        if (bM5681to == 3) {
            try {
                b2l b2lVar = (b2l) c0962es;
                return m73544k4(b2lVar, f50179k4, (C12009k4) b2lVar.m3942ck());
            } catch (RuntimeException e) {
                C3085sv.m13082k4(e);
                return new C11999ar(c0962es.m5676k4().Clone());
            }
        }
        if (bM5681to != 4) {
            return (AbstractC12024x1) C12010kk.m56611kk().deepClone();
        }
        try {
            cxj cxjVar = (cxj) c0962es;
            C12007ix c12007ixClone = cxjVar.m4851ks().Clone();
            C12007ix[] c12007ixArr = {c12007ixClone};
            C12012lr c12012lrM73545k4 = m73545k4(cxjVar, abstractC14897zn, c12007ixArr);
            c12007ixArr[0].CloneTo(c12007ixClone);
            cxjVar.m4863x1(c12007ixClone.Clone());
            return c12012lrM73545k4;
        } catch (RuntimeException e2) {
            C3085sv.m13082k4(e2);
            return new C11999ar(c0962es.m5676k4().Clone());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0533  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC12024x1 m73547k4(C14478sy c14478sy) {
        C12003du c12003du;
        C12025x6 c12025x6;
        float f;
        int iOooO00o;
        int iM56507jd;
        int iM56502ck;
        int iM70886jd = c14478sy.m70886jd();
        C12003du c12003duClone = c14478sy.m5676k4().Clone();
        C12003du c12003duClone2 = c14478sy.m5682x1().Clone();
        int iM70897up = c14478sy.m70897up();
        float fM70899wl = c14478sy.m70899wl();
        SortedList<Float, C12003du> sortedListM70887k4 = c14478sy.m70887k4(true);
        c14478sy.m71127c6();
        C12003du c12003duClone3 = c12003duClone.Clone();
        C12003du c12003duClone4 = c12003duClone2.Clone();
        float fM70895rv = c14478sy.m70895rv() / 100.0f;
        if (iM70886jd == 1) {
            c12003duClone.CloneTo(c12003duClone3);
            if (iM70897up < 10) {
                iM56507jd = ((c12003duClone3.m56507jd() & 255) * iM70897up) / 9;
                iM56502ck = ((c12003duClone3.m56502ck() & 255) * iM70897up) / 9;
                iOooO00o = ((c12003duClone3.m56505fa() & 255) * iM70897up) / 9;
            } else {
                int i = iM70897up - 9;
                int iM56507jd2 = (((255 - (c12003duClone3.m56507jd() & 255)) * i) / 10) + (c12003duClone3.m56507jd() & 255);
                int iOooO00o2 = com.aspose.slides.internal.p497xc.OooO00o.OooO00o(255, c12003duClone3.m56502ck() & 255, i, 10) + (c12003duClone3.m56502ck() & 255);
                iOooO00o = com.aspose.slides.internal.p497xc.OooO00o.OooO00o(255, c12003duClone3.m56505fa() & 255, i, 10) + (c12003duClone3.m56505fa() & 255);
                iM56507jd = iM56507jd2;
                iM56502ck = iOooO00o2;
            }
            C12003du.m56398k4(255 & c12003duClone2.m56501c5(), iM56507jd, iM56502ck, iOooO00o).CloneTo(c12003duClone4);
        }
        if (fM70895rv < 0.0f) {
            C12003du c12003duClone5 = c12003duClone3.Clone();
            c12003duClone4.CloneTo(c12003duClone3);
            c12003duClone5.CloneTo(c12003duClone4);
        }
        C11902kk c11902kkM5665k4 = C0962es.m5665k4(sortedListM70887k4);
        if (c14478sy.m70883ck() == 1) {
            C12007ix c12007ixClone = c14478sy.m71131xk().Clone();
            if (C14116yg.m67480k4(c14478sy.m71130wy()) > 0.1d || c14478sy.m71125ak() || c14478sy.m71128dq()) {
                double d = (((double) fM70899wl) / 180.0d) * 3.141592653589793d;
                double dM67470dy = C14116yg.m67470dy(d);
                double dM67495m9 = C14116yg.m67495m9(d);
                if (c14478sy.m71125ak()) {
                    dM67470dy = -dM67470dy;
                }
                if (c14478sy.m71128dq()) {
                    dM67495m9 = -dM67495m9;
                }
                float fM67498to = (float) ((C14116yg.m67498to(dM67495m9, dM67470dy) * 180.0d) / 3.141592653589793d);
                if (c14478sy.m70885ix() != null) {
                    C11896dy c11896dy = (C11896dy) c14478sy.m70885ix().deepClone();
                    c11896dy.m55526dy();
                    m73542k4(c11896dy, c14478sy.m71131xk().Clone(), -c14478sy.m71130wy(), c14478sy.m71126b3().m56897x1(), c14478sy.m71126b3().m56895kk()).CloneTo(c12007ixClone);
                    m73542k4(null, c12007ixClone.Clone(), -fM67498to, c14478sy.m71126b3().m56897x1(), c14478sy.m71126b3().m56895kk()).CloneTo(c12007ixClone);
                    c11896dy.dispose();
                } else {
                    m73542k4(null, c14478sy.m71131xk().Clone(), -c14478sy.m71130wy(), c14478sy.m71126b3().m56897x1(), c14478sy.m71126b3().m56895kk()).CloneTo(c12007ixClone);
                    m73542k4(null, c12007ixClone.Clone(), -fM67498to, c14478sy.m71126b3().m56897x1(), c14478sy.m71126b3().m56895kk()).CloneTo(c12007ixClone);
                }
                m73542k4(null, new C12007ix(c12007ixClone.m56557jd(), c14478sy.m71126b3().m56895kk(), c12007ixClone.m56550c5(), 0.0f), c14478sy.m71130wy() + fM67498to, c14478sy.m71126b3().m56897x1(), c14478sy.m71126b3().m56895kk()).CloneTo(c12007ixClone);
                if (c12007ixClone.m56550c5() < 1.0f) {
                    c12007ixClone.m56576x1(1.0f);
                }
                if (c12007ixClone.m56575x1() < 1.0f) {
                    c12007ixClone.m56560k4(1.0f);
                }
                fM70899wl = fM67498to + c14478sy.m71130wy();
            }
            C12007ix c12007ixClone2 = C0962es.m5667k4(c14478sy.m70893ne().m4217k4(c12007ixClone.Clone()).Clone()).Clone();
            if (fM70899wl == 180.0f) {
                c12007ixClone2.m56560k4(c12007ixClone2.m56550c5() + 45.0f);
            }
            C11909up c11909up = new C11909up(c12007ixClone2.Clone(), c12003duClone3.Clone(), c12003duClone4.Clone(), fM70899wl);
            c11909up.m55725k4(3);
            if (c11902kkM5665k4 != null) {
                c11909up.m55726k4(c11902kkM5665k4);
            } else {
                c11909up.m55729kk(C14116yg.m67480k4(fM70895rv), 1.0f);
            }
            c11909up.m55737x1(c14478sy.m70896u4(), 1);
            return c11909up;
        }
        C12007ix c12007ixClone3 = m73550x1(c14478sy).Clone();
        C12025x6[] c12025x6Arr = {new C12025x6(c12007ixClone3.m56571to(), c12007ixClone3.m56554dy()), new C12025x6(c12007ixClone3.m56556h4(), c12007ixClone3.m56554dy()), new C12025x6(c12007ixClone3.m56556h4(), c12007ixClone3.m56558k4()), new C12025x6(c12007ixClone3.m56571to(), c12007ixClone3.m56558k4())};
        float fM71130wy = c14478sy.m71130wy();
        C11896dy c11896dyM70885ix = c14478sy.m70885ix();
        C12007ix c12007ixClone4 = c14478sy.m70893ne().m4217k4(c12007ixClone3.Clone()).Clone();
        ohe oheVarClone = c14478sy.m70901x6().Clone();
        ohe oheVarClone2 = c14478sy.m70893ne().m4218k4().Clone();
        oju ojuVarClone = oju.m68619k4(oheVarClone.f47808k4, oju.m68618k4(oheVarClone.f47809x1, 2)).Clone();
        float fM67480k4 = C14116yg.m67480k4(ojuVarClone.f47836k4 - oheVarClone2.f47808k4.f47836k4) * 2.0f;
        float fM67480k42 = C14116yg.m67480k4((oheVarClone2.f47808k4.f47836k4 + oheVarClone2.f47809x1.f47836k4) - ojuVarClone.f47836k4) * 2.0f;
        float fM67480k43 = C14116yg.m67480k4(ojuVarClone.f47837x1 - oheVarClone2.f47808k4.f47837x1) * 2.0f;
        float fM67480k44 = C14116yg.m67480k4((oheVarClone2.f47808k4.f47837x1 + oheVarClone2.f47809x1.f47837x1) - ojuVarClone.f47837x1) * 2.0f;
        float fM67481k4 = (fM67480k4 < 1.0f || fM67480k42 < 1.0f) ? C14116yg.m67481k4(fM67480k4, fM67480k42) : C14116yg.m67504x1(fM67480k4, fM67480k42);
        float fM67481k42 = (fM67480k43 < 1.0f || fM67480k44 < 1.0f) ? C14116yg.m67481k4(fM67480k43, fM67480k44) : C14116yg.m67504x1(fM67480k43, fM67480k44);
        if (fM67481k4 == fM67481k42) {
            oju ojuVarClone2 = oheVarClone.f47808k4.Clone();
            float f2 = ojuVarClone2.f47836k4;
            if (fM67481k4 - f2 >= 1.0f) {
                fM67481k4 -= f2;
            }
            float f3 = ojuVarClone2.f47837x1;
            if (fM67481k42 - f3 >= 1.0f) {
                fM67481k42 -= f3;
            }
        }
        float fM67504x1 = C14116yg.m67504x1(fM67481k4, fM67481k42) >= 1.0f ? C14116yg.m67504x1(fM67481k4, fM67481k42) : C14116yg.m67481k4(fM67481k4, fM67481k42);
        ojuVarClone.f47836k4 = (c12007ixClone3.m56550c5() * ojuVarClone.f47836k4) + c12007ixClone3.m56557jd();
        ojuVarClone.f47837x1 = (c12007ixClone3.m56575x1() * ojuVarClone.f47837x1) + c12007ixClone3.m56551ck();
        byte bM70884fa = c14478sy.m70884fa();
        if (bM70884fa == 1) {
            c12003du = c12003duClone3;
            c11896dyM70885ix = new C11896dy();
            c11896dyM70885ix.m55578x1(c12007ixClone4.Clone());
        } else if (bM70884fa != 2) {
            c12003du = c12003duClone3;
            if (bM70884fa == 3) {
                fM71130wy = 0.0f;
            }
        } else {
            float fM67481k43 = C14116yg.m67481k4(c12007ixClone4.m56550c5(), c12007ixClone4.m56575x1());
            float fOooO00o = C22205OooOOo.OooO00o(c12007ixClone4, 2.0f, c12007ixClone4.m56557jd());
            float fOooO0O0 = C22203OooOO0o.OooO0O0(c12007ixClone4, 2.0f, c12007ixClone4.m56551ck());
            C11896dy c11896dy2 = new C11896dy();
            c12003du = c12003duClone3;
            float fM67496rv = (((float) C14116yg.m67496rv((c12007ixClone4.m56575x1() * c12007ixClone4.m56575x1()) + (c12007ixClone4.m56550c5() * c12007ixClone4.m56550c5()))) / fM67481k43) * fM67504x1 * fM67481k43;
            float f4 = fM67496rv / 2.0f;
            c11896dy2.m55534k4(fOooO00o - f4, fOooO0O0 - f4, fM67496rv, fM67496rv);
            if (c11902kkM5665k4 != null) {
                float f5 = 1.0f / fM67504x1;
                float[] fArrM55669x1 = c11902kkM5665k4.m55669x1();
                for (int i2 = 1; i2 < fArrM55669x1.length; i2++) {
                    fArrM55669x1[i2] = 1.0f - ((1.0f - fArrM55669x1[i2]) * f5);
                }
                c11902kkM5665k4.m55666k4(fArrM55669x1);
            }
            c11896dyM70885ix = c11896dy2;
        }
        C11906rv c11906rv = (c11896dyM70885ix == null || c11896dyM70885ix.m55525du() <= 0 || c11896dyM70885ix.m55523c5().m56575x1() <= 0.0f) ? new C11906rv(c12025x6Arr) : new C11906rv(c11896dyM70885ix);
        c11906rv.m55694k4(new C12003du[]{c12003duClone4});
        c11906rv.m55692k4(c12003du.Clone());
        int iM70883ck = c14478sy.m70883ck();
        if (iM70883ck == 2) {
            c12025x6 = new C12025x6(c12007ixClone3.m56571to(), c12007ixClone3.m56554dy());
        } else if (iM70883ck == 3) {
            c12025x6 = new C12025x6(c12007ixClone3.m56556h4(), c12007ixClone3.m56554dy());
        } else if (iM70883ck == 4) {
            c12025x6 = new C12025x6(c12007ixClone3.m56571to(), c12007ixClone3.m56558k4());
        } else {
            if (iM70883ck != 5) {
                c11906rv.m55693k4(new C12025x6(ojuVarClone.f47836k4, ojuVarClone.f47837x1));
                if (c14478sy.m70884fa() != 2 || oju.m68620kk(oheVarClone.f47808k4, oju.f47834kk)) {
                    oju ojuVar = oheVarClone.f47809x1;
                    c11906rv.m55703x1(new C12025x6(ojuVar.f47836k4, ojuVar.f47837x1));
                }
                if (c11902kkM5665k4 == null) {
                    if (c11906rv.m55681c5().m56894k4()) {
                        oju ojuVar2 = oheVarClone.f47809x1;
                        c11906rv.m55703x1(new C12025x6(ojuVar2.f47836k4 / 10.0f, ojuVar2.f47837x1 / 10.0f));
                    }
                    c11906rv.m55690k4(c11902kkM5665k4);
                    f = 1.0f;
                } else {
                    f = 1.0f;
                    c11906rv.m55695kk(C14116yg.m67480k4(fM70895rv), 1.0f);
                }
                if (C14116yg.m67480k4(fM71130wy) > 0.1d) {
                    float fM56897x1 = c14478sy.m71126b3().m56897x1();
                    float fM56895kk = c14478sy.m71126b3().m56895kk();
                    c11906rv.m55696kk(fM56897x1, fM56895kk, 0);
                    c11906rv.m55701x1(fM71130wy, 0);
                    c11906rv.m55696kk(-fM56897x1, -fM56895kk, 0);
                }
                if (!c14478sy.m71125ak() || c14478sy.m71128dq()) {
                    c11906rv.m55702x1(C3108y2.m13225k4(!c14478sy.m71125ak() ? -1.0f : f, !c14478sy.m71128dq() ? -1.0f : f, c14478sy.m71126b3().m56897x1(), c14478sy.m71126b3().m56895kk()), 0);
                }
                if (c14478sy.m70898uz() != null) {
                    c14478sy.m70890k4(c11906rv);
                }
                return c11906rv;
            }
            c12025x6 = new C12025x6(c12007ixClone3.m56556h4(), c12007ixClone3.m56558k4());
        }
        c11906rv.m55693k4(c12025x6);
        if (c11902kkM5665k4 == null) {
        }
        if (C14116yg.m67480k4(fM71130wy) > 0.1d) {
        }
        if (!c14478sy.m71125ak()) {
            c11906rv.m55702x1(C3108y2.m13225k4(!c14478sy.m71125ak() ? -1.0f : f, !c14478sy.m71128dq() ? -1.0f : f, c14478sy.m71126b3().m56897x1(), c14478sy.m71126b3().m56895kk()), 0);
        }
        if (c14478sy.m70898uz() != null) {
        }
        return c11906rv;
    }
}
