package com.aspose.slides;

import android.content.pm.PackageManager;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p159h0.AbstractC4434bz;
import com.aspose.slides.internal.p159h0.C4428ai;
import com.aspose.slides.internal.p159h0.C4433bv;
import com.aspose.slides.internal.p159h0.C4443em;
import com.aspose.slides.internal.p159h0.C4459os;
import com.aspose.slides.internal.p159h0.C4473um;
import com.aspose.slides.internal.p159h0.C4476v4;
import com.aspose.slides.internal.p159h0.C4479w6;
import com.aspose.slides.internal.p159h0.C4489zj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.internal.p505xn.C12556ck;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.mh */
/* JADX INFO: loaded from: classes3.dex */
class C13837mh extends C14748wr {
    public C13837mh(C14693vm c14693vm) {
        super(c14693vm);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64891k4(C12007ix c12007ix, C0962es c0962es, azo azoVar, C11896dy c11896dy, float f, float f2) {
        if (c0962es != null && c0962es.m5681to() != 0) {
            m64889k4(m72891x1().m72361x1(), c12007ix.Clone(), c0962es, null, c11896dy, f, f2);
        }
        if (azoVar == null || !azoVar.m3903h4()) {
            return;
        }
        m64889k4(m72891x1().m72361x1(), c12007ix.Clone(), null, azoVar, c11896dy, f, f2);
    }

    /* JADX INFO: renamed from: k4 */
    private void m64889k4(C14365qy c14365qy, C12007ix c12007ix, C0962es c0962es, azo azoVar, C11896dy c11896dy, float f, float f2) throws PackageManager.NameNotFoundException {
        C11896dy c11896dy2;
        boolean z;
        boolean z2;
        boolean z3;
        C4459os c4459os;
        C4443em c4443em;
        tfm tfmVar;
        C12009k4 c12009k4M71134h4;
        C12009k4 c12009k4M73281k4;
        if (c11896dy.m55525du() == 0) {
            return;
        }
        IRotation3D rotation3D = c14365qy.m69834fa().getRotation3D();
        float[] fArrM72889k4 = m72889k4(m72885k4(rotation3D));
        if (fArrM72889k4 == null) {
            return;
        }
        C4473um c4473umClone = m72890x1(rotation3D).Clone();
        C4473um c4473umClone2 = m72882k4(fArrM72889k4).Clone();
        tfm tfmVar2 = new tfm();
        if (c0962es == null || c0962es.m5681to() == 0 || c0962es.m5681to() == -1) {
            c11896dy2 = c11896dy;
            z = false;
        } else {
            if (c0962es.m5681to() != 1) {
                c11896dy2 = c11896dy;
                c12009k4M73281k4 = AbstractC14780xb.m73282k4(c14365qy.m69870wy(), c11896dy2, c0962es);
            } else {
                c11896dy2 = c11896dy;
                c12009k4M73281k4 = AbstractC14780xb.m73281k4(c0962es.m5676k4().Clone());
            }
            tfmVar2.m71139k4(c12009k4M73281k4);
            z = true;
        }
        C14093tq<C12003du> c14093tqClone = m72884k4(c0962es, azoVar).Clone();
        tfmVar2.m71147x1(C14093tq.m67296x1(c14093tqClone, null) ? AbstractC14780xb.m73281k4(c14093tqClone.m67297k4().Clone()) : tfmVar2.m71132du());
        if (azoVar == null || !azoVar.m3903h4() || azoVar.m3901dy() == null || azoVar.m3901dy().m5681to() == 0 || azoVar.m3901dy().m5681to() == -1) {
            z2 = false;
        } else if (C14093tq.m67296x1(c14093tqClone, null)) {
            if (tfmVar2.m71132du() == null) {
                c12009k4M71134h4 = AbstractC14780xb.m73281k4(azoVar.m3916m9().Clone());
                tfmVar2.m71139k4(c12009k4M71134h4);
            }
            z2 = true;
        } else {
            if (C12003du.m56476x1(azoVar.m3916m9(), C12003du.f40505to)) {
                tfmVar2.m71147x1(AbstractC14780xb.m73281k4(azoVar.m3916m9().Clone()));
            }
            if (tfmVar2.m71132du() == null) {
                c12009k4M71134h4 = tfmVar2.m71134h4();
                tfmVar2.m71139k4(c12009k4M71134h4);
            }
            z2 = true;
        }
        if (tfmVar2.m71132du() == null && tfmVar2.m71134h4() == null) {
            return;
        }
        C11896dy c11896dy3 = (C11896dy) c11896dy2.deepClone();
        tfmVar2.m71137k4(new List<>());
        tfmVar2.m71144to().addItem(c11896dy3);
        tfmVar2.m71136k4((z ? 2 : 0) | 4);
        tfmVar2.m71146x1(0);
        C4459os c4459os2 = new C4459os(0.0f, 0.0f);
        if (!z && azoVar != null) {
            C12026yj c12026yjM3930x6 = azoVar.m3930x6();
            if (f != 0.0f) {
                c12026yjM3930x6.m56927kk(0);
            }
            C12556ck.m58562k4(c11896dy3, c12026yjM3930x6);
            tfmVar2.m71140k4(true);
            tfmVar2.m71136k4(tfmVar2.m71135k4() | 2);
            tfmVar2.m71146x1(1);
        }
        C4489zj c4489zj = new C4489zj(c12007ix.m56550c5() / 2.0f, c12007ix.m56575x1() / 2.0f, f);
        C4459os c4459os3 = new C4459os(C22205OooOOo.OooO00o(c12007ix, 2.0f, c12007ix.m56557jd()), C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck()));
        C4459os.m18279k4(c4459os3, c4459os2).CloneTo(c4459os3);
        boolean z4 = z;
        tfmVar2.m71138k4(new C4476v4(tfmVar2.m71144to().get_Item(0), f2, f, tfmVar2.m71135k4(), tfmVar2.m71145x1(), null, false, tfmVar2.m71142kk(), new C14093tq(c4459os3.Clone())));
        for (int i = 1; i < tfmVar2.m71144to().size(); i++) {
            tfmVar2.m71143m9().m18397k4(tfmVar2.m71144to().get_Item(i), f2, f, tfmVar2.m71135k4(), tfmVar2.m71145x1(), null, false, tfmVar2.m71142kk(), new C14093tq<>(c4459os3.Clone()));
        }
        if (tfmVar2.m71144to().size() > 1) {
            tfmVar2.m71143m9().m18395k4(new C4459os(0.0f, 0.0f), new C4459os(1.0f, 1.0f));
        }
        C4489zj c4489zj2 = new C4489zj();
        C4489zj c4489zj3 = new C4489zj();
        C4489zj[] c4489zjArr = {c4489zj2};
        C4489zj[] c4489zjArr2 = {c4489zj3};
        tfmVar2.m71143m9().m18396k4(c4473umClone2.Clone(), c4489zjArr, c4489zjArr2);
        c4489zjArr[0].CloneTo(c4489zj2);
        c4489zjArr2[0].CloneTo(c4489zj3);
        c4489zj.m18507k4(C4479w6.m18405k4(c4489zj.m18506k4(), C14116yg.m67480k4(c4489zj2.m18506k4()), C14116yg.m67480k4(c4489zj3.m18506k4())));
        c4489zj.m18512x1(C4479w6.m18405k4(c4489zj.m18511x1(), C14116yg.m67480k4(c4489zj2.m18511x1()), C14116yg.m67480k4(c4489zj3.m18511x1())));
        c4489zj.m18509kk(C4479w6.m18405k4(c4489zj.m18508kk(), C14116yg.m67480k4(c4489zj2.m18508kk()), C14116yg.m67480k4(c4489zj3.m18508kk())));
        C4443em c4443em2 = new C4443em(c14365qy.m69870wy().mo67711m9(), c14365qy.m69870wy().mo67708dy());
        C4443em c4443em3 = new C4443em();
        float[] fArr = {0.0f};
        C4443em[] c4443emArr = {c4443em3};
        C4473um c4473umClone3 = ck8.m4610k4(fArrM72889k4, c4473umClone.Clone(), c4489zj.Clone(), c4443em2.Clone(), fArr, c4443emArr).Clone();
        float f3 = fArr[0];
        c4443emArr[0].CloneTo(c4443em3);
        C4473um c4473umClone4 = C4473um.m18362k4(new C4489zj(0.0f, 0.0f, f3).Clone(), new C4489zj(0.0f, 0.0f, 0.0f).Clone(), new C4489zj(0.0f, 1.0f, 0.0f).Clone()).Clone();
        C4489zj c4489zjClone = m72883k4(rotation3D, z4, z2, f).Clone();
        if (z4) {
            c4459os = c4459os3;
            c4443em = c4443em3;
            z3 = z2;
            tfmVar = tfmVar2;
            m72886k4(tfmVar, c4473umClone2.Clone(), c4473umClone.Clone(), c4473umClone4.Clone(), c4473umClone3.Clone(), c4489zjClone.Clone(), c4459os.Clone(), c4443em.Clone());
        } else {
            z3 = z2;
            c4459os = c4459os3;
            c4443em = c4443em3;
            tfmVar = tfmVar2;
        }
        if (z3) {
            m64890k4(tfmVar, c4473umClone2.Clone(), c4473umClone.Clone(), c4473umClone4.Clone(), c4473umClone3.Clone(), c4459os.Clone(), c4443em.Clone(), azoVar);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.aspose.slides.vm] */
    /* JADX WARN: Type inference failed for: r2v4, types: [float, int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v3, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r5v1, types: [float, java.lang.String] */
    /* JADX INFO: renamed from: k4 */
    private void m64890k4(tfm tfmVar, C4473um c4473um, C4473um c4473um2, C4473um c4473um3, C4473um c4473um4, C4459os c4459os, C4443em c4443em, azo azoVar) throws PackageManager.NameNotFoundException {
        C4473um c4473umClone = C4473um.m18361k4(C4473um.m18361k4(c4473um, C4473um.m18361k4(c4473um2, c4473um3)), c4473um4).Clone();
        ?? M72360to = m72891x1().m72360to() * m72891x1().m72355du();
        ?? packageInfo = PackageManager.getPackageInfo((String) c4443em.m18173k4(), (int) M72360to);
        ?? packageInfo2 = PackageManager.getPackageInfo((String) c4443em.m18177x1(), (int) M72360to);
        AbstractC12024x1 abstractC12024x1M56935x1 = (azoVar == null || !azoVar.m3903h4()) ? null : azoVar.m3930x6().m56935x1();
        if (abstractC12024x1M56935x1 == null) {
            return;
        }
        C12009k4 c12009k4 = new C12009k4((int) packageInfo, (int) packageInfo2);
        try {
            AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
            try {
                abstractC12008jdM56582k4.mo17481h4(4);
                abstractC12008jdM56582k4.mo17517k4(C12003du.m56396k4(0).Clone());
                IGenericEnumerator<C4433bv> it = tfmVar.m71143m9().iterator();
                ?? r3 = packageInfo;
                while (it.hasNext()) {
                    try {
                        IGenericEnumerator<AbstractC4434bz.k4> it2 = it.next().iterator();
                        while (it2.hasNext()) {
                            try {
                                AbstractC4434bz.k4 next = it2.next();
                                C4428ai c4428aiClone = c4473umClone.m18373kk(next.f12178k4.f12185k4.Clone()).Clone();
                                C4428ai c4428aiClone2 = c4473umClone.m18373kk(next.f12180x1.f12185k4.Clone()).Clone();
                                C4428ai c4428aiClone3 = c4473umClone.m18373kk(next.f12179kk.f12185k4.Clone()).Clone();
                                if (c4428aiClone.m18047kk() >= 0.0f && c4428aiClone2.m18047kk() >= 0.0f && c4428aiClone3.m18047kk() >= 0.0f) {
                                    C4443em c4443emClone = C4479w6.m18406k4(C4428ai.m18039x1(c4428aiClone, c4428aiClone.m18049to()).Clone(), r3 == true ? 1 : 0, (int) packageInfo2).Clone();
                                    C4443em c4443emClone2 = C4479w6.m18406k4(C4428ai.m18039x1(c4428aiClone2, c4428aiClone2.m18049to()).Clone(), r3 == true ? 1 : 0, (int) packageInfo2).Clone();
                                    C4443em c4443emClone3 = C4479w6.m18406k4(C4428ai.m18039x1(c4428aiClone3, c4428aiClone3.m18049to()).Clone(), r3 == true ? 1 : 0, (int) packageInfo2).Clone();
                                    C11896dy c11896dy = new C11896dy();
                                    try {
                                        int iM18173k4 = c4443emClone.m18173k4();
                                        int iM18177x1 = c4443emClone.m18177x1();
                                        C4473um c4473um5 = c4473umClone;
                                        int iM18173k42 = c4443emClone2.m18173k4();
                                        boolean z = r3 == true ? 1 : 0;
                                        c11896dy.m55576x1(iM18173k4, iM18177x1, iM18173k42, c4443emClone2.m18177x1());
                                        c11896dy.m55576x1(c4443emClone2.m18173k4(), c4443emClone2.m18177x1(), c4443emClone3.m18173k4(), c4443emClone3.m18177x1());
                                        c11896dy.m55576x1(c4443emClone3.m18173k4(), c4443emClone3.m18177x1(), c4443emClone.m18173k4(), c4443emClone.m18177x1());
                                        abstractC12008jdM56582k4.mo17527k4(abstractC12024x1M56935x1, c11896dy);
                                        c11896dy.dispose();
                                        c4473umClone = c4473um5;
                                        r3 = z ? 1 : 0;
                                    } finally {
                                    }
                                }
                            } catch (Throwable th) {
                                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                    it2.dispose();
                                }
                                throw th;
                            }
                        }
                        C4473um c4473um6 = c4473umClone;
                        boolean z2 = r3 == true ? 1 : 0;
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        c4473umClone = c4473um6;
                        r3 = z2 ? 1 : 0;
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                m72891x1().m72358k4(c12009k4, c4459os.Clone(), c4443em.Clone(), M72360to);
                abstractC12008jdM56582k4.dispose();
            } finally {
                if (abstractC12008jdM56582k4 != null) {
                    abstractC12008jdM56582k4.dispose();
                }
            }
        } finally {
            c12009k4.dispose();
        }
    }
}
