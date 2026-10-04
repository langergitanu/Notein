package com.aspose.slides;

import android.content.pm.PackageManager;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p159h0.AbstractC4434bz;
import com.aspose.slides.internal.p159h0.C4430ar;
import com.aspose.slides.internal.p159h0.C4441dy;
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
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p505xn.C12556ck;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.iv */
/* JADX INFO: loaded from: classes3.dex */
class C13662iv {

    /* JADX INFO: renamed from: k4 */
    private float f45383k4;

    /* JADX INFO: renamed from: com.aspose.slides.iv$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: du */
        private List<C4430ar> f45384du;

        /* JADX INFO: renamed from: h4 */
        private int f45385h4;

        /* JADX INFO: renamed from: k4 */
        private C4473um f45386k4 = new C4473um();

        /* JADX INFO: renamed from: x1 */
        private C4473um f45389x1 = new C4473um();

        /* JADX INFO: renamed from: kk */
        private C4473um f45387kk = new C4473um();

        /* JADX INFO: renamed from: to */
        private C4473um f45388to = new C4473um();

        public k4(C4473um c4473um, C4473um c4473um2, C4473um c4473um3, C4473um c4473um4, List<C4430ar> list, int i) {
            m63139k4(c4473um.Clone());
            m63142x1(c4473um2.Clone());
            m63140kk(c4473um3.Clone());
            m63141to(c4473um4.Clone());
            m63138k4(new List<>(list));
            m63137k4(i);
        }

        /* JADX INFO: renamed from: du */
        public final List<C4430ar> m63143du() {
            return this.f45384du;
        }

        /* JADX INFO: renamed from: h4 */
        public final int m63144h4() {
            return this.f45385h4;
        }

        /* JADX INFO: renamed from: k4 */
        public final C4473um m63145k4() {
            return this.f45386k4.Clone();
        }

        /* JADX INFO: renamed from: kk */
        public final C4473um m63146kk() {
            return this.f45387kk.Clone();
        }

        /* JADX INFO: renamed from: to */
        public final C4473um m63147to() {
            return this.f45388to.Clone();
        }

        /* JADX INFO: renamed from: x1 */
        public final C4473um m63148x1() {
            return this.f45389x1.Clone();
        }

        /* JADX INFO: renamed from: k4 */
        private void m63137k4(int i) {
            this.f45385h4 = i;
        }

        /* JADX INFO: renamed from: kk */
        private void m63140kk(C4473um c4473um) {
            this.f45387kk = c4473um.Clone();
        }

        /* JADX INFO: renamed from: to */
        private void m63141to(C4473um c4473um) {
            this.f45388to = c4473um.Clone();
        }

        /* JADX INFO: renamed from: x1 */
        private void m63142x1(C4473um c4473um) {
            this.f45389x1 = c4473um.Clone();
        }

        /* JADX INFO: renamed from: k4 */
        private void m63138k4(List<C4430ar> list) {
            this.f45384du = list;
        }

