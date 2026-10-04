package com.aspose.slides.internal.p154gr;

import OooO0Oo.C20398OooO0O0;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p031aw.InterfaceC1565x1;
import com.aspose.slides.internal.p066cl.InterfaceC2624k4;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p129fe.C3976c5;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p129fe.C3984kk;
import com.aspose.slides.internal.p129fe.C3989up;
import com.aspose.slides.internal.p129fe.C3990x1;
import com.aspose.slides.internal.p156gw.C4408to;
import com.aspose.slides.internal.p156gw.C4417x6;
import com.aspose.slides.internal.p175i1.AbstractC4786k4;
import com.aspose.slides.internal.p282mu.C6541k4;
import com.aspose.slides.internal.p282mu.C6542kk;
import com.aspose.slides.internal.p313oa.C6986dy;
import com.aspose.slides.internal.p314oc.C7015du;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12012lr;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p550zi.C13597du;
import com.aspose.slides.internal.p550zi.C13600h4;
import com.aspose.slides.internal.p550zi.C13623yj;
import com.aspose.slides.p559ms.System.C14112xw;
import com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4;
import java.io.File;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: com.aspose.slides.internal.gr.to */
/* JADX INFO: loaded from: classes.dex */
class C4377to {

    /* JADX INFO: renamed from: k4 */
    private final C4369ck f11890k4;

    public C4377to(C4369ck c4369ck) {
        this.f11890k4 = c4369ck;
    }

    /* JADX INFO: renamed from: kk */
    private C4417x6 m17656kk(C12025x6[] c12025x6Arr) {
        C12025x6 c12025x6 = new C12025x6((c12025x6Arr[2].m56897x1() + c12025x6Arr[1].m56897x1()) - c12025x6Arr[0].m56897x1(), (c12025x6Arr[2].m56895kk() + c12025x6Arr[1].m56895kk()) - c12025x6Arr[0].m56895kk());
        new C4408to();
        C4417x6 c4417x6 = new C4417x6();
        c4417x6.m17842k4(c12025x6Arr[0].m56897x1(), c12025x6Arr[0].m56895kk());
        c4417x6.m17845x1(c12025x6Arr[1].m56897x1(), c12025x6Arr[1].m56895kk());
        c4417x6.m17845x1(c12025x6.m56897x1(), c12025x6.m56895kk());
        c4417x6.m17845x1(c12025x6Arr[2].m56897x1(), c12025x6Arr[2].m56895kk());
        c4417x6.m17825k4();
        return c4417x6;
    }

    /* JADX INFO: renamed from: x1 */
    private C4408to m17657x1(C12025x6[] c12025x6Arr) {
        C11913yj c11913yjMo67596kk = this.f11890k4.mo17582wl().mo67596kk();
        this.f11890k4.mo17582wl().mo67593k4(C4375kk.m17626k4(this.f11890k4));
        InterfaceC1565x1 interfaceC1565x1Mo67586h4 = this.f11890k4.mo17582wl().mo67586h4();
        C4408to c4408toM17980x1 = new C4408to(m17656kk(c12025x6Arr)).m17980x1(this.f11890k4.mo17577u4());
        if (interfaceC1565x1Mo67586h4 != null) {
            c4408toM17980x1 = c4408toM17980x1.m17980x1(c11913yjMo67596kk);
            c4408toM17980x1.m17978kk(new C4408to(interfaceC1565x1Mo67586h4));
        }
        this.f11890k4.mo17582wl().mo67593k4(c11913yjMo67596kk);
        return c4408toM17980x1;
    }

    /* JADX INFO: renamed from: k4 */
    public C4408to m17659k4(C4408to c4408to) {
        C11896dy c11896dyM55503k4 = C11896dy.m55503k4((InterfaceC1565x1) c4408to);
        if (c4408to.m17976k4()) {
            return c4408to;
        }
        C12025x6[] c12025x6ArrM55565kk = c11896dyM55503k4.m55565kk();
        byte[] bArrM55571to = c11896dyM55503k4.m55571to();
        C12025x6[] c12025x6Arr = new C12025x6[c12025x6ArrM55565kk.length];
        for (int i = 0; i < c12025x6ArrM55565kk.length; i++) {
            float fM56897x1 = c12025x6ArrM55565kk[i].m56897x1();
            float fM56895kk = c12025x6ArrM55565kk[i].m56895kk();
            c12025x6Arr[i] = new C12025x6((float) Math.ceil(Math.round(fM56897x1 * 1000.0f) / 1000.0f), (float) Math.ceil(Math.round(fM56895kk * 1000.0f) / 1000.0f));
        }
        return new C4408to(new C11896dy(c12025x6Arr, bArrM55571to).m55568ne());
    }

    /* JADX INFO: renamed from: k4 */
    private static C11913yj m17638k4(AbstractC12002ck abstractC12002ck, C11913yj c11913yj, boolean z, boolean z2) {
        if (c11913yj.m55789x1()) {
            return c11913yj;
        }
        if (z || z2) {
            c11913yj.m55786x1(z ? (-((float) (c11913yj.m55759fa() + c11913yj.m55761jd()))) / 2.0f : 0.0f, z2 ? (-((float) (c11913yj.m55756ck() + c11913yj.m55784up()))) / 2.0f : 0.0f, 1);
        }
        C12025x6[] c12025x6Arr = {new C12025x6(0.0f, 0.0f), new C12025x6(abstractC12002ck.mo15760yj(), 0.0f), new C12025x6(0.0f, abstractC12002ck.mo15757m9())};
        c11913yj.m55775k4(c12025x6Arr);
        for (int i = 0; i < 3; i++) {
            C12025x6 c12025x6 = c12025x6Arr[i];
            c12025x6.m56891k4(c12025x6.m56897x1() + 0.5f);
            C12025x6 c12025x62 = c12025x6Arr[i];
            c12025x62.m56898x1(c12025x62.m56895kk() + 0.5f);
        }
        return new C11913yj(C12007ix.m56544k4(new C12014ne(0, 0, abstractC12002ck.mo15760yj(), abstractC12002ck.mo15757m9())), c12025x6Arr);
    }

