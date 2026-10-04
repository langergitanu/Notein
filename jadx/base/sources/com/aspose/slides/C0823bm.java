package com.aspose.slides;

import android.content.pm.PackageManager;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p159h0.C4430ar;
import com.aspose.slides.internal.p159h0.C4433bv;
import com.aspose.slides.internal.p159h0.C4442e0;
import com.aspose.slides.internal.p159h0.C4443em;
import com.aspose.slides.internal.p159h0.C4449ix;
import com.aspose.slides.internal.p159h0.C4459os;
import com.aspose.slides.internal.p159h0.C4471ts;
import com.aspose.slides.internal.p159h0.C4473um;
import com.aspose.slides.internal.p159h0.C4476v4;
import com.aspose.slides.internal.p159h0.C4479w6;
import com.aspose.slides.internal.p159h0.C4489zj;
import com.aspose.slides.internal.p159h0.InterfaceC4472u4;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.bm */
/* JADX INFO: loaded from: classes3.dex */
class C0823bm extends C14748wr {
    public C0823bm(C14693vm c14693vm) {
        super(c14693vm);
    }

    /* JADX INFO: renamed from: k4 */
    private C4476v4 m4266k4(bc9 bc9Var, C12007ix c12007ix) {
        C4476v4 c4476v4 = new C4476v4();
        C4459os c4459os = new C4459os(0.0f, 0.0f);
        C4459os c4459os2 = new C4459os(C22205OooOOo.OooO00o(c12007ix, 2.0f, c12007ix.m56557jd()), C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck()));
        C4459os.m18279k4(c4459os2, c4459os).CloneTo(c4459os2);
        C4489zj[] c4489zjArrM4141k4 = bc9Var.m4141k4(c4459os2.Clone());
        C4489zj[] c4489zjArr = (C4489zj[]) C22200OooO0o0.OooO00o(C4489zj.class, 3);
        C4489zj.m18497k4(bc9Var.m4137dy()).CloneTo(c4489zjArr[0]);
        c4489zjArr[0].CloneTo(c4489zjArr[1]);
        c4489zjArr[0].CloneTo(c4489zjArr[2]);
        float fM18506k4 = c4489zjArrM4141k4[0].m18506k4();
        float fM18511x1 = c4489zjArrM4141k4[0].m18511x1();
        float fM18506k42 = c4489zjArrM4141k4[0].m18506k4();
        float fM18511x12 = c4489zjArrM4141k4[0].m18511x1();
        for (C4489zj c4489zj : c4489zjArrM4141k4) {
            if (fM18506k4 > c4489zj.m18506k4()) {
                fM18506k4 = c4489zj.m18506k4();
            }
            if (fM18511x1 > c4489zj.m18511x1()) {
                fM18511x1 = c4489zj.m18511x1();
            }
            if (fM18506k42 < c4489zj.m18506k4()) {
                fM18506k42 = c4489zj.m18506k4();
            }
            if (fM18511x12 < c4489zj.m18511x1()) {
                fM18511x12 = c4489zj.m18511x1();
            }
        }
        C4459os c4459os3 = new C4459os(fM18506k4, fM18511x1);
        C4459os c4459osClone = C4459os.m18282x1(new C4459os(fM18506k42, fM18511x12), c4459os3).Clone();
        int[] iArrM4143m9 = bc9Var.m4143m9();
        C4459os[] c4459osArr = (C4459os[]) C22200OooO0o0.OooO00o(C4459os.class, 3);
        c4459osArr[0].m18286k4((c4489zjArrM4141k4[0].m18506k4() - c4459os3.m18285k4()) / c4459osClone.m18285k4());
        c4459osArr[0].m18291x1(c4459osClone.m18290x1() != 0.0f ? (c4489zjArrM4141k4[0].m18511x1() - c4459os3.m18290x1()) / c4459osClone.m18290x1() : 1.0f);
        c4459osArr[1].m18286k4((c4489zjArrM4141k4[1].m18506k4() - c4459os3.m18285k4()) / c4459osClone.m18285k4());
        c4459osArr[1].m18291x1(c4459osClone.m18290x1() != 0.0f ? (c4489zjArrM4141k4[1].m18511x1() - c4459os3.m18290x1()) / c4459osClone.m18290x1() : 1.0f);
        c4459osArr[2].m18286k4((c4489zjArrM4141k4[2].m18506k4() - c4459os3.m18285k4()) / c4459osClone.m18285k4());
        c4459osArr[2].m18291x1(c4459osClone.m18290x1() != 0.0f ? (c4489zjArrM4141k4[2].m18511x1() - c4459os3.m18290x1()) / c4459osClone.m18290x1() : 1.0f);
        C4433bv c4433bv = new C4433bv(4);
        c4433bv.m18082k4(c4489zjArrM4141k4);
        c4433bv.m18080k4(iArrM4143m9);
        c4433bv.m18086x1(c4489zjArr);
        c4433bv.m18081k4(c4459osArr);
        c4476v4.m18394k4(c4433bv);
        return c4476v4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4269k4(ijy ijyVar, C12007ix c12007ix, C0962es c0962es) {
        m4267k4(m72891x1().m72361x1(), c12007ix.Clone(), c0962es, null, ijyVar.m7646k4(), ijyVar.m7647x1());
    }