        /* JADX INFO: renamed from: k4 */
        private void m63139k4(C4473um c4473um) {
            this.f45386k4 = c4473um.Clone();
        }
    }

    public C13662iv(float f) {
        this.f45383k4 = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private a1f m63131k4(IThreeDFormat iThreeDFormat, C11896dy c11896dy, boolean z, boolean[] zArr) {
        zArr[0] = true;
        a1f a1fVarM4290k4 = bp9.m4290k4(iThreeDFormat);
        C12007ix c12007ixClone = c11896dy.m55523c5().Clone();
        if (z) {
            if (a1fVarM4290k4 == null) {
                a1fVarM4290k4 = new a1f();
            }
            a1fVarM4290k4.m3154k4(10);
            a1fVarM4290k4.m3155k4(new ShapeBevel(true));
            a1fVarM4290k4.m3161m9().setBevelType(2);
            a1fVarM4290k4.m3161m9().setHeight(c12007ixClone.m56575x1());
            a1fVarM4290k4.m3161m9().setWidth(c12007ixClone.m56550c5());
            a1fVarM4290k4.m3166x1(new ShapeBevel(false));
            a1fVarM4290k4.m3149dy().setBevelType(2);
            a1fVarM4290k4.m3149dy().setHeight(c12007ixClone.m56575x1());
            a1fVarM4290k4.m3149dy().setWidth(c12007ixClone.m56550c5());
        }
        if (a1fVarM4290k4 == null) {
            return null;
        }
        C4459os c4459os = new C4459os(1.0f, 1.0f);
        C4459os c4459os2 = new C4459os(7.0f, 7.0f);
        if (c12007ixClone.m56550c5() >= c4459os2.m18285k4() || c12007ixClone.m56575x1() >= c4459os2.m18290x1()) {
            if (a1fVarM4290k4.m3161m9() != null && (a1fVarM4290k4.m3161m9().getWidth() < c4459os.m18285k4() || a1fVarM4290k4.m3161m9().getHeight() < c4459os.m18290x1())) {
                a1fVarM4290k4.m3155k4((IShapeBevel) null);
            }
            if (a1fVarM4290k4.m3149dy() != null && (a1fVarM4290k4.m3149dy().getWidth() < c4459os.m18285k4() || a1fVarM4290k4.m3149dy().getHeight() < c4459os.m18290x1())) {
            }
            zArr[0] = a1fVarM4290k4.m3161m9() == null;
            return a1fVarM4290k4;
        }
        a1fVarM4290k4.m3155k4((IShapeBevel) null);
        a1fVarM4290k4.m3166x1((IShapeBevel) null);
        zArr[0] = a1fVarM4290k4.m3161m9() == null;
        return a1fVarM4290k4;
    }

    /* JADX INFO: renamed from: k4 */
    private C14093tq<C12003du> m63132k4(C0962es c0962es, azo azoVar) {
        C14093tq<C12003du> c14093tq = new C14093tq<>();
        if (c0962es != null && c0962es.m5681to() == 1) {
            c14093tq = new C14093tq<>(c0962es.m5676k4().Clone());
        } else if (azoVar != null && azoVar.m3903h4() && azoVar.m3901dy().m5681to() == 1) {
            c14093tq = new C14093tq<>(azoVar.m3916m9().Clone());
        }
        return (C14093tq.m67296x1(c14093tq, null) && C12003du.m56403k4(c14093tq.m67297k4(), C12003du.f40505to)) ? new C14093tq<>() : c14093tq;
    }

    /* JADX INFO: renamed from: k4 */
    private C14562th m63133k4(IThreeDFormat iThreeDFormat, boolean z) {
        C14562th c14562thM71270k4 = C14570tp.m71270k4(iThreeDFormat);
        if (c14562thM71270k4 != null || !z) {
            return c14562thM71270k4;
        }
        C14562th c14562th = new C14562th();
        c14562th.m71165k4(45.0f);
        c14562th.m71166k4(46);
        c14562th.m71167k4(new float[]{0.0f, 0.0f, 0.0f});
        return c14562th;
    }

    /* JADX INFO: renamed from: k4 */
    private void m63134k4(tfm tfmVar, C11896dy c11896dy, C14365qy c14365qy, C0962es c0962es, azo azoVar, C14093tq<C12003du> c14093tq, boolean[] zArr) {
        zArr[0] = false;
        if (c0962es != null && c0962es.m5681to() != 0 && c0962es.m5681to() != -1) {
            tfmVar.m71139k4(c0962es.m5681to() != 1 ? AbstractC14780xb.m73282k4(c14365qy.m69870wy(), c11896dy, c0962es) : AbstractC14780xb.m73281k4(c0962es.m5676k4().Clone()));
            zArr[0] = true;
        }
        tfmVar.m71147x1(C14093tq.m67296x1(c14093tq, null) ? AbstractC14780xb.m73281k4(c14093tq.m67297k4().Clone()) : tfmVar.m71132du());
        if (azoVar == null || !azoVar.m3903h4() || azoVar.m3901dy() == null || azoVar.m3901dy().m5681to() == 0 || azoVar.m3901dy().m5681to() == -1) {
            return;
        }
        if (C12003du.m56476x1(azoVar.m3916m9(), C12003du.f40505to)) {
            tfmVar.m71147x1(AbstractC14780xb.m73281k4(azoVar.m3916m9().Clone()));
        }
        if (tfmVar.m71132du() == null) {
            tfmVar.m71139k4(tfmVar.m71134h4());
        }
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [float, int] */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r6v1, types: [float, java.lang.String] */
    /* JADX INFO: renamed from: k4 */
    private void m63135k4(AbstractC14897zn abstractC14897zn, List<tfm> list, k4 k4Var, C4459os c4459os, C4443em c4443em) throws PackageManager.NameNotFoundException {
        C4442e0 c4442e0 = new C4442e0();
        c4442e0.m18166kk(k4Var.m63145k4().Clone());
        c4442e0.m18164k4(C4473um.m18361k4(k4Var.m63148x1(), k4Var.m63146kk()).Clone());
        c4442e0.m18169x1(k4Var.m63147to().Clone());
        c4442e0.m18163k4(1);
        ?? r4 = this.f45383k4 * (abstractC14897zn.m74608ar() != null ? abstractC14897zn.m74608ar().mo17577u4().m55776k4()[0] : 1.0f);
        ?? packageInfo = PackageManager.getPackageInfo((String) c4443em.m18173k4(), (int) r4);
        ?? packageInfo2 = PackageManager.getPackageInfo((String) c4443em.m18177x1(), (int) r4);
        C4471ts c4471ts = new C4471ts(packageInfo, packageInfo2, AbstractC14780xb.m73284k4(k4Var.m63144h4()));
        c4471ts.m18352k4(0L);
        List.Enumerator<tfm> it = list.iterator();
        while (it.hasNext()) {
            try {
                tfm next = it.next();
                AbstractC4434bz[] abstractC4434bzArr = {null};
                AbstractC4434bz[] abstractC4434bzArr2 = {null};
                tme.m71250k4(next, c4442e0, k4Var.m63143du(), abstractC4434bzArr, abstractC4434bzArr2);
                c4471ts.m18354k4(next.m71143m9(), abstractC4434bzArr[0], abstractC4434bzArr2[0]);
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        C12009k4 c12009k4 = new C12009k4((int) packageInfo, (int) packageInfo2);
        try {
            C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 2, 2498570);
            C3914k4.m15621k4(c4471ts.m18355k4(), 0, c3983k4M56597k4.m15721to(), C14116yg.m67482k4(c3983k4M56597k4.m15715du()) * c12009k4.mo15757m9());
            c12009k4.m56605k4(c3983k4M56597k4);
            abstractC14897zn.mo64341k4((AbstractC12002ck) c12009k4, C7019kk.m27462to(Float.valueOf(c4459os.m18285k4() - (c4443em.m18173k4() / 2.0f)), 13), C7019kk.m27462to(Float.valueOf(c4459os.m18290x1() - (c4443em.m18177x1() / 2.0f)), 13), c4443em.m18173k4(), c4443em.m18177x1());
        } finally {
            c12009k4.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m63136k4(C14365qy c14365qy, IThreeDFormat iThreeDFormat, C12007ix c12007ix, C0962es c0962es, azo azoVar, C11896dy c11896dy) throws PackageManager.NameNotFoundException {
        float[] fArrM71273k4;
        float f;
        if (c11896dy.m55525du() == 0 || ChartTypeCharacterizer.is3DChart(c14365qy.m69834fa().getType())) {
            return false;
        }
        boolean z = c14365qy.m69834fa().getType() == 69;
        C14562th c14562thM63133k4 = m63133k4(iThreeDFormat, z);
        if (c14562thM63133k4 == null) {
            return false;
        }
        boolean[] zArr = {false};
        a1f a1fVarM63131k4 = m63131k4(iThreeDFormat, c11896dy, z, zArr);
        boolean z2 = zArr[0];
        if (a1fVarM63131k4 == null || (fArrM71273k4 = C14570tp.m71273k4(c14562thM63133k4.m71169kk(), c14562thM63133k4.m71168k4(), c14562thM63133k4.m71170x1(), z2)) == null) {
            return false;
        }
        C4473um c4473umClone = C4473um.m18358k4().Clone();
        C4473um c4473umClone2 = ck8.m4611x1(fArrM71273k4).Clone();
        C14093tq<C12003du> c14093tqClone = m63132k4(c0962es, azoVar).Clone();
        int iM73277k4 = AbstractC14780xb.m73277k4(a1fVarM63131k4, false);
        boolean z3 = C14093tq.m67296x1(c14093tqClone, null) && (iM73277k4 == 2 || iM73277k4 == 3);
        tfm tfmVar = new tfm();
        boolean[] zArr2 = {false};
        m63134k4(tfmVar, c11896dy, c14365qy, c0962es, azoVar, c14093tqClone.Clone(), zArr2);
        boolean z4 = zArr2[0];
        if (tfmVar.m71132du() == null && tfmVar.m71134h4() == null) {
            return false;
        }
        C11896dy c11896dy2 = (C11896dy) c11896dy.deepClone();
        tfmVar.m71137k4(new List<>());
        tfmVar.m71144to().addItem(c11896dy2);
        tfmVar.m71136k4((z4 ? 2 : 0) | 4);
        tfmVar.m71146x1(0);
        C4459os c4459os = new C4459os(0.0f, 0.0f);
        if (!z4 && azoVar != null) {
            C12556ck.m58562k4(c11896dy2, azoVar.m3930x6());
            tfmVar.m71140k4(true);
            tfmVar.m71136k4(tfmVar.m71135k4() | 2);
            tfmVar.m71146x1(1);
        }
        C4459os c4459os2 = new C4459os(C22205OooOOo.OooO00o(c12007ix, 2.0f, c12007ix.m56557jd()), C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck()));
        C4459os.m18279k4(c4459os2, c4459os).CloneTo(c4459os2);
        C4441dy c4441dyM74347k4 = C14877z9.m74347k4(a1fVarM63131k4);
        tfmVar.m71138k4(new C4476v4(tfmVar.m71144to().get_Item(0), 0.0f, 0.0f, tfmVar.m71135k4(), tfmVar.m71145x1(), c4441dyM74347k4, z3, tfmVar.m71142kk(), new C14093tq(c4459os2.Clone())));
        for (int i = 1; i < tfmVar.m71144to().size(); i++) {
            tfmVar.m71143m9().m18397k4(tfmVar.m71144to().get_Item(i), 0.0f, 0.0f, tfmVar.m71135k4(), tfmVar.m71145x1(), c4441dyM74347k4, z3, tfmVar.m71142kk(), new C14093tq<>(c4459os2.Clone()));
        }
        if (tfmVar.m71144to().size() > 1) {
            f = 2.0f;
            tfmVar.m71143m9().m18395k4(new C4459os(0.0f, 0.0f), new C4459os(1.0f, 1.0f));
        } else {
            f = 2.0f;
        }
        C4489zj c4489zj = new C4489zj();
        C4489zj c4489zj2 = new C4489zj();
        C4489zj[] c4489zjArr = {c4489zj};
        C4489zj[] c4489zjArr2 = {c4489zj2};
        tfmVar.m71143m9().m18396k4(c4473umClone2.Clone(), c4489zjArr, c4489zjArr2);
        c4489zjArr[0].CloneTo(c4489zj);
        c4489zjArr2[0].CloneTo(c4489zj2);
        C4489zj c4489zj3 = new C4489zj(c12007ix.m56550c5() / f, c12007ix.m56575x1() / f, 0.0f);
        c4489zj3.m18507k4(C4479w6.m18405k4(c4489zj3.m18506k4(), C14116yg.m67480k4(c4489zj.m18506k4()), C14116yg.m67480k4(c4489zj2.m18506k4())));
        c4489zj3.m18512x1(C4479w6.m18405k4(c4489zj3.m18511x1(), C14116yg.m67480k4(c4489zj.m18511x1()), C14116yg.m67480k4(c4489zj2.m18511x1())));
        c4489zj3.m18509kk(C4479w6.m18405k4(c4489zj3.m18508kk(), C14116yg.m67480k4(c4489zj.m18508kk()), C14116yg.m67480k4(c4489zj2.m18508kk())));
        C4443em c4443em = new C4443em(c14365qy.m69870wy().mo67711m9(), c14365qy.m69870wy().mo67708dy());
        C4443em c4443em2 = new C4443em();
        float[] fArr = {0.0f};
        C4443em[] c4443emArr = {c4443em2};
        C4473um c4473umClone3 = ck8.m4610k4(fArrM71273k4, c4473umClone.Clone(), c4489zj3.Clone(), c4443em.Clone(), fArr, c4443emArr).Clone();
        float f2 = fArr[0];
        c4443emArr[0].CloneTo(c4443em2);
        C4473um c4473umClone4 = C4473um.m18362k4(new C4489zj(0.0f, 0.0f, f2).Clone(), new C4489zj(0.0f, 0.0f, 0.0f).Clone(), new C4489zj(0.0f, 1.0f, 0.0f).Clone()).Clone();
        tfmVar.m71141kk(iM73277k4);
        List<tfm> list = new List<>();
        list.addItem(tfmVar);
        List<C4430ar> listM71436k4 = txr.m71436k4(a1fVarM63131k4);
        List.Enumerator<C4430ar> it = listM71436k4.iterator();
        while (it.hasNext()) {
            try {
                C4430ar next = it.next();
                next.m18064kk(c4473umClone2.m18370k4(next.m18063kk().Clone()).m18510to().Clone());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m63135k4(c14365qy.m69870wy(), list, new k4(c4473umClone2.Clone(), c4473umClone.Clone(), c4473umClone4.Clone(), c4473umClone3.Clone(), listM71436k4, iM73277k4), c4459os2.Clone(), c4443em2.Clone());
        return true;
    }
}
