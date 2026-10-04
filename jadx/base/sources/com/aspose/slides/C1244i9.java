package com.aspose.slides;

import android.content.pm.PackageManager;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p159h0.C4428ai;
import com.aspose.slides.internal.p159h0.C4430ar;
import com.aspose.slides.internal.p159h0.C4442e0;
import com.aspose.slides.internal.p159h0.C4443em;
import com.aspose.slides.internal.p159h0.C4459os;
import com.aspose.slides.internal.p159h0.C4473um;
import com.aspose.slides.internal.p159h0.C4476v4;
import com.aspose.slides.internal.p159h0.C4479w6;
import com.aspose.slides.internal.p159h0.C4489zj;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.i9 */
/* JADX INFO: loaded from: classes3.dex */
class C1244i9 extends C14748wr {
    public C1244i9(C14693vm c14693vm) {
        super(c14693vm);
    }

    /* JADX INFO: renamed from: k4 */
    private C12009k4 m7600k4(C14365qy c14365qy, AutoShape autoShape, C12007ix[] c12007ixArr) {
        C4317dy c4317dy;
        c12007ixArr[0] = new C12007ix(autoShape.getX(), autoShape.getY(), autoShape.getWidth(), autoShape.getHeight());
        AbstractC12008jd abstractC12008jdM74608ar = c14365qy.m69870wy().m74608ar();
        float f = abstractC12008jdM74608ar != null ? abstractC12008jdM74608ar.mo17577u4().m55776k4()[0] : 1.0f;
        float f2 = abstractC12008jdM74608ar != null ? abstractC12008jdM74608ar.mo17577u4().m55776k4()[3] : 1.0f;
        double dM67480k4 = (((double) C14116yg.m67480k4(autoShape.getRotation())) / 180.0d) * 3.141592653589793d;
        float fM67475k4 = (float) C14116yg.m67475k4(C14116yg.m67495m9(dM67480k4));
        float fM67475k42 = (float) C14116yg.m67475k4(C14116yg.m67470dy(dM67480k4));
        float fM56575x1 = (c12007ixArr[0].m56575x1() * fM67475k4) + (c12007ixArr[0].m56550c5() * fM67475k42);
        float fM56575x12 = (c12007ixArr[0].m56575x1() * fM67475k42) + (c12007ixArr[0].m56550c5() * fM67475k4);
        c12007ixArr[0].m56576x1(fM56575x1);
        c12007ixArr[0].m56560k4(fM56575x12);
        C12009k4 c12009k4 = new C12009k4(C22221Oooo0O0.OooO0O0(f * fM56575x1, m72891x1().m72356h4(), 0.5f, 13), C22221Oooo0O0.OooO0O0(f2 * fM56575x12, m72891x1().m72356h4(), 0.5f, 13), 2498570);
        c12009k4.m56332k4(96.0f, 96.0f);
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
        try {
            abstractC12008jdM56582k4.mo17517k4(C12003du.m56458up().Clone());
            abstractC12008jdM56582k4.dispose();
            omq omqVar = new omq(c12009k4, fM56575x1, fM56575x12);
            try {
                float rotation = autoShape.getRotation();
                if (rotation % 90.0f == 0.0f) {
                    c4317dy = new C4317dy(1.0f, 0.0f, 0.0f, 1.0f, -c12007ixArr[0].m56557jd(), -c12007ixArr[0].m56551ck());
                } else {
                    c4317dy = rotation <= 180.0f ? new C4317dy(1.0f, 0.0f, 0.0f, 1.0f, (autoShape.getHeight() * fM67475k4) + (-c12007ixArr[0].m56557jd()), -c12007ixArr[0].m56551ck()) : new C4317dy(1.0f, 0.0f, 0.0f, 1.0f, -c12007ixArr[0].m56557jd(), (autoShape.getWidth() * fM67475k4) + (-c12007ixArr[0].m56551ck()));
                    c4317dy.m17338k4(autoShape.getRotation(), new C12025x6(c12007ixArr[0].m56557jd(), c12007ixArr[0].m56551ck()));
                    autoShape.setRotation(0.0f);
                }
                omqVar.m74632x1(c4317dy);
                autoShape.m2546bz().mo4131k4(omqVar, c14365qy.m69821ak(), InterruptionToken.getNone());
                autoShape.setRotation(rotation);
                omqVar.dispose();
                return c12009k4;
            } catch (Throwable th) {
                omqVar.dispose();
                throw th;
            }
        } catch (Throwable th2) {
            if (abstractC12008jdM56582k4 != null) {
                abstractC12008jdM56582k4.dispose();
            }
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [float, int] */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r6v7, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v8, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r8v3, types: [float, java.lang.String] */
    /* JADX INFO: renamed from: k4 */
    private void m7601k4(tfm tfmVar, C4473um c4473um, C4473um c4473um2, C4473um c4473um3, C4473um c4473um4, C4489zj c4489zj, C4459os c4459os, C4443em c4443em, C4489zj c4489zj2) throws PackageManager.NameNotFoundException {
        C4473um c4473umClone = C4473um.m18361k4(C4473um.m18361k4(c4473um, C4473um.m18361k4(c4473um2, c4473um3)), c4473um4).Clone();
        C4442e0 c4442e0 = new C4442e0();
        c4442e0.m18166kk(c4473um.Clone());
        c4442e0.m18164k4(C4473um.m18361k4(c4473um2, c4473um3).Clone());
        c4442e0.m18169x1(c4473um4.Clone());
        c4442e0.m18163k4(0);
        C4430ar c4430arM18055m9 = C4430ar.m18055m9();
        c4430arM18055m9.m18062k4(new C4489zj(0.3f, 0.3f, 0.3f));
        c4430arM18055m9.m18064kk(c4473um.m18377x1(c4489zj.m18510to().Clone()).Clone());
        c4430arM18055m9.m18066to(new C4489zj(0.3f));
        c4430arM18055m9.m18061k4(5.0f);
        ?? M72355du = m72891x1().m72355du();
        ?? packageInfo = PackageManager.getPackageInfo((String) c4443em.m18173k4(), (int) M72355du);
        ?? packageInfo2 = PackageManager.getPackageInfo((String) c4443em.m18177x1(), (int) M72355du);
        C12009k4 c12009k4 = new C12009k4((int) packageInfo, (int) packageInfo2);
        try {
            AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
            try {
                C4428ai c4428aiClone = c4473umClone.m18373kk(c4489zj2.Clone()).Clone();
                C4443em c4443emClone = C4479w6.m18406k4(C4428ai.m18039x1(c4428aiClone, c4428aiClone.m18049to()).Clone(), (int) packageInfo, (int) packageInfo2).Clone();
                abstractC12008jdM56582k4.mo17503k4((AbstractC12002ck) tfmVar.m71132du(), c4443emClone.m18173k4(), c4443emClone.m18177x1());
                m72891x1().m72358k4(c12009k4, c4459os.Clone(), c4443em.Clone(), m72891x1().m72360to());
                abstractC12008jdM56582k4.dispose();
            } catch (Throwable th) {
                if (abstractC12008jdM56582k4 != null) {
                    abstractC12008jdM56582k4.dispose();
                }
                throw th;
            }
        } finally {
            c12009k4.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m7603k4(C12007ix c12007ix, AutoShape autoShape, float f) throws PackageManager.NameNotFoundException {
        C14365qy c14365qyM72361x1 = m72891x1().m72361x1();
        IRotation3D rotation3D = c14365qyM72361x1.m69834fa().getRotation3D();
        float[] fArrM72889k4 = m72889k4(m72885k4(rotation3D));
        if (fArrM72889k4 == null) {
            return false;
        }
        C4473um c4473umClone = m72890x1(rotation3D).Clone();
        C4473um c4473umClone2 = m72882k4(fArrM72889k4).Clone();
        C12007ix c12007ix2 = new C12007ix();
        C12007ix[] c12007ixArr = {c12007ix2};
        C12009k4 c12009k4M7600k4 = m7600k4(c14365qyM72361x1, autoShape, c12007ixArr);
        c12007ixArr[0].CloneTo(c12007ix2);
        tfm tfmVar = new tfm();
        tfmVar.m71139k4(c12009k4M7600k4);
        tfmVar.m71147x1(c12009k4M7600k4);
        if (tfmVar.m71132du() == null && tfmVar.m71134h4() == null) {
            return false;
        }
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55578x1(new C12007ix(autoShape.getX(), autoShape.getY(), c12007ix2.m56550c5(), c12007ix2.m56575x1()));
        tfmVar.m71137k4(new List<>());
        tfmVar.m71144to().addItem(c11896dy);
        tfmVar.m71136k4(6);
        tfmVar.m71146x1(0);
        C4489zj c4489zj = new C4489zj(c12007ix.m56550c5() / 2.0f, c12007ix.m56575x1() / 2.0f, 0.0f);
        C4459os c4459os = new C4459os(C22205OooOOo.OooO00o(c12007ix, 2.0f, c12007ix.m56557jd()), C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck()));
        tfmVar.m71138k4(new C4476v4(tfmVar.m71144to().get_Item(0), f, 0.0f, tfmVar.m71135k4(), tfmVar.m71145x1(), null, false, tfmVar.m71142kk(), new C14093tq(c4459os.Clone())));
        for (int i = 1; i < tfmVar.m71144to().size(); i++) {
            tfmVar.m71143m9().m18397k4(tfmVar.m71144to().get_Item(i), f, 0.0f, tfmVar.m71135k4(), tfmVar.m71145x1(), null, false, tfmVar.m71142kk(), new C14093tq<>(c4459os.Clone()));
        }
        if (tfmVar.m71144to().size() > 1) {
            tfmVar.m71143m9().m18395k4(new C4459os(0.0f, 0.0f), new C4459os(1.0f, 1.0f));
        }
        C4489zj c4489zj2 = new C4489zj();
        C4489zj c4489zj3 = new C4489zj();
        C4489zj[] c4489zjArr = {c4489zj2};
        C4489zj[] c4489zjArr2 = {c4489zj3};
        tfmVar.m71143m9().m18396k4(c4473umClone2.Clone(), c4489zjArr, c4489zjArr2);
        c4489zjArr[0].CloneTo(c4489zj2);
        c4489zjArr2[0].CloneTo(c4489zj3);
        c4489zj.m18507k4(C4479w6.m18405k4(c4489zj.m18506k4(), C14116yg.m67480k4(c4489zj2.m18506k4()), C14116yg.m67480k4(c4489zj3.m18506k4())));
        c4489zj.m18512x1(C4479w6.m18405k4(c4489zj.m18511x1(), C14116yg.m67480k4(c4489zj2.m18511x1()), C14116yg.m67480k4(c4489zj3.m18511x1())));
        c4489zj.m18509kk(C4479w6.m18405k4(c4489zj.m18508kk(), C14116yg.m67480k4(c4489zj2.m18508kk()), C14116yg.m67480k4(c4489zj3.m18508kk())));
        C4443em c4443em = new C4443em(c14365qyM72361x1.m69870wy().mo67711m9(), c14365qyM72361x1.m69870wy().mo67708dy());
        C4443em c4443em2 = new C4443em();
        float[] fArr = {0.0f};
        C4443em[] c4443emArr = {c4443em2};
        C4473um c4473umClone3 = ck8.m4610k4(fArrM72889k4, c4473umClone.Clone(), c4489zj.Clone(), c4443em.Clone(), fArr, c4443emArr).Clone();
        float f2 = fArr[0];
        c4443emArr[0].CloneTo(c4443em2);
        C4473um c4473umClone4 = C4473um.m18362k4(new C4489zj(0.0f, 0.0f, f2).Clone(), new C4489zj(0.0f, 0.0f, 0.0f).Clone(), new C4489zj(0.0f, 1.0f, 0.0f).Clone()).Clone();
        C4489zj c4489zj4 = new C4489zj(-1.5f, -2.0f, -3.5f);
        if (m72891x1().m72360to() <= 1.0f || m7602k4(m72891x1())) {
            m7601k4(tfmVar, c4473umClone2.Clone(), c4473umClone.Clone(), c4473umClone4.Clone(), c4473umClone3.Clone(), c4489zj4.Clone(), c4459os.Clone(), c4443em2.Clone(), new C4489zj(autoShape.getX() - c4459os.m18285k4(), c4459os.m18290x1() - autoShape.getY(), f - 0.0f));
            return true;
        }
        m72886k4(tfmVar, c4473umClone2.Clone(), c4473umClone.Clone(), c4473umClone4.Clone(), c4473umClone3.Clone(), c4489zj4.Clone(), c4459os.Clone(), c4443em2.Clone());
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m7602k4(C14693vm c14693vm) {
        return C14164n2.m67859x1(c14693vm.m72361x1().m69834fa());
    }
}