    /* JADX INFO: renamed from: k4 */
    private void m4267k4(C14365qy c14365qy, C12007ix c12007ix, C0962es c0962es, azo azoVar, bc9 bc9Var, InterfaceC4472u4 interfaceC4472u4) throws PackageManager.NameNotFoundException {
        boolean z;
        IRotation3D rotation3D = c14365qy.m69834fa().getRotation3D();
        float[] fArrM72889k4 = m72889k4(m72885k4(rotation3D));
        if (fArrM72889k4 == null) {
            return;
        }
        C4473um c4473umClone = m72890x1(rotation3D).Clone();
        C4473um c4473umClone2 = m72882k4(fArrM72889k4).Clone();
        tfm tfmVar = new tfm();
        if (c0962es == null || c0962es.m5681to() == 0 || c0962es.m5681to() == -1) {
            z = false;
        } else {
            tfmVar.m71139k4(AbstractC14780xb.m73281k4(c0962es.m5676k4().Clone()));
            z = true;
        }
        C14093tq<C12003du> c14093tqClone = m72884k4(c0962es, azoVar).Clone();
        tfmVar.m71147x1(C14093tq.m67296x1(c14093tqClone, null) ? AbstractC14780xb.m73281k4(c14093tqClone.m67297k4().Clone()) : tfmVar.m71132du());
        if (azoVar != null && azoVar.m3903h4() && azoVar.m3901dy() != null && azoVar.m3901dy().m5681to() != 0 && azoVar.m3901dy().m5681to() != -1) {
            if (C12003du.m56476x1(azoVar.m3916m9(), C12003du.f40505to)) {
                tfmVar.m71147x1(AbstractC14780xb.m73281k4(azoVar.m3916m9().Clone()));
            }
            if (tfmVar.m71132du() == null) {
                tfmVar.m71139k4(tfmVar.m71134h4());
            }
        }
        if (tfmVar.m71132du() == null && tfmVar.m71134h4() == null) {
            return;
        }
        tfmVar.m71136k4((z ? 2 : 0) | 4);
        tfmVar.m71146x1(0);
        C4459os c4459os = new C4459os(0.0f, 0.0f);
        C4489zj c4489zj = new C4489zj(c12007ix.m56550c5() / 2.0f, c12007ix.m56575x1() / 2.0f, 0.0f);
        C4459os c4459os2 = new C4459os(C22205OooOOo.OooO00o(c12007ix, 2.0f, c12007ix.m56557jd()), C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck()));
        C4459os.m18279k4(c4459os2, c4459os).CloneTo(c4459os2);
        tfmVar.m71138k4(m4266k4(bc9Var, c12007ix.Clone()));
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
        C4443em c4443em = new C4443em(c14365qy.m69870wy().mo67711m9(), c14365qy.m69870wy().mo67708dy());
        C4443em c4443em2 = new C4443em();
        float[] fArr = {0.0f};
        C4443em[] c4443emArr = {c4443em2};
        C4473um c4473umClone3 = ck8.m4610k4(fArrM72889k4, c4473umClone.Clone(), c4489zj.Clone(), c4443em.Clone(), fArr, c4443emArr).Clone();
        float f = fArr[0];
        c4443emArr[0].CloneTo(c4443em2);
        m4268k4(tfmVar, c4473umClone2.Clone(), c4473umClone.Clone(), C4473um.m18362k4(new C4489zj(0.0f, 0.0f, f).Clone(), new C4489zj(0.0f, 0.0f, 0.0f).Clone(), new C4489zj(0.0f, 1.0f, 0.0f).Clone()).Clone().Clone(), c4473umClone3.Clone(), new C4489zj(1.2f, -1.5f, 1.5f).m18510to().Clone().Clone(), c4459os2.Clone(), c4443em2.Clone(), interfaceC4472u4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v7, types: [float, int] */
    /* JADX WARN: Type inference failed for: r9v7, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v8, types: [android.content.pm.PackageInfo, int] */
    /* JADX INFO: renamed from: k4 */
    private void m4268k4(tfm tfmVar, C4473um c4473um, C4473um c4473um2, C4473um c4473um3, C4473um c4473um4, C4489zj c4489zj, C4459os c4459os, C4443em c4443em, InterfaceC4472u4 interfaceC4472u4) throws PackageManager.NameNotFoundException {
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
        ?? M72360to = m72891x1().m72360to() * m72891x1().m72355du();
        ?? packageInfo = PackageManager.getPackageInfo((String) c4443em.m18173k4(), (int) M72360to);
        ?? packageInfo2 = PackageManager.getPackageInfo((String) c4443em.m18177x1(), (int) M72360to);
        C4471ts c4471ts = new C4471ts(packageInfo, packageInfo2, false);
        c4471ts.m18352k4(0L);
        c4471ts.m18354k4(tfmVar.m71143m9(), new C4449ix(interfaceC4472u4, c4442e0, c4430arM18055m9, 7));
        C12009k4 c12009k4 = new C12009k4((int) packageInfo, (int) packageInfo2);
        try {
            C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 2, 2498570);
            C3914k4.m15621k4(c4471ts.m18355k4(), 0, c3983k4M56597k4.m15721to(), C14116yg.m67482k4(c3983k4M56597k4.m15715du()) * c12009k4.mo15757m9());
            c12009k4.m56605k4(c3983k4M56597k4);
            m72891x1().m72358k4(c12009k4, c4459os.Clone(), c4443em.Clone(), M72360to);
        } finally {
            c12009k4.dispose();
        }
    }
}
