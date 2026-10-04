package com.aspose.slides;

import android.content.pm.PackageManager;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p159h0.AbstractC4429ak;
import com.aspose.slides.internal.p159h0.AbstractC4434bz;
import com.aspose.slides.internal.p159h0.C4428ai;
import com.aspose.slides.internal.p159h0.C4430ar;
import com.aspose.slides.internal.p159h0.C4433bv;
import com.aspose.slides.internal.p159h0.C4442e0;
import com.aspose.slides.internal.p159h0.C4443em;
import com.aspose.slides.internal.p159h0.C4459os;
import com.aspose.slides.internal.p159h0.C4471ts;
import com.aspose.slides.internal.p159h0.C4473um;
import com.aspose.slides.internal.p159h0.C4476v4;
import com.aspose.slides.internal.p159h0.C4479w6;
import com.aspose.slides.internal.p159h0.C4489zj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12012lr;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.internal.p504xm.C12552kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.xb */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC14780xb {

    /* JADX INFO: renamed from: k4 */
    protected float f50033k4;

    /* JADX INFO: renamed from: kk */
    private boolean f50034kk;

    /* JADX INFO: renamed from: x1 */
    protected float f50035x1;

    public AbstractC14780xb(float f, float f2) {
        this.f50033k4 = f;
        this.f50035x1 = f2;
        m73297k4(false);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m73277k4(a1f a1fVar, boolean z) {
        if (a1fVar != null) {
            if (a1fVar.m3151jd() == 2 && a1fVar.m3150h4() == 13) {
                return 6;
            }
            int iM3150h4 = a1fVar.m3150h4();
            if (iM3150h4 == 0) {
                return z ? 4 : 2;
            }
            if (iM3150h4 == 13) {
                return z ? 5 : 3;
            }
        }
        return z ? 1 : 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m73299x1() {
        return this.f50034kk;
    }

    /* JADX INFO: renamed from: k4 */
    private C4317dy m73278k4(GeometryShape geometryShape, C4459os c4459os, C4443em c4443em) {
        C4317dy c4317dy = new C4317dy();
        if (m73299x1()) {
            c4317dy.m17338k4(geometryShape.getParentGroup().getRotation(), new C12025x6((c4443em.m18173k4() / 2.0f) + C7019kk.m27462to(Float.valueOf(c4459os.m18285k4() - (c4443em.m18173k4() / 2.0f)), 13), C7019kk.m27462to(Float.valueOf((c4443em.m18177x1() / 2.0f) + (c4459os.m18290x1() - (c4443em.m18177x1() / 2.0f))), 13)));
            return c4317dy;
        }
        if (m73298k4(geometryShape)) {
            c4317dy.m17338k4(geometryShape.getRotation(), new C12025x6((c4443em.m18173k4() / 2.0f) + C7019kk.m27462to(Float.valueOf(c4459os.m18285k4() - (c4443em.m18173k4() / 2.0f)), 13), C7019kk.m27462to(Float.valueOf((c4443em.m18177x1() / 2.0f) + (c4459os.m18290x1() - (c4443em.m18177x1() / 2.0f))), 13)));
            return c4317dy;
        }
        c4317dy.m17338k4(geometryShape.getRotation(), new C12025x6((geometryShape.getWidth() / 2.0f) + geometryShape.getX(), (geometryShape.getHeight() / 2.0f) + geometryShape.getY()));
        return c4317dy;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4429ak m73285k4() {
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private C4442e0 m73279k4(AbstractC14897zn abstractC14897zn, float[] fArr, C4489zj c4489zj, C4473um c4473um, C4443em[] c4443emArr) {
        C4473um c4473umClone = ck8.m4609k4(fArr).Clone();
        float[] fArr2 = {0.0f};
        C4473um c4473umClone2 = ck8.m4610k4(fArr, c4473umClone.Clone(), c4489zj.Clone(), new C4443em(abstractC14897zn.mo67711m9(), abstractC14897zn.mo67708dy()), fArr2, c4443emArr).Clone();
        C4473um c4473umClone3 = C4473um.m18362k4(new C4489zj(0.0f, 0.0f, fArr2[0]), new C4489zj(0.0f), new C4489zj(0.0f, 1.0f, 0.0f)).Clone();
        C4442e0 c4442e0 = new C4442e0();
        c4442e0.m18166kk(c4473um.Clone());
        c4442e0.m18164k4(C4473um.m18361k4(c4473umClone, c4473umClone3).Clone());
        c4442e0.m18169x1(c4473umClone2.Clone());
        c4442e0.m18163k4(1);
        return c4442e0;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4459os m73280k4(C11896dy c11896dy, byte b, C4459os c4459os) {
        float f;
        float fM67481k4;
        float fM56550c5;
        C4459os c4459os2 = new C4459os();
        if (c11896dy == null) {
            return c4459os2;
        }
        C12007ix c12007ixClone = c11896dy.m55523c5().Clone();
        if (b == 3 || b == 4) {
            f = 0.25f;
            c4459os2.m18286k4(C14116yg.m67481k4(c12007ixClone.m56550c5(), c12007ixClone.m56575x1()) * 0.25f);
            fM67481k4 = C14116yg.m67481k4(c12007ixClone.m56550c5(), c12007ixClone.m56575x1());
        } else {
            if (b != 5) {
                if (b == 1 || b == 2) {
                    c4459os2.m18286k4((c12007ixClone.m56550c5() * 0.1f) + (c12007ixClone.m56575x1() * 0.4f));
                    fM56550c5 = (c12007ixClone.m56550c5() * 0.1f) + (c12007ixClone.m56575x1() * 0.4f);
                    c4459os2.m18291x1(fM56550c5);
                }
                c4459os2.m18286k4(C14116yg.m67504x1(c4459os2.m18285k4(), c4459os.m18285k4()));
                c4459os2.m18291x1(C14116yg.m67504x1(c4459os2.m18290x1(), c4459os.m18290x1()));
                return c4459os2;
            }
            f = 0.5f;
            c4459os2.m18286k4(c12007ixClone.m56575x1() * 0.5f);
            fM67481k4 = c12007ixClone.m56575x1();
        }
        fM56550c5 = fM67481k4 * f;
        c4459os2.m18291x1(fM56550c5);
        c4459os2.m18286k4(C14116yg.m67504x1(c4459os2.m18285k4(), c4459os.m18285k4()));
        c4459os2.m18291x1(C14116yg.m67504x1(c4459os2.m18290x1(), c4459os.m18290x1()));
        return c4459os2;
    }

    /* JADX INFO: renamed from: k4 */
    public C4471ts mo73286k4(AbstractC14897zn abstractC14897zn, C4459os c4459os, int i) {
        C12023wl c12023wlClone = m73291k4(c4459os.Clone(), abstractC14897zn).Clone();
        C4471ts c4471ts = new C4471ts(c12023wlClone.m56865x1(), c12023wlClone.m56862kk(), m73284k4(i));
        c4471ts.m18352k4(0L);
        c4471ts.m18353k4(m73285k4());
        return c4471ts;
    }

    /* JADX INFO: renamed from: k4 */
    public final C4476v4 m73287k4(C4459os c4459os, float f, C12007ix c12007ix, boolean z, float f2) {
        return m73288k4(c4459os, f, c12007ix, z, f2, null);
    }

    /* JADX INFO: renamed from: k4 */
    public final C4476v4 m73288k4(C4459os c4459os, float f, C12007ix c12007ix, boolean z, float f2, C4317dy c4317dy) {
        C12025x6 c12025x6;
        C4317dy c4317dy2 = c4317dy;
        C4489zj c4489zj = new C4489zj(0.0f, 0.0f, 1.0f);
        C4489zj c4489zj2 = new C4489zj(0.0f, 0.0f, -1.0f);
        float fM56557jd = c12007ix.m56557jd() - c4459os.m18285k4();
        float fM18290x1 = c4459os.m18290x1() - c12007ix.m56551ck();
        float fM56550c5 = c12007ix.m56550c5() + fM56557jd;
        float fM56575x1 = fM18290x1 - c12007ix.m56575x1();
        int iM67483k4 = C14116yg.m67483k4(1, C7019kk.m27462to(Float.valueOf((c12007ix.m56550c5() / f2) + 0.5f), 13));
        int iM67483k42 = C14116yg.m67483k4(1, C7019kk.m27462to(Float.valueOf((c12007ix.m56575x1() / f2) + 0.5f), 13));
        int i = iM67483k4 + 1;
        int i2 = iM67483k42 + 1;
        int i3 = i * i2;
        C4489zj[] c4489zjArr = (C4489zj[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C4489zj.class), i3));
        C4489zj[] c4489zjArr2 = (C4489zj[]) C22200OooO0o0.OooO00o(C4489zj.class, i3);
        C4489zj[] c4489zjArr3 = (C4489zj[]) C22200OooO0o0.OooO00o(C4489zj.class, i3);
        C4459os[] c4459osArr = (C4459os[]) C22200OooO0o0.OooO00o(C4459os.class, i3);
        int i4 = iM67483k4 * iM67483k42 * 6;
        C12025x6 c12025x62 = new C12025x6();
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2) {
            float f3 = fM56575x1;
            int i7 = i5;
            float f4 = i5 / iM67483k42;
            c12025x62.m56898x1(((f3 - fM18290x1) * f4) + fM18290x1);
            int i8 = 0;
            while (i8 < i) {
                int i9 = i;
                int i10 = i8;
                float f5 = i8 / iM67483k4;
                c12025x62.m56891k4(((fM56550c5 - fM56557jd) * f5) + fM56557jd);
                if (c4317dy2 != null) {
                    C12025x6 c12025x6Clone = c4317dy2.m17333k4(c12025x62.Clone()).Clone();
                    c12025x6 = c12025x62;
                    c4489zjArr[i6] = new C4489zj(c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk(), f);
                } else {
                    c12025x6 = c12025x62;
                    c4489zjArr[i6] = new C4489zj(c12025x6.m56897x1(), c12025x6.m56895kk(), f);
                }
                c4459osArr[i6] = new C4459os(f5, f4);
                c4489zj.CloneTo(c4489zjArr2[i6]);
                c4489zj2.CloneTo(c4489zjArr3[i6]);
                i6++;
                i8 = i10 + 1;
                i = i9;
                c4317dy2 = c4317dy;
                c12025x62 = c12025x6;
            }
            i5 = i7 + 1;
            c4317dy2 = c4317dy;
            fM56575x1 = f3;
        }
        int i11 = i;
        C4476v4 c4476v4 = new C4476v4();
        int[] iArr = new int[i4];
        int i12 = 0;
        for (int i13 = 0; i13 < iM67483k42; i13++) {
            for (int i14 = 0; i14 < iM67483k4; i14++) {
                int i15 = (i13 * i11) + i14;
                iArr[i12] = i15;
                int i16 = i15 + i11;
                iArr[i12 + 1] = i16;
                int i17 = i16 + 1;
                iArr[i12 + 2] = i17;
                iArr[i12 + 3] = i17;
                iArr[i12 + 4] = i15 + 1;
                iArr[i12 + 5] = i15;
                i12 += 6;
            }
        }
        C4433bv c4433bv = new C4433bv(2);
        c4433bv.m18082k4(c4489zjArr);
        c4433bv.m18086x1(c4489zjArr2);
        c4433bv.m18081k4(c4459osArr);
        c4433bv.m18080k4(iArr);
        c4476v4.m18394k4(c4433bv);
        if (z) {
            int[] iArr2 = new int[i4];
            for (int i18 = 0; i18 < i4; i18 += 6) {
                int i19 = i18 + 5;
                iArr2[i19] = iArr[i18];
                int i20 = i18 + 4;
                int i21 = i18 + 1;
                iArr2[i20] = iArr[i21];
                int i22 = i18 + 3;
                int i23 = i18 + 2;
                iArr2[i22] = iArr[i23];
                iArr2[i23] = iArr[i22];
                iArr2[i21] = iArr[i20];
                iArr2[i18] = iArr[i19];
            }
            C4433bv c4433bv2 = new C4433bv(2);
            c4433bv2.m18082k4(c4489zjArr);
            c4433bv2.m18086x1(c4489zjArr3);
            c4433bv2.m18081k4(c4459osArr);
            c4433bv2.m18080k4(iArr2);
            c4476v4.m18394k4(c4433bv2);
        }
        return c4476v4;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC12002ck m73289k4(C4471ts c4471ts) {
        C12009k4 c12009k4 = new C12009k4(c4471ts.m18357x1().m18173k4(), c4471ts.m18357x1().m18177x1());
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 2, 2498570);
        C3914k4.m15621k4(c4471ts.m18355k4(), 0, c3983k4M56597k4.m15721to(), c12009k4.mo15757m9() * C14116yg.m67482k4(c3983k4M56597k4.m15715du()));
        c12009k4.m56605k4(c3983k4M56597k4);
        return c12009k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m73281k4(C12003du c12003du) {
        C12009k4 c12009k4 = new C12009k4(1, 1, 2498570);
        c12009k4.m56604k4(0, 0, c12003du.Clone());
        return c12009k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m73282k4(AbstractC14897zn abstractC14897zn, C11896dy c11896dy, C0962es c0962es) {
        return m73283k4(abstractC14897zn, c11896dy, c0962es, (azo) null, (C11913yj) null, (azo) null, 1.0f);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m73283k4(AbstractC14897zn abstractC14897zn, C11896dy c11896dy, C0962es c0962es, azo azoVar, C11913yj c11913yj, azo azoVar2, float f) {
        C11896dy c11896dy2;
        C11913yj c11913yj2 = new C11913yj();
        if (f <= 1.0f || !(c0962es.m5681to() == 4 || c0962es.m5681to() == 3)) {
            c11896dy2 = c11896dy;
        } else {
            c11896dy2 = (C11896dy) c11896dy.deepClone();
            C12007ix c12007ixClone = c11896dy2.m55523c5().Clone();
            c11913yj2.m55777kk(c12007ixClone.m56557jd(), c12007ixClone.m56551ck());
            c11913yj2.m55763k4(f, f);
            c11913yj2.m55777kk(-c12007ixClone.m56557jd(), -c12007ixClone.m56551ck());
            c11896dy2.m55577x1(c11913yj2);
            if (azoVar2 != null && azoVar2.m3903h4()) {
                azoVar2.m3909k4(azoVar2.m3906k4() * ((double) f));
            }
        }
        float fM3906k4 = (azoVar == null || !azoVar.m3903h4()) ? 0.0f : (float) azoVar.m3906k4();
        if (azoVar2 != null && azoVar2.m3903h4()) {
            fM3906k4 += (float) azoVar2.m3906k4();
        }
        C11896dy c11896dy3 = (C11896dy) c11896dy2.deepClone();
        if (c11913yj != null) {
            c11896dy3.m55577x1(c11913yj);
        }
        c11896dy3.m55526dy();
        C12007ix c12007ixClone2 = c11896dy3.m55523c5().Clone();
        AbstractC12008jd abstractC12008jdM74608ar = abstractC14897zn.m74608ar();
        float f2 = abstractC12008jdM74608ar != null ? abstractC12008jdM74608ar.mo17577u4().m55776k4()[0] : 1.0f;
        float f3 = abstractC12008jdM74608ar != null ? abstractC12008jdM74608ar.mo17577u4().m55776k4()[3] : 1.0f;
        C12009k4 c12009k4 = new C12009k4(C14116yg.m67483k4(C7019kk.m27462to(Float.valueOf(((c12007ixClone2.m56550c5() + fM3906k4) * f2) + 0.5f), 13), 1), C14116yg.m67483k4(C7019kk.m27462to(Float.valueOf(((c12007ixClone2.m56575x1() + fM3906k4) * f3) + 0.5f), 13), 1), 2498570);
        c12009k4.m56332k4(96.0f, 96.0f);
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
        try {
            abstractC12008jdM56582k4.mo17588x1(new C11913yj(f2, 0.0f, 0.0f, f3, 0.0f, 0.0f));
            float f4 = fM3906k4 / 2.0f;
            abstractC12008jdM56582k4.mo17584x1((-c12007ixClone2.m56557jd()) + f4, (-c12007ixClone2.m56551ck()) + f4);
            if (c11913yj != null) {
                abstractC12008jdM56582k4.mo17500k4(c11913yj, 0);
            }
            AbstractC12024x1 abstractC12024x1M73548kk = C14814xq.m73548kk(c0962es);
            if (C7019kk.m27469x1(abstractC12024x1M73548kk, C12012lr.class)) {
                if (c0962es.m5681to() == 3 && ((b2l) c0962es).m3943jd() != -1) {
                    ((C12012lr) abstractC12024x1M73548kk).m56621kk(f / f2, f / f3);
                }
                if (c0962es.m5681to() == 4) {
                    ((C12012lr) abstractC12024x1M73548kk).m56629x1(c11913yj2, 1);
                }
            }
            abstractC12008jdM56582k4.mo17527k4(abstractC12024x1M73548kk, c11896dy2);
            if (azoVar != null && azoVar.m3903h4()) {
                abstractC12008jdM56582k4.mo17481h4(4);
                abstractC12008jdM56582k4.mo17540k4(C7019kk.m27469x1(abstractC14897zn, omq.class) ? azoVar.m3930x6() : azoVar.m3928x1(72.0f), c11896dy2);
            }
            if (azoVar2 != null && azoVar2.m3903h4()) {
                abstractC12008jdM56582k4.mo17481h4(4);
                C12026yj c12026yjM3930x6 = C7019kk.m27469x1(abstractC14897zn, omq.class) ? azoVar2.m3930x6() : azoVar2.m3928x1(72.0f);
                c12026yjM3930x6.m56914h4(2);
                abstractC12008jdM56582k4.mo17540k4(c12026yjM3930x6, c11896dy2);
            }
            abstractC12008jdM56582k4.dispose();
            C12552kk.m58539k4(c12009k4, 4);
            return c12009k4;
        } catch (Throwable th) {
            if (abstractC12008jdM56582k4 != null) {
                abstractC12008jdM56582k4.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C12009k4 m73290k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, GeometryShape geometryShape, ShapeElement[] shapeElementArr, ShapeFrame shapeFrame, float f, byte b, C12007ix[] c12007ixArr) {
        float x = geometryShape.getX();
        float y = geometryShape.getY();
        C4317dy c4317dy = new C4317dy();
        if (m73299x1()) {
            x = shapeFrame.getX();
            y = shapeFrame.getY();
            c4317dy.m17338k4(geometryShape.getRotation() - geometryShape.getParentGroup().getRotation(), new C12025x6(shapeFrame.getCenterX(), shapeFrame.getCenterY()));
        }
        float fM67481k4 = C14116yg.m67481k4(f, C14116yg.m67504x1(geometryShape.getWidth(), geometryShape.getHeight()));
        float f2 = x - fM67481k4;
        float f3 = y - fM67481k4;
        float f4 = fM67481k4 * 2.0f;
        c12007ixArr[0] = new C12007ix(f2, f3, geometryShape.getWidth() + f4, geometryShape.getHeight() + f4);
        AbstractC12008jd abstractC12008jdM74608ar = abstractC14897zn.m74608ar();
        C12009k4 c12009k4 = new C12009k4(C7019kk.m27462to(Float.valueOf((c12007ixArr[0].m56550c5() * (abstractC12008jdM74608ar != null ? abstractC12008jdM74608ar.mo17577u4().m55776k4()[0] : 1.0f)) + 0.5f), 13), C7019kk.m27462to(Float.valueOf((c12007ixArr[0].m56575x1() * (abstractC12008jdM74608ar != null ? abstractC12008jdM74608ar.mo17577u4().m55776k4()[3] : 1.0f)) + 0.5f), 13), 2498570);
        c12009k4.m56332k4(96.0f, 96.0f);
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
        try {
            abstractC12008jdM56582k4.mo17517k4(C12003du.m56458up().Clone());
            abstractC12008jdM56582k4.dispose();
            omq omqVar = new omq(c12009k4, c12007ixArr[0].m56550c5(), c12007ixArr[0].m56575x1());
            try {
                C4317dy c4317dy2 = new C4317dy(1.0f, 0.0f, 0.0f, 1.0f, -c12007ixArr[0].m56557jd(), -c12007ixArr[0].m56551ck());
                c4317dy2.m17341k4(c4317dy, 0);
                omqVar.m74632x1(c4317dy2);
                geometryShape.m1586ks().mo4335k4(omqVar, kg7Var, shapeElementArr, shapeFrame, geometryShape.m2595yd().getEffective(), b);
                return c12009k4;
            } finally {
                omqVar.dispose();
            }
        } catch (Throwable th) {
            if (abstractC12008jdM56582k4 != null) {
                abstractC12008jdM56582k4.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C12023wl m73291k4(C4459os c4459os, AbstractC14897zn abstractC14897zn) {
        float f = this.f50033k4 * (abstractC14897zn.m74608ar() != null ? abstractC14897zn.m74608ar().mo17577u4().m55776k4()[0] : 1.0f);
        return new C12023wl(C7019kk.m27462to(Float.valueOf(c4459os.m18285k4() * f), 13), C7019kk.m27462to(Float.valueOf(c4459os.m18290x1() * f), 13));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:3:0x0006, B:5:0x000c, B:7:0x0018, B:9:0x001e, B:11:0x0028, B:12:0x0033, B:15:0x0039, B:16:0x0040, B:18:0x0046, B:19:0x004d, B:21:0x0053), top: B:31:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0006 A[SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m73292k4(List<tfm> list) {
        C12009k4 c12009k4M71134h4;
        List.Enumerator<tfm> it = list.iterator();
        while (it.hasNext()) {
            try {
                tfm next = it.next();
                if (next.m71132du() == null || next.m71134h4() == null) {
                    if (next.m71132du() != null) {
                        next.m71132du().dispose();
                    }
                    if (next.m71134h4() == null) {
                        c12009k4M71134h4 = next.m71134h4();
                        c12009k4M71134h4.dispose();
                    }
                } else if (next.m71132du() != next.m71134h4()) {
                    next.m71132du().dispose();
                    c12009k4M71134h4 = next.m71134h4();
                    c12009k4M71134h4.dispose();
                } else {
                    next.m71132du().dispose();
                    if (next.m71132du() != null) {
                    }
                    if (next.m71134h4() == null) {
                    }
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73293k4(AbstractC14897zn abstractC14897zn, GeometryShape geometryShape, List<tfm> list, C4473um c4473um, C4459os c4459os, C4489zj c4489zj, int i, float[] fArr, List<C4430ar> list2) {
        C4443em c4443em = new C4443em();
        C4443em[] c4443emArr = {c4443em};
        C4442e0 c4442e0M73279k4 = m73279k4(abstractC14897zn, fArr, c4489zj.Clone(), c4473um.Clone(), c4443emArr);
        c4443emArr[0].CloneTo(c4443em);
        List.Enumerator<C4430ar> it = list2.iterator();
        while (it.hasNext()) {
            try {
                C4430ar next = it.next();
                next.m18064kk(c4473um.m18377x1(next.m18063kk().Clone()).m18510to().Clone());
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        C4443em c4443em2 = new C4443em(c4443em.m18173k4(), c4443em.m18177x1());
        C4317dy c4317dyM73278k4 = m73278k4(geometryShape, c4459os.Clone(), c4443em2.Clone());
        C4471ts c4471tsMo73286k4 = mo73286k4(abstractC14897zn, C4443em.m18171k4(c4443em2).Clone(), i);
        it = list.iterator();
        AbstractC4434bz abstractC4434bz = null;
        AbstractC4434bz abstractC4434bz2 = null;
        while (it.hasNext()) {
            try {
                tfm next2 = it.next();
                AbstractC4434bz[] abstractC4434bzArr = {abstractC4434bz};
                AbstractC4434bz[] abstractC4434bzArr2 = {abstractC4434bz2};
                tme.m71250k4(next2, c4442e0M73279k4, list2, abstractC4434bzArr, abstractC4434bzArr2);
                abstractC4434bz = abstractC4434bzArr[0];
                abstractC4434bz2 = abstractC4434bzArr2[0];
                c4471tsMo73286k4.m18354k4(next2.m71143m9(), abstractC4434bz, abstractC4434bz2);
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        mo73295k4(abstractC14897zn, c4471tsMo73286k4, c4317dyM73278k4, c4459os.Clone(), c4443em2.Clone());
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v4, types: [float, int] */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r8v3, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.content.pm.PackageInfo, int] */
    /* JADX INFO: renamed from: k4 */
    public final void m73294k4(AbstractC14897zn abstractC14897zn, GeometryShape geometryShape, List<tfm> list, C4473um c4473um, C4459os c4459os, C4489zj c4489zj, float[] fArr) throws PackageManager.NameNotFoundException {
        float rotation;
        C12025x6 c12025x6;
        C4433bv next;
        C4443em c4443em = new C4443em();
        C4473um c4473umClone = ck8.m4609k4(fArr).Clone();
        float f = 0.0f;
        float[] fArr2 = {0.0f};
        C4443em[] c4443emArr = {c4443em};
        C4473um c4473umClone2 = ck8.m4610k4(fArr, c4473umClone.Clone(), c4489zj.Clone(), new C4443em(abstractC14897zn.mo67711m9(), abstractC14897zn.mo67708dy()), fArr2, c4443emArr).Clone();
        float f2 = fArr2[0];
        c4443emArr[0].CloneTo(c4443em);
        C4473um c4473umClone3 = C4473um.m18361k4(C4473um.m18361k4(c4473um, C4473um.m18361k4(c4473umClone, C4473um.m18362k4(new C4489zj(0.0f, 0.0f, f2), new C4489zj(0.0f), new C4489zj(0.0f, 1.0f, 0.0f)).Clone())), c4473umClone2).Clone();
        C12026yj c12026yj = new C12026yj(C12003du.m56460uz().Clone(), 1.0f);
        a1f a1fVarM4288k4 = bp9.m4288k4(geometryShape);
        if (a1fVarM4288k4 != null && a1fVarM4288k4.m3162to() != 0.0f && a1fVarM4288k4.m3148du().m67302x1()) {
            c12026yj = new C12026yj(a1fVarM4288k4.m3148du().m67297k4().Clone(), a1fVarM4288k4.m3162to());
        }
        ?? r7 = this.f50033k4 * (abstractC14897zn.m74608ar() != null ? abstractC14897zn.m74608ar().mo17577u4().m55776k4()[0] : 1.0f);
        ?? packageInfo = PackageManager.getPackageInfo((String) c4443em.m18173k4(), (int) r7);
        ?? packageInfo2 = PackageManager.getPackageInfo((String) c4443em.m18177x1(), (int) r7);
        C12009k4 c12009k4 = new C12009k4((int) packageInfo, (int) packageInfo2);
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
        abstractC12008jdM56582k4.mo17517k4(C12003du.m56396k4(0).Clone());
        List.Enumerator<tfm> it = list.iterator();
        while (it.hasNext()) {
            try {
                IGenericEnumerator<C4433bv> it2 = it.next().m71143m9().iterator();
                while (it2.hasNext()) {
                    try {
                        next = it2.next();
                    } finally {
                    }
                    if ((next.m18085to() & 4) != 0) {
                        IGenericEnumerator<AbstractC4434bz.k4> it3 = next.iterator();
                        while (it3.hasNext()) {
                            try {
                                AbstractC4434bz.k4 next2 = it3.next();
                                C4428ai c4428aiClone = c4473umClone3.m18373kk(next2.f12178k4.f12185k4.Clone()).Clone();
                                float f3 = f;
                                C4428ai c4428aiClone2 = c4473umClone3.m18373kk(next2.f12180x1.f12185k4.Clone()).Clone();
                                C4428ai c4428aiClone3 = c4473umClone3.m18373kk(next2.f12179kk.f12185k4.Clone()).Clone();
                                if (c4428aiClone.m18047kk() < f3 || c4428aiClone2.m18047kk() < f3) {
                                    f = f3;
                                } else if (c4428aiClone3.m18047kk() < f3) {
                                    f = f3;
                                } else {
                                    C4443em c4443emClone = C4479w6.m18406k4(C4428ai.m18039x1(c4428aiClone, c4428aiClone.m18049to()).Clone(), (int) packageInfo, (int) packageInfo2).Clone();
                                    C4443em c4443emClone2 = C4479w6.m18406k4(C4428ai.m18039x1(c4428aiClone2, c4428aiClone2.m18049to()).Clone(), (int) packageInfo, (int) packageInfo2).Clone();
                                    C4443em c4443emClone3 = C4479w6.m18406k4(C4428ai.m18039x1(c4428aiClone3, c4428aiClone3.m18049to()).Clone(), (int) packageInfo, (int) packageInfo2).Clone();
                                    C11896dy c11896dy = new C11896dy();
                                    C4443em c4443em2 = c4443em;
                                    try {
                                        C4473um c4473um2 = c4473umClone3;
                                        c11896dy.m55576x1(c4443emClone.m18173k4(), c4443emClone.m18177x1(), c4443emClone2.m18173k4(), c4443emClone2.m18177x1());
                                        c11896dy.m55576x1(c4443emClone.m18173k4(), c4443emClone.m18177x1(), c4443emClone3.m18173k4(), c4443emClone3.m18177x1());
                                        abstractC12008jdM56582k4.mo17540k4(c12026yj, c11896dy);
                                        c11896dy.dispose();
                                        c4473umClone3 = c4473um2;
                                        f = f3;
                                        c4443em = c4443em2;
                                    } finally {
                                    }
                                }
                            } finally {
                            }
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                it2.dispose();
                            }
                        }
                        C4443em c4443em3 = c4443em;
                        C4473um c4473um3 = c4473umClone3;
                        float f4 = f;
                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                            it3.dispose();
                        }
                        c4473umClone3 = c4473um3;
                        f = f4;
                        c4443em = c4443em3;
                    }
                }
                C4443em c4443em4 = c4443em;
                C4473um c4473um4 = c4473umClone3;
                float f5 = f;
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                c4473umClone3 = c4473um4;
                f = f5;
                c4443em = c4443em4;
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        C4443em c4443em5 = c4443em;
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        C4317dy c4317dy = new C4317dy();
        if (m73299x1()) {
            rotation = geometryShape.getParentGroup().getRotation();
            c12025x6 = new C12025x6((c4443em5.m18173k4() / 2.0f) + C7019kk.m27462to(Float.valueOf(c4459os.m18285k4() - (c4443em5.m18173k4() / 2.0f)), 13), C7019kk.m27462to(Float.valueOf((c4443em5.m18177x1() / 2.0f) + (c4459os.m18290x1() - (c4443em5.m18177x1() / 2.0f))), 13));
        } else {
            rotation = geometryShape.getRotation();
            c12025x6 = new C12025x6((geometryShape.getWidth() / 2.0f) + geometryShape.getX(), (geometryShape.getHeight() / 2.0f) + geometryShape.getY());
        }
        c4317dy.m17338k4(rotation, c12025x6);
        abstractC14897zn.m74622kk(c4317dy);
        abstractC14897zn.mo64341k4((AbstractC12002ck) c12009k4, C7019kk.m27462to(Float.valueOf(c4459os.m18285k4() - (c4443em5.m18173k4() / 2.0f)), 13), C7019kk.m27462to(Float.valueOf(c4459os.m18290x1() - (c4443em5.m18177x1() / 2.0f)), 13), c4443em5.m18173k4(), c4443em5.m18177x1());
        abstractC14897zn.m74626rv();
        abstractC12008jdM56582k4.dispose();
        c12009k4.dispose();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo73295k4(AbstractC14897zn abstractC14897zn, C4471ts c4471ts, C4317dy c4317dy, C4459os c4459os, C4443em c4443em) {
        AbstractC12002ck abstractC12002ckM73289k4 = m73289k4(c4471ts);
        try {
            m73296k4(abstractC14897zn, abstractC12002ckM73289k4, c4317dy, c4459os.Clone(), c4443em.Clone());
            if (abstractC12002ckM73289k4 != null) {
                abstractC12002ckM73289k4.dispose();
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73296k4(AbstractC14897zn abstractC14897zn, AbstractC12002ck abstractC12002ck, C4317dy c4317dy, C4459os c4459os, C4443em c4443em) {
        if (c4317dy != null) {
            abstractC14897zn.m74622kk(c4317dy);
        }
        abstractC14897zn.mo64339k4(abstractC12002ck, C7019kk.m27462to(Float.valueOf(c4459os.m18285k4()), 13) - (c4443em.m18173k4() / 2.0f), C7019kk.m27462to(Float.valueOf(c4459os.m18290x1() - (c4443em.m18177x1() / 2.0f)), 13), c4443em.m18173k4(), c4443em.m18177x1());
        if (c4317dy != null) {
            abstractC14897zn.m74626rv();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73297k4(boolean z) {
        this.f50034kk = z;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m73284k4(int i) {
        return i == 2 || i == 3 || i == 4 || i == 5 || i == 6;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m73298k4(GeometryShape geometryShape) {
        return geometryShape.getShapeType() == 89;
    }
}