    /* JADX INFO: renamed from: x1 */
    private static C12009k4 m17658x1(AbstractC12002ck abstractC12002ck, int i, int i2) {
        InterfaceC2624k4 interfaceC2624k4Mo11993x1 = abstractC12002ck.mo15751du().m62930k4().mo11993x1(i, i2);
        C12009k4 c12009k4 = new C12009k4(abstractC12002ck.mo15760yj(), abstractC12002ck.mo15757m9(), 2498570);
        InterfaceC14122k4 interfaceC14122k4Mo17582wl = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4).mo17582wl();
        interfaceC14122k4Mo17582wl.mo67591k4(interfaceC2624k4Mo11993x1, 0, 0, abstractC12002ck.mo15760yj(), abstractC12002ck.mo15757m9());
        interfaceC14122k4Mo17582wl.mo67584du();
        return (!AbstractC12002ck.m56327x1(abstractC12002ck.mo15753jd()) || (((double) i) / ((double) abstractC12002ck.mo15760yj()) >= 1.0d && ((double) i2) / ((double) abstractC12002ck.mo15757m9()) >= 1.0d)) ? c12009k4 : C4375kk.m17628k4(c12009k4);
    }

    /* JADX INFO: renamed from: k4 */
    private C11913yj m17639k4(C12025x6[] c12025x6Arr, C12007ix c12007ix) {
        return m17640k4(c12025x6Arr, c12007ix, true);
    }

    /* JADX INFO: renamed from: k4 */
    private C11913yj m17640k4(C12025x6[] c12025x6Arr, C12007ix c12007ix, boolean z) {
        C11913yj c11913yj = z ? new C11913yj(c12007ix, c12025x6Arr) : C11913yj.f40121k4.m55760h4();
        if (!c11913yj.m55778kk()) {
            c11913yj = C11913yj.f40121k4.m55760h4();
        }
        c11913yj.m55769k4(this.f11890k4.mo17577u4(), 1);
        C11913yj c11913yjM17626k4 = C4375kk.m17626k4(this.f11890k4);
        c11913yjM17626k4.m55787x1(c11913yj);
        return c11913yjM17626k4;
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC12002ck m17641k4(AbstractC12002ck abstractC12002ck) {
        if ((abstractC12002ck instanceof C3989up) || this.f11890k4.mo17479fa() == 2 || this.f11890k4.mo17479fa() == 7 || this.f11890k4.mo17479fa() == 6) {
            return abstractC12002ck;
        }
        C12009k4 c12009k4 = new C12009k4(abstractC12002ck.mo15760yj() + 1, abstractC12002ck.mo15757m9() + 1);
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
        abstractC12008jdM56582k4.mo17582wl().mo67592k4(abstractC12002ck.mo15751du().m62930k4(), new C11913yj());
        abstractC12008jdM56582k4.dispose();
        return c12009k4;
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC12002ck m17642k4(AbstractC12002ck abstractC12002ck, C12015qq c12015qq) {
        char c;
        boolean z;
        int iMo11975du = abstractC12002ck.mo15751du().m62930k4().mo11975du();
        int iMo11978h4 = abstractC12002ck.mo15751du().m62930k4().mo11978h4();
        double d = iMo11975du;
        double dM56699x1 = ((double) c12015qq.m56699x1()) / d;
        double d2 = iMo11978h4;
        double dM56697kk = ((double) c12015qq.m56697kk()) / d2;
        int iM17619k4 = C4375kk.m17619k4(dM56699x1, 1.0d);
        int iM17619k42 = C4375kk.m17619k4(dM56697kk, 1.0d);
        double[] dArr = {Math.abs(dM56699x1), Math.abs(dM56697kk)};
        if (!(this.f11890k4.mo17479fa() == 1 && this.f11890k4.mo17603x6() == 3 && this.f11890k4.mo17473c5() == 0) && (abstractC12002ck instanceof C12009k4) && ((iM17619k4 == -1 || iM17619k42 == -1) && (!(this.f11890k4.mo17603x6() == 3 || this.f11890k4.mo17603x6() == -1 || this.f11890k4.mo17473c5() == -1) || (!(this.f11890k4.mo17473c5() == 0 || this.f11890k4.mo17473c5() == -1) || (this.f11890k4.mo17479fa() == 3 && this.f11890k4.mo17603x6() == 3 && this.f11890k4.mo17473c5() == 0))))) {
            c = 1;
            z = true;
        } else {
            c = 1;
            z = false;
        }
        if (this.f11890k4.mo17479fa() == 3 && ((this.f11890k4.mo17603x6() == 3 || this.f11890k4.mo17603x6() == 0) && this.f11890k4.mo17473c5() == 0)) {
            return abstractC12002ck;
        }
        if (!z) {
            if ((iM17619k4 != -1 && iM17619k42 != -1) || !(abstractC12002ck instanceof C12009k4)) {
                return abstractC12002ck;
            }
            if ((dArr[0] >= 1.0d && dArr[c] >= 1.0d) || this.f11890k4.mo17479fa() == 5) {
                return abstractC12002ck;
            }
            if (this.f11890k4.mo17479fa() != 2 && this.f11890k4.mo17479fa() != 7 && this.f11890k4.mo17479fa() != 6) {
                return abstractC12002ck;
            }
        }
        double d3 = dArr[0];
        int i = (int) (d * d3);
        double d4 = dArr[c];
        int i2 = (int) (d2 * d4);
        if (i <= 0 || i2 <= 0) {
            return abstractC12002ck;
        }
        if (d3 < 1.0d) {
            iMo11975du = i;
        }
        if (d4 < 1.0d) {
            iMo11978h4 = i2;
        }
        return m17658x1(abstractC12002ck, iMo11975du, iMo11978h4);
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC12002ck m17643k4(AbstractC12002ck abstractC12002ck, float[] fArr, C11913yj c11913yj) {
        return ((fArr[0] < 1.0f || fArr[1] < 1.0f) && (abstractC12002ck instanceof C12009k4)) ? (this.f11890k4.mo17479fa() == 2 || this.f11890k4.mo17479fa() == 7 || this.f11890k4.mo17479fa() == 6) ? m17645k4((C12009k4) abstractC12002ck, (float) c11913yj.m55761jd(), (float) c11913yj.m55784up()) : abstractC12002ck : abstractC12002ck;
    }

    /* JADX INFO: renamed from: k4 */
    private C12007ix m17644k4(C12025x6[] c12025x6Arr) {
        C12007ix c12007ix = new C12007ix();
        c12007ix.m56566kk(c12025x6Arr[0].m56897x1());
        c12007ix.m56572to(c12025x6Arr[0].m56895kk());
        c12007ix.m56576x1(C6542kk.m26363x1(c12025x6Arr[1], c12025x6Arr[0]));
        c12007ix.m56560k4(C6542kk.m26363x1(c12025x6Arr[2], c12025x6Arr[0]));
        return c12007ix;
    }

    /* JADX INFO: renamed from: k4 */
    private static C12009k4 m17645k4(C12009k4 c12009k4, float f, float f2) {
        C12009k4 c12009k42;
        int i;
        char c;
        int i2;
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((fAbs < 1.0f || fAbs2 < 1.0f) && fAbs != 0.0f && fAbs2 != 0.0f) {
            float fMin = Math.min(1.0f / fAbs, 6.0f);
            float fMin2 = Math.min(1.0f / fAbs2, 6.0f);
            int iFloor = (int) Math.floor((fMin * 1.5f) / 1.25f);
            int iFloor2 = (int) Math.floor((fMin2 * 1.5f) / 1.25f);
            int i3 = 0;
            if (AbstractC12002ck.m56327x1(c12009k4.mo15753jd())) {
                c12009k42 = new C12009k4(c12009k4.mo15760yj(), c12009k4.mo15757m9(), 2498570);
                AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k42).mo17513k4(c12009k4, new C12016rv(0, 0));
            } else {
                c12009k42 = (C12009k4) c12009k4.deepClone();
            }
            int iMo15760yj = c12009k4.mo15760yj();
            int iMo15757m9 = c12009k4.mo15757m9();
            char c2 = 3;
            int[][][] iArr = (int[][][]) Array.newInstance((Class<?>) Integer.TYPE, iMo15760yj, iMo15757m9, 4);
            for (int i4 = 0; i4 < iMo15760yj; i4++) {
                for (int i5 = 0; i5 < iMo15757m9; i5++) {
                    C12003du c12003duM56609x1 = c12009k4.m56609x1(i4, i5);
                    iArr[i4][i5][0] = c12003duM56609x1.m56501c5() & 255;
                    iArr[i4][i5][1] = c12003duM56609x1.m56507jd() & 255;
                    iArr[i4][i5][2] = c12003duM56609x1.m56502ck() & 255;
                    iArr[i4][i5][3] = c12003duM56609x1.m56505fa() & 255;
                }
            }
            for (int i6 = 0; i6 < iMo15760yj; i6++) {
                int i7 = i3;
                while (i7 < iMo15757m9) {
                    int iMax = Math.max(i3, i6 - iFloor);
                    int i8 = i3;
                    int i9 = i8;
                    int i10 = i9;
                    int i11 = i10;
                    int i12 = i11;
                    while (iMax >= 0 && iMax < iMo15760yj) {
                        c = c2;
                        if (iMax >= i6 + iFloor) {
                            i = i3;
                            break;
                        }
                        int iMax2 = Math.max(i3, i7 - iFloor2);
                        while (iMax2 >= 0 && iMax2 < iMo15757m9) {
                            i2 = i3;
                            if (iMax2 < i7 + iFloor2) {
                                int[] iArr2 = iArr[iMax][iMax2];
                                i10 += iArr2[i2];
                                i11 += iArr2[1];
                                i12 += iArr2[2];
                                i8 += iArr2[c];
                                i9++;
                                iMax2++;
                                i3 = i2;
                            }
                        }
                        i2 = i3;
                        iMax++;
                        c2 = c;
                        i3 = i2;
                    }
                    i = i3;
                    c = c2;
                    if (i9 > 0) {
                        c12009k42.m56604k4(i6, i7, C12003du.m56398k4(i10 / i9, i11 / i9, i12 / i9, i8 / i9));
                    }
                    i7++;
                    c2 = c;
                    i3 = i;
                }
            }
            return c12009k42;
        }
        return c12009k4;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C12009k4 m17646k4(C12009k4 c12009k4, C12025x6[] c12025x6Arr, C12007ix[] c12007ixArr, C3976c5 c3976c5) {
        if (c3976c5 == null) {
            return c12009k4;
        }
        C12007ix c12007ix = c12007ixArr[0];
        if (c12007ix.m56550c5() + c12007ix.m56557jd() <= c12009k4.mo15760yj()) {
            if (c12007ix.m56575x1() + c12007ix.m56551ck() > c12009k4.mo15757m9()) {
                if (c3976c5.f10748k4 != 4) {
                    float fMo15760yj = c12007ix.m56557jd() > ((float) c12009k4.mo15760yj()) ? c12009k4.mo15760yj() % c12007ix.m56557jd() : c12007ix.m56557jd();
                    float fMo15757m9 = c12007ix.m56551ck() > ((float) c12009k4.mo15757m9()) ? c12009k4.mo15757m9() % c12007ix.m56551ck() : c12007ix.m56551ck();
                    c12009k4.mo15760yj();
                    C12012lr c12012lr = new C12012lr(c12009k4, c3976c5.f10748k4, new C12007ix(0.0f, fMo15757m9, c12009k4.mo15760yj(), c12009k4.mo15757m9() - fMo15757m9));
                    float fM56550c5 = c12007ixArr[0].m56550c5() + fMo15760yj;
                    float fM56575x1 = c12007ixArr[0].m56575x1();
                    C12009k4 c12009k42 = new C12009k4(Math.round(fM56550c5), Math.round(fM56575x1));
                    AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k42).mo17524k4(c12012lr, 0.0f, 0.0f, fM56550c5, fM56575x1);
                    C12009k4 c12009k4M56601k4 = c12009k42.m56601k4(new C12014ne(Math.round(fMo15760yj), 0, Math.round(c12007ixArr[0].m56550c5()), Math.round(c12007ixArr[0].m56575x1())));
                    c12007ixArr[0] = new C12007ix(0.0f, 0.0f, c12009k4M56601k4.mo15760yj(), c12009k4M56601k4.mo15757m9());
                    return c12009k4M56601k4;
                }
                if (c3976c5.f10752x1 != null) {
                    C11913yj c11913yjM17639k4 = m17639k4(c12025x6Arr, c12007ix);
                    C12018u4 c12018u4 = new C12018u4(c12007ix.Clone());
                    c12018u4.m56752k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()));
                    c12018u4.m56771x1(c11913yjM17639k4);
                    this.f11890k4.mo17531k4(new C11999ar(c3976c5.f10752x1), c12018u4);
                }
            }
        }
        return c12009k4;
    }

    /* JADX INFO: renamed from: k4 */
    public void m17660k4(AbstractC12002ck abstractC12002ck, float f, float f2) {
        if (abstractC12002ck == null) {
            throw new ArgumentNullException("Value of 'image' cannot be null");
        }
        m17662k4(abstractC12002ck, f, f2, abstractC12002ck.mo15755k4(new int[]{2}).Clone(), 2);
    }

    /* JADX INFO: renamed from: k4 */
    public void m17661k4(AbstractC12002ck abstractC12002ck, float f, float f2, float f3, float f4) {
        if (abstractC12002ck == null) {
            throw new ArgumentNullException("Value of 'image' cannot be null");
        }
        m17680k4(m17642k4(abstractC12002ck, new C12015qq(f3, f4)), new C12025x6[]{new C12025x6(f, f2), new C12025x6(f3 + f, f2), new C12025x6(f, f2 + f4)}, true);
    }

    /* JADX INFO: renamed from: k4 */
    public void m17662k4(AbstractC12002ck abstractC12002ck, float f, float f2, C12007ix c12007ix, int i) {
        char c;
        C12007ix c12007ix2;
        int i2;
        float fM17616k4;
        int iMo17605yj;
        double d;
        float fM17633to;
        float fM17616k42;
        C12007ix c12007ix3;
        if (abstractC12002ck == null) {
            throw new ArgumentNullException("Value of 'image' cannot be null");
        }
        if (i == 1) {
            throw new ArgumentException("Invalid parameter", "srcUnit");
        }
        C12007ix c12007ixM17627k4 = C4375kk.m17627k4(i, 2, c12007ix);
        float fM56550c5 = c12007ixM17627k4.m56550c5();
        float fM56575x1 = c12007ixM17627k4.m56575x1();
        if (!C4375kk.m17630k4(i)) {
            c12007ixM17627k4 = C6541k4.m26346k4(C11913yj.m55748du(abstractC12002ck.mo15752dy() / C4375kk.m17632kk(), abstractC12002ck.mo15758up() / C4375kk.m17633to()), c12007ixM17627k4.m56574up()).mo8355dy();
        }
        float fM56557jd = c12007ixM17627k4.m56557jd();
        float fM56551ck = c12007ixM17627k4.m56551ck();
        float fM56550c52 = c12007ixM17627k4.m56550c5();
        float fM56575x12 = c12007ixM17627k4.m56575x1();
        if (!C4375kk.m17630k4(this.f11890k4.mo17605yj()) || !C4375kk.m17630k4(i)) {
            if (C4375kk.m17630k4(i)) {
                c = 2;
                c12007ix2 = c12007ixM17627k4;
                i2 = 2;
                fM17616k4 = (float) C4375kk.m17616k4(2, this.f11890k4.mo17605yj(), fM56550c5, abstractC12002ck.mo15752dy(), this.f11890k4.mo17483jd());
                iMo17605yj = this.f11890k4.mo17605yj();
                d = fM56575x1;
                fM17633to = abstractC12002ck.mo15758up();
            } else {
                c = 2;
                c12007ix2 = c12007ixM17627k4;
                i2 = 2;
                fM17616k4 = (float) C4375kk.m17616k4(2, this.f11890k4.mo17605yj(), fM56550c5, C4375kk.m17632kk(), this.f11890k4.mo17483jd());
                iMo17605yj = this.f11890k4.mo17605yj();
                d = fM56575x1;
                fM17633to = C4375kk.m17633to();
            }
            fM17616k42 = (float) C4375kk.m17616k4(i2, iMo17605yj, d, fM17633to, this.f11890k4.mo17474ck());
        } else {
            float fMo17483jd = (this.f11890k4.mo17483jd() / abstractC12002ck.mo15752dy()) * fM56550c5;
            fM17616k42 = (this.f11890k4.mo17474ck() / abstractC12002ck.mo15758up()) * fM56575x1;
            fM17616k4 = fMo17483jd;
            c = 2;
            c12007ix2 = c12007ixM17627k4;
        }
        if (this.f11890k4.mo17605yj() != 1) {
            fM17616k4 /= this.f11890k4.mo17579up();
            fM17616k42 /= this.f11890k4.mo17579up();
        }
        C12025x6[] c12025x6Arr = new C12025x6[3];
        c12025x6Arr[0] = new C12025x6(f, f2);
        char c2 = c;
        c12025x6Arr[1] = new C12025x6(f + fM17616k4, f2);
        c12025x6Arr[c2] = new C12025x6(f, f2 + fM17616k42);
        C12007ix c12007ix4 = c12007ix2;
        C11913yj c11913yjM17640k4 = m17640k4(c12025x6Arr, c12007ix4, false);
        m17640k4(c12025x6Arr, c12007ix4, true);
        boolean z = (c11913yjM17640k4.m55755c5() & 24) != 0;
        float[] fArrM17653k4 = m17653k4(c12025x6Arr[0].m56897x1(), c12025x6Arr[0].m56895kk(), c11913yjM17640k4.m55760h4());
        float f3 = fArrM17653k4[0];
        float f4 = fArrM17653k4[1];
        float[] fArrM17654k4 = m17654k4(f3, f4, abstractC12002ck);
        float f5 = fArrM17654k4[0];
        float f6 = fArrM17654k4[1];
        float[] fArrM17653k42 = m17653k4(c12025x6Arr[1].m56897x1(), c12025x6Arr[1].m56895kk(), c11913yjM17640k4.m55760h4());
        float f7 = fArrM17653k42[0] - f3;
        float f8 = fArrM17653k42[1] - f4;
        float[] fArrM17653k43 = m17653k4(c12025x6Arr[c2].m56897x1(), c12025x6Arr[c2].m56895kk(), c11913yjM17640k4.m55760h4());
        float f9 = fArrM17653k43[0] - f3;
        float f10 = fArrM17653k43[1] - f4;
        float[] fArrM17654k42 = m17654k4(f7, f8, abstractC12002ck);
        float f11 = fArrM17654k42[0];
        float f12 = fArrM17654k42[1];
        float[] fArrM17654k43 = m17654k4(f9, f10, abstractC12002ck);
        float f13 = fArrM17654k43[0];
        float f14 = fArrM17654k43[1];
        if (z) {
            c12007ix3 = c12007ix4;
        } else {
            C12007ix c12007ix5 = new C12007ix(fM56557jd + f5, fM56551ck + f6, fM56550c52 + f11, fM56575x12 + f14);
            c12025x6Arr = new C12025x6[3];
            float f15 = f + f3;
            float f16 = f2 + f4;
            c12025x6Arr[0] = new C12025x6(f15, f16);
            c12025x6Arr[1] = new C12025x6(fM17616k4 + f15 + f7, f16);
            c12025x6Arr[c2] = new C12025x6(f15, f16 + fM17616k42 + f10);
            c12007ix3 = c12007ix5;
        }
        m17679k4(m17641k4(abstractC12002ck), c12025x6Arr, c12007ix3, 2, true, false);
    }

    /* JADX INFO: renamed from: k4 */
    public void m17663k4(AbstractC12002ck abstractC12002ck, int i, int i2) {
        m17660k4(abstractC12002ck, i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    public void m17664k4(AbstractC12002ck abstractC12002ck, int i, int i2, int i3, int i4) {
        m17661k4(abstractC12002ck, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: k4 */
    public void m17665k4(AbstractC12002ck abstractC12002ck, int i, int i2, C12014ne c12014ne, int i3) {
        m17662k4(abstractC12002ck, i, i2, C12007ix.m56544k4(c12014ne), i3);
    }

    /* JADX INFO: renamed from: k4 */
    private void m17647k4(AbstractC12002ck abstractC12002ck, C4408to c4408to, C11913yj c11913yj, boolean z, boolean z2, float[] fArr) {
        C11913yj c11913yjMo67596kk = this.f11890k4.mo17582wl().mo67596kk();
        C11913yj c11913yjM17626k4 = C4375kk.m17626k4(this.f11890k4);
        InterfaceC1565x1 interfaceC1565x1Mo67586h4 = this.f11890k4.mo17582wl().mo67586h4();
        this.f11890k4.mo17582wl().mo67593k4(c11913yjM17626k4);
        if (!c11913yj.m55778kk()) {
            c11913yj = C11913yj.f40121k4.m55760h4();
        }
        try {
            c11913yj.m55769k4(this.f11890k4.mo17577u4(), 1);
            C11913yj c11913yjM17626k42 = C4375kk.m17626k4(this.f11890k4);
            c11913yjM17626k42.m55787x1(c11913yj);
            if (z && this.f11890k4.m17581v4()) {
                c11913yjM17626k42 = m17638k4(abstractC12002ck, c11913yjM17626k42, true, true);
            }
            if (!z2) {
                abstractC12002ck = m17643k4(abstractC12002ck, fArr, c11913yjM17626k42);
            }
            if (c4408to != null) {
                this.f11890k4.mo17582wl().mo67590k4(c4408to);
            }
            this.f11890k4.mo17582wl().mo67593k4(c11913yjMo67596kk);
            m17648k4(abstractC12002ck, c11913yjM17626k42);
            this.f11890k4.mo17582wl().mo67593k4(c11913yjMo67596kk);
            this.f11890k4.mo17582wl().mo67590k4(interfaceC1565x1Mo67586h4);
        } catch (Throwable th) {
            this.f11890k4.mo17582wl().mo67593k4(c11913yjMo67596kk);
            this.f11890k4.mo17582wl().mo67590k4(interfaceC1565x1Mo67586h4);
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m17648k4(AbstractC12002ck abstractC12002ck, C11913yj c11913yj) {
        InterfaceC1565x1 interfaceC1565x1Mo67586h4 = this.f11890k4.mo17582wl().mo67586h4();
        if (interfaceC1565x1Mo67586h4 != null) {
            interfaceC1565x1Mo67586h4 = m17659k4(new C4408to(interfaceC1565x1Mo67586h4));
        }
        this.f11890k4.mo17582wl().mo67590k4(interfaceC1565x1Mo67586h4);
        if (Double.isNaN(c11913yj.m55782rv())) {
            c11913yj = new C11913yj();
        }
        if (abstractC12002ck instanceof C3989up) {
            abstractC12002ck = ((C3989up) abstractC12002ck).m15759x1();
        }
        this.f11890k4.mo17582wl().mo67592k4(abstractC12002ck.mo15751du().m62930k4(), c11913yj);
    }

    /* JADX INFO: renamed from: k4 */
    public void m17666k4(AbstractC12002ck abstractC12002ck, C12007ix c12007ix) {
        m17677k4(abstractC12002ck, new C12025x6[]{new C12025x6(c12007ix.m56557jd(), c12007ix.m56551ck()), new C12025x6(c12007ix.m56550c5() + c12007ix.m56557jd(), c12007ix.m56551ck()), new C12025x6(c12007ix.m56557jd(), c12007ix.m56575x1() + c12007ix.m56551ck())});
    }

    /* JADX INFO: renamed from: k4 */
    public void m17667k4(AbstractC12002ck abstractC12002ck, C12007ix c12007ix, C12007ix c12007ix2, int i) {
        m17650k4(abstractC12002ck, new C12025x6[]{new C12025x6(c12007ix.m56557jd(), c12007ix.m56551ck()), new C12025x6(c12007ix.m56550c5() + c12007ix.m56557jd(), c12007ix.m56551ck()), new C12025x6(c12007ix.m56557jd(), c12007ix.m56575x1() + c12007ix.m56551ck())}, c12007ix2, i, (C3976c5) null, true, true);
    }

    /* JADX INFO: renamed from: k4 */
    public void m17668k4(AbstractC12002ck abstractC12002ck, C12014ne c12014ne) {
        m17675k4(abstractC12002ck, new C12016rv[]{new C12016rv(c12014ne.m56669jd(), c12014ne.m56664ck()), new C12016rv(c12014ne.m56663c5() + c12014ne.m56669jd(), c12014ne.m56664ck()), new C12016rv(c12014ne.m56669jd(), c12014ne.m56683x1() + c12014ne.m56664ck())});
    }

    /* JADX INFO: renamed from: k4 */
    public void m17669k4(AbstractC12002ck abstractC12002ck, C12014ne c12014ne, float f, float f2, float f3, float f4, int i) {
        m17667k4(abstractC12002ck, C12007ix.m56544k4(c12014ne), new C12007ix(f, f2, f3, f4), i);
    }

    /* JADX INFO: renamed from: k4 */
    public void m17670k4(AbstractC12002ck abstractC12002ck, C12014ne c12014ne, float f, float f2, float f3, float f4, int i, C3976c5 c3976c5) {
        m17678k4(abstractC12002ck, new C12025x6[]{new C12025x6(c12014ne.m56669jd(), c12014ne.m56664ck()), new C12025x6(c12014ne.m56663c5() + c12014ne.m56669jd(), c12014ne.m56664ck()), new C12025x6(c12014ne.m56669jd(), c12014ne.m56683x1() + c12014ne.m56664ck())}, new C12007ix(f, f2, f3, f4), i, c3976c5);
    }

    /* JADX INFO: renamed from: k4 */
    public void m17671k4(AbstractC12002ck abstractC12002ck, C12014ne c12014ne, int i, int i2, int i3, int i4, int i5, C3976c5 c3976c5) {
        m17649k4(abstractC12002ck, C12025x6.m56884k4(new C12016rv[]{new C12016rv(c12014ne.m56669jd(), c12014ne.m56664ck()), new C12016rv(c12014ne.m56663c5() + c12014ne.m56669jd(), c12014ne.m56664ck()), new C12016rv(c12014ne.m56669jd(), c12014ne.m56683x1() + c12014ne.m56664ck())}), new C12007ix(i, i2, i3, i4), i5, c3976c5, true);
    }

    /* JADX INFO: renamed from: k4 */
    public void m17672k4(AbstractC12002ck abstractC12002ck, C12014ne c12014ne, C12014ne c12014ne2, int i) {
        m17667k4(abstractC12002ck, C12007ix.m56544k4(c12014ne), C12007ix.m56544k4(c12014ne2), i);
    }

    /* JADX INFO: renamed from: k4 */
    public void m17673k4(AbstractC12002ck abstractC12002ck, C12016rv c12016rv) {
        m17663k4(abstractC12002ck, c12016rv.m56708k4(), c12016rv.m56713x1());
    }

    /* JADX INFO: renamed from: k4 */
    public void m17674k4(AbstractC12002ck abstractC12002ck, C12025x6 c12025x6) {
        m17660k4(abstractC12002ck, c12025x6.m56897x1(), c12025x6.m56895kk());
    }

    /* JADX INFO: renamed from: k4 */
    public void m17675k4(AbstractC12002ck abstractC12002ck, C12016rv[] c12016rvArr) {
        m17677k4(abstractC12002ck, C12025x6.m56884k4(c12016rvArr));
    }

    /* JADX INFO: renamed from: k4 */
    public void m17676k4(AbstractC12002ck abstractC12002ck, C12016rv[] c12016rvArr, C12014ne c12014ne, int i, C3976c5 c3976c5) {
        m17678k4(abstractC12002ck, C12025x6.m56884k4(c12016rvArr), C12007ix.m56544k4(c12014ne), i, c3976c5);
    }

    /* JADX INFO: renamed from: k4 */
    public void m17677k4(AbstractC12002ck abstractC12002ck, C12025x6[] c12025x6Arr) {
        m17680k4(abstractC12002ck, c12025x6Arr, true);
    }

    /* JADX INFO: renamed from: k4 */
    public void m17678k4(AbstractC12002ck abstractC12002ck, C12025x6[] c12025x6Arr, C12007ix c12007ix, int i, C3976c5 c3976c5) {
        m17649k4(abstractC12002ck, c12025x6Arr, c12007ix, i, c3976c5, true);
    }

    /* JADX INFO: renamed from: k4 */
    private void m17649k4(AbstractC12002ck abstractC12002ck, C12025x6[] c12025x6Arr, C12007ix c12007ix, int i, C3976c5 c3976c5, boolean z) {
        m17650k4(abstractC12002ck, c12025x6Arr, c12007ix, i, c3976c5, z, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m17650k4(AbstractC12002ck abstractC12002ck, C12025x6[] c12025x6Arr, C12007ix c12007ix, int i, C3976c5 c3976c5, boolean z, boolean z2) {
        AbstractC12002ck abstractC12002ckM17646k4 = abstractC12002ck;
        if (abstractC12002ckM17646k4 == null) {
            throw new ArgumentNullException("Value of 'image' cannot be null");
        }
        if (c12025x6Arr == null) {
            throw new ArgumentNullException("Value of 'destPoints' cannot be null");
        }
        int length = c12025x6Arr.length;
        if (length != 3 && length != 4) {
            throw new ArgumentException("Value of 'destPoints' is invalid");
        }
        if (length > 3) {
            throw new NotImplementedException();
        }
        if (i == 1) {
            throw new ArgumentException("Invalid parameter", "srcUnit");
        }
        if (abstractC12002ckM17646k4 instanceof C3989up) {
            abstractC12002ckM17646k4 = ((C3989up) abstractC12002ckM17646k4).m15759x1();
        }
        C12007ix c12007ixM17627k4 = C4375kk.m17627k4(i, 2, c12007ix);
        if (!C4375kk.m17630k4(i)) {
            c12007ixM17627k4 = C6541k4.m26346k4(C11913yj.m55748du(abstractC12002ckM17646k4.mo15752dy() / C4375kk.m17632kk(), abstractC12002ckM17646k4.mo15758up() / C4375kk.m17633to()), c12007ixM17627k4.m56574up()).mo8355dy();
        }
        if (c3976c5 != null) {
            if (!(abstractC12002ckM17646k4 instanceof C12009k4)) {
                abstractC12002ckM17646k4 = new C12009k4(abstractC12002ckM17646k4);
            }
            if (c3976c5.m15672k4()) {
                C12007ix[] c12007ixArr = {c12007ixM17627k4};
                abstractC12002ckM17646k4 = m17646k4((C12009k4) abstractC12002ckM17646k4, c12025x6Arr, c12007ixArr, c3976c5);
                c12007ixM17627k4 = c12007ixArr[0];
            }
            if (m17652k4(c3976c5)) {
                C7015du<C14112xw> c7015du = new C7015du<>(new C14112xw(0L));
                m17651k4((C12009k4) abstractC12002ckM17646k4, c7015du, c3976c5);
                E e = c7015du.f19072k4;
                if (e != 0 && !((C14112xw) e).m67355k4()) {
                    C12009k4 c12009k4 = new C12009k4(abstractC12002ckM17646k4.mo15760yj(), abstractC12002ckM17646k4.mo15757m9());
                    c12009k4.m56332k4(abstractC12002ckM17646k4.mo15752dy(), abstractC12002ckM17646k4.mo15758up());
                    C3983k4 c3983k4M56598k4 = c12009k4.m56598k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 3, 2498570, true);
                    c3983k4M56598k4.m15719k4((C14112xw) c7015du.f19072k4);
                    c12009k4.m56605k4(c3983k4M56598k4);
                    abstractC12002ckM17646k4 = c12009k4;
                }
            }
        }
        float fM56557jd = c12007ixM17627k4.m56557jd();
        float fM56551ck = c12007ixM17627k4.m56551ck();
        float fM56550c5 = c12007ixM17627k4.m56550c5();
        float fM56575x1 = c12007ixM17627k4.m56575x1();
        C11913yj c11913yjM17640k4 = m17640k4(c12025x6Arr, c12007ixM17627k4, false);
        C11913yj c11913yjM17640k42 = m17640k4(c12025x6Arr, c12007ixM17627k4, true);
        float[] fArrM17653k4 = m17653k4(c12025x6Arr[0].m56897x1(), c12025x6Arr[0].m56895kk(), c11913yjM17640k4.m55760h4());
        float f = fArrM17653k4[0];
        float f2 = fArrM17653k4[1];
        float[] fArrM17653k42 = m17653k4(fM56557jd, fM56551ck, c11913yjM17640k42.m55760h4());
        float f3 = fArrM17653k42[0];
        float f4 = fArrM17653k42[1];
        float[] fArrM17653k43 = m17653k4(c12025x6Arr[1].m56897x1(), c12025x6Arr[1].m56895kk(), c11913yjM17640k4.m55760h4());
        float f5 = fArrM17653k43[0];
        float f6 = fArrM17653k43[1];
        float[] fArrM17653k44 = m17653k4(fM56557jd + fM56550c5, fM56551ck, c11913yjM17640k42.m55760h4());
        float f7 = fArrM17653k44[0];
        float f8 = fArrM17653k44[1];
        float[] fArrM17653k45 = m17653k4(c12025x6Arr[2].m56897x1(), c12025x6Arr[2].m56895kk(), c11913yjM17640k4.m55760h4());
        float f9 = fArrM17653k45[0];
        float f10 = fArrM17653k45[1];
        float[] fArrM17653k46 = m17653k4(fM56557jd, fM56551ck + fM56575x1, c11913yjM17640k42.m55760h4());
        float f11 = fArrM17653k46[0];
        C12007ix c12007ix2 = new C12007ix(fM56557jd + f3, fM56551ck + f4, (fM56550c5 - f3) + f7, (fM56575x1 - f4) + fArrM17653k46[1]);
        m17679k4(m17641k4(abstractC12002ckM17646k4), new C12025x6[]{new C12025x6(c12025x6Arr[0].m56897x1() + f, c12025x6Arr[0].m56895kk() + f2), new C12025x6(c12025x6Arr[1].m56897x1() + f5, c12025x6Arr[1].m56895kk() + f6), new C12025x6(c12025x6Arr[2].m56897x1() + f9, c12025x6Arr[2].m56895kk() + f10)}, c12007ix2, 2, z, z2);
    }

    /* JADX INFO: renamed from: k4 */
    public void m17679k4(AbstractC12002ck abstractC12002ck, C12025x6[] c12025x6Arr, C12007ix c12007ix, int i, boolean z, boolean z2) {
        float[] fArrM17655k4;
        if (abstractC12002ck == null) {
            throw new ArgumentNullException("Value of 'image' cannot be null");
        }
        if (c12025x6Arr == null) {
            throw new ArgumentNullException("Value of 'destPoints' cannot be null");
        }
        int length = c12025x6Arr.length;
        if (length != 3 && length != 4) {
            throw new ArgumentException("Value of 'destPoints' is invalid");
        }
        if (length > 3) {
            throw new NotImplementedException();
        }
        if (i == 1) {
            throw new ArgumentException("Invalid parameter", "srcUnit");
        }
        if (abstractC12002ck instanceof C3989up) {
            abstractC12002ck = ((C3989up) abstractC12002ck).m15759x1();
        }
        AbstractC12002ck abstractC12002ck2 = abstractC12002ck;
        C4408to c4408toM17657x1 = m17657x1(c12025x6Arr);
        C11913yj c11913yj = new C11913yj(c12007ix, c12025x6Arr);
        if (z2) {
            fArrM17655k4 = null;
        } else {
            C12007ix c12007ixM17644k4 = m17644k4(c12025x6Arr);
            fArrM17655k4 = m17655k4(c12025x6Arr, c12007ixM17644k4.m56550c5(), c12007ixM17644k4.m56575x1(), c12007ix);
        }
        m17647k4(abstractC12002ck2, c4408toM17657x1, c11913yj, z, z2, fArrM17655k4);
    }

    /* JADX INFO: renamed from: k4 */
    public void m17680k4(AbstractC12002ck abstractC12002ck, C12025x6[] c12025x6Arr, boolean z) {
        if (abstractC12002ck == null) {
            throw new ArgumentNullException("Value of 'image' cannot be null");
        }
        if (c12025x6Arr == null) {
            throw new ArgumentNullException("Value of 'destPoints' cannot be null");
        }
        int length = c12025x6Arr.length;
        if (length != 3 && length != 4) {
            throw new ArgumentException("Value of 'destPoints' is invalid");
        }
        if (length > 3) {
            throw new NotImplementedException();
        }
        C12007ix c12007ixMo15755k4 = abstractC12002ck.mo15755k4(new int[]{2});
        float fM56557jd = c12007ixMo15755k4.m56557jd();
        float fM56551ck = c12007ixMo15755k4.m56551ck();
        float fM56550c5 = c12007ixMo15755k4.m56550c5();
        float fM56575x1 = c12007ixMo15755k4.m56575x1();
        C11913yj c11913yjM17640k4 = m17640k4(c12025x6Arr, c12007ixMo15755k4, false);
        C11913yj c11913yjM17640k42 = m17640k4(c12025x6Arr, c12007ixMo15755k4, true);
        float[] fArrM17653k4 = m17653k4(c12025x6Arr[0].m56897x1(), c12025x6Arr[0].m56895kk(), c11913yjM17640k4.m55760h4());
        float f = fArrM17653k4[0];
        float f2 = fArrM17653k4[1];
        float[] fArrM17653k42 = m17653k4(fM56557jd, fM56551ck, c11913yjM17640k42.m55760h4());
        float f3 = fArrM17653k42[0];
        float f4 = fArrM17653k42[1];
        float[] fArrM17653k43 = m17653k4(c12025x6Arr[1].m56897x1(), c12025x6Arr[1].m56895kk(), c11913yjM17640k4.m55760h4());
        float f5 = fArrM17653k43[0];
        float f6 = fArrM17653k43[1];
        float[] fArrM17653k44 = m17653k4(c12025x6Arr[2].m56897x1(), c12025x6Arr[2].m56895kk(), c11913yjM17640k4.m55760h4());
        float f7 = fArrM17653k44[0];
        float f8 = fArrM17653k44[1];
        float[] fArrM17653k45 = m17653k4(fM56557jd + fM56550c5, fM56551ck, c11913yjM17640k42.m55760h4());
        float f9 = fArrM17653k45[0];
        float f10 = fArrM17653k45[1];
        float[] fArrM17653k46 = m17653k4(fM56557jd, fM56551ck + fM56575x1, c11913yjM17640k42.m55760h4());
        float f11 = fArrM17653k46[0];
        C12007ix c12007ix = new C12007ix(fM56557jd + f3, fM56551ck + f4, (fM56550c5 - f3) + f9, (fM56575x1 - f4) + fArrM17653k46[1]);
        m17679k4(m17641k4(abstractC12002ck), new C12025x6[]{new C12025x6(c12025x6Arr[0].m56897x1() + f, c12025x6Arr[0].m56895kk() + f2), new C12025x6(c12025x6Arr[1].m56897x1() + f5, c12025x6Arr[1].m56895kk() + f6), new C12025x6(c12025x6Arr[2].m56897x1() + f7, c12025x6Arr[2].m56895kk() + f8)}, c12007ix, 2, true, z);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [E, com.aspose.slides.ms.System.xw] */
    /* JADX WARN: Type inference failed for: r14v51, types: [E, com.aspose.slides.ms.System.xw] */
    /* JADX INFO: renamed from: k4 */
    private void m17651k4(C12009k4 c12009k4, C7015du<C14112xw> c7015du, C3976c5 c3976c5) {
        C3976c5.k4 k4VarM15663k4;
        byte b;
        float f;
        C3983k4 c3983k4M56597k4;
        int i;
        C3983k4 c3983k4;
        int i2;
        int i3;
        C3984kk c3984kk;
        int i4;
        C3976c5.k4 k4Var;
        int i5;
        AbstractC3150x6 abstractC3150x6M14472k4;
        float f2;
        byte bM62720to;
        C12003du.f40505to.Clone();
        if (c12009k4 == null || c7015du == null || c3976c5 == null || (k4VarM15663k4 = c3976c5.m15663k4(0)) == null) {
            return;
        }
        C3976c5.k4 k4VarM15663k42 = c3976c5.m15663k4(0);
        C3990x1[] c3990x1Arr = k4VarM15663k4.f10757fa;
        C3976c5.k4 k4Var2 = (c3990x1Arr == null || c3990x1Arr.length <= 0) ? k4VarM15663k42 : k4VarM15663k4;
        C3976c5.k4 k4Var3 = k4VarM15663k4.f10758h4 != 0.0f ? k4VarM15663k4 : k4VarM15663k42;
        C3976c5.k4 k4Var4 = (k4VarM15663k4.f10754ck.m56504dy() || k4VarM15663k4.f10759jd.m56504dy()) ? k4VarM15663k42 : k4VarM15663k4;
        if (k4VarM15663k4.f10760k4 != null) {
            k4VarM15663k42 = k4VarM15663k4;
        }
        C3990x1[] c3990x1Arr2 = k4Var2.f10757fa;
        int i6 = 3;
        if ((c3990x1Arr2 == null || c3990x1Arr2.length <= 0) && k4Var3.f10758h4 == 0.0f && !k4VarM15663k4.f10755du && !k4VarM15663k4.f10756dy && ((k4VarM15663k4.f10754ck.m56504dy() || k4VarM15663k4.f10759jd.m56504dy()) && k4VarM15663k42.f10760k4 == null)) {
            b = 0;
            f = 0.0f;
            c3983k4M56597k4 = null;
        } else {
            C12014ne c12014ne = new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9());
            C3983k4 c3983k4M56597k42 = c12009k4.m56597k4(c12014ne, 3, 2498570);
            c7015du.f19072k4 = c3983k4M56597k42.m15721to();
            b = 0;
            f = 0.0f;
            C12009k4 c12009k42 = new C12009k4(C4370du.m17606k4(c12009k4.mo15751du().m62930k4(), c12009k4.mo15750ck(), c12009k4.mo15753jd()));
            c3983k4M56597k4 = c12009k42.m56597k4(c12014ne, 3, 2498570);
            c3983k4M56597k42.m15718k4(c3983k4M56597k4);
            c12009k42.m56605k4(c3983k4M56597k4);
            c12009k4.m56605k4(c3983k4M56597k42);
        }
        byte[] bArr = c3983k4M56597k4 != null ? (byte[]) c3983k4M56597k4.m15721to().m67356kk().m19850k4() : null;
        if (k4Var2.f10757fa != null) {
            int i7 = b;
            int iM15715du = i7;
            i = iM15715du;
            while (i7 < c3983k4M56597k4.m15716k4()) {
                int i8 = iM15715du;
                int i9 = b;
                while (i9 < c3983k4M56597k4.m15722x1()) {
                    int i10 = i8 + 1;
                    int i11 = i8 + 2;
                    int i12 = i6;
                    int i13 = i8 + 3;
                    int[] iArr = {bArr[i8], bArr[i10], bArr[i11], bArr[i13]};
                    int i14 = b;
                    while (true) {
                        C3990x1[] c3990x1Arr3 = k4Var2.f10757fa;
                        if (i14 < c3990x1Arr3.length) {
                            C12003du c12003duM15763x1 = c3990x1Arr3[i14].m15763x1();
                            C12003du c12003duM15761k4 = k4Var2.f10757fa[i14].m15761k4();
                            int i15 = i7;
                            C3976c5.k4 k4Var5 = k4Var2;
                            int[] iArr2 = iArr;
                            if ((iArr[b] & 255) == (c12003duM15763x1.m56505fa() & 255) && (iArr2[1] & 255) == (c12003duM15763x1.m56502ck() & 255) && (iArr2[2] & 255) == (c12003duM15763x1.m56507jd() & 255) && (iArr2[i12] & 255) == (c12003duM15763x1.m56501c5() & 255)) {
                                bArr[i8] = c12003duM15761k4.m56505fa();
                                bArr[i10] = c12003duM15761k4.m56502ck();
                                bArr[i11] = c12003duM15761k4.m56507jd();
                                bArr[i13] = c12003duM15761k4.m56501c5();
                                i = 1;
                            }
                            i14++;
                            i7 = i15;
                            k4Var2 = k4Var5;
                            iArr = iArr2;
                        }
                    }
                    i8 += 4;
                    i9++;
                    i6 = i12;
                }
                iM15715du += c3983k4M56597k4.m15715du();
                i7++;
            }
        } else {
            i = b;
        }
        int i16 = i6;
        int i17 = 2;
        int i18 = 1;
        float f3 = 1.0f;
        int i19 = 4;
        if (k4Var3 != null) {
            float f4 = k4Var3.f10758h4;
            if (f4 > f && f4 != 1.0f) {
                double d = f4;
                int i20 = b;
                int iM15715du2 = i20;
                while (i20 < c3983k4M56597k4.m15716k4()) {
                    int i21 = iM15715du2;
                    for (int i22 = b; i22 < c3983k4M56597k4.m15722x1(); i22++) {
                        bArr[i21] = (byte) C4375kk.m17618k4(bArr[i21], d);
                        int i23 = i21 + 1;
                        bArr[i23] = (byte) C4375kk.m17618k4(bArr[i23], d);
                        int i24 = i21 + 2;
                        bArr[i24] = (byte) C4375kk.m17618k4(bArr[i24], d);
                        int i25 = i21 + 3;
                        bArr[i25] = (byte) C4375kk.m17618k4(bArr[i25], d);
                        i21 += 4;
                    }
                    iM15715du2 += c3983k4M56597k4.m15715du();
                    i20++;
                }
                i = 1;
            }
        }
        float f5 = 255.0f;
        if (k4VarM15663k4.f10755du) {
            float f6 = k4VarM15663k4.f10765to;
            float f7 = f6 - ((int) f6);
            float f8 = (f7 < f ? f7 + 1.0f : f7) * 255.0f;
            if (f7 == f && f6 > f) {
                f8 = 255.0f;
            }
            int i26 = b;
            int iM15715du3 = i26;
            while (i26 < c3983k4M56597k4.m15716k4()) {
                int i27 = iM15715du3;
                int i28 = b;
                while (i28 < c3983k4M56597k4.m15722x1()) {
                    bArr[i27] = ((float) (bArr[i27] & 255)) > f8 ? (byte) 255 : b;
                    int i29 = i27 + 1;
                    float f9 = f3;
                    bArr[i29] = ((float) (bArr[i29] & 255)) > f8 ? (byte) 255 : b;
                    int i30 = i27 + 2;
                    bArr[i30] = ((float) (bArr[i30] & 255)) > f8 ? (byte) 255 : b;
                    i27 += 4;
                    i28++;
                    f3 = f9;
                }
                iM15715du3 += c3983k4M56597k4.m15715du();
                i26++;
                f3 = f3;
            }
            i = 1;
        }
        float f10 = f3;
        if (k4VarM15663k4.f10756dy) {
            AbstractC3150x6 abstractC3150x6M14472k42 = C13623yj.m62876x1().m14472k4();
            if (k4VarM15663k4.f10753c5 != null) {
                File file = new File(k4VarM15663k4.f10753c5);
                if (!file.isFile() || !file.isAbsolute() || !file.exists()) {
                    throw new NotImplementedException("File path is not exist or is not absolute. Color-profile's filepath must be absolute.");
                }
                abstractC3150x6M14472k4 = new C3130fa(k4VarM15663k4.f10753c5, i16);
            } else {
                abstractC3150x6M14472k4 = C13623yj.m62875k4().m14472k4();
            }
            C6986dy c6986dy = new C6986dy(abstractC3150x6M14472k42, abstractC3150x6M14472k4);
            int i31 = b;
            int iM15715du4 = i31;
            while (i31 < c3983k4M56597k4.m15716k4()) {
                int i32 = iM15715du4;
                int i33 = b;
                while (i33 < c3983k4M56597k4.m15722x1()) {
                    int i34 = i32 + 2;
                    float f11 = f5;
                    int i35 = i32 + 1;
                    int i36 = i31;
                    C13597du c13597duM62732k4 = C13600h4.m62732k4(bArr[i32 + 3] & 255, bArr[i34] & 255, bArr[i35] & 255, bArr[i32] & 255, c6986dy);
                    int i37 = k4VarM15663k4.f10763m9;
                    if (i37 == 0) {
                        bM62720to = c13597duM62732k4.m62717k4();
                    } else if (i37 == i18) {
                        bM62720to = c13597duM62732k4.m62721x1();
                    } else if (i37 == i17) {
                        bM62720to = c13597duM62732k4.m62719kk();
                    } else if (i37 == 3) {
                        bM62720to = c13597duM62732k4.m62720to();
                    } else {
                        f2 = f;
                        byte b2 = (byte) ((f10 - f2) * f11);
                        bArr[i32] = b2;
                        bArr[i35] = b2;
                        bArr[i34] = b2;
                        i32 += 4;
                        i33++;
                        f5 = f11;
                        i31 = i36;
                        i17 = 2;
                        i18 = 1;
                    }
                    f2 = (bM62720to & 255) / f11;
                    byte b22 = (byte) ((f10 - f2) * f11);
                    bArr[i32] = b22;
                    bArr[i35] = b22;
                    bArr[i34] = b22;
                    i32 += 4;
                    i33++;
                    f5 = f11;
                    i31 = i36;
                    i17 = 2;
                    i18 = 1;
                }
                iM15715du4 += c3983k4M56597k4.m15715du();
                i31++;
                i17 = 2;
                i19 = 4;
                i18 = 1;
            }
            i = 1;
        }
        float f12 = f5;
        int[] iArr3 = new int[i19];
        if (k4Var4.f10759jd.m56504dy() || k4Var4.f10754ck.m56504dy()) {
            c3983k4 = c3983k4M56597k4;
            i2 = i;
        } else {
            int i38 = 255;
            int iM56505fa = k4Var4.f10759jd.m56505fa() & 255;
            int iM56505fa2 = k4Var4.f10754ck.m56505fa() & 255;
            int iM56502ck = k4Var4.f10759jd.m56502ck() & 255;
            int iM56502ck2 = k4Var4.f10754ck.m56502ck() & 255;
            int iM56507jd = k4Var4.f10759jd.m56507jd() & 255;
            int iM56507jd2 = k4Var4.f10754ck.m56507jd() & 255;
            int iM15716k4 = c3983k4M56597k4.m15716k4();
            int iM15722x1 = c3983k4M56597k4.m15722x1();
            int i39 = b;
            while (i39 < iM15716k4) {
                int i40 = b;
                while (i40 < iM15722x1) {
                    c3983k4M56597k4.m15717k4(i40, i39, iArr3);
                    C3983k4 c3983k42 = c3983k4M56597k4;
                    int i41 = iArr3[b] & i38;
                    int[] iArr4 = iArr3;
                    int i42 = iArr4[1] & i38;
                    int i43 = iM15716k4;
                    int i44 = iArr4[2] & i38;
                    if (i41 >= iM56505fa && i41 <= iM56505fa2 && i42 >= iM56502ck && i42 <= iM56502ck2 && i44 >= iM56507jd && i44 <= iM56507jd2) {
                        int i45 = ((i39 * iM15722x1) + i40) * 4;
                        bArr[i45] = b;
                        bArr[i45 + 1] = b;
                        bArr[i45 + 2] = b;
                        bArr[i45 + 3] = b;
                    }
                    i40++;
                    iM15716k4 = i43;
                    c3983k4M56597k4 = c3983k42;
                    iArr3 = iArr4;
                    i38 = 255;
                }
                i39++;
                i38 = 255;
            }
            c3983k4 = c3983k4M56597k4;
            i2 = 1;
        }
        if (k4VarM15663k42.f10760k4 != null) {
            int i46 = k4VarM15663k42.f10767x1;
            int i47 = b;
            int iM15715du5 = i47;
            while (i47 < c3983k4.m15716k4()) {
                int i48 = iM15715du5;
                int i49 = b;
                while (i49 < c3983k4.m15722x1()) {
                    int i50 = bArr[i48] & 255;
                    int i51 = i48 + 1;
                    int i52 = bArr[i51] & 255;
                    int i53 = i48 + 2;
                    int i54 = bArr[i53] & 255;
                    int i55 = i48 + 3;
                    int i56 = bArr[i55] & 255;
                    if (i56 < 0 || i50 < 0 || i54 < 0 || i52 < 0) {
                        StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("a=", i56, ", r=", ", g=", i54);
                        sbOooO0O0.append(i52);
                        sbOooO0O0.append(", b=");
                        sbOooO0O0.append(i50);
                        throw new ArgumentException(sbOooO0O0.toString());
                    }
                    if (i46 == 0 || i50 != i52 || i50 != i54) {
                        c3984kk = k4VarM15663k42.f10760k4;
                    } else if (i46 == 1) {
                        i48 += 4;
                        i4 = i46;
                        k4Var = k4VarM15663k42;
                        i5 = i47;
                        i49++;
                        i46 = i4;
                        k4VarM15663k42 = k4Var;
                        i47 = i5;
                    } else {
                        c3984kk = k4VarM15663k42.f10761kk;
                    }
                    float f13 = i54;
                    float f14 = i52;
                    float f15 = i50;
                    float f16 = i56;
                    i4 = i46;
                    int iM15739u4 = (int) ((c3984kk.m15739u4() * f12) + (c3984kk.m15737rv() * f16) + (c3984kk.m15727fa() * f15) + (c3984kk.m15726dy() * f14) + (c3984kk.m15738to() * f13));
                    if (iM15739u4 == 0) {
                        bArr[i48] = b;
                        bArr[i51] = b;
                        bArr[i53] = b;
                        bArr[i55] = b;
                        i48 += 4;
                        k4Var = k4VarM15663k42;
                        i5 = i47;
                        i49++;
                        i46 = i4;
                        k4VarM15663k42 = k4Var;
                        i47 = i5;
                    } else {
                        k4Var = k4VarM15663k42;
                        int iM15742x6 = (int) ((c3984kk.m15742x6() * f12) + (c3984kk.m15740up() * f16) + (c3984kk.m15723c5() * f15) + (c3984kk.m15725du() * f14) + (c3984kk.m15731k4() * f13));
                        i5 = i47;
                        int iM15736ne = (int) ((c3984kk.m15736ne() * f12) + (c3984kk.m15743yj() * f16) + (c3984kk.m15730jd() * f15) + (c3984kk.m15728h4() * f14) + (c3984kk.m15741x1() * f13));
                        int iM15729ix = (int) ((c3984kk.m15729ix() * f12) + (c3984kk.m15734ks() * f16) + (c3984kk.m15724ck() * f15) + (c3984kk.m15735m9() * f14) + (c3984kk.m15733kk() * f13));
                        int i57 = iM15742x6 > 255 ? 255 : iM15742x6;
                        int i58 = iM15736ne > 255 ? 255 : iM15736ne;
                        int i59 = iM15729ix > 255 ? 255 : iM15729ix;
                        int i60 = iM15739u4 > 255 ? 255 : iM15739u4;
                        if (iM15742x6 < 0) {
                            i57 = b;
                        }
                        if (iM15736ne < 0) {
                            i58 = b;
                        }
                        if (iM15729ix < 0) {
                            i59 = b;
                        }
                        if (iM15739u4 < 0) {
                            i60 = b;
                        }
                        bArr[i48] = (byte) (i59 & 255);
                        bArr[i51] = (byte) (i58 & 255);
                        bArr[i53] = (byte) (i57 & 255);
                        bArr[i55] = (byte) (i60 & 255);
                        i48 += 4;
                        i49++;
                        i46 = i4;
                        k4VarM15663k42 = k4Var;
                        i47 = i5;
                    }
                }
                iM15715du5 += c3983k4.m15715du();
                i47++;
                i46 = i46;
                k4VarM15663k42 = k4VarM15663k42;
            }
            i3 = 1;
        } else {
            i3 = i2;
        }
        if (i3 != 0) {
            c7015du.f19072k4 = new C14112xw(AbstractC4786k4.m19846k4(bArr));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m17652k4(C3976c5 c3976c5) {
        C3976c5.k4 k4VarM15663k4;
        if (c3976c5 != null && (k4VarM15663k4 = c3976c5.m15663k4(0)) != null) {
            C3976c5.k4 k4VarM15663k42 = c3976c5.m15663k4(0);
            C3990x1[] c3990x1Arr = k4VarM15663k4.f10757fa;
            C3976c5.k4 k4Var = (c3990x1Arr == null || c3990x1Arr.length <= 0) ? k4VarM15663k42 : k4VarM15663k4;
            C3976c5.k4 k4Var2 = k4VarM15663k4.f10758h4 != 0.0f ? k4VarM15663k4 : k4VarM15663k42;
            C3976c5.k4 k4Var3 = (k4VarM15663k4.f10754ck.m56504dy() || k4VarM15663k4.f10759jd.m56504dy()) ? k4VarM15663k42 : k4VarM15663k4;
            if (k4VarM15663k4.f10760k4 != null) {
                k4VarM15663k42 = k4VarM15663k4;
            }
            C3990x1[] c3990x1Arr2 = k4Var.f10757fa;
            if ((c3990x1Arr2 == null || c3990x1Arr2.length <= 0) && k4Var2.f10758h4 == 0.0f && !k4VarM15663k4.f10755du && !k4VarM15663k4.f10756dy && ((k4VarM15663k4.f10754ck.m56504dy() || k4VarM15663k4.f10759jd.m56504dy()) && k4VarM15663k42.f10760k4 == null)) {
                return ((k4Var3.f10759jd.m56504dy() || k4Var3.f10754ck.m56504dy()) && k4VarM15663k42.f10760k4 == null) ? false : true;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private float[] m17653k4(float f, float f2, C11913yj c11913yj) {
        C11913yj c11913yjM55760h4 = c11913yj.m55760h4();
        c11913yjM55760h4.m55775k4(new C12025x6[]{new C12025x6(f, f2)});
        C12025x6[] c12025x6Arr = {new C12025x6((float) Math.ceil(r0[0].m56897x1()), (float) Math.ceil(r0[0].m56895kk()))};
        c11913yjM55760h4.m55780m9();
        c11913yjM55760h4.m55775k4(c12025x6Arr);
        return new float[]{c12025x6Arr[0].m56897x1() - f, c12025x6Arr[0].m56895kk() - f2};
    }

    /* JADX INFO: renamed from: k4 */
    private float[] m17654k4(float f, float f2, AbstractC12002ck abstractC12002ck) {
        float fM17616k4 = (float) C4375kk.m17616k4(this.f11890k4.mo17605yj(), 2, f, this.f11890k4.mo17483jd(), C4375kk.m17632kk());
        float fM17616k42 = (float) C4375kk.m17616k4(this.f11890k4.mo17605yj(), 2, f2, this.f11890k4.mo17474ck(), C4375kk.m17633to());
        if (this.f11890k4.mo17605yj() != 1) {
            fM17616k4 *= this.f11890k4.mo17579up();
            fM17616k42 *= this.f11890k4.mo17579up();
        }
        if (abstractC12002ck.mo15752dy() < C4375kk.m17632kk()) {
            fM17616k4 *= abstractC12002ck.mo15752dy() / C4375kk.m17632kk();
        }
        if (abstractC12002ck.mo15758up() < C4375kk.m17632kk()) {
            fM17616k42 *= abstractC12002ck.mo15758up() / C4375kk.m17632kk();
        }
        return new float[]{fM17616k4, fM17616k42};
    }

    /* JADX INFO: renamed from: k4 */
    private float[] m17655k4(C12025x6[] c12025x6Arr, float f, float f2, C12007ix c12007ix) {
        float[] fArr = {1.0f, 1.0f};
        float fM26363x1 = ((f + f2) + C6542kk.m26363x1(c12025x6Arr[1], c12025x6Arr[2])) / 2.0f;
        float fPow = (((float) Math.pow((fM26363x1 - r10) * ((fM26363x1 - f2) * ((fM26363x1 - f) * fM26363x1)), 0.5d)) * 2.0f) / f;
        fArr[0] = f / c12007ix.m56550c5();
        fArr[1] = fPow / c12007ix.m56575x1();
        return fArr;
    }
}
